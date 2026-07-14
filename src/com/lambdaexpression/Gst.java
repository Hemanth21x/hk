package com.lambdaexpression;

import java.util.function.Function;

public class Gst {
	 public static void main(String[] args) {
		 
		 Function<Double,Double> gst=amount->amount+amount*0.18;
		 
		 System.out.println(gst.apply(10000.00));
		 
	 }
	 

}
