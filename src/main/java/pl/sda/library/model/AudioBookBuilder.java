package pl.sda.library.model;

import java.util.Optional;

public class AudioBookBuilder {
    private String authorFirstName;
    private String authorLastName;
    private String title;
    private Format format;

   public AudioBookBuilder authorFirstName(String authorFirstName){
       this.authorFirstName = authorFirstName;
       return this;
   }

    public AudioBookBuilder authorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
        return this;
    }

    public AudioBookBuilder title(String title) {
        this.title = title;
        return this;
    }

    public AudioBookBuilder format(Format format) {
        this.format = format;
        return this;
    }

    public AudioBook build(){
       AudioBook book = new AudioBook();
       Author author = new Author();
        author.setFirstName(authorFirstName);
              author.setLastName(authorLastName);
             book.setAuthor(author);
            book.setTitle(title);
        Optional<Format> optionalFormat = Optional.ofNullable(this.format);
        book.setFormat(optionalFormat.orElse(Format.MP3));


            return book;
    }

}
