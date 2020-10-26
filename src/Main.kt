
fun main(){
    var f1 = Fraction (n=0F, d=1F)
    f1.numerator = 1F
    f1.denomirator = 2F

    var f2 = Fraction (n=0F,d=1F)
    f2.numerator = 2F
    f2.denomirator = 4F

    println(f1)
    println(f2)
    println(f1==f2)
    println(f1.plus(f2))
    println(f2.minus(f1))
    println(f1.multiplicaton(f2))
    println(f2.reduction())
}

class Fraction(n: Float, d: Float) {
    var numerator: Float = n
    var denomirator: Float = d


    fun plus(fraction: Fraction): Fraction {
        var a = denomirator * fraction.denomirator
        var b = a / denomirator * numerator
        var c = a / fraction.denomirator * fraction.numerator
        return Fraction(b + c, a)
    }


    fun minus(fraction: Fraction): Fraction {
        var a = denomirator * fraction.denomirator
        var b = a / denomirator * numerator
        var c = a / fraction.denomirator * fraction.numerator
        return Fraction(b - c, a)
    }

    fun reduction() {
        var a = numerator
        var b = denomirator
        while (a != 0F && b != 0F) {
            if (a > b) {
                a = a % b
            } else {
                b = b % a
            }
        }
        var c = a + b
        var aa = numerator / c
        var bb = denomirator / c
        this.numerator = aa
        this.denomirator = bb
        println("$aa/$bb")
    }


    override fun toString(): String {
        return "$numerator/$denomirator"
    }


    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denomirator / denomirator == other.numerator)
                return true
        }
        return false
    }

    fun multiplicaton(fraction: Fraction): Fraction {
        var a = numerator * fraction.numerator
        var b = denomirator * fraction.denomirator
        return Fraction(a, b)
    }


    fun gayofa(fraction: Fraction): Fraction {
        var a = numerator * fraction.denomirator
        var b = denomirator * fraction.numerator
        return Fraction(a, b)
    }

}

