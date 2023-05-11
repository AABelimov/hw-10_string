public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
    }

    public static void task1(){
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Task1:");
        System.out.printf("ФИО сотрудника - %s\n", fullName);
    }

    public static void task2(){
        String fullName = "Ivanov Ivan Ivanovich";

        System.out.println("Task2:");
        System.out.printf("Данные ФИО сотрудника для заполнения отчета - %s\n", fullName.toUpperCase());
    }

    public static void task3(){
        String fullName = "Иванов Семён Семёнович";

        System.out.println("Task3:");
        System.out.printf("Данные ФИО сотрудника - %s\n", fullName.replace("ё", "е"));
    }
}