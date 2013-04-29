package fitnesse;

import fit.ColumnFixture;

public class Mysum extends ColumnFixture {
	
	public int val1;
	public int val2;
	
	public int sum()
	{
		return val1+val2;
	}

}
