package com.Lpan.Utils;

import java.math.BigDecimal;

public class MathDouble {
	
	/**
	 * 加法运算
	 * @param d1
	 * @param d2
	 * @return
	 */
	public Double adds(double d1,double d2){
		BigDecimal b1 = new BigDecimal(Double.toString(d1));
		BigDecimal b2 = new BigDecimal(Double.toString(d2));
		double doubleValue = b1.add(b2).doubleValue();
		return doubleValue;
	}
	
	/**
	 * 减法运算
	 * @param d1
	 * @param d2
	 * @return
	 */
	public Double subtract(double d1,double d2){
		BigDecimal b1 = new BigDecimal(Double.toString(d1));
		BigDecimal b2 = new BigDecimal(Double.toString(d2));
		BigDecimal subtract = b1.subtract(b2);
		return subtract.doubleValue();
	}
	
	/**
	 * 乘法运算
	 * @param d1
	 * @param d2
	 * @return
	 */
	public Double multiply(double d1,Double d2){
		BigDecimal b1 = new BigDecimal(d1);
		BigDecimal b2 = new BigDecimal(d2);
		double doubleValue = b1.multiply(b2).doubleValue();
		return doubleValue;
	}
	
	/**
	 * 除法运
	 * @param d1
	 * @param d2
	 * @param length
	 * @return
	 */
	public Double div(Double d1,Double d2,int length){
		BigDecimal  b1 = new BigDecimal(d1);
		BigDecimal b2 = new BigDecimal(d2);
		 double doubleValue = b1.divide(b2,length,BigDecimal.ROUND_HALF_UP).doubleValue();
		return doubleValue;
	}
	
	/**
	 * 四舍五入
	 * @param d1
	 * @param len
	 * @return
	 */
	public Double  round(double d1,int len){
		BigDecimal b1 = new BigDecimal(d1);
		BigDecimal b2 = new BigDecimal(1);
		//BigDeclmal.ROUND_HALF_UP  ��bigdecimal��һ������ ��ʾ��������
		BigDecimal bigDecimal = b1.divide(b2,len, BigDecimal.ROUND_HALF_UP);
		return bigDecimal.doubleValue();
	}
}
