import java.util.Objects;

public class Book {

    private final String bookName;
    private final Author author;
    private int publishingYear;

    public Book(String bookName,Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return publishingYear == book.publishingYear && Objects.equals(bookName,book.bookName) && Objects.equals(author,book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName,author,publishingYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "Book name '" + bookName + '\'' +
                ", author " + author +
                ", publishing year " + publishingYear +
                '}';
    }
}
