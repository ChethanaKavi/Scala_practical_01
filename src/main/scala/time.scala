object time {
  def easy(x: Int) = x * 8
  def tempo(y: Int) = y * 7
  def total(x: Int, y: Int, z: Int) = easy(x) + tempo(y) + easy(z)

  def main(arg: Array[String]): Unit = {
    var x = 2
    var y = 3
    var tot = total(2, 3, 2);
    println("Total running time " + tot)
  }
}