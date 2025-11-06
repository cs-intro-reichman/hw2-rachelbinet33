// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		int steps = 0;
		String mode = args[1];
		int current = seed;
		if(mode.equals('v')){
			for(int i = 1 ; i<= seed ;i++)
			{
				current=i;
			do{
				System.out.print(current + " ");
				if(current%2==0) {current=current/2;}
				else{current = ((current*3)+1);};
				steps+=1;
			}
			while(current!=1);
			System.out.print(current + " ");
			steps+=1;
			System.out.println("(" + steps + ")");
			steps = 0;
			}
		}
		else{
			for(int i = seed ; i>=1 ;i--)
			{
				current=i;
			do{
				System.out.print(current + " ");
				if(current%2==0) {current=current/2;}
				else{current = ((current*3)+1);};
				steps+=1;
			}
			while(current!=1);
			System.out.print(current + " ");
			steps+=1;
			System.out.println("(" + steps + ")");
			steps = 0;
			}
		}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}
