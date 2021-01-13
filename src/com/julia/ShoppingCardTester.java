package com.julia;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCardTester {
    @Test
    public void appendFormattedTest() {
        assertEquals("23 ", ShoppingCart.appendFormatted(new StringBuilder(), "234", 0, 2).toString());
        assertEquals("657 ", ShoppingCart.appendFormatted(new StringBuilder(), "657", 0, 3).toString());
        assertEquals("1239 ", ShoppingCart.appendFormatted(new StringBuilder(), "1239", 0, 4).toString());
        assertEquals(" 725 ", ShoppingCart.appendFormatted(new StringBuilder(), "725", 1, 4).toString());
        assertEquals("396 ", ShoppingCart.appendFormatted(new StringBuilder(), "396", -1, 3).toString());
        assertEquals("789  ", ShoppingCart.appendFormatted(new StringBuilder(), "789", -1, 4).toString());
    }

    @Test
    public void discountTest() {
        assertEquals(0, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.NEW, 99));
        assertEquals(50, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.SECOND_FREE, 9));
        assertEquals(60, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.SECOND_FREE, 100));
        assertEquals(71, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.SALE, 12));
        assertEquals(80, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.SALE, 100));
        assertEquals(10, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.REGULAR, 100));
        assertEquals(8, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.REGULAR, 80));
    }
}
