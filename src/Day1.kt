class Day1:Day {
    var frequency=0
    val frequencies= mutableListOf<Int>(0)
    override fun solveA(lines: List<String>) {
        lines.forEach { frequency+= it.toInt() }
        println(frequency)
    }

    override fun solveB(lines: List<String>) {
        while(true) {
            lines.forEach {
                frequency += it.toInt()
                if (frequencies.contains(frequency)) {
                    println(frequency)
                    return
                }else frequencies.add(frequency)
            }
        }

    }
}