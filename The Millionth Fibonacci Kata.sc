object Fib {
  val fib: Stream[BigInt] = 0 #:: 1 #:: fib.zip(fib.tail).map(p => p._1 + p._2)

  def main(args: Array[String]){
    val s = fib take 185 mkString ” “
    print(s)
    println()
    print(fib(180))
  }
}



