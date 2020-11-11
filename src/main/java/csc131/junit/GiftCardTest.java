package csc131.junit;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class GiftCardTest
{
	@Test
	public void getIssuingStore()
	{
		double balance;
		GiftCard card;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance); //new GiftCard(1337, 100)
		assertEquals("getIssuingStore()",issuingStore, card.getIssuingStore());
	}
	
	@Test
	public void getBalance()
	{
		double balance;
		GiftCard card;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance); //new GiftCard(1337, 100)
		assertEquals("getBalance()", balance, card.getBalance(), 0.001);
	}
	
    @Test
    public void deduct()
    {
        double       balance;        
        GiftCard     card;
        int          issuingStore;
        String       result;
        
        
        issuingStore = 1337;
        balance      = 100.00;
        card = new GiftCard(issuingStore, balance);

        result = "Remaining Balance: " + String.format("%6.2f", 90.00);
        assertEquals("deduct(10.00)", result, card.deduct(10.0));
    }

}

