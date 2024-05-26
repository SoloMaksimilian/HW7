public class Main {
    public static void main(String[] args) {
        int h = 15000;
        int i = 0;
        int j = 0;
        while (i <= 2459000) {
            i = i + h;
            i = i + i / 100;
            j = 1 + j;
        }
        System.out.println("Месяц " + j + ", сумма накоплений равна " + i + " рублей");

        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println(" ");
        while (a >= 1) {
            System.out.print(a + " ");
            a--;
        }
        System.out.println(" ");

        int population = 12000000;
        for (int year = 1; year <= 10; year++) {
            int fertility = population / 1000 * 17;
            int mortality = population / 1000 * 8;
            population = population + fertility - mortality;
            System.out.println("Год " + year + ", численность населения " + population);
        }

        int s = 15000;
        for (int d = 1; s <= 12000000; d++) {
            s = s + (s / 100 * 7);
            if (d % 6 == 0) {
                System.out.println("Месяц " + d + ", сумма накоплений равна " + s + " рублей");
            }
        }

        int v = 15000;
        int year = 0;
        int month = 0;
        while (year < 9) {
            v = v + (v / 100 * 7);
            month = month + 1;
            year = month / 12;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + v + " рублей");
            }
        }

        int firstFriday = 3;
        for (int day = 0; day <= 31; day++) {
            if ((day - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
        }

        int now = 2024;
        for (int years = 0; years <= 2134; years = years + 79) {
            int min = now - 200;
            int max = now + 100;
            if (years > min && years < max) {
                System.out.println(years);
            }
        }


    }
}