import java.io.IOException;
import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        final CsvGenerator csvGenerator = new CsvGenerator();
        try {
            // add lines
            csvGenerator.ToCsv(Arrays.asList("first line", "second line", "third line"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}