package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;//O tipo primitivo int já inicia a variável com o valor 0.
	
	//Construtor
	//Ele vai ter o nome da classe.
	//Podemos colocar parâmetros entre parênteses.
	//Não tem o tipo de retorno e é executado no momento da instanciação do objeto.
	//Para que me construtor pegue os atributos da classe obrigatoriamente,
	//o construtor precisa recebê-los como parâmetro.
	//A palavra this aqui fazer uma referência para o próprio objeto, ou seja,
	//this.name faz referência para o atributo name do objeto instanciado na classe Product.
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Sobrecarga
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//Construtor padrão
	public Product() {
		
	}
	
	//Por conveção os getters e setters são colocados depois dos contrutores
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity(int quantity) {
		return quantity;
	}

	//Métodos da minha classe.
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
