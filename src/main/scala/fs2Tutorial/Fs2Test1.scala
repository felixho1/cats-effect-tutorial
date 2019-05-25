package fs2Tutorial
import cats.effect.IO
object Fs2Test1 {
  def main(args: Array[String]): Unit = {
    val s1a = fs2.Stream(1, 2, 3)
    val eff = fs2.Stream.eval(IO { println("BEING RUN!!"); 1 + 1 })
    val result =
      eff.compile // combine into 1 effect
      .toList // IO[List[Int]]
        .unsafeRunSync() // List[Int]
  }
}
