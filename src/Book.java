public class Book extends Product{
    private String authorFullName;

    public Book(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorFullName='" + authorFullName + '\'' +
                "} " + super.toString();
    }
}
