import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionParamTest {
    Feline feline;
    private final String sex;
    private final Boolean expectedHasMane;

    public LionParamTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters (name = "{0} {1}")
    public static Object[][] checkHasMane(){
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void checkHasManeCorrectValue() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}
