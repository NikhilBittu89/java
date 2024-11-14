package in.nueron;

abstract class Plane{
	abstract public void fly();
	abstract public void takeoff();
		
		
	//abstract class can have normal function if needed 
	public void landing() {
		System.out.println("Plane is Landing");
	}
}
class CargoPlane extends Plane{
	public void fly() {
		System.out.println("cargo plane files at lower height");
	}
	//takeoff is inherited
	public void takeoff()
	{
		System.out.println("cargo plane files requre londer run way to take off");
	}
}
class FighterPlane extends Plane{
	public void fly() {
		System.out.println("Fighter plane files at medium height");
	}
	//takeoff is inherited
	public void takeoff()
	{
		System.out.println("Fighter plane requre shoter run way to land");
	}
}
class Airport
{
	public void permit(Plane p)
	{
		p.takeoff();
		p.fly();
	}
}

public class abstractkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp=new CargoPlane();
		FighterPlane fp=new FighterPlane();
		//Plane p =new Plane();
		

		
		Airport a=new Airport();
		a.permit(cp);
		a.permit(fp);
		
	}

}
