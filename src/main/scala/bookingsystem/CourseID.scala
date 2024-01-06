package bookingsystem

case class CourseID(val shortname: String) extends Ordered[CourseID]:
  override def compare(that: CourseID): Int =
    shortname.compare(that.shortname)
