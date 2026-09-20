package homework2

fun main() {
    val song = Song("Self Aware", "Temper City", 2026, 1_100_000)
    song.printDescription()
    println(song.isPopular)
}


class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
){
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}