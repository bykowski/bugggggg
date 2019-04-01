package pl.bykowski.bug;

import org.junit.Test;

import static org.junit.Assert.*;

public class BugApplicationTest {

    @Test
    public void adder() {
        BugApplication bugApplication = new BugApplication();
        assertEquals(10, bugApplication.adder(5, 5));
    }
}