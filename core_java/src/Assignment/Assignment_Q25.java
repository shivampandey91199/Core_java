
/* Print the sum, difference and product of two complex numbers by 
 * creating a class named 'Complex' with separate methods for each
 * operation whose real and imaginary parts are entered by user. */

package Assignment;

class Complex {
	double real;
	double imaginary;
	public Complex(double real, double imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	public Complex sum(Complex other) {
		double r=this.real+other.real;
		double i=this.imaginary+other.imaginary;
		return new Complex(r,i);
	}
	public Complex diff(Complex other) {
		double r=this.real-other.real;
		double i=this.imaginary-other.imaginary;
		return new Complex(r,i);
	}
    public double getReal() {
    	return real;
    }
    public double getImaginary() {
    	return imaginary;
    }
	@Override
	public String toString() {
		return "Complex [real=" + real + ", imaginary=" + imaginary + "]";
	}
}

public class Assignment_Q25 {
	public static void main(String[] args) {
		Complex c1=new Complex(2,4);
		Complex c2=new Complex(3,5);
		
		
		Complex sum=c1.sum(c2);
		Complex diff=c1.diff(c2);
		System.out.println("First Complex number :-"+c1);
		System.out.println("Second Complex number :-"+c2);
		System.out.println("Sum of Two Complex Number :-"+sum);
		System.out.println("Diff of two complex number :-"+diff);
	}
}
