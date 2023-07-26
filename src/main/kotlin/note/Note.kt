package note

import Show

class Note(

    val name: String,
    val text : String
    ) : Show {
    override fun show(): String {
        return name + " : " + text
    }
}