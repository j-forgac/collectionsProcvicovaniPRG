import java.util.*

private val vowels = setOf('a','e','i','o','u')
private val sc = Scanner(System.`in`)

fun main(){
	println("Zadejte počet slov")
	val count = sc.nextInt()

	sc.nextLine() //bruh buffer

	val arr = Array(count) { //initialize arr
		println("Zadej ${it + 1}. slovo")
		sc.nextLine()
	}
	val frequency = arr.groupBy { it.count { ch -> ch in vowels } } //group by the count of vowel occurrences in string

	sc.nextLine() //bruh buffer

	while(sc.hasNext()){
		println("Zadejte další číslo nebo end pro konec")
		println(frequency[sc.nextInt()])
	}
}