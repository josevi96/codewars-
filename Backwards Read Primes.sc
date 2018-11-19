
object Solution {
  def backwardsPrime(start: Long, nd: Long): String = {
    (start to nd).filter(e => isPrime1(e) && !isPalindromo(e) && isPrime1(rotate(e))).mkString(",")
 }
  def rotate(n: Long)= {n.toString.reverse.toInt}
  def isPrime1(n: Long): Boolean = {! ((2L until n-1L) exists (n % _ == 0L))}
  def isPalindromo(n: Long):Boolean = {n.toString==n.toString.reverse}
}
