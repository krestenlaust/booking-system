package bookingsystem
import com.github.nscala_time.time.StaticLocalDateTime

class Reservation extends TimeSlot:
  override def overlaps(other: TimeSlot): Boolean = ???

  override def covers(other: TimeSlot): Boolean = ???

  override def startDate: StaticLocalDateTime = ???

  override def endDate: StaticLocalDateTime = ???

  override def available: Boolean = ???

  /**
   * Updates the time used by the group
   * when the reservation is approved.
   * @return
   */
  def approve = ??? // No idea

  override def toString: String = ???

