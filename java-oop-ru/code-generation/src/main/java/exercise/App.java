package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    public static void save(Path path, Car car) throws IOException {
        Files.writeString(path, car.serialize());
    }

    public static Car extract(Path path) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (InputStream in = Files.newInputStream(path);
             BufferedReader reader =
                     new BufferedReader(new InputStreamReader(in))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException x) {
            System.err.println(x);
        }

        return Car.deserialize(sb.toString());
    }
}
// END
