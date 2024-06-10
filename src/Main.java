import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Ekonomi101","Mahfi Eğilmez",204, LocalDate.EPOCH);
        Book b2 = new Book("Yalın Startup","Eric Ries",212, LocalDate.EPOCH);
        Book b3 = new Book("Kaplanın Sırtında","Zülfü Livaneli",324, LocalDate.EPOCH);
        Book b4 = new Book("Saatleri Ayarlama Enstitüsü","Ahmet Hamdi Tanpınar",384, LocalDate.EPOCH);
        Book b5 = new Book("Ince Memed 1","Yaşar Kemal",436, LocalDate.EPOCH);
        TreeSet<Book> books = new TreeSet<>(Book::compareTo);
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getTitle());
        }
        TreeSet<Book> books2 = new TreeSet<>( new BookPageCompare().reversed());
        books2.add(b1);
        books2.add(b2);
        books2.add(b3);
        books2.add(b4);
        books2.add(b5);
        Iterator<Book> iterator2 = books2.iterator();
        while (iterator2.hasNext()) {
            Book book = iterator2.next();
            System.out.println(book.getPages());
        }
    }
}