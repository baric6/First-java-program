package class_inherit;
import java.util.Scanner;


public class output {

		public static void main(String args[])
		{
			//main program file
			//parent object 
			animals a = new animals();
			//child object
			child p = new child();
			
			Scanner keyboard = new Scanner(System.in);
			String nme;
			String agz;
			String nme1;
			String agz1;
			String toy1;
			
			System.out.print("What was the First name of your pet you owned: ");
			//scanner to read user input
			nme = keyboard.nextLine();
			//set user input to object var member
			a.set_name(nme);
			
			System.out.print("How old was it: ");
			//reads user input
			agz = keyboard.nextLine();
			//set var to parent class
			a.set_age(agz);
			
			System.out.println("------------------------------------------------------------");
			
		
			System.out.print("What was the Second name of your pet you have owned: ");
			//user input
			nme1 = keyboard.nextLine();
			//set var to child class = name inheritance
			p.set_name(nme1);
			
			System.out.print("How old was it: ");
			//user input 
			agz1 = keyboard.nextLine();
			//set var to child class = age inheritance
			p.set_age(agz1);
			
			System.out.print("What was its favorite toy: ");
			//user info
			toy1 = keyboard.nextLine();
			//set var to child class = toy 'not inherited'
			p.set_toy(toy1);
			
			
			//if use scanner need to close var
			
			keyboard.close();
			
			//output
			System.out.println();
			System.out.println("base class");
			System.out.println("----------------------------------------------------------------------");
			
			System.out.println(a.get_name());
			System.out.println(a.get_age());
			
			System.out.println("child class");
			System.out.println("----------------------------------------------------------------------");
			
			System.out.println(p.get_name());
			System.out.println(p.get_age());
			System.out.println(p.get_toy());

			System.out.println("-------------------------------------------------------");
			
			//sets class var to string for convertion
			String age = a.get_age();
			//changing string age to int so i can do math
			Integer x = Integer.valueOf(age);
			
			//sets class var to string for convertion
			String age1 = p.get_age();
			//changing string age to int so i can do math
			Integer y = Integer.valueOf(age1);
			
			//adds ages together
			//System.out.println(x + y);
			
			System.out.println("How old is your animal in human years");
			
			System.out.println("");
			
			System.out.print("First pets age if is a cat: ");
			int cat_years1 = x * 6 + 1;
			System.out.println(cat_years1 + "Years");
			
			System.out.print("First pets age if is a dog: ");
			int dog_years1 = x * 4 + 15;
			System.out.println(dog_years1 + "Years");
			
			System.out.println("");
			
			System.out.print("Second pets age if is a cat: ");
			int cat_years2 = y * 6 + 1;
			System.out.println(cat_years2 + "Years");
			
			System.out.print("Second pets age if is a dog: ");
			int dog_years2 = y * 4 + 15;
			System.out.println(dog_years2 + "Years");
		}
}
