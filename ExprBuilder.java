package edu.ycp.cs350.randart;

import java.util.Random;

public class ExprBuilder extends ExprNode{
 public static final int MAX_LEVEL = 8;
 
 private Random rand;
 
 public ExprBuilder() {
  rand = new Random();
 }
 
 public ExprNode build() {
  throw new UnsupportedOperationException("TODO - implement");
 }
}
