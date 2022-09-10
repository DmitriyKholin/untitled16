import java.util.Objects;

public class Book  {
    private final String namePublisher;
    private int yearPublisher;
    private final Author nameAuthor;
    private int idBook;

    public int getIdBook() {
        return idBook;
    }

    public String getNamePublisher() {

        return this.namePublisher;
    }

    public int getYearPublisher() {

        return this.yearPublisher;
    }

    public void setYearPublisher(int yearPublisher) {

        this.yearPublisher = yearPublisher;
    }

    public Book (int idBook, String namePublisher, int yearPublisher, Author nameAuthor) {
        this.yearPublisher = yearPublisher;
        this.namePublisher = namePublisher;
        this.nameAuthor = nameAuthor;
        this.idBook = idBook;
    }
    @Override
    public String toString() {
        return "Book id: " + idBook + '\'' +
                " Название книги - '" + namePublisher + '\'' +
                ", Год публикации - " + yearPublisher +
                ", Имя автора книги - '" + nameAuthor + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublisher == book.yearPublisher && idBook == book.idBook && namePublisher.equals(book.namePublisher) && nameAuthor.equals(book.nameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namePublisher, yearPublisher, nameAuthor, idBook);
    }
}