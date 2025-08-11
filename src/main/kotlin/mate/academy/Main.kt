package mate.academy

fun greetUsers() {
    println("Please enter a name (or press Enter to quit): ")
    val name = readln()
    if (name.isEmpty()) println("Hello!") else println("Hello, $name!")
}

fun main() {
    greetUsers()
}
