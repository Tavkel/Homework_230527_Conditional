public class TrainCart
{
	private final int _totalCapacity;
	private final int _seats;
	public TrainCart(int capacity, int seats)
	{
		_totalCapacity = capacity;
		_seats = seats;
	}
	public int GetCapacity()
	{
		return this._totalCapacity;
	}
	public int GetSeatingCapacity()
	{
		return this._seats;
	}
}
