class vehicle{
	void run(){
		System.out.println("Vehicle running");
	}
}
class car extends vehicle{
	void run(){
		System.out.println("car running");
	}
}
class bike extends vehicle{
	void run(){
		System.out.println("Bike running");
	}
}
public class override{
	public static void main(String[]args){
		vehicle v=new vehicle();
		car c=new car();
		bike b=new bike();
		v.run();
		c.run();
		b.run();
	}
}
