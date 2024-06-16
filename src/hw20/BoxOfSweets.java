package hw20;

public interface BoxOfSweets {

	void addSweet(Sweet sweet);
	void removeSweet(int index);
	void removeLastSweet();
	double getTotalWeight();
	double getTotalPrice();
	void displayAllSweets();
	void optimizeWeight(double targetWeight);

	void optimizePrice(double targetPrice);
}
