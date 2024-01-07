package bookingsystem

import scala.collection.mutable.ListBuffer
import com.github.nscala_time.time.Imports._

class Room(id: String) extends Identifiable[String]:
  private val calendar = ListBuffer.empty[TimeSlot]

  override def identifier: String = id

  /**
   * Returns true if the room is available at the time period represented by t.
   * @param t
   * @return
   */
  def available(t: TimeSlot): Boolean =
    ???

  /**
   * Adds the reservation r to the room's calendar.
   * @param r
   */
  def book(r: Reservation): Unit = ???
    //calendar.addOne()

  override def toString: String = ???

  /**
   * String representation of the room including its calendar
   * with busy and available times on a date.
   * @param date
   * @return
   */
  def toString(date: LocalDate): String = ???
