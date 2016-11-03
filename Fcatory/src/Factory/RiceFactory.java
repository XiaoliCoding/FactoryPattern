package Factory;

public class RiceFactory extends Factory{
	@Override
	public Food CreateFood(){
		return new Rice();
	}
}
