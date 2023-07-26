package comander

import Add
import archive.Archive
import HasList


class Comander : HasList<Archive>(), Add {

    override fun add() {
        println("Введите название:")
        val userInput = readln()
        addItem(Archive(userInput))

    }





}
