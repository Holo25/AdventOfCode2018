import com.sun.javafx.scene.control.skin.Utils.getResource
import java.io.File


const val SOLVE_SECOND=false

fun main(args: Array<String>) {
    val file = File("res/input.txt")
    val lines = file.readLines()
    val day:Day = Day1()
    if(!SOLVE_SECOND)
        day.solveA(lines)
    else day.solveB(lines)
}