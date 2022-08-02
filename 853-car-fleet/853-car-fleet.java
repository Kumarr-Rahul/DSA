// class Solution {
//     public int carFleet(int target, int[] position, int[] speed) {
//         Car[] cars = new Car[position.length];
//         for(int i = 0; i < position.length; i++){
//             cars[i] = new Car(position[i], speed[i]);
//         }
        
//         Arrays.sort(cars);
        
//         int groups = 0;
//         double time = 0;
//         for(int i = cars.length - 1; i >= 0; i--){
//             Car c = cars[i];
//             double ctime = (target - c.pos) * 1.0 / c.speed;
//             if(ctime > time){
//                 time = ctime;
//                 groups++;
//             }
//         }
        
//         return groups;
//     }
    
//     class Car implements Comparable<Car> {
//         int pos;
//         int speed;
        
//         Car(int pos, int speed){
//             this.pos = pos;
//             this.speed = speed;
//         }
        
//         public int compareTo(Car c){
//             return this.pos - c.pos;
//         }
//     }
// }

//2nd

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(int i = 0; i < position.length; i++){
            map.put(position[i], speed[i]);
        }
        
        double time = 0;
        int res = 0;
        for(Map.Entry<Integer, Integer> car: map.entrySet()){
            double ctime = (target - car.getKey()) * 1.0 / car.getValue();
            if(ctime > time){
                time = ctime;
                res++;
            }
        }
        
        return res;
    }
}