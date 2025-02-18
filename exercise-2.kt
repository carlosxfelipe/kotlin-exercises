import kotlin.random.Random

// fun main() {
//     val dice = Random.nextInt(1, 7)
//     println("O dado caiu no lado: $dice")
// }

fun main() {
    print("Quantos lados tem o dado? ")
    val sides = readLine()?.toIntOrNull() ?: 6

    val dice = Random.nextInt(1, sides + 1)
    println("O dado caiu no lado: $dice")
}
