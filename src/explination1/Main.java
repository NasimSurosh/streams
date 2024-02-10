package explination1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

  public static void main(String[] args) throws IOException {
    
    Files.lines(Paths.get("/home/dci-student/eclipse-workspace/Sreams/src/file.txt")).forEach(System.out::println);

  }

}
