/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null) 
            return new ArrayList();
        
        List<List<Integer>> ans = new ArrayList();
        
        Queue<Node> que = new ArrayDeque();
        que.add(root);

        while (que.size() != 0) {
          int size = que.size();
          List<Integer> currLevel = new ArrayList();
          while (size-- > 0) {
            Node rnode = que.remove();
            currLevel.add(rnode.val);
            for (Node child : rnode.children) {
              que.add(child);
            }
          }
          ans.add(currLevel);
        }
        
        return ans;
    }
}