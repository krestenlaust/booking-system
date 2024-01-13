package bookingsystem

import com.github.nscala_time.time.Imports.*

/**
 * An interface TimeSlot that represents time slots that can be booked
 *
 * @author The Teacher
 * @version 1.1, 2023-12-04
 */
trait TimeSlot(startTime: LocalDateTime, val duration: Duration):
  def overlaps(other: TimeSlot): Boolean =
    other.endDate.isAfter(startDate) && endDate.isAfter(other.startDate)

  def covers(other: TimeSlot): Boolean =
    ???

  def startDate: LocalDateTime =
    startTime

  def endDate: LocalDateTime =
    startTime + duration

  def available: Boolean
