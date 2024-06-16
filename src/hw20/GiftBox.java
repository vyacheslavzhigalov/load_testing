package hw20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GiftBox implements BoxOfSweets{

	private List<Sweet> sweets = new ArrayList<>();

	@Override
	public void addSweet(Sweet sweet) {
		sweets.add(sweet);
	}

	@Override
	public void removeSweet(int index) {
		if (index >= 0 && index < sweets.size()) {
			sweets.remove(index);
		}
	}

	@Override
	public void removeLastSweet() {
		if (!sweets.isEmpty()) {
			sweets.remove(sweets.size() - 1);
		}
	}

	@Override
	public double getTotalWeight() {
		double totalWeight = 0;
		for (Sweet sweet : sweets) {
			totalWeight += sweet.getWeight();
		}
		return totalWeight;
	}

	@Override
	public double getTotalPrice() {
		double totalPrice = 0;
		for (Sweet sweet : sweets) {
			totalPrice += sweet.getPrice();
		}
		return totalPrice;
	}

	@Override
	public void displayAllSweets() {
		if (sweets.isEmpty()) {
			System.out.println("Коробка пуста");
		} else {
			for (Sweet sweet : sweets) {
				sweet.display();
				System.out.println("----------------------");
			}
		}
	}

	@Override
	public void optimizeWeight(double targetWeight) {
		double currentWeight = getTotalWeight();
		if (currentWeight > targetWeight) {
			Iterator<Sweet> iterator = sweets.iterator();
			while (iterator.hasNext() && currentWeight > targetWeight) {
				Sweet sweet = iterator.next();
				currentWeight -= sweet.getWeight();
				iterator.remove();
			}
		} else {
			System.out.println("Вес коробки уже меньше целевого веса");
			System.out.println("----------------------");
		}
	}

	@Override
	public void optimizePrice(double targetPrice) {
		double currentPrice = getTotalPrice();
		if (currentPrice > targetPrice) {
			Iterator<Sweet> iterator = sweets.iterator();
			while (iterator.hasNext() && currentPrice > targetPrice) {
				Sweet sweet = iterator.next();
				currentPrice -= sweet.getPrice();
				iterator.remove();
			}
		} else {
			System.out.println("Цена коробки меньше целевой цены");
			System.out.println("----------------------");
		}
	}
}
