import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;
class CsvGenerator implements ToCsvGenerator {
    @Override
    public void ToCsv(List<String> lines) throws IOException {
        FileWriter CsvW = new FileWriter("new.csv");

        CsvW.append("*************");
        CsvW.append("\n");

        for (String line : lines) CsvW.append(line);
        CsvW.append("\n");

        CsvW.append("*************");
        CsvW.append("\n");
        CsvW.flush();
        CsvW.close();

        try {

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}