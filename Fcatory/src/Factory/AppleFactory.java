package Factory;

public class AppleFactory extends Factory{
	@Override
	public Food CreateFood(){
		return new Apple();
	}
}
