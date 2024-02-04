package homework10;

public class Main {
    public static void main(String[] args) {
    //Задача 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        String fullName1 = String.join(" ", lastName, firstName, middleName);
        System.out.println("Ф.И.О сотрудника - " + fullName1);
    //Задача 2
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName1.toUpperCase());
    //Задача 3
        String fullName2 = "Иванов Семён Семёнович";
        String replacedFullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + replacedFullName2);

    }
}
