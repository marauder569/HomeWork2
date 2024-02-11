package homework12;

public class LibraryCatalog {
    public static void main(String[] args) {
        Author author1 = new Author("Джордж", "Оруэлл");
        Author author2 = new Author("Рей", "Брэдбери");

        Book book1 = new Book("1984", author1, 1949);
        Book book2 = new Book("451 градус по Фаренгейту", author2, 1953);

        System.out.println("Изначальный год публикации книги 1: " + book1.getPublicationYear());

        book1.setPublicationYear(1950);
        System.out.println("Измененный год публикации книги 1: " + book1.getPublicationYear());
    }
}
