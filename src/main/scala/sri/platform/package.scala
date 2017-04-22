package sri

import sri.universal.SriPlatform

package object platform {

  implicit object SriPlatform extends SriPlatform {

    @inline def isIOS: Boolean = true
    @inline def isAndroid: Boolean = false
    @inline def isWeb: Boolean = false
  }

}
