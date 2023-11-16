//Benutze für folgende Aufgabe das Try&Catch Prinzip.
//Erstelle eine Variable  Zahlstring vom Typ String und initialisiere sie  mit  einem Zahlenwert mittels readln().
// Wichtig ist, dass der Zahlenwert als Text geschrieben wird als eins, zwei, zehn usw.
//Erstelle einen neue Variabel ZahlInt vom Typ Int und gebe ihr den Wert den du per readln() eingegeben hast.
//Fange in einem Catch Block die Exception ab und schreibe in eine Println warum es zu dieser Exception gekommen ist.


fun main() {

    println("Please enter a numerical value as text:")
    val zahlString: String = readln()
    try {
        val zahlInt: Int = zahlString.toInt()
        println("The number entered as an integer: $zahlInt")

    } catch (e: Exception) {
        println("Error: The input '$zahlString' could not be converted to a number.")
    }

}