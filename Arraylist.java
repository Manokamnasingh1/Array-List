import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 class Arraylist {
    public  static void main(String args[]){
        ArrayList<Integer>List=new ArrayList<Integer>();
        //add elements
        List.add(0);
        List.add(1);
        List.add(2);
        System.out.println(List);
        // get element
        int element = List.get(0);
        System.out.println(element);

        //add element
        List.add(1,1);
        System.out.println(List);

        //Set element
        List.set(0,5);
        System.out.println(List);

        // remove element
        List.remove(3);
        System.out.println(List);

        //size
        int size= List.size();
        System.out.println(size);

        //loop
        for(int i=0; i<List.size();i++) {
            System.out.print(List.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(List);
        System.out.println(List);

        }


    }

