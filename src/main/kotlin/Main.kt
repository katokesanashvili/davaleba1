import kotlin.math.pow
import kotlin.math.sqrt


fun main (){
    var point1 = Point(1.0,2.0)
    var point2 = Point(3.0,4.0)
    var point3 = Point(5.0, 6.0)
    println(point1)
    println(point2)
    println(point3)
    println(point1.equals(point2))
    println(point2.equals(point3))
    println(point1.gadatana())
    println(point2.gadatana())
    println(point3.gadatana())
    println(point3.mandzili(point1))
}
class Point(x:Double, y: Double){
    private var xcoordinate = x
    private var ycoordinate = y


    override fun toString(): String {
        return "($xcoordinate,$ycoordinate)"
    }

        override fun equals(other: Any?): Boolean {

            return other is Point && xcoordinate == other.xcoordinate && ycoordinate ==other.ycoordinate
    }

    fun gadatana (): Point{

        return Point (xcoordinate*-1,ycoordinate*-1)
    }

    fun mandzili(point: Point):Double{

        var distance =sqrt((xcoordinate-point.xcoordinate).pow(2)+(ycoordinate-point.ycoordinate).pow(2))
        return distance
    }



}