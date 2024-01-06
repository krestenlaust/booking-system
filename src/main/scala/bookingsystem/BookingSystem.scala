package bookingsystem

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

class BookingSystem:
  private val rooms = ListBuffer.empty[Room]

  /**
   * Course IDs are mapped to the list of groups
   * registered in a course.
   */
  private val groups = mutable.HashMap.empty[CourseID, ListBuffer[Group]]

  private val requestedReservations = mutable.HashMap.empty[Room, ListBuffer[Reservation]]

  /**
   * Allows to request the reservation of a room by a group.
   */
  def bookInAdvance: Unit =
    ???

  /**
   * Shows the available and busy times of the rooms.
   */
  def showCalendars: Unit =
    ???

  /**
   * Handles all the reservation requests
   * in the order defined by the compareTo-method.
   */
  def handleRequests: Unit =
    ???

  /**
   * Loads the information about rooms, groups, and reservations
   * from the CSV files `input\rooms.csv`, `input\groups.csv`, `input\reservations.csv`.
   */
  def loadState: Unit =
    ???

  /**
   * Sets the reserved time to zero for all the groups.
   */
  def startNewReservationPeriod: Unit =
    ???

  /**
   * Adds a new group of students to a course.
   */
  def addGroup: Unit =
    ???
