package bookingsystem

/**
 * An interface Identifiable with parameter type A
 * that represents entity with an identifier
 *
 * @author The Teacher
 * @version 1.1, 2023-10-20
 */
trait Identifiable[A]:
  def identifier : A
