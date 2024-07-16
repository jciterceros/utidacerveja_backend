package com.jciterceros.utidacerveja_backend.domain.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class BeerTest {

    private Long id;
    private String name;
    private BigDecimal price;
    private Integer stock;

    @BeforeEach
    void setUp() {
        id = 1L;
        name = "Heineken";
        price = new BigDecimal("10.0");
        stock = 10;
    }

    @DisplayName("Constructor should be create a beer, width all attributes")
    @Test
    void constructorShouldBeCreateABeerWidthAllAttributes() {
        // Given

        // When
        Beer beer = new Beer(id, name, price, stock);

        // Then
        assertEquals(id, beer.getId());
        assertEquals(name, beer.getName());
        assertEquals(price, beer.getPrice());
        assertEquals(stock, beer.getStock());
    }

    @DisplayName("Constructor should be create a beer, width no attributes")
    @Test
    void constructorShouldBeCreateABeerWidthNoAttributes() {
        // Given
        Beer beer = new Beer();

        // Then
        assertNull(beer.getId());
        assertNull(beer.getName());
        assertNull(beer.getPrice());
        assertNull(beer.getStock());
    }

    @DisplayName("Setters and getters should be working")
    @Test
    void settersAndGettersShouldBeWorking() {
        // Given

        // When
        Beer beer = new Beer();
        beer.setId(id);
        beer.setName(name);
        beer.setPrice(price);
        beer.setStock(stock);

        // Then
        assertEquals(id, beer.getId());
        assertEquals(name, beer.getName());
        assertEquals(price, beer.getPrice());
        assertEquals(stock, beer.getStock());
    }

    @DisplayName("Equals and hashcode should be working")
    @Test
    void equalsAndHashCodeShouldBeWorking() {
        // Given

        // When
        Beer beer1 = new Beer(id, name, price, stock);
        Beer beer2 = new Beer(id, name, price, stock);

        // Then
        assertEquals(beer1, beer2);
        assertEquals(beer1.hashCode(), beer2.hashCode());
    }

    @DisplayName("ToString should be working")
    @Test
    void toStringShouldBeWorking() {
        // Given

        // When
        Beer beer = new Beer(id, name, price, stock);

        // Then
        assertEquals("Beer(id=1, name=Heineken, price=10.0, stock=10)", beer.toString());
    }

}