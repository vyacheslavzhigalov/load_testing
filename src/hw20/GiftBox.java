package hw20;

import java.util.*;
import java.util.stream.Collectors;

public class GiftBox implements BoxOfSweets {

	private List<Sweet> sweets = new ArrayList<>();

	private List<Double> listPrices = new ArrayList<>();

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
			while (iterator.hasNext()) {
				Sweet sweet = iterator.next();
				if (sweet.weight == targetWeight) {
					iterator.remove();
				}
			}
		} else {
			System.out.println("Вес коробки равен или меньше целевого веса");
			System.out.println("----------------------");
		}
	}

	@Override
	public void optimizePrice(double targetWeight) {
		double currentWeight = getTotalWeight();
		List<Sweet> sweetOneWithTargetWeight = new ArrayList<>();
		if (currentWeight > targetWeight) {
			sweetOneWithTargetWeight = sweets.stream()
					.filter(s -> s.getWeight() == targetWeight)
					.collect(Collectors.toList());
		}
		sweetOneWithTargetWeight.sort(Comparator.comparing(Sweet::getPrice));
		if (currentWeight > targetWeight) {
			Iterator<Sweet> iterator = sweets.iterator();
			while (iterator.hasNext()) {
				Sweet sweet = iterator.next();
				if (sweet.weight == targetWeight && sweet.price == sweetOneWithTargetWeight.get(0).price)
				iterator.remove();
			}
		} else {
			System.out.println("Вес коробки равен или меньше целевого веса");
			System.out.println("----------------------");
		}
	}
}


