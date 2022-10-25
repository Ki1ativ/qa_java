import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
public class FelineTest {

    Feline feline;

    @Before
    public void setUp() {
        this.feline = new Feline();
    }


    @Test
    public void getFamilyListCat() {
        assertEquals("Кошачьи", feline.getFamily());
    }


    @Test
    public void eatMeatYesOrNoPredator() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, feline.eatMeat());
    }

    @Test
    public void getKittensBeOne() {
        int expectedResult = 1;
        assertEquals(expectedResult, feline.getKittens());
    }
}
