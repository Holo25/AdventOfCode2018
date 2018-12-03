class Day2:Day {
    var double=0
    var triple=0
    override fun solveA(lines: List<String>) {
        lines.forEach { line ->
            val map = HashMap<Char,Int>()
            line.forEach {
                map[it] = (map[it] ?: 0)+1
            }
            var duo=true
            var tri=true
            map.forEach { entry ->
                if(entry.value == 2 && duo) {double++; duo=false}
                if(entry.value == 3 && tri) {triple++; tri=false}
            }

        }
        println(double * triple)
    }

    override fun solveB(lines: List<String>) {
        lines.forEachIndexed { i, line ->
            lines.drop(i).forEach {secondLine ->
                var diff = ""
                line.forEachIndexed { j , character ->
                    if(character == secondLine[j]) diff+=character
                }
                if(diff.length == line.length-1) println(diff)
            }
        }
    }
}