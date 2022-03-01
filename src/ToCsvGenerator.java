import java.io.IOException;
import java.util.List;

public interface ToCsvGenerator {
    void ToCsv(List<String> lines) throws IOException;
}
