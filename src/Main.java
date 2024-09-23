public class Main {
    public static void main(String[] args) {

        // Task #1
        for (int one = 1; one <= 10; one++) {
            System.out.println(one);
        }

        // Task #2
        for (int two = 10; two >= 1; two--) {
            System.out.println(two);
        }

        // Task #3
        // если считать, что 0 - четное число
        for (int three = 0; three < 17; three += 2) {
            System.out.println(three);
        }

        // Task #4
        for (int four = 10; four >= -10; four--) {
            System.out.println(four);
        }

        // Task #5
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным.");
        }

        // Task #6
        for (int six = 7; six <= 98; six += 7) {
            System.out.println(six);
        }

        // Task #7
        for (int seven = 1; seven <= 512; seven *= 2) {
            System.out.println(seven);
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
        for (int tenth = 1; tenth <= 10; tenth++) {
            int multiplication = 2 * tenth;
            System.out.println("2 * " + tenth + " = " + multiplication);
        }
    }
}