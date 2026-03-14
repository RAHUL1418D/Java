import java.util.Scanner;
class ScannerExample {
	public static void main(String[] agrs) {
		System.out.println("START");
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter UserID");
		int UserID=scan.nextInt();
		System.out.println("Enter UserName");
		String Username=scan.next();
		System.out.println("Enter Salary");
		Double Salary=scan.nextDouble();
		
		System.out.println("UserID:"+UserID+" \nUserName:"+Username+" \nSalary:"+Salary);
		
		scan.close();
	}

}
