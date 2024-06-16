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

		Sweet truffle = new Sweet("Трюфель", 430, 470, 3) {
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
		Sweet caramel = new Sweet("Карамель", 280, 420, 4) {
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
		giftBox.addSweet(caramel);
		giftBox.addSweet(truffle);

		// Показать все сладости
		giftBox.displayAllSweets();

		// Показать общий вес коробки
		double totalWeight = giftBox.getTotalWeight();
		System.out.println("Общий вес коробки: " + totalWeight + " г");

		// Показать общую цену коробки
		double totalPrice = giftBox.getTotalPrice();
		System.out.println("Общая цена коробки: " + totalPrice + " руб");

		// Удалить последний элемент-сладость
		giftBox.removeLastSweet();

		// Удалить сладость по индексу
		giftBox.removeSweet(caramel.getUniqueParameter());

		//  Показать коробку сладостей
		giftBox.displayAllSweets();

		// Оптимизация коробки по цене, цена коробки меньше целевой цены
		giftBox.optimizePrice(1400);

		// Оптимизация коробки по весу, вес коробки меньше целевого веса
		giftBox.optimizeWeight(990);
	}
}
