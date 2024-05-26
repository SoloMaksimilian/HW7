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

    }
}