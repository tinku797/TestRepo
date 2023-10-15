package first;

import java.util.Objects;

/**
 * 
 */
public class StudentPOJO {

	private int a;
	private int b;
	private int c;
	private int d;

	/**
	 * @param a sample description
	 * @param b sample description
	 * @param c sample description
	 * @param d sample description
	 */
	public StudentPOJO(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	/**
	 *
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	/**
	 *
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentPOJO other = (StudentPOJO) obj;
		return a == other.a && b == other.b && c == other.c && d == other.d;
	}


	/**
	 *
	 */
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	/**
	 * @return sample description
	 */
	public int getA() {
		return a;
	}

	/**
	 * @return sample description
	 */
	public int getB() {
		return b;
	}

	/**
	 * @return sample description
	 */
	public int getC() {
		return c;
	}

	/**
	 * @return sample description
	 */
	public int getD() {
		return d;
	}

	@Override
	public int hashCode() {
		return Objects.hash(a, b, c, d);
	}

	/**
	 * @param a sample description
	 */
	public void setA(int a) {
		this.a = a;
	}

	/**
	 * @param b sample description
	 */
	public void setB(int b) {
		this.b = b;
	}

	/**
	 * @param c sample description
	 */
	public void setC(int c) {
		this.c = c;
	}

	/**
	 * @param d sample description
	 */
	public void setD(int d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "StudentPOJO [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

}
