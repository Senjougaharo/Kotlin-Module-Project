package archive

import Add
import HasList
import Show


import note.Note

class Archive(val name: String ) : HasList<Note>() , Show, Add {

    override fun add() {
        println("Введите название:")
        val name = readln()

        println("Введите текст:")

        val text = readln()

        addItem(Note(name,text))
        println("Заметка успешно создана!")
    }

    override fun show(): String {
        return name
    }


}
