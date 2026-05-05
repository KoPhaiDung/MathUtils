import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.File;

public class PathTest {
    private static Logger logger = LoggerFactory.getLogger(MathUtilsTest.class);
    @Test
    public void testFilePathRefactored() {
        // Tự động lấy dấu \ hoặc / tùy theo OS đang chạy
        String separator = File.separator;
        String expectedPath = "target" + separator + "classes";

        File file = new File("target/classes");
        assertTrue(file.getPath().contains(expectedPath));
    }
}