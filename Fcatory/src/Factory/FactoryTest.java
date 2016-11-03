package Factory;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Factory Rfactory = new RiceFactory();  
	        Factory Afactory = new AppleFactory();  
	        Food R = Rfactory.CreateFood();  
	        R.print(); 
	        Food A = Afactory.CreateFood();  
	        A.print();  
	}
}
