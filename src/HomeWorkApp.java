public class HomeWorkApp {
            public static void main(String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
        }

        public static void printThreeWords() {
            System.out.println("������� 2");
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
            System.out.println();
        }

        public static void checkSumSign() {
            System.out.println("������� 3");
                int a = 10, b = 15;
            int c = a + b;
            if (c >= 0) System.out.println("����� �������������");
            else System.out.println("����� �������������");
            System.out.println();
        }

        public static void printColor() {
            System.out.println("������� 4");
            int value = 1;
            if (value <= 0) System.out.println("�������");
            else if (value > 0 && value <= 100) System.out.println("������");
            else System.out.println("�������");
            System.out.println();
        }

        public static void compareNumbers() {
            System.out.println("������� 5");
            int a = 1, b = 2;
            if (a >= b) System.out.println("a >= b");
            else System.out.println("a < b");
            System.out.println();
        }
    }
