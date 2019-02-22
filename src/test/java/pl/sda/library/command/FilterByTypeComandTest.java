package pl.sda.library.command;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.stubbing.Answer;
import pl.sda.library.model.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.CharBuffer;

import static org.mockito.Mockito.*;

public class FilterByTypeComandTest {
    private InputStream inputStream;
   @Before public void setUp() {
       inputStream=System.in;
       System.setIn(new ByteArrayInputStream("Movie\n".getBytes()));

   }
    @After public void tearDown(){
        System.setIn(inputStream);
    }

    @Test
    public void shouldDisplaymoviesWhenFilterByMovie() throws IOException {
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
        Readable readableMock = mock(Readable.class);
        PrintStream printStreamMock = mock(PrintStream.class);
        Command command = new FilterByTypeComand(library, printStreamMock);
                //when
        command.execute();
        //then
        verify(printStreamMock, times(1)).println("Typ: ");
        verify(printStreamMock, times(1)).println(movie);
        verify(printStreamMock, never()).println(book);


    }

}