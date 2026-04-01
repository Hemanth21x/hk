package myPackage;

public class Noofobjects {

		static int count;
		{
			count++;
		}

		public static void main(String[] args) {
			
			Noofobjects l1 = new Noofobjects();
			Noofobjects l2 = new Noofobjects();
			Noofobjects l3 = new Noofobjects();
			Noofobjects l4 = new Noofobjects();
			Noofobjects l5 = new Noofobjects();
			
			System.out.println("No of Objects : "+count);

		}

	}