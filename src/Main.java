public class Main {
    public static void main(String[] args) {

        //блок 1
        //задача 1

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        double[] array2 = {1.57, 7.654, 9.986};

        byte[] array3 = new byte[2];
        array3[0] = 1;
        array3[1] = 2;

        //задача 2

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i != array2.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
            if (i != array3.length - 1) {
                System.out.print(", ");
            }
        }

        //задача 3

        System.out.println();
        for (int a = array.length - 1; a >= 0;  a--) {
            System.out.print(array[a]); // 1 2 3
            if (a != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int b = array2.length - 1; b >=0; b--) {
            System.out.print(array2[b]);
            if (b != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int c = array3.length - 1; c >= 0; c--) {
            System.out.print(array3[c]);
            if (c != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //задача 4

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i]++;
            }
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}