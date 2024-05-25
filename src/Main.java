public class Main {
    public static void main(String[] args) {
        int h = 29000;
        int i = 0;
        for (int j = 1; j <= 12; j++) {
            i = i + h;
            i = i + i / 100;
            System.out.println("Месяц " + j + ", сумма накоплений равна " + i + " рублей");
        }
    }
}