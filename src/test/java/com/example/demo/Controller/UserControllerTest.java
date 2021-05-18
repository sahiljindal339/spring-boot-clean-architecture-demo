package com.example.demo.Controller;

import com.example.demo.Interactors.User.UserFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

    @Mock
    private UserFactory mockUserFactory;

    @InjectMocks
    private UserController userControllerUnderTest;

    @Test
    public void testAddUser() throws Exception {
        // Setup

        // Run the test
        final String result = userControllerUnderTest.addUser();

        // Verify the results
        assertEquals("New User add in h2", result);
    }

    @Test
    public void testAddUser_ThrowsIOException() {
        // Setup

        // Run the test
        assertThrows(IOException.class, () -> userControllerUnderTest.addUser());
    }
}
