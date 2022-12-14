package model;

import java.io.Serializable;

public class CalculatorModel implements MathOperations, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8739324152122396364L;
	private Float a;
	private Float b;
	
	
	//METODOS
	@Override
	public Float soma() {
		// TODO Auto-generated method stub
		return this.getA()+this.getB();
	}

	@Override
	public Float subtracao() {
		// TODO Auto-generated method stub
		return this.getA()-this.getB();
	}

	@Override
	public Float multiplicacao() {
		// TODO Auto-generated method stub
		return this.getA()*this.getB();
	}

	@Override
	public Float divisao() throws Exception {
		// TODO Auto-generated method stub
		if(b != 0) {
			return this.getA()/this.getB();
		}else {
			throw new Exception("Divisão por zero");
		}
		
	}

	
	//GETTERS E SETTERS
	public Float getA() {
		return a;
	}

	public void setA(Float a) {
		this.a = a;
	}

	public Float getB() {
		return b;
	}

	public void setB(Float b) {
		this.b = b;
	}

}
