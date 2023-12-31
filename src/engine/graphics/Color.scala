// DO NOT MODIFY FOR BASIC SUBMISSION
// scalastyle:off

package engine.graphics

/** Color in red green blue, where each color value is in the range 0-255 */
case class Color(red: Float, green: Float, blue: Float, alpha: Float) {

  // This is called on new Color(r, g, b)
  def this(red: Float, green: Float, blue: Float) = this(red, green, blue, 255)

  def linearInterpolation(l: Float, r: Float, t: Float): Float = (1 - t) * l + t * r

  def interpolate(fraction: Float, rhs: Color): Color =
    Color(linearInterpolation(red,   rhs.red,   fraction),
          linearInterpolation(green, rhs.green, fraction),
          linearInterpolation(blue,  rhs.blue,  fraction),
          linearInterpolation(alpha, rhs.alpha, fraction)
    )

  def darken(rate : Float) : Color = {
    Color(red * rate , green * rate , blue * rate)
  }
}

/** Color companion object */
object Color {

  // This is called on Color(r, g, b) (without new)
  def apply(red: Float, green: Float, blue: Float): Color = new Color(red, green, blue)

  val LawnGreen = Color(124, 252,   0)
  val DarkGreen = Color(  0, 100,   0)

  val Black     = Color(  0,   0,   0)

  val Gray      = Color(100, 100, 100)

  val Red       = Color(255,   0,   0)
  val shadowRed = Color(250, 143, 143)

  val White     = Color(255, 255, 255)
  val test = Color(232,156,156)
  val LightBlue = Color(173, 216, 230)
  val shadowLightBlue = Color(135,206,250)

  val Yellow    = Color(255, 255,   0)
  val shadowYellow = Color(243, 250, 143)

  val Orange    = Color(255, 165,   0)
  val shadowOrange = Color(250, 202, 143)

  val Blue      = Color(  0,   0, 255)
  val shadowBlue = Color(155, 143, 250)

  val Green     = Color(  0, 255,   0)
  val shadowGreen = Color(101, 247, 85)

  val Purple    = Color(128,   0, 128)
  val shadowPurple = Color(209, 143, 250)

  val grey      = Color(192 ,192 , 192 )




}