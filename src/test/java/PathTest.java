import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.File;

public class PathTest {

    @Test
    public void testFilePath() {
        // Cố tình dùng định dạng cứng của Windows: "target\classes"
        String expectedPath = "target\\classes";

        File file = new File("target/classes");
        String actualPath = file.getPath();

        System.out.println("Hệ điều hành: " + System.getProperty("os.name"));
        System.out.println("Đường dẫn thực tế: " + actualPath);

        // Test này sẽ PASS trên Windows nhưng FAIL trên Ubuntu và macOS
        assertTrue(actualPath.contains(expectedPath), "Đường dẫn không khớp với định dạng hệ điều hành!");
    }
}