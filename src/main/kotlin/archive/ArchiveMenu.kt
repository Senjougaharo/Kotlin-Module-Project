package archive

import Menu
import note.Note

class ArchiveMenu(override val comander: Archive) : Menu<Archive, Note>() {


    override val header = "Заметки"
    override val comands = mutableListOf("Создать заметку:", "Назад")
    override val onItemClick: (Int) -> Unit = {println(comander.chosen(it - 1).show())}
    override val onExitClick: (() -> Unit)? = null


}