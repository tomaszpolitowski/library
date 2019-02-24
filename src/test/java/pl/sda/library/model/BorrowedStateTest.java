package pl.sda.library.model;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.PrintStream;


import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BorrowedStateTest {
    @Test
    public void shouldNotBorrowBookWhenIsBorrowed() {
        //given
        PrintStream printStreamMock = mock(PrintStream.class);
        BorrowedState state = new BorrowedState(printStreamMock);
        String firstName1 = "Jan";
        String firstName2 = "Andrzej";
        String lastName1 = "Kowalski";
        String lastName2 = "Nowak";
        state.setFirstName(firstName1);
        state.setLastName(lastName1);
        //when
        MediumState mediumState = state.borrowMedium(firstName2, lastName2);
        //then
        assertTrue(mediumState instanceof BorrowedState);
        assertEquals(firstName1, ((BorrowedState) mediumState).getFirstName());
        assertEquals(lastName1, ((BorrowedState) mediumState).getLastName());
        verify(printStreamMock, only()).println("Książka już jest wypożyczona");

    }

    @Test
    public void shouldReturnBookWhenIsBorrowed(){
        //given
        PrintStream printStreamMock = mock(PrintStream.class);
        BorrowedState state = new BorrowedState(printStreamMock);
        //when
        MediumState mediumState = state.returnMedium();
        //then
        assertTrue(mediumState instanceof  ReturnedState);
        verify(printStreamMock,never()).println(anyString());
    }
}