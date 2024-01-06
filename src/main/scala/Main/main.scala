package Main
import bookingsystem.BookingSystem

@main
def main(): Unit =
  val bookingSystem: BookingSystem = new BookingSystem

  bookingSystem.loadState
  println("Hello world!")