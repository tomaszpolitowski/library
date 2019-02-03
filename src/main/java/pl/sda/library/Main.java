package pl.sda.library;

import pl.sda.library.model.*;

public class Main {
    public static void main(String[] args) {
        Library<Book> library = new Library<>();
        library.addBook(new PaperBookBuilder()//
                .authorFirstName("Carol")//
                .authorLastName("Lewis")//
                .title("Lew, czarownica i stara szafa")//
                .cover(Cover.HARD)
                .build());
        library.addBook(new PaperBookBuilder()//
                .authorFirstName("Lewis")//
                .authorLastName("Carol")//
                .title("Alicja w Krainie Czarów")//
                .build());
        library.addBook(new PaperBookBuilder()//
                .authorFirstName("Xueqin")//
                .authorLastName("Cao")//
                .title("Sen czerwonego pawilonu")//
                .build());
        library.addBook(new PaperBookBuilder()//
                .authorFirstName("Agatha")//
                .authorLastName("Christie")//
                .title("I nie było już nikogo")//
                .build());
        library.addBook(new PaperBookBuilder()//
                .authorFirstName("John")//
                .authorLastName("Tolkien")//
                .title("Hobbit, czyli tam i z powrotem")//
                .build());
        library.addBook(new PaperBookBuilder()//
                .authorFirstName("Joanne")//
                .authorLastName("Rowling")//
                .title("Harry Potter i kamień filozoficzny")//
                .build());
        library.addBook(new PaperBookBuilder()//
                .authorFirstName("Antoine")//
                .authorLastName("de Saint-Exupéry")//
                .title("Mały Książę")//
                .build());
        library.addBook(new PaperBookBuilder()//
                .authorFirstName("John")//
                .authorLastName("Tolkien")//
                .title("Władca Pierścieni")//
                .build());
        library.addBook(new PaperBookBuilder()//
                .authorFirstName("Charles")//
                .authorLastName("Dickens")//
                .title("Opowieść o dwóch miastach")//
                .build());
        library.addBook(new PaperBookBuilder()//
                .authorFirstName("Miguel")//
                .authorLastName("de Cervantes")//
                .title("Don Kichot")//
                .build());
        library.addBook(new AudioBookBuilder()//
                .authorFirstName("Carol")//
                .authorLastName("Lewis")//
                .title("Lew, czarownica i stara szafa")//
                .build());
        library.addBook(new AudioBookBuilder()//
                .authorFirstName("Lewis")//
                .authorLastName("Carol")//
                .title("Alicja w Krainie Czarów")//
                .build());
        library.addBook(new AudioBookBuilder()//
                .authorFirstName("Xueqin")//
                .authorLastName("Cao")//
                .title("Sen czerwonego pawilonu")//
                .format(Format.FLAC)
                .build());
        library.addBook(new AudioBookBuilder()//
                .authorFirstName("Agatha")//
                .authorLastName("Christie")//
                .title("I nie było już nikogo")//
                .build());
        library.addBook(new AudioBookBuilder()//
                .authorFirstName("John")//
                .authorLastName("Tolkien")//
                .title("Hobbit, czyli tam i z powrotem")//
                .build());
        library.addBook(new AudioBookBuilder()//
                .authorFirstName("Joanne")//
                .authorLastName("Rowling")//
                .title("Harry Potter i kamień filozoficzny")//
                .build());
        library.addBook(new AudioBookBuilder()//
                .authorFirstName("Antoine")//
                .authorLastName("de Saint-Exupéry")//
                .title("Mały Książę")//
                .build());
        library.addBook(new AudioBookBuilder()//
                .authorFirstName("John")//
                .authorLastName("Tolkien")//
                .title("Władca Pierścieni")//
                .build());
        library.addBook(new AudioBookBuilder()//
                .authorFirstName("Charles")//
                .authorLastName("Dickens")//
                .title("Opowieść o dwóch miastach")//
                .build());
        library.addBook(new AudioBookBuilder()//
                .authorFirstName("Miguel")//
                .authorLastName("de Cervantes")//
                .title("Don Kichot")//
                .build());
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }

    }
}
