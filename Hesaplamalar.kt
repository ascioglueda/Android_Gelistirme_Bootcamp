fun main() {
    val celsius = 25.0
    val fahrenheit = celsiusToFahrenheit(celsius)
    println("$celsius°C = $fahrenheit°F")

    val kenar1 = 5.0
    val kenar2 = 8.0
    val cevre = dikdortgenCevresi(kenar1, kenar2)
    println("Dikdörtgenin çevresi (kenar1=$kenar1, kenar2=$kenar2): $cevre")

    val sayi = 5
    val faktoriyel = faktoriyelHesapla(sayi)
    println("$sayi! = $faktoriyel")

    val kelime = "Merhaba"
    val harf = 'a'
    val harfSayisi = harfSay(kelime, harf)
    println("'$kelime' kelimesinde '$harf' harfi $harfSayisi kez geçiyor.")
}

fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 1.8 + 32
}

fun dikdortgenCevresi(kenar1: Double, kenar2: Double): Double {
    return 2 * (kenar1 + kenar2)
}

fun faktoriyelHesapla(sayi: Int): Long {
    if (sayi < 0) return 0 // Negatif sayılar için faktöriyel tanımlı değil
    if (sayi == 0 || sayi == 1) return 1
    var sonuc: Long = 1
    for (i in 2..sayi) {
        sonuc *= i
    }
    return sonuc
}

fun harfSay(kelime: String, harf: Char): Int {
    var sayac = 0
    for (karakter in kelime) {
        if (karakter.lowercaseChar() == harf.lowercaseChar()) {
            sayac++
        }
    }
    return sayac
}