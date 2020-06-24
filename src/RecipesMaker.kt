val ingredients = listOf("Water", "Milk", "Meat", "Vegetables", "Fruits", "Cereals", "Eggs", "Oil")

fun main(){

    val menu: String = """
        
        ::Welcome to Recipe Maker::
        
        Select wish option:
        1. Make Recipe
        2. Look my recipes
        3. Exit
    """.trimIndent()

    println(menu)


    do {

        val response: String? = readLine()

        when (response) {
            "1" -> makeRecipe() //println("Make Recipe \nChoose you ingredients")
            "2" -> viewRecipe() //println("Look my recipes \nEmpty")
            "3" ->  println("Exit \nThanks for using this app")
            else -> println("Choose a valid option")
        }
    }while (response != "3")


}

fun makeRecipe(){

    val options = """
        
        ::Hacer receta::
        
        Selecciona los ingredientes deseados:

    """.trimIndent()

    println(options)
    ingredients.forEach{
        println(it)
    }
}

fun viewRecipe(){
    println("My recipes")
}