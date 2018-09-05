public class Fraction {
    private int nume;
    private int deno;

    /*----------Constructor------------*/
//    a two parameter constructor that initializes the numerator and denominator
//    This constructor should throw an IllegalArgumentException if the denominator is zero
//    If the user enters a negative denominator bump the negative sign to the numerator.
//    For example, -3/-2 should be converted to 3/2. Likewise, 5/-3 should be converted to -5/3
    public Fraction (int nume, int deno) {
        if (deno == 0) {
            throw new IllegalArgumentException("Denominator should be non-zero integer");
        } else {
            if (deno > 0) {
                this.nume = nume;
                this.deno = deno;
            } else {
                this.nume = (-1) * nume;
                this.deno = (-1) * deno;
            }
        }
    }

    //    one parameter constructor that initializes the object equal in value to the integer parameter.
    public Fraction (int nume) {
        this.nume = nume;
        this.deno = 1;
    }

    //    zero parameter constructor that initializes the object to 0, meaning the numerator is 0 and the denominator is 1
    public Fraction () {
        this.nume = 0;
        this.deno = 1;
    }

    /*----------Behavior------------*/
    public int getNumerator() {
        return this.nume;
    }

    public int getDenominator() {
        return this.deno;
    }

    public String toString() {
        if (this.deno == 1) {
            return Integer.toString(this.nume);
        } else if (this.nume == 0) {
            return "0";
        } else {
            return this.nume + "/" + this.deno;
        }
    }

    public double toDouble() {
        return nume / deno;
    }

    public Fraction add(Fraction other) {
        Fraction result = new Fraction();
        result.deno = this.deno * other.deno;
        result.nume = this.nume * other.deno + other.nume * this.deno;
        result.toLowerTerms();
        return result;
    }

    public Fraction subtract(Fraction other) {
        Fraction result = new Fraction();
        result.deno = this.deno * other.deno;
        result.nume = this.nume * other.deno - other.nume * this.deno;
        result.toLowerTerms();
        return result;
    }

    public Fraction multiply(Fraction other) {
        Fraction result = new Fraction(this.nume * other.nume, this.deno * other.deno);
        result.toLowerTerms();
        return result;
    }

    public Fraction divide(Fraction other) {
        if (other.nume == 0) {
            throw new IllegalArgumentException("Trying to divide by zero");
        } else {
            Fraction result = new Fraction(this.nume * other.deno, this.deno * other.nume);
            result.toLowerTerms();
            return result;
        }
    }

    public boolean equals(Object other) {
        Fraction other_casted;
        if (other instanceof Fraction) {
            other_casted = (Fraction) other;
            other_casted.toLowerTerms();
            this.toLowerTerms();
            return (other_casted.nume == this.nume && other_casted.deno == this.deno);
        } else {
            return false;
        }
    }

    public void toLowerTerms() {

        if (this.nume != 0) {
            if (this.nume > 0) {
                int gcd_res = gcd(this.nume, this.deno);
                this.nume /= gcd_res ;
                this.deno /= gcd_res ;
            } else {
                int gcd_res = gcd((-1) * this.nume, this.deno);
                this.nume /= gcd_res ;
                this.deno /= gcd_res ;
            }
        }
    }

    public static int gcd(int nume, int deno) {
        if (nume % deno == 0) {
            return deno;
        } else {
            return gcd(deno, nume % deno);
        }
    }

}
