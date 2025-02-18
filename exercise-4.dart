class Product {
  String name;
  double price;
  int quantity;

  Product(this.name, this.price, this.quantity);

  void updatePrice(double newPrice) {
    price = newPrice;
    print("Preço do produto \$name atualizado para R\$ \$price");
  }

  void updateQuantity(int newQuantity) {
    quantity = newQuantity;
    print("Quantidade do produto \$name atualizada para \$quantity unidades");
  }

  void displayInfo() {
    print(
        "Produto: \$name | Preço: R\$ \$price | Estoque: \$quantity unidades");
  }
}

void main() {
  Product product1 = Product("MacBook Air M3", 15999.00, 10);
  Product product2 = Product("iPhone 16 Plus", 8099.00, 20);
  Product product3 = Product("Magic Mouse", 829.00, 50);

  product1.displayInfo();
  product2.displayInfo();
  product3.displayInfo();

  print("\nAtualizando preços e estoques...");
  product1.updatePrice(11699.00);
  product2.updateQuantity(15);

  print("\nProdutos atualizados:");
  product1.displayInfo();
  product2.displayInfo();
  product3.displayInfo();
}
