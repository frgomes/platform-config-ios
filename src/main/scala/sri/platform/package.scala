package sri


import sri.universal.SriPlatForm

package object platform {
  
  implicit object SriPlatForm extends SriPlatForm {

  @inline def isIOS: Boolean = true
  @inline def isAndroid: Boolean = false
  @inline def isWeb: Boolean = false
}


}
