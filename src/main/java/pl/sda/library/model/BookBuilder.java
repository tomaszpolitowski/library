package pl.sda.library.model;

public  final class BookBuilder {
    private String authorFirstName;
    private String authorLastName;
    private String title;

    public BookBuilder authorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
        return this;

    }

    public BookBuilder authorLastName(String authorLastNameName) {
        this.authorLastName = authorLastNameName;
        return this;
    }

    public BookBuilder title(String title) {
        this.title = title;
        return this;
    }

    public Book build() {
        Book book = new Book();
        Author author = new Author();
        author.setFirstName(authorFirstName);
        author.setLastName(authorLastName);
        book.setAuthor(author);
        book.setTitle(title);
        return book;
    }
}
