package bookingsystem

import com.github.nscala_time.time.Imports.*

/**
 * An interface TimeSlot that represents time slots that can be booked
 *
 * @author The Teacher
 * @version 1.1, 2023-12-04
 */
trait TimeSlot {
  def overlaps(other: TimeSlot): Boolean
  def covers(other: TimeSlot): Boolean

  def startDate: LocalDateTime
  def endDate: LocalDateTime

  def available: Boolean
}
