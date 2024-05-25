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
        int fertility=0;
        int mortality=0;
        for (int year = 0; year<=10; year++) {
            System.out.println(population);
            population = population+fertility-mortality;
            fertility = population / 1000 * 17;
            mortality = population / 1000 * 8;
            }
    }
}