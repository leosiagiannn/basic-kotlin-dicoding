fun main(){
    println((1..99 step 9).sum())
}


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


/* Class Generic */
//fun main() {
//    val arrayLongg = arrayOf(9L, 8L)
//    val longArrayList = ArrayList<Long>(9)
//    longArrayList.add(56)
//    longArrayList.add(1)
//    println(longArrayList.get(1))
//}
//class ArrayList<T> : List<T> {
//    override fun get(index: Int): T {
//        return this[index]
//    }
//}
//interface List<T> {
//    operator fun get(index: Int): T
//}


/*
Concurrency terjadi apabila terdapat 2 (dua) atau lebih proses yang tumpang tindih dalam satu waktu.
Ini bisa terjadi jika ada 2 (dua) atau lebih thread yang sedang aktif. Dan jika thread tersebut dijalankan
oleh komputer yang hanya memiliki 1 (satu) core, semua thread tidak akan dijalankan secara paralel.
Concurrency memungkinkan sebuah komputer yang hanya memiliki 1 (satu) core tampak seakan mengerjakan
banyak tugas sekaligus. Padahal sebenarnya tugas-tugas tersebut dilakukan secara bergantian.

Sedangkan parallelism terjadi ketika 2 (dua) proses dijalankan pada titik waktu yang sama persis.
Parallelism bisa dilakukan jika terdapat 2 (dua) atau lebih thread dan komputer juga memiliki 2 (dua)
core atau lebih. Sehingga setiap core dapat menjalankan perintah dari masing-masing thread secara bersamaan.
*/


/*
Untuk memfasilitasi komunikasi antar proses, sebagian besar sistem operasi mendukung sumber daya
Inter Process Communication (IPC), seperti pipes dan soket. Biasanya sistem operasi modern sudah mendukung IPC.
IPC digunakan tidak hanya untuk komunikasi antar proses pada sistem yang sama, melainkan juga untuk proses
pada sistem yang berbeda.
*/


/* Deadlocks
yaitu sebuah kondisi di mana dua proses atau lebih saling menunggu proses yang lain untuk melepaskan
resource yang sedang digunakan.
*/


/* Livelocks
Sama halnya dengan deadlocks, livelocks juga merupakan kondisi di mana sebuah proses tidak bisa
melanjutkan tugasnya. Namun yang membedakannya adalah bahwa selama livelocks terjadi, keadaan dari
aplikasi tetap bisa berubah. Walaupun perubahan keadaan tersebut menyebabkan proses berjalan dengan tidak semestinya.
*/


/*
Aging merupakan sebuah teknik yang secara bertahap meningkatkan prioritas sebuah proses yang menunggu dalam sistem
pada waktu yang cukup lama.
*/


/* Starvation
Starvation merupakan sebuah kondisi yang biasanya terjadi setelah deadlock
*/


/* Race condition merupakan masalah umum pada concurrency, yaitu kondisi di mana terdapat banyak thread yang
mengakses data yang dibagikan bersama dan mencoba mengubahnya secara bersamaan.
*/


/* Coroutines */
//import kotlinx.coroutines.*
//fun main() = runBlocking{
//    launch {
//        delay(1000L)
//        println("Coroutines!")
//    }
//    println("Hello,")
//    delay(2000L)
//}


/* Async */
//import kotlinx.coroutines.*
//import kotlin.system.measureTimeMillis
//
//fun main() = runBlocking {
//    val timeOne = measureTimeMillis {
//        val capital = getCapital()
//        val income = getIncome()
//        println("Your profit is ${income - capital}")
//    }
//
//    val timeTwo = measureTimeMillis {
//        val capital = async { getCapital() }
//        val income = async { getIncome() }
//        println("Your profit is ${income.await() - capital.await()}")
//    }
//
//    println("Completed in $timeOne ms vs $timeTwo ms")
//
//}
//suspend fun getCapital(): Int {
//    delay(1000L)
//    return 50000
//}
//
//suspend fun getIncome(): Int {
//    delay(1000L)
//    return 75000
//}


/* Create Job */
//import kotlinx.coroutines.Job
//import kotlinx.coroutines.launch
//import kotlinx.coroutines.runBlocking
//
//menggunakan launch():
//fun main() = runBlocking {
//    val job = launch {
//        println("leo")
//    }
//}
//
//fun main() = runBlocking {
//    val job = Job()
//}


/* Start Job */
//import kotlinx.coroutines.CoroutineStart
//import kotlinx.coroutines.delay
//import kotlinx.coroutines.launch
//import kotlinx.coroutines.runBlocking
//
//fun main() = runBlocking {
//    val job = launch(start = CoroutineStart.LAZY) {
//        delay(1000L)
//        println("Start new job!")
//    }
//
//    job.start()
//    println("Other task")
//}
//
//fun main() = runBlocking {
//    val job = launch(start = CoroutineStart.LAZY) {
//        delay(1000L)
//        println("Start new job!")
//    }
//
//    job.join()
//    println("Other task")
//}


/* Cancel Job */
//import kotlinx.coroutines.*
//fun main() = runBlocking {
//    val job = launch {
//        delay(5000)
//        println("Start new job!")
//    }
//
//    delay(2000)
//    job.cancel()
//    println("Cancelling job...")
//    if (job.isCancelled){
//        println("Job is cancelled")
//    }
//}
//
//@InternalCoroutinesApi
//fun main() = runBlocking {
//    val job = launch {
//        delay(5000)
//        println("Start new job!")
//    }
//
//    delay(2000)
//    job.cancel(cause = CancellationException("time is up!"))
//    println("Cancelling job...")
//    if (job.isCancelled){
//        println("Job is cancelled because ${job.getCancellationException().message}")
//    }
//}


/* Deferred
adalah nilai tangguhan yang dihasilkan dari proses coroutines.
Nilai ini nantinya bisa kita kelola sesuai dengan kebutuhan.
*/


/* Dispatcher.IO
Sebuah dispatcher yang dapat digunakan untuk membongkar pemblokiran operasi I/O
*/
//import kotlinx.coroutines.*
//
//fun main() = runBlocking<Unit> {
//    launch(Dispatchers.Unconfined) {
//        println("Starting in ${Thread.currentThread().name}")
//        delay(1000)
//        println("Resuming in ${Thread.currentThread().name}")
//    }.start()
//}


/* Single Thread Context
Dispatcher ini menjamin bahwa setiap saat coroutine akan dijalankan pada thread yang Anda tentukan
*/
//import kotlinx.coroutines.*
//
//fun main() = runBlocking<Unit> {
//    val dispatcher = newSingleThreadContext("myThread")
//    launch(dispatcher) {
//        println("Starting in ${Thread.currentThread().name}")
//        delay(1000)
//        println("Resuming in ${Thread.currentThread().name}")
//    }.start()
//}


/* Thread Pool
Sebuah dispatcher yang memiliki kumpulan thread. Ia akan memulai dan melanjutkan coroutine di salah satu
thread yang tersedia pada kumpulan tersebut. Runtime akan menentukan thread mana yang tersedia dan juga
menentukan bagaimana proses distribusi bebannya.
*/
//import kotlinx.coroutines.*
//
//fun main() = runBlocking<Unit> {
//    val dispatcher = newFixedThreadPoolContext(3, "myPool")
//
//    launch(dispatcher) {
//        println("Starting in ${Thread.currentThread().name}")
//        delay(1000)
//        println("Resuming in ${Thread.currentThread().name}")
//    }.start()
//}


/* Channel
Channels adalah nilai deferred yang menyediakan cara mudah untuk mentransfer nilai tunggal antara coroutine.
Pada dasarnya, channels sangat mirip dengan BlockingQueue [11]. Namun, alih-alih memblokir sebuah thread,
channels menangguhkan sebuah coroutine yang jauh lebih ringan.
*/
//import kotlinx.coroutines.*
//import kotlinx.coroutines.channels.Channel
//
//fun main() = runBlocking(CoroutineName("main")) {
//    val channel = Channel<Int>()
//    launch(CoroutineName("v1coroutine")){
//        println("Sending from ${Thread.currentThread().name}")
//        for (x in 1..5) channel.send(x * x)
//    }
//
//    repeat(5) { println(channel.receive()) }
//    println("received in ${Thread.currentThread().name}")
//}
/*
Kesimpulannya, channels memungkinkan komunikasi yang aman antar kode concurrent.
Ia membuat kode concurrent dapat berkomunikasi dengan mengirim dan menerima pesan tanpa harus peduli
di thread mana coroutine berjalan.
*/








/* Rangkuman dari Coroutines

Concurrency adalah beberapa proses yang terjadi pada suatu sistem.
Terjadi apabila terdapat 2 (dua) atau lebih proses yang tumpang tindih dalam satu waktu.

Parallelism sama seperti concurrency,
namun 2 (dua) atau lebih proses tersebut dijalankan pada waktu yang sama persis.

Ada beberapa konsep dasar dari penerapan concurrency yang harus dipelajari yaitu:
Process
Merupakan bagian dari proses aplikasi yang dijalankan. Setiap kali aplikasi dijalankan,
maka saat itu juga proses dijalankan. Tergantung pada sistem operasi yang digunakan, suatu proses
dapat terdiri dari beberapa thread yang menjalankan instruksi secara bersamaan.
Thread
Biasa dikenal sebagai proses yang ringan dan merupakan komponen dari suatu proses aplikasi
yang menjalankan tugas tertentu secara spesifik.
I/O-Bound
Sebuah algoritma yang bergantung pada perangkat input atau output.
Waktu untuk mengeksekusi sebuah I/O-bound tergantung pada kecepatan perangkat yang digunakan.

Ada beberapa permasalahan yang ditimbulkan ketika menerapkan concurrency pada aplikasi, yaitu :
Deadlocks
Sebuah kondisi di mana dua proses atau lebih saling menunggu proses yang
lain untuk melepaskan resource yang sedang digunakan yang mengakibatkan proses yang
sedang berjalan tak kunjung selesai melakukan operasinya.
Livelocks
Kondisi di mana sebuah proses tidak bisa melanjutkan tugasnya,
sama seperti deadlocks. Namun, perbedaannya adalah selama livelocks terjadi,
keadaan aplikasi tetap bisa berubah. Walau perubahan keadaan tersebut menyebabkan proses
berjalan dengan tidak semestinya.
Starvation
Kondisi yang biasa terjadi setelah deadlock. Kondisi ini sering kali menyebabkan sebuah
proses kekurangan sumber daya. Pada kondisi ini, thread menjadi tidak mendapatkan akses
reguler ke sumber daya bersama dan membuat proses terhenti.
Race Conditions
Kondisi di mana terdapat banyak thread yang mengakses data yang dibagikan bersama
dan mencoba mengubahnya secara bersamaan. Ini bisa terjadi ketika kode concurrent yang dituliskan
untuk berjalan secara sekuensial.

Untuk menjalankan coroutine, diperlukan fungsi yang biasa disebut sebagai coroutine builder yang
mengambil suspending lambda dan membuat coroutine untuk menjalankannya. Ada beberapa macam coroutine
builder yaitu:
launch
Fungsi ini digunakan untuk memulai sebuah coroutines yang tidak akan mengembalikan sebuah
hasil dan menghasilkan Job yang dapat digunakan untuk membatalkan eksekusi.
runBlocking
Dibuat untuk menjembatani blocking code menjadi kode yang dapat ditangguhkan.
runBlocking akan memblokir sebuah thread yang sedang berjalan hingga eksekusi coroutine selesai
async
Fungsi ini digunakan untuk memulai sebuah coroutine yang akan mengembalikan sebuah hasil.

Job merupakan hasil dari perintah asynchronous yang dijalankan dan merepresentasikan coroutine yang sebenarnya.
Memiliki 3 properti terdiri dari isActive, isCompleted, dan isCancelled yang menunjukkan state dari Job tersebut.

Deferred adalah nilai kembalian dari fungsi async yang dapat berupa hasil atau exception.
Merupakan nilai tangguhan yang dihasilkan dari proses coroutines dan bisa kita kelola sesuai dengan kebutuhan.

CoroutineDispatcher, merupakan base class yang menentukan thread yang berfungsi untuk menjalankan coroutines.
Class ini diimplementasikan pada beberapa class berikut :
Dispatcher.Default
Merupakan dispatcher dasar yang digunakan oleh semua standard builders seperti launch,
async, dll jika tidak ada dispatcher lain yang ditentukan. Dispatcher.Default menggunakan kumpulan
thread yang ada pada JVM. Jumlah maksimal thread yang digunakan adalah sama dengan jumlah core dari CPU.
Dispatcher.IO
Merupakan dispatcher yang digunakan untuk membongkar pemblokiran operasi I/O dan akan menggunakan
kumpulan thread yang dibuat berdasarkan permintaan.
Dispatcher.Unconfined
Merupakan Dispatcher yang menjalankan coroutines pada thread yang sedang berjalan sampai mencapai titik penangguhan.
Setelah penangguhan, coroutines akan dilanjutkan pada thread dimana komputasi penangguhan yang dipanggil.

Selain dengan menggunakan metode diatas, ada beberapa builder lain yang dapat digunakan untuk menentukan
thread yang dibutuhkan, antara lain:
Single Thread Context
Dispatcher ini menjamin bahwa setiap saat coroutine akan dijalankan pada thread yang ditentukan. Penerapannya
dilakukan dengan memanfaatkan fungsi newSingleThreadContext() pada parameter dispatcher dalam fungsi launch().
Thread Pool
Sebuah dispatcher yang memiliki kumpulan thread. Ia akan memulai dan melanjutkan coroutine di salah satu
thread yang tersedia pada kumpulan tersebut. Runtime akan menentukan thread mana yang tersedia dan
juga menentukan bagaimana proses distribusi bebannya. Penerapannya dilakukan dengan memanfaatkan fungsi
newFixedThreadPoolContext() pada parameter dispatcher dalam fungsi launch().

Channel adalah adalah nilai deferred yang menyediakan cara mudah untuk mentransfer nilai tunggal antara
coroutine atau bisa disebut melakukan interaksi antar coroutine serta membuat kode concurrent dapat
berkomunikasi dengan mengirim dan menerima pesan tanpa harus peduli di thread mana coroutine berjalan.
*/