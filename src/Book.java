import java.time.LocalDate;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int pages;
    private LocalDate publishDate;
    public Book(String title, String author, int pages, LocalDate publishDate) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.publishDate = publishDate;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book book) {
        return this.getTitle().compareTo(book.getTitle());
    }
    public String toString(){
        return this.title + "\t" + this.author + "\t" + this.pages + "\t" + this.publishDate;
    }
}
