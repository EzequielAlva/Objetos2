package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseRealAccessTest {
    private DatabaseAccess database1;
    private DatabaseAccess database2;

    @BeforeEach
    void setUp() throws Exception {
        database1 = new DatabaseAccessProxy("brian@gmail.com", "123");
        database2 = new DatabaseAccessProxy("toto@gmail.com", "123");
    }

    @Test
    void testGetSearchResultsWithAuthenticatedUser() {
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database1.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database1.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testGetSearchResultsWithNonAuthenticatedUser() {
        assertEquals(null, this.database2.getSearchResults("select * from comics where id=1"));
        assertEquals(null, this.database2.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRowWithAuthenticatedUser() {
        assertEquals(3, this.database1.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database1.getSearchResults("select * from comics where id=3"));
    }

    @Test
    void testInsertNewRowWithNonAuthenticatedUser() {
        assertEquals(0, this.database2.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(null, this.database2.getSearchResults("select * from comics where id=3"));
    }
}