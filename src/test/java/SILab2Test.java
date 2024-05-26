import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class SILab2Test {

    private List<Item> create(Item... products)
    {
        return new ArrayList<Item>(Arrays.asList(products));

    }
    @Test
    void checkEveryBranch() {
        RuntimeException throw_exception;

        throw_exception=assertThrows(RuntimeException.class, ()-> SILab2.checkCart(null,0));
        assertFalse(SILab2.checkCart(new ArrayList<Item>(), -7));
        assertTrue(SILab2.checkCart(new ArrayList<Item>(), 0));
        assertTrue(throw_exception.getMessage().contains("allItems list can't be null!"));

        throw_exception=assertThrows(RuntimeException.class, ()-> SILab2.checkCart(create(new Item("dejan",null,20,0.7f)),0));
        assertFalse(SILab2.checkCart(create(new Item("dejan","123456",100,-0.7f)),0));
        assertTrue(throw_exception.getMessage().contains("No barcode!"));


        throw_exception=assertThrows(RuntimeException.class, ()-> SILab2.checkCart(create(new Item("","55g",789,0.7f)),0));
        assertFalse(SILab2.checkCart(create(new Item("","123456",123,0.7f)),0));
        assertTrue(throw_exception.getMessage().contains("Invalid character in item barcode!"));



    }
    @Test
    void checkMultipleCondition() {
        assertTrue(SILab2.checkCart(create(new Item("dejan","071011",777,0.7f)),10000));
        assertFalse(SILab2.checkCart(create(new Item("dejan","171011",777,0.7f)),2));

        assertFalse(SILab2.checkCart(create(new Item("dejan","071011",777,-7f)),2));
        assertFalse(SILab2.checkCart(create(new Item("dejan","071011",70,0.7f)),2));
    }


}