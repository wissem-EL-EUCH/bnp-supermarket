package bnp.supermarket.model;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import bnp.supermarket.ReceiptPrinter;
import bnp.supermarket.model.Product;
import bnp.supermarket.model.ProductUnit;
import bnp.supermarket.model.Receipt;
import bnp.supermarket.model.ReceiptItem;
import bnp.supermarket.model.ShoppingCart;
import bnp.supermarket.model.SpecialOfferType;
import bnp.supermarket.model.SupermarketCatalog;
import bnp.supermarket.model.Teller;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SupermarketBasketTest {

    // Todo: test all kinds of discounts are applied properly

	//APPLE
	@Test
    public void OneAppleBasketTest() {
        SupermarketCatalog catalog = new FakeCatalog();
        
        Product apple = new Product("apple", ProductUnit.Each);
        catalog.addProduct(apple, 0.20);               
        
        Teller teller = new Teller(catalog);        
        teller.addSpecialOffer(SpecialOfferType.BuyOneGetOneFree, apple, 50.0);        

        ShoppingCart cart = new ShoppingCart();
        cart.addItemQuantity(apple, 1);        
        
        // ACT
        Receipt receipt = teller.checksOutArticlesFrom(cart);

        // ASSERT
        assertEquals(0.20, receipt.getTotalPrice(),0.10);
    }
	
	@Test
    public void TwoAppleBasketTest() {
        SupermarketCatalog catalog = new FakeCatalog();
        
        Product apple = new Product("apple", ProductUnit.Each);
        catalog.addProduct(apple, 0.20);               
        
        Teller teller = new Teller(catalog);        
        teller.addSpecialOffer(SpecialOfferType.BuyOneGetOneFree, apple, 50.0);        

        ShoppingCart cart = new ShoppingCart();
        cart.addItemQuantity(apple, 2);        
        
        // ACT
        Receipt receipt = teller.checksOutArticlesFrom(cart);

        // ASSERT
        assertEquals(0.20, receipt.getTotalPrice(),0.10);
    }
	
	@Test
    public void ThreeAppleBasketTest() {
        SupermarketCatalog catalog = new FakeCatalog();
        
        Product apple = new Product("apple", ProductUnit.Each);
        catalog.addProduct(apple, 0.20);               
        
        Teller teller = new Teller(catalog);        
        teller.addSpecialOffer(SpecialOfferType.BuyOneGetOneFree, apple, 50.0);        

        ShoppingCart cart = new ShoppingCart();
        cart.addItemQuantity(apple, 3);        
        
        // ACT
        Receipt receipt = teller.checksOutArticlesFrom(cart);

        // ASSERT
        assertEquals(0.40, receipt.getTotalPrice(),0.10);
    }
	
	@Test
    public void FourAppleBasketTest() {
        SupermarketCatalog catalog = new FakeCatalog();
        
        Product apple = new Product("apple", ProductUnit.Each);
        catalog.addProduct(apple, 0.20);               
        
        Teller teller = new Teller(catalog);        
        teller.addSpecialOffer(SpecialOfferType.BuyOneGetOneFree, apple, 50.0);        

        ShoppingCart cart = new ShoppingCart();
        cart.addItemQuantity(apple, 4);        
        
        // ACT
        Receipt receipt = teller.checksOutArticlesFrom(cart);

        // ASSERT
        assertEquals(0.40, receipt.getTotalPrice(),0.10);
    }
	
	@Test
    public void FiveAppleBasketTest() {
        SupermarketCatalog catalog = new FakeCatalog();
        
        Product apple = new Product("apple", ProductUnit.Each);
        catalog.addProduct(apple, 0.20);               
        
        Teller teller = new Teller(catalog);        
        teller.addSpecialOffer(SpecialOfferType.BuyOneGetOneFree, apple, 50.0);        

        ShoppingCart cart = new ShoppingCart();
        cart.addItemQuantity(apple, 5);        
        
        // ACT
        Receipt receipt = teller.checksOutArticlesFrom(cart);

        // ASSERT
        assertEquals(0.60, receipt.getTotalPrice(),0.10);
    }
	
	//ORANGE	
	@Test
    public void OneOrangeBasketTest() {
        SupermarketCatalog catalog = new FakeCatalog();
        
        Product orange = new Product("orange", ProductUnit.Each);
        catalog.addProduct(orange, 0.50);                      

        Teller teller = new Teller(catalog); 
        
        ShoppingCart cart = new ShoppingCart();
        cart.addItemQuantity(orange, 1);        
        
        // ACT
        Receipt receipt = teller.checksOutArticlesFrom(cart);

        // ASSERT
        assertEquals(0.50, receipt.getTotalPrice(),0.10);
    }
	
	@Test
    public void TwoOrangeBasketTest() {
        SupermarketCatalog catalog = new FakeCatalog();
        
        Product orange = new Product("orange", ProductUnit.Each);
        catalog.addProduct(orange, 0.50);                      

        Teller teller = new Teller(catalog); 
        
        ShoppingCart cart = new ShoppingCart();
        cart.addItemQuantity(orange, 2);        
        
        // ACT
        Receipt receipt = teller.checksOutArticlesFrom(cart);

        // ASSERT
        assertEquals(1.00, receipt.getTotalPrice(),0.10);
    }
	
	@Test
    public void ThreeOrangeBasketTest() {
        SupermarketCatalog catalog = new FakeCatalog();
        
        Product orange = new Product("orange", ProductUnit.Each);
        catalog.addProduct(orange, 0.50);                      

        Teller teller = new Teller(catalog); 
        
        ShoppingCart cart = new ShoppingCart();
        cart.addItemQuantity(orange, 3);        
        
        // ACT
        Receipt receipt = teller.checksOutArticlesFrom(cart);

        // ASSERT
        assertEquals(1.50, receipt.getTotalPrice(),0.10);
    }
	
	@Test
    public void FourOrangeBasketTest() {
        SupermarketCatalog catalog = new FakeCatalog();
        
        Product orange = new Product("orange", ProductUnit.Each);
        catalog.addProduct(orange, 0.50);                      

        Teller teller = new Teller(catalog); 
        
        ShoppingCart cart = new ShoppingCart();
        cart.addItemQuantity(orange, 4);        
        
        // ACT
        Receipt receipt = teller.checksOutArticlesFrom(cart);

        // ASSERT
        assertEquals(2.00, receipt.getTotalPrice(),0.10);
    }
	
	
	@Test
    public void FiveOrangeBasketTest() {
        SupermarketCatalog catalog = new FakeCatalog();
        
        Product orange = new Product("orange", ProductUnit.Each);
        catalog.addProduct(orange, 0.50);                      

        Teller teller = new Teller(catalog); 
        
        ShoppingCart cart = new ShoppingCart();
        cart.addItemQuantity(orange, 5);        
        
        // ACT
        Receipt receipt = teller.checksOutArticlesFrom(cart);

        // ASSERT
        assertEquals(2.50, receipt.getTotalPrice(),0.10);
    }
	
	
	//WATERMELON
	@Test
    public void OneWaterMelonBasketTest() {
        SupermarketCatalog catalog = new FakeCatalog();
        
        Product watermelon = new Product("watermelon", ProductUnit.Each);
        catalog.addProduct(watermelon, 0.80);               
        
        Teller teller = new Teller(catalog);        
        teller.addSpecialOffer(SpecialOfferType.ThreeForTwo, watermelon, 33.33);        

        ShoppingCart cart = new ShoppingCart();
        cart.addItemQuantity(watermelon, 1);        
        
        // ACT
        Receipt receipt = teller.checksOutArticlesFrom(cart);

        // ASSERT
        assertEquals(0.80, receipt.getTotalPrice(),0.10);
    }
	
	@Test
    public void TwoWaterMelonBasketTest() {
        SupermarketCatalog catalog = new FakeCatalog();
        
        Product watermelon = new Product("watermelon", ProductUnit.Each);
        catalog.addProduct(watermelon, 0.80);               
        
        Teller teller = new Teller(catalog);        
        teller.addSpecialOffer(SpecialOfferType.ThreeForTwo, watermelon, 33.33);        

        ShoppingCart cart = new ShoppingCart();
        cart.addItemQuantity(watermelon, 2);        
        
        // ACT
        Receipt receipt = teller.checksOutArticlesFrom(cart);

        // ASSERT
        assertEquals(1.60, receipt.getTotalPrice(),0.10);
    }
	
	@Test
    public void ThreeWaterMelonBasketTest() {
        SupermarketCatalog catalog = new FakeCatalog();
        
        Product watermelon = new Product("watermelon", ProductUnit.Each);
        catalog.addProduct(watermelon, 0.80);               
        
        Teller teller = new Teller(catalog);        
        teller.addSpecialOffer(SpecialOfferType.ThreeForTwo, watermelon, 33.33);        

        ShoppingCart cart = new ShoppingCart();
        cart.addItemQuantity(watermelon, 3);        
        
        // ACT
        Receipt receipt = teller.checksOutArticlesFrom(cart);

        // ASSERT
        assertEquals(1.60, receipt.getTotalPrice(),0.10);
    }
	
	@Test
    public void FourWaterMelonBasketTest() {
        SupermarketCatalog catalog = new FakeCatalog();
        
        Product watermelon = new Product("watermelon", ProductUnit.Each);
        catalog.addProduct(watermelon, 0.80);               
        
        Teller teller = new Teller(catalog);        
        teller.addSpecialOffer(SpecialOfferType.ThreeForTwo, watermelon, 33.33);        

        ShoppingCart cart = new ShoppingCart();
        cart.addItemQuantity(watermelon, 4);        
        
        // ACT
        Receipt receipt = teller.checksOutArticlesFrom(cart);

        // ASSERT
        assertEquals(2.40, receipt.getTotalPrice(),0.10);
    }
	
	@Test
    public void FiveWaterMelonBasketTest() {
        SupermarketCatalog catalog = new FakeCatalog();
        
        Product watermelon = new Product("watermelon", ProductUnit.Each);
        catalog.addProduct(watermelon, 0.80);               
        
        Teller teller = new Teller(catalog);        
        teller.addSpecialOffer(SpecialOfferType.ThreeForTwo, watermelon, 33.33);        

        ShoppingCart cart = new ShoppingCart();
        cart.addItemQuantity(watermelon, 5);        
        
        // ACT
        Receipt receipt = teller.checksOutArticlesFrom(cart);

        // ASSERT
        assertEquals(3.20, receipt.getTotalPrice(),0.10);
    }
	
	@Test
    public void SixWaterMelonBasketTest() {
        SupermarketCatalog catalog = new FakeCatalog();
        
        Product watermelon = new Product("watermelon", ProductUnit.Each);
        catalog.addProduct(watermelon, 0.80);               
        
        Teller teller = new Teller(catalog);        
        teller.addSpecialOffer(SpecialOfferType.ThreeForTwo, watermelon, 33.33);        

        ShoppingCart cart = new ShoppingCart();
        cart.addItemQuantity(watermelon, 6);        
        
        // ACT
        Receipt receipt = teller.checksOutArticlesFrom(cart);

        // ASSERT
        assertEquals(3.20, receipt.getTotalPrice(),0.10);
    }
	
    @Test
    public void AllBasketTest() {
        SupermarketCatalog catalog = new FakeCatalog();
        
        Product apple = new Product("apple", ProductUnit.Each);
        catalog.addProduct(apple, 0.20);
        
        Product orange = new Product("orange", ProductUnit.Each);
        catalog.addProduct(orange, 0.50);
        
        Product watermelon = new Product("watermelon", ProductUnit.Each);
        catalog.addProduct(watermelon, 0.80);
        
        Teller teller = new Teller(catalog);        
        teller.addSpecialOffer(SpecialOfferType.BuyOneGetOneFree, apple, 50.0);
        teller.addSpecialOffer(SpecialOfferType.ThreeForTwo, watermelon, 33.33);

        ShoppingCart cart = new ShoppingCart();
        cart.addItemQuantity(apple, 3);
        cart.addItemQuantity(orange, 3);
        cart.addItemQuantity(watermelon, 5);
        
        // ACT
        Receipt receipt = teller.checksOutArticlesFrom(cart);

        // ASSERT
        assertEquals(5.10, receipt.getTotalPrice(), 0.10);
        //assertEquals(Collections.emptyList(), receipt.getDiscounts());
        assertEquals(3, receipt.getItems().size());
        ReceiptItem receiptItem = receipt.getItems().get(0);
        assertEquals(apple, receiptItem.getProduct());
        assertEquals(0.20, receiptItem.getPrice());
        assertEquals(0.60, receiptItem.getTotalPrice(),0.10);
        assertEquals(3, receiptItem.getQuantity());

    }


}
