package TwoDArray;

import java.util.ArrayList;

public class TwoDArrayList {
    static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(); // create 2d arraylist
        ArrayList<Integer> a = new ArrayList<>();// create 1d arraylist
        a.add(2);
        a.add(3);
        a.add(6);
        a.add(8);
        a.add(4);
        a.add(5);
        arr.add(a);// add new arraylist in arraylist
        ArrayList<Integer> b = new ArrayList<>();
        arr.add(1,b);// add new arraylist in arraylist
        arr.get(1).add(3);// add new element arraylist
        arr.get(1).add(4);
        arr.get(1).add(5);
        arr.get(1).add(6);

        arr.get(1).set(1,3); // update element
            // with for loop
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j  < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) +" "); // get element...
            }
            System.out.println();

        }
        // with for each loop
        for(ArrayList<Integer> li : arr){
            for(int i : li){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println(arr );

    }
}
