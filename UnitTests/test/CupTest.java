import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void getLiquidType() {
        Cup c = new Cup("Orange Juice", 84);
        assertEquals("Orange Juice", c.getLiquidType());
    }

    @Test
    void getPercentFilled(){
        Cup c = new Cup("Orange Juice", 84);
        assertEquals(84, c.getPercentFilled());
    }
}