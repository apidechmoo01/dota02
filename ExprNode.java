package edu.ycp.cs350.randart;
import java.lang.Math;

import java.util.Random;
public  class ExprNode {
  
  public static final int MAX_LEVEL = 8;
  public static final double pi = Math.PI;
  private Random rand;
  
  public ExprNode() {
   
    rand = new Random();
  }
 
   
  
  
  public double evaluateR(double x, double y){
    return  sin(pi * avg((((cos(pi * (sin(pi * cos(pi * y)) * avg(avg(x, x), sin(pi * y)))) * avg(sin(pi * (sin(pi * y) * (y * x))), cos(pi * cos(pi * (y * y))))) * sin(pi * (sin(pi * (sin(pi * y) * sin(pi * y))) * cos(pi * ((y * y) * sin(pi * y)))))) * sin(pi * avg(cos(pi * avg(((y * x) * (x * x)), sin(pi * (y * x)))), sin(pi * avg(avg(sin(pi * x), avg(x, x)), sin(pi * avg(x, y))))))), cos(pi * cos(pi * avg(sin(pi * sin(pi * avg((x * x), (x * x)))), sin(pi * sin(pi * sin(pi * sin(pi * y)))))))));
 
  }
  public double evaluateG(double x, double y){
    return sin(pi * ((avg(avg(cos(pi * (cos(pi * cos(pi * x)) * (cos(pi * x) * avg(y, x)))), ((cos(pi * cos(pi * y)) * (cos(pi * x) * (x * y))) * sin(pi * sin(pi * avg(y, y))))), cos(pi * (avg(sin(pi * sin(pi * x)), sin(pi * sin(pi * x))) * sin(pi * sin(pi * (x * y)))))) * avg((avg(cos(pi * sin(pi * cos(pi * x))), avg((sin(pi * x) * cos(pi * y)), avg(cos(pi * x), cos(pi * x)))) * avg(avg(sin(pi * cos(pi * x)), sin(pi * sin(pi * x))), (avg(cos(pi * x), avg(y, x)) * avg(sin(pi * y), sin(pi * x))))), (cos(pi * cos(pi * (avg(y, y) * (y * x)))) * cos(pi * cos(pi * sin(pi * avg(x, x))))))) * sin(pi * avg(avg(sin(pi * cos(pi * sin(pi * cos(pi * x)))), avg(sin(pi * cos(pi * cos(pi * y))), ((sin(pi * y) * (x * y)) * cos(pi * (y * y))))), cos(pi * avg(((cos(pi * y) * (y * y)) * avg(sin(pi * y), cos(pi * y))), (((x * x) * avg(y, x)) * cos(pi * sin(pi * x)))))))));
     
  }
  public double evaluateB(double x, double y){

    return avg(sin(pi * (avg(cos(pi * avg((cos(pi * (x * x)) * cos(pi * (x * y))), avg(avg((x * x), avg(y, y)), avg(cos(pi * y), cos(pi * x))))), avg(avg(avg((sin(pi * y) * (x * y)), sin(pi * (x * x))), avg(((x * x) * sin(pi * y)), (avg(x, x) * sin(pi * y)))), avg((cos(pi * sin(pi * y)) * cos(pi * avg(x, x))), sin(pi * avg(sin(pi * y), sin(pi * y)))))) * cos(pi * avg(avg(avg(sin(pi * (x * x)), avg(sin(pi * y), sin(pi * x))), cos(pi * avg(cos(pi * y), avg(y, x)))), (((avg(x, y) * cos(pi * x)) * cos(pi * avg(y, x))) * avg(cos(pi * (y * x)), ((x * x) * (y * x)))))))), avg(((((sin(pi * sin(pi * avg(x, x))) * avg(avg(sin(pi * y), sin(pi * y)), avg(avg(x, x), cos(pi * y)))) * sin(pi * sin(pi * sin(pi * (y * y))))) * avg(cos(pi * avg(avg(avg(x, y), (y * x)), cos(pi * sin(pi * x)))), (sin(pi * sin(pi * sin(pi * x))) * cos(pi * ((y * y) * cos(pi * x)))))) * avg(cos(pi * cos(pi * sin(pi * cos(pi * avg(x, y))))), (sin(pi * (cos(pi * avg(y, x)) * sin(pi * cos(pi * x)))) * ((sin(pi * cos(pi * y)) * avg(avg(x, x), cos(pi * x))) * avg((sin(pi * x) * avg(y, x)), sin(pi * sin(pi * x))))))), ((cos(pi * cos(pi * (sin(pi * (y * y)) * cos(pi * cos(pi * x))))) * avg(sin(pi * avg(cos(pi * sin(pi * y)), (cos(pi * x) * avg(x, x)))), cos(pi * cos(pi * cos(pi * avg(x, y)))))) * sin(pi * (avg((cos(pi * (y * y)) * cos(pi * sin(pi * y))), avg(((x * x) * sin(pi * x)), cos(pi * sin(pi * y)))) * avg(sin(pi * (avg(y, x) * avg(x, x))), cos(pi * avg((y * y), avg(y, y)))))))));
  }
  
  
  
  //sdasdsadadsadsa
  //dsadsadsadsadsadsd
  //dsadsadsadsadasdasds
  
  public double avg(double... num) {
    double sum = 0;
    for(int i=0 ; i<num.length ; i++) {
      sum = sum + num[i];
    }
    return sum / num.length;
  }
   
  public double cos(double num) {
    return Math.cos(num);
  }
   
  public double sin(double num) {
    return Math.sin(num);
  }
  
  
 public String exprAsString(){
    return " "+evaluateR(1,2);
    
  }
 /*sdfdsfsdfdsfd
  * sfdsfdsfdsfdsfdsfdsfdsf
  * dsfdsfdsfds
  * fdsf
  * dsf
  * sdf
  * sdf
  * sdf
  * sdfsdf
  * ds
  * fds
  * fsd*/
}
