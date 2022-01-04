

	public class Driver
	{
		public String firstName="a";
		public String lastName="b";
		public String carBrand="c";
		public int driverage = 0;
	
		public Driver(String fn, String ln, String cb, int age)
		{
			firstName=fn;
			lastName=ln;
			carBrand=cb;
			driverage=age;
		}
		
		public Driver()
		{
			firstName="no fn yet";
			lastName="no ln yet";
			carBrand="no cb yet";
			driverage= 1;
		}
		
		public void setFirstName(String newfn)
		{
			firstName = newfn;
		}
	
		public void setLastName(String newln)
		{
			lastName = newln;
		}
	
		public void setCarBrand(String newcb)
		{
			carBrand = newcb;
		}
	
		public void setDriverAge(int newage)
		{
			driverage = newage;
		}
		public String getFirstName()
		{
		
			return firstName;
		}
	
		public String getLastName()
		{
		
			return lastName;
		}
	
		public String getCarBrand()
		{
			return carBrand;
		}
		
		public int getDriverAge()
		{
			return driverage;
		}
		
		public String toString()
		{
			String result;
			result="Name "+firstName+" "+lastName+". Car brand is "+carBrand+". Age = "+driverage;
			return result;
		}
	
		public double licenseFee()
		{
			double fee = driverage*1.5;
			return fee;
		}
}