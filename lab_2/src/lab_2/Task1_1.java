package lab_2;

public class Task1_1 {
	// S(n)=1-2+3-4+...+ ((-1)^(n+1) )*n , n>0
			public static int getSn1(int n) {
				if(n == 1) 
				return 1;
				else 
					return (int) (getSn1(n -1) + Math.pow(-1, (n+1))*n);
			}

			// S(n)=1+ 1.2 + 1.2.3+ ... +1.2.3...n , n>0
			public static int getSn2(int n) {
				if(n == 1)
					return 1;
				else
					return n*getSn2(n-1);
			}

			public static int getSn3(int n) {
				if(n ==1)
				return 1;
				else 
					return (int) (Math.pow(n, 2) + getSn3(n-1));
			}

			public static double getSn4(int n) {
				if(n==0) 
				return 1.0;
				else
					return getSn4(n-1) + 1.0/(fn(n));
			}
			public static int fn(int n) {
				if(n == 1) 
					return 2;
				else 
					return fn(n-1)*(2*n);
			}



			public static void main(String[] args) {
				int n =3;
				System.out.println( getSn1(n));
				System.out.println(getSn2(n));
				System.out.println(getSn3(n));
				System.out.println(getSn4(n));
				System.out.println(fn(n));
			}
	}

