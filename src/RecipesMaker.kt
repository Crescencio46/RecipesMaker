fun main(){

    val ingredients = listOf("Water", "Milk", "Meat", "Vegetables", "Fruits", "Cereals", "Eggs", "Oil")

    val menu: String = """
        ::Welcome to Recipe Maker::
        
        Select wish option:
        1. Make Recipe
        2. Look my recipes
        3. Exit
    """.trimIndent()

    println(menu)
    val response: String? = readLine()

    when (response) {
        "1" -> println("Make Recipe \nChoose you ingrediends")
        "2" -> println("Look my recipes \nEmpty")
        "3" -> println("Exit \nThanks for useing this app")
        else 
        //println("Please, choose one option")
    }


}