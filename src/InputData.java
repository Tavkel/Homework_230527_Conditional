public class InputData
{
	private final int _age;
	private final int _temperature;
	private final int _speed;

	public InputData(int age, int temperature, int speed)
	{
		this._age = age;
		this._temperature = temperature;
		this._speed = speed;
	}
	public int GetAge()
	{
		return this._age;
	}
	public int GetTemperature()
	{
		return this._temperature;
	}
	public int GetSpeed()
	{
		return this._speed;
	}
}
