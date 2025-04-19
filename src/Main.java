public class Main {
    public static void main(String[] args) {

        // Task #1
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }

        // Task #2
        for (int b = 10; b >= 1; b--) {
            System.out.println(b);
        }

        // Task #3
        // если считать, что 0 - четное число
        for (int c = 0; c < 17; c += 2) {
            System.out.println(c);
        }

        // Task #4
        for (int d = 10; d >= -10; d--) {
            System.out.println(d);
        }

        // Task #5
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным.");
        }

        // Task #6
        for (int e = 7; e <= 98; e += 7) {
            System.out.println(e);
        }

        // Task #7
        for (int f = 1; f <= 512; f *= 2) {
            System.out.println(f);
        }

        // Task #8
        int investment = 29000;
        int savings = 0;
        for (int month = 1; month <= 12; month++) {
            savings = savings + investment;
            System.out.println("Месяц " + month + ", сумма годовых накоплений равна " + savings + " рублей.");
        }

        // Task #9
        // за первый месяц процент не начисляется???????
        int investmentInBank = 29000;
        int savingsInBank = 0;
        for (int month = 1; month <= 12; month++) {
            savingsInBank = savingsInBank + savingsInBank / 100;
            savingsInBank = savingsInBank + investmentInBank;
            System.out.println("Месяц " + month + ", сумма по вкладу " + savingsInBank + " рублей.");
        }

        /* если начисляется, то
        int investmentInBank = 29000;
        int savingsInBank = 0;
        for (int month = 1; month <= 12; month++) {
            savingsInBank = savingsInBank + investmentInBank;
            savingsInBank = savingsInBank + savingsInBank / 100;
            System.out.println("Месяц " + month + ", сумма по вкладу " + savingsInBank + " рублей.");
        }
        */

        // Task #10
        for (int g = 1; g <= 10; g++) {
            int multiplication = 2 * g;
            System.out.println("2 * " + g + " = " + multiplication);
        }
    }
}