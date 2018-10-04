object HumanTime {

  def formatDuration(seconds: Int): String = {

    def formatUnit(num: Int, unit: String) = {
      if (num == 0) "" else if (num == 1) s"1 $unit" else  s"$num ${unit}s"
    }

    val years = formatUnit(seconds / 31536000, "year")
    val days = formatUnit((seconds % 31536000) / 86400, "day")
    val hours = formatUnit(((seconds % 31536000) % 86400) / 3600, "hour")
    val mins = formatUnit((((seconds % 31536000) % 86400) % 3600) / 60, "minute")
    val secs = formatUnit((((seconds % 31536000) % 86400) % 3600) % 60, "second")

    List(years, days, hours, mins, secs).filter(s => s != "") match {
      case Nil => "now"
      case List(single) => single
      case list => s"${list.init.mkString(", ")} and ${list.last}"
    }
  }
}