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
    public String toString() {
        return "Book{" +
                "Book name '" + bookName + '\'' +
                ", author " + author +
                ", publishing year " + publishingYear +
                '}';
    }
}
