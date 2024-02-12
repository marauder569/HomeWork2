package homework13;
public class LibraryCatalog {
    public static void main(String[] args) {
        Author author1 = new Author("Джордж", "Оруэлл");
        Author author2 = new Author("Рей", "Брэдбери");

        Book book1 = new Book("1984", author1, 1949);
        Book book2 = new Book("451 градус по Фаренгейту", author2, 1953);

        System.out.println(book2.toString());
        System.out.println("------------------");
        System.out.println(book1.equals(book2));
    }
}