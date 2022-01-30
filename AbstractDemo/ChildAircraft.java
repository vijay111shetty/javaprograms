package AbstractDemo;

public class ChildAircraft extends ParentAircraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAircraft a=new ChildAircraft();
		a.Engine();
		a.color();
		a.safetyManual();
		System.out.println(a.add(2, 3));
		//ParentAircraft b=new ParentAircraft(); not possiable to create the object for the abstract class
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
		
	}
	

}
