class Product(var name: String, var price: Double, var quantity: Int) {
  fun updatePrice(newPrice: Double) {
    price = newPrice
    println("Preço do produto $name atualizado para R$$price")
  }

  fun updateQuantity(newQuantity: Int) {
    quantity = newQuantity
    println("Quantidade do produto $name atualizada para $quantity unidades")
  }

  fun displayInfo() {
    println("Produto: $name | Preço: R$$price | Estoque: $quantity unidades")
  }
}

fun main() {
  val product1 = Product("MacBook Air M3", 15999.00, 10)
  val product2 = Product("iPhone 16 Plus", 8099.00, 20)
  val product3 = Product("Magic Mouse", 829.00, 50)

  product1.displayInfo()
  product2.displayInfo()
  product3.displayInfo()

  println("\nAtualizando preços e estoques...")
  product1.updatePrice(11699.00)
  product2.updateQuantity(15)

  println("\nProdutos atualizados:")
  product1.displayInfo()
  product2.displayInfo()
  product3.displayInfo()
}
