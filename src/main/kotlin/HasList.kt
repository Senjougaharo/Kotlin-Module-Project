abstract class HasList <T:Show> : Add {

    val body = mutableListOf<T>()

    fun addItem(item : T){
        body.add(item)
    }

    fun chosen(index: Int) : T  {

        return body[index]
    }

    fun getList() : List<String>{

        return body.map { it.show() }
    }

}