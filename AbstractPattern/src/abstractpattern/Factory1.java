package abstractpattern;

public class Factory1 implements AbstractFactory {
    @Override
    public Food CreateFood(){
    	return new Rice();//·µ»ØRice¶ÔÏó
    }
    @Override
    public Shape CreateShape(){
    	return new Rectangle();
    }
}
