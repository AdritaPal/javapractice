package IOjava8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFileExample1 {
    public static void main(String[] args) {
        Path source = Paths.get("./filename.txt");
        Path dest = Paths.get(System.getProperty("user.home") + "/Desktop/training/filename-copy.txt");

        try(InputStream is = Files.newInputStream(source);
            BufferedInputStream bis = new BufferedInputStream(is);

            OutputStream os = Files.newOutputStream(dest);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(os)) {

            byte[] buffer = new byte[4096];
            int numBytes;
            while ((numBytes = bis.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, numBytes);
            }
        } catch (IOException ex) {
            System.out.format("I/O error: %s%n", ex);
        }
    }
}
