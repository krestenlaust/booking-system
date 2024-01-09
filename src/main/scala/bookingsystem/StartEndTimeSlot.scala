package bookingsystem
import com.github.nscala_time.time.Imports
import com.github.nscala_time.time.Imports.{Duration, LocalDateTime}
import com.github.nscala_time.time.Imports.*

trait StartEndTimeSlot(val startTime: LocalDateTime, val duration: Duration) extends TimeSlot:
  override def overlaps(other: TimeSlot): Boolean = ???

  override def covers(other: TimeSlot): Boolean = ???

  override def startDate: LocalDateTime =
    startTime

  override def endDate: LocalDateTime =
    startTime + duration
