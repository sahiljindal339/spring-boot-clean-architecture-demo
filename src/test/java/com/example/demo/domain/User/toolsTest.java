package com.example.demo.domain.User;
/*
    Automatically generated using `SquareTest toolkit`.
 */

import com.example.demo.Infrastructure.tools.tools;
import com.example.demo.Entity.User.User;
import org.junit.Test;
import java.io.IOException;
import static junit.framework.TestCase.assertTrue;

public class toolsTest {
    String  paylaod = "{\"Name\":\"Name\",\"ContactNumber\":\"ContactNumber\",\"Address\":\"Address\",\"City\":\"City\",\"Country\":\"Country\"}";

    @Test
    public void testToPojo() throws Exception {
        assertTrue((User) tools.toPojo(paylaod, User.class) instanceof User);
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test(expected = IOException.class)
    public void testToPojo_ThrowsIOException() throws Exception {
        tools.toPojo("payload", Object.class);
    }
}
