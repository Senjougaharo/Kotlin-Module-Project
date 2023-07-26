import java.util.*

abstract class Menu <T:HasList<E> , E : Show> {

    abstract val header : String
    abstract val comander : T
    val menuList = mutableListOf<String>()
    abstract val comands : MutableList<String>
    abstract val onItemClick : (Int) -> Unit
    abstract val onExitClick : (() -> Unit)?

    fun showMenu() {
        println(header)
        menuList.clear()
        menuList.addAll(comands)
        val list = comander.getList()
        menuList.addAll(1,list)
        for(z in 0..menuList.lastIndex) {
            println("$z. ${menuList[z]}")
        }
    }

    fun interaction() {
        while (true) {
            try {
                showMenu()
                val userInput = Scanner(System.`in`).nextInt()
                if (userInput > menuList.lastIndex || userInput < 0) {
                    println("Пожалуйста выберите действие из списка ниже:")
                    continue
                }

                when (userInput) {
                    0 -> comander.add()
                    menuList.lastIndex -> onExitClick?.invoke() ?: return
                    else -> onItemClick.invoke(userInput)
                }
            } catch (v: InputMismatchException) {

                println("Пожалуйста выберите действие из списка ниже:")
            }
        }
}
}