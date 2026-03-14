public class Bike {
    // Non-static block
    {
        System.out.println("Inside Non-Static Block ");
    }

    // Constructor
    public Bike() {
        System.out.println("Inside The Constructor");
    }
public static void main(String[] args) {
		Bike b=new Bike();
	}
}