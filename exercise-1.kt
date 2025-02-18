import kotlin.random.Random

fun main() {
    val numbers = List(10) { Random.nextInt(1, 51) }
    val evenCount = numbers.count { it % 2 == 0 }
    val oddCount = numbers.size - evenCount

    println("Números gerados: $numbers")
    println("Quantidade de pares: $evenCount")
    println("Quantidade de ímpares: $oddCount")
}
