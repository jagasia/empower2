package com.empower.spring;

public class Mathematics {
	private Integer no1;
	private Integer no2;
	private Integer result;
	
	public Mathematics() {}

	public Mathematics(Integer no1, Integer no2, Integer result) {
		super();
		this.no1 = no1;
		this.no2 = no2;
		this.result = result;
	}

	public Integer getNo1() {
		return no1;
	}

	public void setNo1(Integer no1) {
		this.no1 = no1;
	}

	public Integer getNo2() {
		return no2;
	}

	public void setNo2(Integer no2) {
		this.no2 = no2;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}

	public void updateSum()
	{
		this.result=this.no1+this.no2;
	}
}
