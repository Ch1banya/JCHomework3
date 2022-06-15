import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // 1 задание
        Integer[] array = new Integer[4];

        array[0] = 33;
        array[1] = 22;
        array[2] = 55;
        array[3] = 77;

        System.out.println("Default: " + Arrays.toString(array));
        swap(array, 0, 2);
        System.out.println("Swap 1 and 3 elements: " + Arrays.toString(array));

        // 2 задание
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3, apple4);
        Box<Orange> box2 = new Box<Orange>(orange1, orange2, orange3, orange4, orange5);
        Box<Orange> box3 = new Box<Orange>();
        box2.transfer(box3);

        System.out.println(box1.compare(box2));
        if(box1.compare(box2)) {
            System.out.println("Вес коробок одинаковый");
        } else System.out.println("Вес коробок разный");
    }
    // 1 задание
    private static void swap(Object[] array, int num1, int num2) {
            Object T = array[num1];
            array[num1] = array[num2];
            array[num2] = T;
        }
    }