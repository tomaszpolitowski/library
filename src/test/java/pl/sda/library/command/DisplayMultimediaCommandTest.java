package pl.sda.library.command;

import org.junit.Test;
import org.mockito.Mockito;
import pl.sda.library.model.*;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

public class DisplayMultimediaCommandTest {


    @Test
    public void shouldDisplayMultimediaWhenSomeMultimediaIsAvailable() {
        //given
        PaperBook book = new PaperBookBuilder()
                .authorFirstName("henryk")//
                .authorLastName("Sienkiewicz")//
                .title("w pustyni")//
                .cover(Cover.HARD)//
                .pageCount(100)//
                .build();

        Movie movie = new MovieBuilder().title("w pus").directorFirstName("fsfds").directorLastName("sdf").duration(100).build();
        Library<Medium> library = new Library<>();
        library.addMedium(book);
        library.addMedium(movie);
        PrintStream printStreamMock = mock(PrintStream.class);
        Command command = new DisplayMultimediaCommand(library, printStreamMock);
        //when
        command.execute();
        //then
        verify(printStreamMock, times(1)).println(book);
        verify(printStreamMock, times(1)).println(movie);
    }

}