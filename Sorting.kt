data class Data(val elem: String, val splitElem: List<String>) {

}

fun sortList(list: List<String>) : List<String> {
    val listData = mutableListOf<Data>()
    for (l in list) {
        listData.add(Data(l, l.split("=")))
    }
    listData.sortWith(Comparator { d1: Data, d2: Data -> d1.splitElem[0].compareTo(d2.splitElem[0]) +
            (d1.splitElem[1].toInt().compareTo(d2.splitElem[1].toInt())) })
    val listReturn = mutableListOf<String>()
    for (l in listData) {
        listReturn.add(l.elem)
    }
    return listReturn
}

fun main() {
    /*
    * A=2
    * S=34
    * A=11
    * A=1
    * */
    println(sortList(listOf("A=2", "S=34", "A=11", "A=1")))
}