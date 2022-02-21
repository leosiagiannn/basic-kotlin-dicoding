import javax.xml.crypto.Data




import kotlin.math.*

fun main(){
    println(PI)
    println(cos(120.0))
    println(sqrt(9.0))
}


/* Safe Calls */
//fun main(){
//    val text: String? = null
//    println(text?.length)
//}


/* Elvis Operator */
//fun main() {
//    val text: String? = null
//    val textLength = text?.length ?: 7
//    println(textLength)
//}


/* Data Class */
//data class DataUser(val name : String, val age : Int)
//fun main(){
//    val dataUser = DataUser("Leonardo Siagian", 20)
//    println(dataUser)
//}

/* Sequences */
//fun main(){
//    val sequenceNumber = generateSequence(5) { it * 3 }
//    sequenceNumber.take(5).forEach { print("$it ") }
//}


/* Variable Argument */
//fun main(){
//    val temp = getNumberSize(3,4,6,7,8,9,6,5,4,3,54,6)
//    println(temp)
//}
//fun getNumberSize(vararg number: Int): Int {
//    return number.sum()
//}


/* Extension Function */
//fun main(){
//    println("Leonardo".nameStudent())
//}
//fun String.nameStudent(): String{
//    return "The name of Student is $this"
//}


/* Extension Properties */
//fun main(){
//    println(8.multiplyBy3)
//}
//val Int.multiplyBy3: Int
//    get() = this*3


/* Function Type */
//fun main(){
//    val sumAll = sum(15, 20)
//    val mutltiplyAll = multiply(5, 4)
//    println(sumAll)
//    println(mutltiplyAll)
//}
//typealias Arithmetic = (Int, Int) -> Int
//val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
//val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }


/* Lambda */
//fun main(){
//    println(printMessage("Hai I'M Leonardo Siagian"))
//}
//val printMessage = { message: String -> message }

//Higher-Order Function
//fun main(){
//    var value = sumAllValue(20){
//        a -> a * a
//    }
//    println(value)
//}
//fun sumAllValue(value: Int, addFromLambda: (Int) -> Int) : Int{
//    return addFromLambda(value)
//}

//Lambda With Receiver
//fun main() {
//    val message = buildString {
//        append("Hello ")
//        append("from ")
//        append("lambda")
//    }
//    println(message)
//}
//fun buildString(action: StringBuilder.() -> Unit): String {
//    val stringBuilder = StringBuilder()
//    stringBuilder.action()
//    return stringBuilder.toString()
//}


/* Context Object */
//Lambda receiver (this)
//fun main() {
//    val buildString = StringBuilder().apply {
//        append("Hello ")
//        append("Kotlin")
//    }
//    println(buildString)
//}

//Lambda argument (it)
//fun main(){
//    val text = "Hello"
//    text.let {
//        val message = "$it Kotlin"
//        println(message)
//    }
//}

//Run
//fun main() {
//    val text = "Hello"
//    val result = text.run {
//        val from = this
//        val to = this.replace("Hello", "Kotlin")
//        "replace text from $from to $to"
//    }
//    println("result : $result")
//}

//With
//fun main() {
//    val message = "Hello Kotlin!"
//    val result = with(message) {
//        "First character is ${this[0]}" +
//                " and last character is ${this[this.length - 1]}"
//    }
//    println(result)
//}

//Let
//fun main() {
//    val message: String? = null
//    message?.let {
//        val length = it.length * 2
//        val text = "text length $length"
//        println(text)
//    } ?: run {
//        val text = "message is null"
//        println(text)
//    }
//}

//Also
//fun main() {
//    val text = "Hello Kotlin"
//    val result = text.also {
//        println("value length -> ${it.length}")
//    }
//    println("text -> $result")
//}


/* Member References */
//References extensions function
//fun main() {
//    val numbers = 1.rangeTo(10)
//    val evenNumbers = numbers.filter(Int::isEvenNumber)
//    println(evenNumbers)
//}
//fun Int.isEvenNumber() = this % 2 == 0


/* Inner Function */
//fun main(){
//    println(sum(4,5,7))
//}
//fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
//    fun validateNumber(value: Int) {
//        if (value == 0) {
//            throw IllegalArgumentException("value must be better than 0")
//        }
//    }
//    validateNumber(valueA)
//    validateNumber(valueB)
//    validateNumber(valueC)
//    return valueA + valueB + valueC
//}


/* Fold */
//fun main(){
//    val numbers = listOf(1, 2, 3)
//    val fold = numbers.fold(30) { current, item ->
//        println("current $current")
//        println("item $item")
//        println()
//        current + item
//    }
//    println("Fold result: $fold")
//}


/* Drop */
//fun main(){
//    val number = listOf(1, 2, 3, 4, 5, 6)
//    val drop = number.drop(3)
//    println(drop)
//}


/* Take */
//fun main(){
//    val total = listOf(1, 2, 3, 4, 5, 6)
//    val take = total.takeLast(3)
//    println(take)
//}


/* Slice */
//fun main(){
//    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val slice = total.slice(3..6 step 2)
//    println(slice)
//}


/* Distinct */
//data class Item(val key: String, val value: Any)
//fun main(){
//    val items = listOf(
//        Item("1", "Kotlin"),
//        Item("2", "is"),
//        Item("3", "Awesome"),
//        Item("3", "as"),
//        Item("3", "Programming"),
//        Item("3", "Language")
//    )
//    val distinctItems = items.distinctBy { it.key }
//    distinctItems.forEach {
//        println("${it.key} with value ${it.value}")
//    }
//}


/* Chunked */
//fun main(){
//    val word = "QWERTY"
//    val chunkedTransform = word.chunked(3) {
//        it.toString().toLowerCase()
//    }
//    println(chunkedTransform)
//}


/* Rekursif */
//fun main(){
//    println("Faktorial dari 9 adalah ${factorial(9)}")
//}
//fun factorial(n: Int): Int {
//    return if (n == 1) {
//        n
//    } else {
//        n * factorial(n - 1)
//    }
//}


/* Tailrec */
//fun main(){
//    println("Faktorial dari 9 adalah ${factorial(12)}")
//}
//tailrec fun factorial(n: Int): Int {
//    return if (n == 1) {
//        n
//    } else {
//        n * factorial(n - 1)
//    }
//}


/* Delegate Class */
//import kotlin.reflect.KProperty
//class DelegateName {
//    private var value: String = "Default"
//    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
//        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
//        return value
//    }
//    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
//        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
//        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
//        value = newValue
//    }
//}
//class Animal {
//    var name: String by DelegateName()
//}
//class Person {
//    var name: String by DelegateName()
//}
//class Hero {
//    var name: String by DelegateName()
//}
//fun main() {
//    val animal = Animal()
//    animal.name = "Dicoding Miaw"
//    println("Nama Hewan: ${animal.name}")
//
//    val person = Person()
//    person.name = "Dimas"
//    println("Nama Orang: ${person.name}")
//
//    val hero = Hero()
//    hero.name = "Gatotkaca"
//    println("Nama Pahlawan: ${hero.name}")
//}