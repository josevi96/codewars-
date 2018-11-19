object LoveVsFriendship {
  def loveVsFriendship(s: String): Int = {
    s.toList.map(letterValue(_)).sum
  }
  def letterValue(char: Char) = {
    char match {
      case 'a' => 1
      case 'b' => 2
      case 'c' => 3
      case 'd' => 4
      case 'e' => 5
      case 'f' => 6
      case 'g' => 7
      case 'h' => 8
      case 'i' => 9
      case 'j' => 10
      case 'k' => 11
      case 'l' => 12
      case 'm' => 13
      case 'n' => 14
      case 'o' => 15
      case 'p' => 16
      case 'q' => 17
      case 'r' => 18
      case 's' => 19
      case 't' => 20
      case 'u' => 21
      case 'v' => 22
      case 'w' => 23
      case 'x' => 24
      case 'y' => 25
      case 'z' => 26
    }
  }
}