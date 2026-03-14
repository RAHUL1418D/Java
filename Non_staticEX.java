public class Non_staticEx {
	 {
		System.out.println("Inside Non-Static block 1");
	}
	
		public static void main(String [] args) {
			Non_staticEx Ns1=new Non_staticEx();
			System.out.println("Inside main");
			Non_staticEx Ns=new Non_staticEx();
			
			
		}
	 {
		System.out.println("Inside Non Static block 2");
	}
}