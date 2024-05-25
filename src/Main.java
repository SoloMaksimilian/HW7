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
        System.out.println("");
        while (a >= 1) {
            System.out.print(a + " ");
            a--;
        }

    }
}