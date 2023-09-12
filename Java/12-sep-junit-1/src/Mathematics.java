
public class Mathematics {
	private int no1;
	private int no2;
	private float result;
	
	public Mathematics() {}
	
	
	public int getNo1() {
		return no1;
	}


	public void setNo1(int no1) {
		this.no1 = no1;
	}


	public int getNo2() {
		return no2;
	}


	public void setNo2(int no2) {
		this.no2 = no2;
	}


	public float getResult() {
		return result;
	}


	public void setResult(float result) {
		this.result = result;
	}


	public Mathematics(int no1, int no2, float result) {
		super();
		this.no1 = no1;
		this.no2 = no2;
		this.result = result;
	}


	public void sum()
	{
		result=no1+no2;
	}
	
	public void difference()
	{
		result=Math.abs(no1-no2);
//		result=no1-no2;
	}
	
	public void product()
	{
		result=no1*no2;
	}
	public void divide()
	{
		//if no1=5	and no2=2	what is result based on below?
		result=(float)no1/no2;
	}
}
