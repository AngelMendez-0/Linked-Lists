import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        LinkedList A = new LinkedList();
        LinkedList A2 = new LinkedList();

        int randomListSize = 20000; // Change to 2000 if your machine is slow
        Random r = new Random();

        for (int i = 0; i < randomListSize; i++) {
            int randomInt = r.nextInt(3000000);
            A.addLast(randomInt);
            A2.addLast(randomInt);
        } // end of for

        double then = System.currentTimeMillis();
        A.MergeSort();
        double now = System.currentTimeMillis();

        System.out.println("Time cost in milliseconds for mergesort: " + (now - then));
        System.out.println(A.isSorted());
        System.out.println("Size of list A is: " + A.getSize());

        then = System.currentTimeMillis();
        A2.InsertionSort();
        now = System.currentTimeMillis();

        System.out.println("Time cost in milliseconds for insertionsort: " + (now - then));
        System.out.println(A2.isSorted());
        System.out.println("Size of list A2 is: " + A2.getSize());

    } // end of main
} // end of Tester