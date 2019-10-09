package cse360assign2;

public class AddingMachine 
{

    private int total;
    private String transactions = "0 ";
	
    public AddingMachine ()
    {
		total = 0;  // not needed - included for clarity
    }
    
	/**
     * Gets local variable total
     * 
     * @return total
     */
    public int getTotal () 
    {
		return 0;
	}
    
    /**
     * Adds the value to the total
     * 
     * @param value
     */
    public void add (int value) 
    {
        total = total + value;
        transactions = transactions + "+ " + value + " ";
	}
    
    /**
     * Subtracts the value from the total
     * 
     * @param value
     */
    public void subtract (int value)
    {
        total = total - value;
        transactions = transactions + "- " + value + " ";
	}
    
    /**
     * toString function the prints the transactions in a singular formula
     */
    public String toString () 
    {
		return transactions;
	}

    /**
     * Resets the total to 0 and resets the transactions to 0 as well
     */
    public void clear() 
    {
        total = 0;
        transactions = "0 ";
	}
}
