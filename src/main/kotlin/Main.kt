//Benutze für folgende Aufgabe das Try&Catch Prinzip.
//Erstelle eine Variable  Zahlstring vom Typ String und initialisiere sie  mit  einem Zahlenwert mittels readln().
// Wichtig ist, dass der Zahlenwert als Text geschrieben wird als eins, zwei, zehn usw.
//Erstelle einen neue Variabel ZahlInt vom Typ Int und gebe ihr den Wert den du per readln() eingegeben hast.
//Fange in einem Catch Block die Exception ab und schreibe in eine Println warum es zu dieser Exception gekommen ist.


fun main() {

    println("Bitte gib einen Zahlenwert als Text ein:")
    val zahlString: String = readln()
    try {
        val zahlInt: Int = zahlString.toInt()
        println("Die eingegebene Zahl als Integer: $zahlInt")

    } catch (e: Exception) {
        println("Fehler: Die Eingabe '$zahlString' konnte nicht in eine Zahl umgewandelt werden.")
    }

}