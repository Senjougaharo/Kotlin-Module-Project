package comander
import Menu
import archive.Archive
import archive.ArchiveMenu
import kotlin.system.exitProcess

class ComanderMenu : Menu<Comander, Archive>() {

    override val comander = Comander()
    override val comands = mutableListOf( "Создать архив:", "Завершение работы")
    override val header = "Архивы"
    override val onItemClick : (Int) -> Unit = {ArchiveMenu(comander.chosen(it - 1)).interaction()}
    override val onExitClick : () -> Unit = { exitProcess(0) }



}