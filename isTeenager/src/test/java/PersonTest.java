import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class PersonTest {

    @Test
    public void testIsTeenagerForTeenagers() {
        assertTrue(Person.isTeenager(13)); // Должно быть true
        assertTrue(Person.isTeenager(19)); // Должно быть true (ошибка)
    }

    @Test
    public void testIsTeenagerForNonTeenagers() {
        assertFalse(Person.isTeenager(12)); // Должно быть false
        assertFalse(Person.isTeenager(20)); // Должно быть false
    }

    @Test
    public void testIsTeenagerForEdgeCases() {
        assertFalse(Person.isTeenager(-1)); // Должно быть false
        assertFalse(Person.isTeenager(0)); // Должно быть false
    }

    @Test
    public void testIsTeenagerForValidTeenagers() {
        assertTrue(Person.isTeenager(14)); // Должно быть true
        assertTrue(Person.isTeenager(15)); // Должно быть true
        assertTrue(Person.isTeenager(16)); // Должно быть true
        assertTrue(Person.isTeenager(17)); // Должно быть true
        assertTrue(Person.isTeenager(18)); // Должно быть true
    }
}
