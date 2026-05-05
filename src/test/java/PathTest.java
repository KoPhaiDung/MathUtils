import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.File;

public class PathTest {
    private static Logger logger = LoggerFactory.getLogger(MathUtilsTest.class);
    @Test
    public void testFilePath() {

        // Cố tình dùng định dạng cứng của Windows: "target\classes"
        String expectedPath = "target\\classes";

        File file = new File("target/classes");
        String actualPath = file.getPath();

        logger.info("Hệ điều hành: " + System.getProperty("os.name"));
        logger.info("Đường dẫn thực tế: " + actualPath);

        // Test này sẽ PASS trên Windows nhưng FAIL trên Ubuntu và macOS
        assertTrue(actualPath.contains(expectedPath), "Đường dẫn không khớp với định dạng hệ điều hành!");
    }
}