package bookingsystem
import com.github.nscala_time.time.Imports._

/**
 * Represents an available time slot
 * from a start time to an end time.
 */
class FreeSlot(startTime: LocalDateTime, duration: Duration) extends StartEndTimeSlot(startTime, duration):
  override def available: Boolean = ???

  override def toString: String = ???
