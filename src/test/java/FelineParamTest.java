import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParamTest {
    private final int numberOfKittens;
    private final int expectedCount;

    public FelineParamTest(int numberOfKittens, int expectedCount) {
        this.numberOfKittens = numberOfKittens;
        this.expectedCount = expectedCount;
    }


    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][]{
                {1,1},
                {0,0},
                {-1,-1}
        };
    }

    @Test
    public void getKittensHowManyKittens() {
        Feline feline = new Feline();
        int actualResult = feline.getKittens(numberOfKittens);
        assertEquals(expectedCount,actualResult);
    }


}
