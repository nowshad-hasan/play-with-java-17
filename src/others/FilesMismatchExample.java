package others;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author Nowshad Hasan
 * @since 9/10/21 9:34 am
 */
public class FilesMismatchExample {

    /*
    Here, hello1 and hello3 have same content, hello2 has different content.
    This method returns -1 if no mismatch.
    If mismatched,
    1. The position of the first mismatched byte, or
    2. The size of the smaller file (in bytes) when the files are different sizes and every byte of the smaller file is identical to the corresponding byte of the larger file.
     */
    public static void main(String[] args) {
        Path path1 = Path.of("hello1.txt");
        Path path2 = Path.of("hello2.txt");
        Path path3 = Path.of("hello3.txt");

        try {
            System.out.println(Files.mismatch(path1, path1)); // -1, as same file comparison
            System.out.println(Files.mismatch(path1, path2)); // 13, different file, different content
            System.out.println(Files.mismatch(path1, path3)); // -1, different file but same content
            System.out.println(Files.mismatch(path2, path3)); // 13, different file, different content
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
