import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {

    @org.junit.jupiter.api.Test
    void setPricePositive() {
        Trade t1 = new Trade("T1", "APPL",100, 15.25);
        assertEquals(t1.getPrice(), 15.25);
    }
    @Test
    void setPriceMessage(){
        Trade t1 = new Trade("T1", "APPL",100, 15.25);
        Throwable exception = assertThrows(IllegalArgumentException.class, ()-> {t1.setPrice(-15.25);});
       assertEquals("Price can not be negative value", exception.getMessage());

    }
}
