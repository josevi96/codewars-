object Immortal {
  /**
    * set true to enable debug
    */
  val debug = false

  def elderAge(n: Long, m: Long, k: Long, newp: Long): Long = {

    def timeDonation(matrix: Array[Long]) = {
      val magicArray = matrix.map(e => if (e > k) e - k else e)
      val time = matrix.filter(_ > k).size * k
      (magicArray, time)
    }

    def recur(magicMatrix: Array[Long], acc: Long, newp: Long): Long = {
      val (newMatrix, newAcc) = timeDonation(magicMatrix)
      if (k == 0) {
        magicMatrix.sum
      } else if (newp > 0 && newAcc != 0) {
        recur(newMatrix, newAcc + acc, newp - 1L)
      } else {
        acc
      }
    }

    val magicMatrix = Array.tabulate(n.toInt, m.toInt)({
      case (0, j) => j
      case (i, 0) => i
      case (i, j) => i ^ j
    })
    val longArray = magicMatrix.flatten.map{_.toLong}
    val finalTime = recur(longArray, 0, newp)
    if (finalTime > newp) finalTime % newp else finalTime
  }
  elderAge(5, 45, 3, 1000007)
}