package pl.sda.library.command;

import pl.sda.library.model.Library;
import pl.sda.library.model.Medium;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FilterByTypeComand implements Command {
    private final Library<Medium> library;

    private final PrintStream printStream;

    public FilterByTypeComand(Library<Medium> library, PrintStream printStream) {
        this.library = library;
        this.printStream = printStream;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        printStream.println("Typ: ");
        String type = scanner.nextLine();

         library.getMedia().stream().filter(x->x.getType().equals(type)).forEach(printStream::println);
      //  for (Medium medium : library.getMedia()) {
        //    if (medium.getClass().getSimpleName().equals(type)) {
          //      printStream.println(medium);
            //}
        //}

    }
}
