package cse360assign2;

public class AddingMachine {

	private int total;
	
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
		this.total = getTotal() + value;
	}
    
    /**
     * Subtracts the value from the total
     * 
     * @param value
     */
    public void subtract (int value)
    {
		this.total = getTotal() - value;
	}
    
    /**
     * toString function for this class
     */
    public String toString () 
    {
		return "";
	}

    /**
     * 
     */
    public void clear() 
    {
	
	}
}
