object MultiplesOf3Or5 {
  def solution(number: Int): Long = {
     (0 to number-1).filter(e => e % 3 == 0 || e % 5 == 0).reduce(_+_)
  }
  val a  = solution(100000)
}
