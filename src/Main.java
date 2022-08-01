public class Main {
    public static void main(String[] args) {

        //zadanie 1

        int i = 7;
        short s = 100;
        byte b = 5;
        long a = 300L;
        float f = 52.825f;
        double d = 72.39;
        boolean  z = false;
        char c = 4;

        //zadanie 2

        float boxerfirst = 78.2f;
        float boxersecond = 82.7f;

        float vesoboix = boxerfirst + boxersecond;
        float raznica = boxersecond - boxerfirst;

        System.out.println("Zadanie 2");

        System.out.println("Общий вес обоих боксеров " + vesoboix + " кг");
        System.out.println("Разница в весе " + raznica + " кг");

        //zadanie 3

        int banani = 5;
        int bananives = 80;

        int milk = 200;
        int milkSto = 105;

        int iceCream = 2;
        int iceCreamves = 100;

        int eggs = 4;
        int eggsves = 70;

        int breakves = (banani * bananives) + (milk / 100 * milkSto) + (iceCream * iceCreamves) + (eggs * eggsves);
        float breakveskg = breakves / 1000f;

        System.out.println("Zadanie 3");

        System.out.println("Завтрак в граммах весит " + breakves + " гр");
        System.out.println("Завтрак в килограммах " + breakveskg + " кг");


        //zadanie 4

        int celvkg = 7;

        int racionfirst = 250;
        int racionsecond = 500;

        int daysfirst = celvkg * 1000 / 250;
        int dayssecond = celvkg * 1000 / 500;
        int daysmidle = (daysfirst + dayssecond) / 2;

        System.out.println("Zadanie 4");

        System.out.println ("По первой программе потребуется " + daysfirst + " дней");
        System.out.println ("По второй программе потребуется " + dayssecond + " дней");
        System.out.println ("В среднем потребуется " + daysmidle + " дней");


        //zadanie 5

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;

        int mashanewzp = masha + masha / 10;
        int denisnewzp = denis + denis / 10;
        int kristinanewzp = kristina + kristina /10;

        System.out.println("Zadanie 5");

        System.out.println("Маша теперь получает " + mashanewzp + " рублей. Годовой доход вырос на " + (mashanewzp - masha) + " рублей.");
        System.out.println("Денис теперь получает " + denisnewzp + " рублей. Годовой доход вырос на " + (denisnewzp - denis) + " рублей.");
        System.out.println("Кристина теперь получает " + kristinanewzp + " рублей. Годовой доход вырос на " + (kristinanewzp - kristina) + " рублей.");
    }
}