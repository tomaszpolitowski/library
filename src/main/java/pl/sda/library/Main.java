package pl.sda.library;

import pl.sda.library.model.Book;
import pl.sda.library.model.BookBuilder;
import pl.sda.library.model.Library;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       Library library= new Library();
        library.addBook(new BookBuilder()//
                .authorFirstName("Carol")//
                .authorLastName("Lewis")//
                .title("Lew, czarownica i stara szafa")//
                .build());
        library.addBook(new BookBuilder()//
                .authorFirstName("Lewis")//
                .authorLastName("Carol")//
                .title("Alicja w Krainie Czarów")//
                .build());
        library.addBook(new BookBuilder()//
                .authorFirstName("Xueqin")//
                .authorLastName("Cao")//
                .title("Sen czerwonego pawilonu")//
                .build());
        library.addBook(new BookBuilder()//
                .authorFirstName("Agatha")//
                .authorLastName("Christie")//
                .title("I nie było już nikogo")//
                .build());
        library.addBook(new BookBuilder()//
                .authorFirstName("John")//
                .authorLastName("Tolkien")//
                .title("Hobbit, czyli tam i z powrotem")//
                .build());
        library.addBook(new BookBuilder()//
                .authorFirstName("Joanne")//
                .authorLastName("Rowling")//
                .title("Harry Potter i kamień filozoficzny")//
                .build());
        library.addBook(new BookBuilder()//
                .authorFirstName("Antoine")//
                .authorLastName("de Saint-Exupéry")//
                .title("Mały Książę")//
                .build());
        library.addBook(new BookBuilder()//
                .authorFirstName("John")//
                .authorLastName("Tolkien")//
                .title("Władca Pierścieni")//
                .build());
        library.addBook(new BookBuilder()//
                .authorFirstName("Charles")//
                .authorLastName("Dickens")//
                .title("Opowieść o dwóch miastach")//
                .build());
        library.addBook(new BookBuilder()//
                .authorFirstName("Miguel")//
                .authorLastName("de Cervantes")//
                .title("Don Kichot")//
                .build());
        for (Book book : library.getBooks()){
            System.out.println(book);
        }

    }
}
