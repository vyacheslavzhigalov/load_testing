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
		Sweet chocolate = new Sweet("Аленка", 150, 250, 2) {
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

		Sweet truffle = new Sweet("Трюфель", 150, 470, 3) {
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
		Sweet caramel = new Sweet("Карамель", 150, 420, 4) {
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

		giftBox.addSweet(caramel);
		giftBox.addSweet(truffle);
		giftBox.addSweet(candy);
		giftBox.addSweet(chocolate);

		giftBox.displayAllSweets();

		double totalWeight = giftBox.getTotalWeight();
		System.out.println("Общий вес коробки: " + totalWeight + " г");

		double totalPrice = giftBox.getTotalPrice();
		System.out.println("Общая цена коробки: " + totalPrice + " руб");

		giftBox.removeLastSweet();

		giftBox.removeSweet(caramel.getUniqueParameter());

		giftBox.displayAllSweets();

		giftBox.optimizeWeight(100);
		giftBox.displayAllSweets();

		giftBox.optimizePrice(100);
		giftBox.displayAllSweets();
	}
}
