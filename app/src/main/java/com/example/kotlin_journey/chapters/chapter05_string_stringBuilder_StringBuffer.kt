fun main() {
    val singleLineText = "Kotlin"
    val multiLineText = """
        Kotlin is a statically typed programming language developed by JetBrains.
                         It is designed to be fully interoperable with Java.
    """.trimIndent()
    val escapedText = "Kotlin is a \"Statically Typed\" language"

    val concatenatedText = "Kotlin" + " is a statically typed language"
    val templateText = "$singleLineText is a statically typed language"
    println("* singleLineText => $singleLineText")
    println("* multiLineText => $multiLineText")
    println("* escapedText => $escapedText")
    println("* concatenatedText => $concatenatedText")
    println("* templateText => $templateText")



    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello")
    stringBuilder.append(" World", "\n                   ...Hi Kotlin")
    stringBuilder.insert(0, "...")
    println("* stringBuilder => $stringBuilder")

    val stringBuffer = StringBuffer()
    stringBuffer.append("Hello")
    stringBuffer.append(" World", "\n                  ...Hi Kotlin")
    stringBuffer.insert(0, "...")
    println("* stringBuffer => $stringBuffer")


}