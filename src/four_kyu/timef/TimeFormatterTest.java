package four_kyu.timef;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TimeFormatterTest {

    @Test
    public void exampleTests() {
        assertEquals("1 second", TimeFormatter.formatDuration(1));
        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
        assertEquals("2 minutes", TimeFormatter.formatDuration(120));
        assertEquals("1 hour", TimeFormatter.formatDuration(3600));
        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
        assertEquals("40 years, 68 days, 3 hours and 4 minutes", TimeFormatter.formatDuration(1261440000 + 5875200 + 10800 + 240));
    }

}