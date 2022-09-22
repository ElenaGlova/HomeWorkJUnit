import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Тест класса Manager")
class ManagerTest {
    @Test
    @DisplayName("тест метода endOfWork")
    void endOfWorkFalse() {
        Manager manager = new Manager();
        Assertions.assertFalse(manager.endOfWork("end"));
    }

    @Test
    @DisplayName("тест метода endOfWork")
    void endOfWorkTrue() {
        Manager manager = new Manager();
        Assertions.assertTrue(manager.endOfWork("Another word"));
    }
    @Test
    @DisplayName("тест метода parseToInteger")
    void parseToInteger(){
        Manager manager = new Manager();
        Assertions.assertFalse(manager.parseToInteger(new String[]{"1","2","3"}));
    }
}
