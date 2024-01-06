package bookingsystem
import com.github.nscala_time.time.Imports.*

class Reservation(val startTime: LocalDateTime, val duration: Duration) extends TimeSlot:
  override def overlaps(other: TimeSlot): Boolean =
    ???

  override def covers(other: TimeSlot): Boolean =
    ???

  override def startDate: LocalDateTime =
    startTime

  override def endDate: LocalDateTime =
    startTime + duration

  override def available: Boolean =
    ???

  /**
   * Updates the time used by the group
   * when the reservation is approved.
   * @return
   */
  def approve =
    ??? // No idea

  override def toString: String =
    ???
