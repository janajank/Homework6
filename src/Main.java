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
        task9();
        task10();
    }
    public static void task1 () {
        System.out.println("Задача1");
        int i = 1;
        for (i=1; i<=10; i++){
        System.out.println(i);}
    }
    public static void task2 () {
        System.out.println("Задача2");
        int i=10;
        for (i=10; i>=1; i=i-1) {
            System.out.println(i);}
    }

    public static void task3 () {
        System.out.println("Задача3");
    int i = 0;
    for (i=0; i<=17; i=i+2) {
        System.out.println(i);}
    }

    public static void task4 () {
        System.out.println("Задача4");
    int i = 10;
    for (i=10; i>=-10;i=i-1) {
        System.out.println(i);}
    }

    public static void task5 () {
        System.out.println("Задача5");
        int i = 1904;
        for (i=1904; i<=2096; i=i+4) {
            System.out.println( i +" год является високосным");}
    }

    public static void task6 () {
        System.out.println("Задача6");
    int i = 7;
    for (i=7; i<=98; i=i+7) {
        System.out.println(i);}
    }

    public static void task7 () {
        System.out.println("Задача7");
    int i = 1;
    for (i=1; i<=512; i=i*2) {
        System.out.println(i);}
    }

    public static void task8 () {
        System.out.println("Задача8");
    int sum = 0;
    int paymentPerMonth = 29000;
    int month = 1;
    for ( month=1; month<=12; month=month+1){
        sum = month*paymentPerMonth;
        System.out.println("Месяц "+month+", сумма накоплений равна "+sum+" рублей");}
    }

    public static void task9 () {
        System.out.println("Задача9");
    double sum = 0;
    int paymentPerMonth = 29000;
    int month = 1;
    double percent = 0.01;
    for ( month=1; month<=12; month=month+1){
        sum = month*paymentPerMonth;
        sum = sum*(1+percent);
        System.out.println("Месяц "+month+", сумма накоплений равна "+sum+" рублей");}
    }

    public static void task10 () {
        System.out.println("Задача10");
        int i = 1;
    for (i=1; i<=10; i=i+1)
        System.out.println("2* "+i+" = "+2*i);

    }


}