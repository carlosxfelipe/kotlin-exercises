class Product {
    var name: String
    var price: Double
    var quantity: Int

    init(name: String, price: Double, quantity: Int) {
        self.name = name
        self.price = price
        self.quantity = quantity
    }

    func updatePrice(newPrice: Double) {
        self.price = newPrice
        print("Preço do produto \(name) atualizado para R$\(price)")
    }

    func updateQuantity(newQuantity: Int) {
        self.quantity = newQuantity
        print("Quantidade do produto \(name) atualizada para \(quantity) unidades")
    }

    func displayInfo() {
        print("Produto: \(name) | Preço: R$\(price) | Estoque: \(quantity) unidades")
    }
}

let product1 = Product(name: "MacBook Air M3", price: 15999.00, quantity: 10)
let product2 = Product(name: "iPhone 16 Plus", price: 8099.00, quantity: 20)
let product3 = Product(name: "Magic Mouse", price: 829.00, quantity: 50)

product1.displayInfo()
product2.displayInfo()
product3.displayInfo()

print("\nAtualizando preços e estoques...")
product1.updatePrice(newPrice: 11699.00)
product2.updateQuantity(newQuantity: 15)

print("\nProdutos atualizados:")
product1.displayInfo()
product2.displayInfo()
product3.displayInfo()
