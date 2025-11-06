// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int num = Integer.parseInt(args[0]);
		boolean sign = true;
		double sum = 0;
		for (int i=1; i<num+1;i+=2){
			if(sign == true){
				sum += (1.0/i);
				sign = false;
			} 
			else{sum -= (1.0/i);
			sign = true;}
		}
		System.out.println("pi according to Java: " + Math.PI);
				System.out.println("pi, approximated:     " + sum*4);

	}
}
