import java.util.function.Predicate

fun<R> unionList(vararg lists:List<R>, conditions:List<Predicate<R>>): MutableList<R> {
    var result = ArrayList<R>()
    var totalCondition = conditions.get(0)
    for (tempCondition in conditions) {
        totalCondition = totalCondition.and(tempCondition)
    }
    for (tempList in lists) {
        for (tempR in tempList) {
            if (totalCondition.test(tempR))
                result.add(tempR)
        }
    }
    return result
}