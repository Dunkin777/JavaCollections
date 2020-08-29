import java.util.Arrays;
import java.util.Stack;

public class testStack {
    static class Room{
        private int wight;
        private int length;
        private String name;
        Room (int wight,int length,String name){
            this.length = length;
            this.wight = wight;
            this.name = name;
        }

        public int getWight() {
            return wight;
        }

        public void setWight(int wight) {
            this.wight = wight;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Room room1 = new Room(14,20, "firstRoom");
        Room room2 = new Room(20,35,"secondRoom");
        Stack<Room> roomStack1= new Stack<>();
        Stack<Room> roomStack2= new Stack<>();
        roomStack1.push(room2);
        roomStack1.push(room1);
        roomStack2.push(room1);
        roomStack2.push(room2);
        Room[] arr1 = new Room[7];
        Room[] arr2 = new Room[7];
        arr1 = roomStack1.toArray(arr1);
        arr2 = roomStack1.toArray(arr2);
        System.out.println(roomStack1);
        System.out.println(roomStack2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        //System.out.println(roomStack1.get(0).getName());
        //System.out.println(roomStack1.equals(roomStack2));
    }
}
