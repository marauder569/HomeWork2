package homework15_oop1;

public class Main {
    public static void main(String[] args) {
        GryffindorStudent gryffindor1 = new GryffindorStudent("Гарри Поттер", 90, 20, 80, 75, 85);
        GryffindorStudent gryffindor2 = new GryffindorStudent("Гермиона Грейнджер",95, 25, 85, 80, 90);
        GryffindorStudent gryffindor3 = new GryffindorStudent("Рон Уизли", 87, 66, 80, 77, 90);
        HufflepuffStudent hufflepuff1 = new HufflepuffStudent("Седрик Диггори",88, 22, 85, 80, 75);
        HufflepuffStudent hufflepuff2 = new HufflepuffStudent("Захария Смит",78, 22, 75, 60, 75);
        HufflepuffStudent hufflepuff3 = new HufflepuffStudent("Джастин Финч-Флетчли",88, 22, 85, 80, 75);
        RavenclawStudent ravenclaw1 = new RavenclawStudent("Чжоу Чанг",72, 24, 90, 85, 88);
        RavenclawStudent ravenclaw2 = new RavenclawStudent("Падма Патиль",72, 24, 90, 85, 88);
        RavenclawStudent ravenclaw3 = new RavenclawStudent("Маркус Белби",62, 34, 80, 87, 88);
        SlytherinStudent slytherin1 = new SlytherinStudent("Драко Малфой",87, 21, 90, 85, 80);
        SlytherinStudent slytherin2 = new SlytherinStudent("Грэхэм Монтегю",81, 28, 78, 65, 80);
        SlytherinStudent slytherin3 = new SlytherinStudent("Грегори Гойл",81, 28, 78, 65, 80);

        Hogwarts hogwarts = new Hogwarts();
        hogwarts.compare(gryffindor1, gryffindor1);
        hogwarts.compare(gryffindor1, gryffindor3);
        hogwarts.compare(ravenclaw3, ravenclaw1);
        hogwarts.compare(hufflepuff2, hufflepuff3);
        hogwarts.compare(slytherin2,slytherin3);
        hogwarts.compare(slytherin2,slytherin2);
        hogwarts.compare(gryffindor1, slytherin3);

    }
}