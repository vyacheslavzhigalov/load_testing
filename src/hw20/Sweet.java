package hw20;

public abstract class Sweet {

	protected String name;
	protected double weight;
	protected double price;
	protected int uniqueParameter;

	// конструктор
	public Sweet(String name, double weight, double price, int uniqueParameter) {
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.uniqueParameter = uniqueParameter;
	}

	// геттеры
	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public double getPrice() {
		return price;
	}

	public int getUniqueParameter() {
		return uniqueParameter;
	}

	// вывод информации о сладости
	public void display() {
		System.out.println("Название: " + name);
		System.out.println("Вес: " + weight + " г");
		System.out.println("Цена: " + price + " руб");
		System.out.println("Уникальный параметр: " + uniqueParameter);
	}
}
