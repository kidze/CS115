public class DriverClient
{
	public static void main(String[] args)
	{
		Driver a = new Driver("Yen","Nguyen","BMW",25);
		Driver b = new Driver();
		
		String c = a.getLastName();
		System.out.println(a.toString());
		System.out.println(b.getFirstName());
		System.out.println(c);
		
		double d = a.licenseFee();
		System.out.println("this driver's fee is "+d);
	}
}