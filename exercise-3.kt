class Person(val name: String, val age: Int, val profession: String) {
  fun displayInfo() {
    println("Nome: $name, Idade: $age, Profissão: $profession")
  }
}

fun main() {
  val person1 = Person("Carlos Felipe", 37, "Programador")
  val person2 = Person("Isabelle Mosca", 33, "Analista de BI ")
  val person3 = Person("Luís Felipe", 6, "Filho")

  person1.displayInfo()
  person2.displayInfo()
  person3.displayInfo()
}
