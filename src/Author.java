import java.util.Objects;

public class Author {
    private final String nameAuthor;


    public Author (String nameAuthor){

        this.nameAuthor = nameAuthor;
    }

    public String getNameAuthor() {

        return this.nameAuthor;
    }

    @Override
    public String toString() {
        return nameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return nameAuthor.equals(author.nameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor);
    }
}