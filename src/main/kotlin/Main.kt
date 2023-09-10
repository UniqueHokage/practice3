import kotlin.random.*
import kotlin.math.*

fun main(args: Array<String>) {
    //1 zadanie
    val myAge = 18;
    val isTeenager = myAge >= 13 && myAge <= 19;

    //2 zadanie
    val theirAge = 30;
    val bothTeenagers = myAge >= 13 && myAge <= 19 && theirAge >= 13 && theirAge <= 19;

    //3 zadanie
    val reader = "Roman"
    val author = "Richard Lucas"
    val authorIsReader = reader == author

    //4 zadanie
    val readerBeforeAuthor = reader < author

    //5 zadanie
    val myAge2 = 19;
    if (myAge2 >= 13 && myAge2 <= 19)
        println("Podrostok")
    else
        println("Ne podrostok")

    //6 zadanie
    val answer = if (myAge2 >= 13 && myAge2 <= 19) "Podrostok" else "Ne podrostok"

    //7 zadanie
    var counter = 0;
    while (counter<10){
        println("X=: $counter")
        counter++;
    }

    //8 zadanie
    var counter1 = 0;
    var roll = 0;
    while (true) {
        roll = Random.nextInt(6);
        counter1++;
        if (roll == 0){
            break}
        println("Posle $counter1 broskov, roll raven $roll")
    }

    //9 zadanie
    val range = 1..10
    for (i in range)
        println(i*i)

    //10 zadanie
    for (i in range)
        println(sqrt(i.toDouble()))

    //11 zadanie
    var sum = 0
    for (row in 1 until 8 step 2){
        if (row % 2 == 0){
            continue
        }
        for (column in 0 until 8){
            sum += row * column
        }
    }
}