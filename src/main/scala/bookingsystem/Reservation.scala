package bookingsystem
import com.github.nscala_time.time.Imports.*

class Reservation(val group: Group, startTime: LocalDateTime, duration: Duration) extends TimeSlot(startTime, duration):
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
