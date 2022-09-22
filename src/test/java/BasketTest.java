import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование класса Basket")
public class BasketTest {
    @Test
    @DisplayName("Тест метода modifyTotal")
    void modifyTotal() {
        Basket basket = new Basket();
        int number = 1;
        Assertions.assertEquals(number, basket.modifyTotal(number));
    }
}
