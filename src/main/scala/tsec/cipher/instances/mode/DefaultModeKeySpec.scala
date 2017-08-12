package tsec.cipher.instances.mode

import javax.crypto.spec.IvParameterSpec
import tsec.cipher.instances._

abstract class DefaultModeKeySpec[T](repr: String) {
  implicit val spec = new ModeKeySpec[T]{
    override lazy val algorithm: String = repr
    def buildAlgorithmSpec(specBytes: Array[Byte]): JSpec[T] = tagSpec[T](new IvParameterSpec(specBytes))
  }
}
