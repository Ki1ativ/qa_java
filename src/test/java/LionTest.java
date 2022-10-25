import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline felineMock;


    @Test
    public void getKittensOneCorrectValue() throws Exception {
        Lion lion = new Lion ("Самец", felineMock);
        int expectedValue = 1;
        Mockito.when(felineMock.getKittens()).thenReturn(1);
        assertEquals(expectedValue, lion.getKittens());
    }
    @Test
    public void getFoodPredatorShowEatMeat() throws Exception {
        Lion lion = new Lion ("Самец", felineMock);
        List<String> expectedListOfFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(expectedListOfFood, lion.getFood());
    }

    @Test (expected = Exception.class)
    public void constructorExceptionTest() throws Exception {
        try {
            new Lion("Оно", felineMock);
        } catch (Exception exp) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", exp.getMessage());
            throw exp;
        }
    }
}