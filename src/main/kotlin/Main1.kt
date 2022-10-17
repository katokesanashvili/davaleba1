fun main (){
    var fr1=Fraction(2,4)
    var fr2=Fraction(3,6)
    println(fr1)
    println(fr2)
    println (fr1.equals(fr2))
    println(gamkopi(8,2))
    println(shekveca(fr2))
    println(shekveca(fr1))
    println(fr1.shekreba(fr2))
    println(fr1.gamravleba(fr2))
}

class Fraction (numerator:Int,denominator:Int) {
    var a = numerator
    var b = denominator

    override fun toString(): String {
        return "$a/$b"

    }

    override fun equals(other: Any?): Boolean {
        return other is Fraction && a * other.b == b * other.a
    }

    fun shekreba(fraction: Fraction): Fraction {
            val q = a * fraction.b + fraction.a * b
            val p = b * fraction.b
            return shekveca(Fraction(q, p))
        }
    fun gamravleba(fraction:Fraction):Fraction{
        val n = a*fraction.a
        val m = b*fraction.b
        return shekveca(Fraction(n,m))
    }
    }


    fun shekveca(fraction: Fraction): Fraction {
        var x = gamkopi(fraction.a, fraction.b)
        return Fraction(fraction.a / x, fraction.b / x)
    }

    fun gamkopi(a: Int, b: Int): Int {
        return if (b == 0) {
           a
        } else {
            gamkopi(b, a % b)
     }
    }
