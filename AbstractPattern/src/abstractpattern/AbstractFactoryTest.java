package abstractpattern;

public class AbstractFactoryTest {
    public static void main(String [] args){
    	AbstractFactory aFactory = new Factory1();
    	AbstractFactory bFactory = new Factory2();
    	Food Afood = aFactory.CreateFood();  
        Shape Ashape= aFactory.CreateShape();  
        Afood.print();  
        Ashape.print(); 
        Food Bfood = bFactory.CreateFood();  
        Shape Bshape= bFactory.CreateShape();  
        Bfood.print();  
        Bshape.print();  
    }
}
