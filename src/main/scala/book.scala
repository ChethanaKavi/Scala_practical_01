object book {
  def bookCoverPrice(n: Int) = n * 24.95

  def discount(p: Double): Double = p * 0.4

  def price(n:Int):Double= bookCoverPrice(n)-discount(bookCoverPrice(n))

  def shippingCost(n: Int): Double =
    if (n <= 50) n * 3 else (n * 3) + (n - 50) * 0.75

  def total(n: Int): Double = price(n) + shippingCost(n)


  def main(args: Array[String]): Unit = {
    val n = 60
    val totalprice = total(n)
    println(f"Total price is $totalprice%.2f")
  }

}
