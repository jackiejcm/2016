package com.mybatis.util;

public class ConvertBoolean {
   public static boolean flag =false;
   public static boolean converBoolean(int returnInt){
	   if(returnInt==1){
		   flag = true;
	   }
	   return flag;
   }
}
