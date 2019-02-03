package pl.sda.library.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class AudioBookBuilderTest {
    @Test
    public void shouldBuildAudioBookWhenBookDetailsAreDefined() {
        //given
        String authorFirstName = "Henryk";
        String authorLastName = "Sienkiewicz";
        String title = "W pustyni";
        Format format = Format.FLAC;
        //when
        AudioBook book = new AudioBookBuilder().authorFirstName(authorFirstName).authorLastName(authorLastName).title(title).format(format).build();

        //then
        assertNotNull(book);
        assertNotNull(book.getAuthor());
        assertEquals(authorFirstName,book.getAuthor().getFirstName());
        assertEquals(authorLastName, book.getAuthor().getLastName());
        assertEquals(format,book.getFormat());
    }
}