package bookingsystem
import com.github.nscala_time.time.Imports._

/**
 * Represents an available time slot
 * from a start time to an end time.
 */
class FreeSlot extends TimeSlot:

  override def overlaps(other: TimeSlot): Boolean = ???

  override def covers(other: TimeSlot): Boolean = ???

  override def startDate: LocalDateTime = ???

  override def endDate: LocalDateTime = ???

  override def available: Boolean = ???

  override def toString: String = ???
