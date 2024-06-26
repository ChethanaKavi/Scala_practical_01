object volumeOfSphere {
  def volumeOfSphere(r: Double): Double = 4*math.Pi *r*r*r/3

  def main(args: Array[String]): Unit = {
    val r = 5
    val volume = volumeOfSphere(r)
    println(f"Volume of Sphere is $volume%.2f")
  }

}
