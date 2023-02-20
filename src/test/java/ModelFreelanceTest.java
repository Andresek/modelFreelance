import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModelFreelanceTest {
    @Test
    public void freelance1() {
        ModelFreelance service = new ModelFreelance();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void freelance2() {
        ModelFreelance service = new ModelFreelance();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}
