import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeWorkLesson1 {
    public static void main(String[] args) {

        task1();
        System.out.println("-------------------------------------");
        task2();
        System.out.println("-------------------------------------");
        task3();
    }

    private static void task3() {
        Box<Apple> boxApple1 = new Box<>();
        Box<Apple> boxApple2 = new Box<>();

        boxApple1.addBox(new Apple());
        boxApple1.addBox(new Apple());
        boxApple1.addBox(new Apple());

        System.out.println("apple to boxApple1 = " + boxApple1.weight());

        boxApple1.boxToBox(boxApple2);

        System.out.println("apple to boxApple1 = " + boxApple1.weight());
        System.out.println("apple to boxApple2 = " + boxApple2.weight());

        Box<Orange> boxOrange = new Box<>();
        boxOrange.addBox(new Orange());

        System.out.println("compare boxApple2 and boxOrange = " + boxApple2.compare(boxOrange));
    }

    private static void task2() {
        Integer[] array1 = {1, 2, 3, 4, 5};
        String[] array2 = {"Hello", "World"};
        List arrayList1 = new ArrayList<>();
        arrToArrayList(array1, arrayList1);
        List arrayList2 = new ArrayList<>();
        arrToArrayList(array2, arrayList2);
    }

    private static void task1() {
        Integer[] array1 = {1, 2, 3, 4, 5};
        String [] array2 = {"World", "Hello"};
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array1));
        swap(array2, 0, 1);
        swap(array1,2, 4);
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array1));
    }

    public static <T> void swap(T[] arr, int a, int b) {
        T t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    private static <T> void arrToArrayList(T[] arr, List arrayList) {
        Collections.addAll(arrayList, arr);
        System.out.println(Arrays.deepToString(arrayList.toArray()));
    }
}
