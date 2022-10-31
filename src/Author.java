import java.util.Objects;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Author author = (Author) obj;
        return Objects.equals(name,author.name) && Objects.equals(surname,author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,surname);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
