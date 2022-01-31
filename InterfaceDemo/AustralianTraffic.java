package InterfaceDemo;

public class AustralianTraffic implements CenteralTraffic,ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CenteralTraffic a=new AustralianTraffic();
		a.greengo();
		a.redstop();
		a.Flashyellow();
		AustralianTraffic b=new AustralianTraffic();
		b.blue();
		ContinentalTraffic c=new AustralianTraffic();
		c.trainSymbol();
	}
	public void blue()
		{
		System.out.println("Blue light implimentation");
		}
	
	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		System.out.println("Green light implimentation");
		
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("Red light implimentation");
		
	}

	@Override
	public void Flashyellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow light implimentation");
		
	}
	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train Symbol stop implimentation");
		
	}

}
