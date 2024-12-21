package utils;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imaginary + other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber square() {
        return this.multiply(this);
    }

    public double magnitude() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginary);
    }
}
