package bookingsystem

import com.github.nscala_time.time.StaticDuration

/**
 * Represents the groups that can reserve rooms.
 * Keeps track of group id, time reserved, number of members, and student ids of its members.
 *
 * @param id
 */
class Group(val id: Int) extends Ordered[Group], Identifiable[Int]:

  /**
   * Extends the reserved time by a specified duration.
   * @param duration The duration to extend the reserved time by.
   */
  def addTime(duration: StaticDuration): Unit =
    ???

  /**
   * Sets the reserved time to zero.
   * This method is used by administrators
   * when a new reservation period starts.
   */
  def clearTime: Unit =
    ???

  override def compare(that: Group): Int =
    ???

  override def identifier: Int = id

