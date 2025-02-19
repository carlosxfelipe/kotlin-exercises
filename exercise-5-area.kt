class AreaConversion {

  fun m2ToFt2(value: Double) {
    val result = value * 10.76
    println("$value metros quadrados para pés quadrados: $result")
  }

  fun ft2ToCm2(value: Double) {
    val result = value * 929
    println("$value pés quadrados para centímetros quadrados: $result")
  }

  fun mi2ToAcres(value: Double) {
    val result = value * 640
    println("$value milhas quadradas para acres: $result")
  }

  fun acresToFt2(value: Double) {
    val result = value * 43560
    println("$value acres para pés quadrados: $result")
  }
}

fun main() {
  val conversion = AreaConversion()
  val inputValue = 2.0

  conversion.m2ToFt2(inputValue)
  conversion.ft2ToCm2(inputValue)
  conversion.mi2ToAcres(inputValue)
  conversion.acresToFt2(inputValue)
}
