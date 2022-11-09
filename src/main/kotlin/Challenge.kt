fun main() {
    println("Choose the method you want to run \n Type '1' for the first method \n Type '2' for the second method")
    when(readLine().toString()){
        "1" -> randomNumberChain()
        "2" -> orderNumbers()
        else-> println("Invalid option try again using '1' or '2'")
    }

}

fun randomNumberChain () :String{

    var numberChain  = mutableListOf<Int>()
    val number = 0..9
    println("Write 'A' or 'B to select the type" )
    val type: String? = readLine()
    when (type?.uppercase()){
        "A" ->{ numberChain = mutableListOf(5,4,number.random(),number.random(),number.random(),number.random(),number.random(),number.random(),number.random(),number.random())
            println("These are the numbers with the type you've selected $numberChain")}
        "B" ->{numberChain = mutableListOf(0,8,number.random(),number.random(),number.random(),number.random(),number.random(),number.random(),number.random(),number.random())
            println("These are the numbers with the type you've selected $numberChain")}
        else -> println("You've entered an invalid type, try it again with 'A' or 'B'")
    }

    return numberChain.toString()

}

fun orderNumbers (){
    val number = 0..9
    val randomChain = arrayOf(number.random(),number.random(),number.random(),number.random(),number.random(),number.random(),number.random(),number.random(),number.random(),number.random())
    println("These are the unordered numbers: "+ java.util.Arrays.toString(randomChain))
    println("Write 'Asc' or 'Desc' to organize the numbers" )
    val order: String? = readLine()
    var exchange: Int
    when(order?.uppercase()) {
        "ASC" -> {
            for (i in (0 until randomChain.size - 1)) {
                for (j in (0 until randomChain.size - 1)) {
                    if (randomChain[j] > randomChain[j + 1]) {
                        exchange = randomChain[j]
                        randomChain[j] = randomChain[j + 1]
                        randomChain[j + 1] = exchange
                    }
                }

            }
            println("Numbers in ascendant order: ")
            for( i in (0 until randomChain.size)){
                print(randomChain[i])
            }
        }
        "DESC" ->{
            for (i in (0 until randomChain.size - 1)) {
                for (j in (0 until randomChain.size - 1)) {
                    if (randomChain[j] < randomChain[j + 1]) {
                        exchange = randomChain[j]
                        randomChain[j] = randomChain[j + 1]
                        randomChain[j + 1] = exchange
                    }
                }

            }
            println("Numbers in descendant order: ")
            for( i in (0 until randomChain.size)){
                print(randomChain[i])
            }

        }
        else -> println("You've entered an invalid entry, try again with 'Asc' or 'Desc'")
    }

}