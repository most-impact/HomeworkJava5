public class Main {
    public static void main(String[] args) {
        //Task 1
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        System.out.println();
        //Task 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println();
        //Task 3
        for (int i = 0; i < 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();
        //Task 4
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }

        System.out.println();
        //Task 5
        for (int i = 1904; i < 2097; i++) {
            if (i % 400 == 0) {
                System.out.println(i + " год является високосным");
            } else if (i % 4 == 0 && i % 100 != 0) {
                System.out.println(i + " год является високосным");
            }
        }

        System.out.println();
        //Task 6
        for (int i = 7; i < 100; i = i + 7) {
            System.out.println(i);
        }

        System.out.println();
        //Task 7
        for (int i = 1; i < 513; i = i * 2) {
            System.out.println(i);
        }

        System.out.println();
        //Task 8
        int totalSum = 0;
        for (int i = 1; i < 13; i++) {
            totalSum += 29000;
            System.out.println(i + " месяц, " + "сумма накоплений равна " + totalSum + " рублей");
        }

        System.out.println();
        //Task 9
        totalSum = 0;
        for (int i = 1; i < 13; i++) {
            totalSum += 29000;
            totalSum = (101 * totalSum) / 100;
            System.out.println(i + " месяц, " + "сумма накоплений равна " + totalSum + " рублей");
        }

        System.out.println();
        //Task 1
        for (int i = 1; i < 11; i++) {
            System.out.println("2*" + i + "=" + 2 * i);
        }
    }
}