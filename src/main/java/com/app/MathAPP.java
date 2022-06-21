package com.app;

public class MathAPP {
   public static Long factorial(int n) {
	  long fact=1;
	  for(int i=1;i<=n;i++)
		  fact*=i;
	  return fact;
   }
}
