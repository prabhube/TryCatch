package org.ne;

public class ProgramOne {
	public static void main(String[] args) {
		try
		{
		String s ="sri";
		System.out.println(s);
			for(int j=0;j<=5;j++)
			{
int a=10%0;

				System.out.print(a);
			}
		}
		
		catch (NullPointerException e) {
			System.out.println("null pointer");
		}
		catch (Exception e) {
			System.out.println("error occured");
		}
	}
	
}
