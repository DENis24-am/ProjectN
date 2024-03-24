package model.button

enum class ButtonUi(
    val percentWidth: Float,
    val percentHeight: Float,
) {
    Left(0.1f, 0.7f),
    Right(0.1f, 0.7f),
    Top(0.55f, 0.1f),
    Unknown(0f, 0f)
}