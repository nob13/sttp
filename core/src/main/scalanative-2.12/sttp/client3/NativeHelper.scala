package sttp.client3

import scala.scalanative.unsafe

private[client3] object NativeHelper {
  def withZone[T](f: unsafe.Zone => T): T = {
    unsafe.Zone { implicit zone =>
      f(zone)
    }
  }
}