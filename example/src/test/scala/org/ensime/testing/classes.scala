// Copyright (C) 2016 Sam Halliday
// License: http://www.gnu.org/licenses/gpl.html
package org.ensime.testing

import org.ensime.annotation.noddy
import scala.concurrent.Future

@noddy
class Me

@noddy
class Myself(val foo: String, val bar: Long)

class Irene

@noddy
trait Mallgan

@noddy
object MyObj {
  def apply(foo: String, bar: Long): Me = null
}

@noddy
class Foo(foo: String, bar: Long) {
  val baz: String = foo // shouldn't be in constructor
}
object Foo {
  def ignore(foo: String, bar: Long): Foo = new Foo(foo, bar)
}

@noddy
class Baz[T](val fred: T)

@noddy
class Mine(val foo: String = "foo", val bar: Long = 13)

@noddy class Covariant[+I](item: I)
@noddy class Contravariant[-I](item: I)

@noddy
class LoggingFutures(a: String, b: Long) {
  def exposed = log
}
@noddy
object LoggingFutures {
  def exposed = log

  def a: Future[String] = null
  def b: Future[Long] = null
}
