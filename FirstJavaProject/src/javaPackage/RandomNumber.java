/*Java Random Numbers
 * Random numbers can be generated in java by following ways
 * 1. By using Maths function
 * 2. Using the Random Class
 * 3. Using the ThreadLocalRandom Class*/

package javaPackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {

	public static void main(String[] args) {
								/*By using Maths function*/
		System.out.println("1st Random Number: " + Math.random());   
		System.out.println("2nd Random Number: " + Math.random()); 
		
							/*Random number between a specified range*/
		int min = 200;  
		int max = 400;  
		//Generate random double value from 200 to 400   
		System.out.println("Random value of type double between "+min+" to "+max+ ":");  
		double ac = Math.random()*(max-min+1)+min;   
		System.out.println(ac);  
		//Generate random int value from 200 to 400   
		System.out.println("Random value of type int between "+min+" to "+max+ ":");  
		int bc = (int)(Math.random()*(max-min+1)+min);  
		System.out.println(bc); 
		
		
										/*Using the Random Class*/
		// creating an object of Random class   
		Random random = new Random();   
		// Generates random integers 0 to 49  
		int x = random.nextInt(50);   
		// Generates random integers 0 to 999  
		int y = random.nextInt(1000);   
		// Prints random integer values  
		System.out.println("Randomly Generated Integers Values");  
		System.out.println(x);   
		System.out.println(y);   
		// Generates Random doubles values  
		double a = random.nextDouble();   
		double b = random.nextDouble();   
		// Prints random double values  
		System.out.println("Randomly Generated Double Values");  
		System.out.println(a);   
		System.out.println(b);    
		// Generates Random float values  
		float f=random.nextFloat();  
		float i=random.nextFloat();  
		// Prints random float values  
		System.out.println("Randomly Generated Float Values");  
		System.out.println(f);   
		System.out.println(i);   
		// Generates Random Long values  
		long p = random.nextLong();   
		long q = random.nextLong();   
		// Prints random long values  
		System.out.println("Randomly Generated Long Values");  
		System.out.println(p);   
		System.out.println(q);    
		// Generates Random boolean values  
		boolean m=random.nextBoolean();  
		boolean n=random.nextBoolean();  
		// Prints random boolean values  
		System.out.println("Randomly Generated Boolean Values");  
		System.out.println(m);   
		System.out.println(n);   
		
								/*Using the ThreadLocalRandom Class*/
		// Generate random integers between 0 to 999   
		int ab = ThreadLocalRandom.current().nextInt();   
		int bb = ThreadLocalRandom.current().nextInt();   
		// Print random integer values  
		System.out.println("Randomly Generated Integer Values:");  
		System.out.println(ab);   
		System.out.println(bb);   
		// Generate Random double values  
		double c = ThreadLocalRandom.current().nextDouble();   
		double d = ThreadLocalRandom.current().nextDouble();   
		// Print random doubles   
		System.out.println("Randomly Generated Double Values:");  
		System.out.println(c);   
		System.out.println(d);   
		// Generate random boolean values  
		boolean ef = ThreadLocalRandom.current().nextBoolean();   
		boolean ff = ThreadLocalRandom.current().nextBoolean();   
		// Print random Booleans   
		System.out.println("Randomly Generated Boolean Values:");  
		System.out.println(ef);   
		System.out.println(ff);   
	}

}
