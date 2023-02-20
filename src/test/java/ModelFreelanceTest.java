import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ModelFreelanceTest {
    @ParameterizedTest()
    @CsvFileSource(files = "src/test/resources/modelfreelance.csv")
    public void freelance(int expected, int income, int expences, int threshold) {
        ModelFreelance service = new ModelFreelance();

        // int expected = 3;
        int actual = service.calculate(income, expences, threshold);

        Assertions.assertEquals(expected, actual);
    }

}
