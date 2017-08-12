package tsec.cipher

import com.softwaremill.tagging.@@
import tsec.core.CryptoTag

package object core {
  case class PlainText[A,M,P](content: Array[Byte])
  case class CipherText[A,M,P](content: Array[Byte], iv: Array[Byte])
  case class AAD(aad: Array[Byte]) extends AnyVal

  sealed trait CipherAlgorithm
  sealed trait CipherMode
  sealed trait CipherPadding

  type CipherAlgo[T] = CryptoTag[T] @@ CipherAlgorithm
  type Padding[T] = CryptoTag[T] @@ CipherPadding
}
