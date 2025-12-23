public class ComplexNumber extends RealNumber {
    public double imaginaryValue;

    public ComplexNumber() {
        super(1.0);
        this.imaginaryValue = 1.0;
    }

    public ComplexNumber(double r, double i) {
        super(r);
        this.imaginaryValue = i;
    }

    public String details() {
        return super.getReal() + "\nImaginaryPart: " + this.imaginaryValue;
    }
}
