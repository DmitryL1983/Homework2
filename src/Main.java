public class Main {
    public static void main(String[] args) {
        // Задание 1
        int dogs = 100;
        byte bigDogs = 15;
        short cats = 32;
        long people = 7000000000L;
        float weightCats = 4.3f;
        double numberPi = 3.141592653589793238462643383279502884197169399375105820974944;
        // специально задано присвоение числа Пи с точностью, превышающей возможности double
            System.out.println("Значение переменной dogs с типом int равно " + dogs);
            System.out.println("Значение переменной bigDogs с типом byte равно " + bigDogs);
            System.out.println("Значение переменной cats с типом short равно " + cats);
            System.out.println("Значение переменной people с типом long равно " + people);
            System.out.println("Значение переменной weightCats с типом float равно " + weightCats);
            System.out.println("Значение переменной numberPi с типом double равно " + numberPi);
        // Задание 2
        float apples = 27.12f;
        long ants = 987678965549L;
        double length = 2.786;
        boolean b = false;
        short money = 569;
        short duty = -159;
        int meters = 27897;
        byte days = 67;
        // Задание 3
        short LP = 23;
        short AS = 27;
        short EA = 30;
        short lists =480;
        lists = (short) (lists / (23+27+30));
        System.out.println("На каждого ученика рассчитано " + lists + " листов бумаги");
        // Задание 4
        int performance2 = 16;
        int performance = performance2 / 2;
        int performance20 = performance * 20;
        System.out.println("За 20 минут машина произвела бутылок " + performance20 + " штук" );
        int performance1440 = performance * 1440;
        System.out.println("За сутки машина произвела бутылок " + performance1440 + " штук" );
        int performance4320 = performance * 4320;
        System.out.println("За трое суток машина произвела бутылок " + performance4320 + " штук" );
        int performanceMonth = performance1440 * 30;
        System.out.println("За месяц машина произвела бутылок " + performanceMonth + " штук" );
        // Задание 5
        int white = 2;
        int brown = 4;
        int room = 120 / (white+brown);
        int whiteRoom = white * room;
        int brownRoom = brown * room;
        System.out.println("В школе, где " + room + " классов, нужно " + whiteRoom + " банок белой краски и " + brownRoom + " банок коричневой краски");
        // Задание 6
        int bananas = 5 * 80;
        int milk = 105 * 2;
        int iceCream = 100 * 2;
        int eggs = 50 * 7;
        double cocktail = bananas + milk + iceCream + eggs;
        cocktail = cocktail / 1000;
        System.out.println("порция коктеля равна " + cocktail + " кг");
        // Задание 7
        int day250 = 7000 / 250;
        int day500 = 7000 / 500;
        int day = (day250 + day500) / 2;
        System.out.println("На лёгкой диете спортсмен похудеет за " + day250 + " дней");
        System.out.println("На жесткой диете спортсмен похудеет за " + day500 + " дней");
        System.out.println("В среднем спортсмен похудеет за " + day + " дней");
        // Задание 8
        int Maha = (int) (67760 * 1.1);
        int Denis = (int) (83690 * 1.1);
        int Kris = (int) (76230 * 1.1);
        int MahaDifference = (Maha * 12) - (67760 * 12);
        System.out.println("Маша теперь получает " + Maha + " рублей. Годовой доход вырос на " + MahaDifference + " рублей.");
        int DenisDifference = (Denis * 12) - (83690 * 12);
        System.out.println("Денис теперь получает " + Denis + " рублей. Годовой доход вырос на " + DenisDifference + " рублей.");
        int KrisDifference = (Kris * 12) - (76230 * 12);
        System.out.println("Кристина теперь получает " + Kris + " рублей. Годовой доход вырос на " + KrisDifference + " рублей.");
        //  ДЗ выполнено
    }
}