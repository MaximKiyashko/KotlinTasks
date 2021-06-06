fun getNSK(a :Int, b :Int) :Int{
    var m = a
    var n = b
    while(m != n) {
        if(m > n) {
            m = m-n
        }
        else {
            n = n-m
        }
    }
    return m
}

fun getListNSK(list: List<Int>): Int{
    var nsk: Int = list[0]
    for(elem in list) {
        nsk = getNSK(nsk, elem)
    }
    return nsk
}

fun main() {
    println(getListNSK(listOf(2, 4, 8)))
}