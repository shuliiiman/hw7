public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задание номер 1 ");
        int accumulation = 15000;
        int total = 0;
        while (total < 2459000) {
            int i = total / 15000;
            total = total + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задание номер 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(" " + i + " ");
        }

        System.out.println(" ");

        for (int a = 10; a > 0; a--) {
            System.out.print(" " + a + " ");

        }
    }

    public static void task3() {

        System.out.println("Задание номер 3");
        int country = 12_000_000;
        int birth = country / 1000 * 17;
        int death = country / 1000 * 8;
        int oneYear = birth - death;
        for (int i = 1; i < 11; i++) {
            int tenYears = oneYear * i + country;
            System.out.println("Год " + i + ", численность населения составляет " + tenYears);

        }
    }

    public static void task4() {
        System.out.println("Задание номер 4 ");
        int accumulation = 15000;
        int percent = 7;
        int i = 0;
        while (accumulation < 12_000_000) {
            i++;
            accumulation = accumulation + accumulation / 100 * percent;

            System.out.println("За " + i + " месяц накопленно " + accumulation + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задание номер 5 ");
        int accumulation = 15000;
        int percent = 7;
        int s = 0;
        for (int i = 1; accumulation < 12_000_000; i = i++) {
            accumulation = accumulation + accumulation / 100 * percent;
            s++;
            if (s % 6 == 0) {


                System.out.println("За " + s + " месяц накопленно " + accumulation + " рублей");
            }
        }

    }

    public static void task6() {
        System.out.println("Задание номер 6 ");
        int accumulation = 15_000;
        int percent = 7;
        int years = 9;
        int month = years * 12;
        int s = 0;
        for (int i = 1; i < month; i++) {
            accumulation = accumulation + accumulation / 100 * 7;
            s++;
            if (s % 6 == 0) {
                System.out.println("за " + i + " месяцев, накопленно  " + accumulation + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задание номер 7 ");
        int friday = 1;
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }
        while (friday < 31);
    }

    public static void task8() {
        System.out.println("Задание номер 8");
        int year = 2000;
        int before=year-100;
        int after=year+200;
        for(year=before;year<after;year++){
        if(year%79==0){
            System.out.println(year);
        }
        }
    }
}
