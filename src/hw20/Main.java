package hw20;

public class Main {

	public static void main(String[] args) {
		BoxOfSweets giftBox = new GiftBox();

		Sweet candy = new Sweet("Мармеладки", 100, 200, 1) {
			@Override
			public String getName() {
				return super.getName();
			}

			@Override
			public double getWeight() {
				return super.getWeight();
			}

			@Override
			public double getPrice() {
				return super.getPrice();
			}

			@Override
			public int getUniqueParameter() {
				return super.getUniqueParameter();
			}

			@Override
			public void display() {
				super.display();
			}
		};
		Sweet chocolate = new Sweet("Аленка", 150, 300, 2) {
			@Override
			public String getName() {
				return super.getName();
			}

			@Override
			public double getWeight() {
				return super.getWeight();
			}

			@Override
			public double getPrice() {
				return super.getPrice();
			}

			@Override
			public int getUniqueParameter() {
				return super.getUniqueParameter();
			}

			@Override
			public void display() {
				super.display();
			}
		};

		giftBox.addSweet(candy);
		giftBox.addSweet(chocolate);

		giftBox.displayAllSweets();

		double totalWeight = giftBox.getTotalWeight();
		System.out.println("Общий вес коробки: " + totalWeight + " г");

		double totalPrice = giftBox.getTotalPrice();
		System.out.println("Общая цена коробки: " + totalPrice + " руб");
		// Оптимизация коробки по весу
		giftBox.optimizeWeight(400);
		giftBox.removeLastSweet();
		giftBox.displayAllSweets();
	}
}
