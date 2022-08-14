package com.amit.practice.junit;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import com.amit.practice.junit.ToDoService;
import com.amit.practice.junit.ToDoServiceBuisnessImpl;

public class ToDoServiceBuisnessImplTest {

    @Test
    public void testToDoServiceBuisnessImplTest() {
        ToDoService toDoServiceMock = Mockito.mock(ToDoService.class);

        List<String> list = Arrays.asList("Java");

        when(toDoServiceMock.getUsers("Java")).thenReturn(list);

        ToDoServiceBuisnessImpl toDoServiceBuisnessImpl = new ToDoServiceBuisnessImpl(toDoServiceMock);
        List<String> actual = toDoServiceBuisnessImpl.filterUsers();

        assertEquals(1, actual.size());
    }
}
