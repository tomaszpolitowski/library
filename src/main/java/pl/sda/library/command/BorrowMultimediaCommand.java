package pl.sda.library.command;

import pl.sda.library.model.Library;
import pl.sda.library.model.Medium;
import pl.sda.library.model.MediumState;

import java.io.PrintStream;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

public class BorrowMultimediaCommand implements Command {
    private final Library<Medium> library;
    private final PrintStream printStream;

    public BorrowMultimediaCommand(Library<Medium> library, PrintStream printStream) {
        this.library = library;
        this.printStream = printStream;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        printStream.println("Tytuł:");
        String title = scanner.nextLine();
        printStream.println("Imię osoby wypożyczającej:");
        String firstName = scanner.nextLine();
        printStream.println("Nazwisko osoby wypożyczającej:");
        String lastName = scanner.nextLine();
        Optional<Medium> medium = library.getMedia().stream()//
                .filter(m -> Objects.equals(m.getTitle(), title))//
                .findFirst();
        Optional<MediumState> state = medium.map(x -> x.getState().borrowMedium(firstName, lastName));
        medium.ifPresent(m -> m.setState(state.get()));
        if (!medium.isPresent()) {
            printStream.println("Książka już jest wypożyczona");

        }
    }
}