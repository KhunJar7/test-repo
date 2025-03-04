package com.jdc.lbhj.trycatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("unused")
public class TryCatchData {

	public String useCheckedWithTryFinallyAndResource() {
		String str = null;
		int res = 0;
		
		//try with resource (close ကို ရေးဖို့မေ့တတ်လို့ auto close)
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Type number !");
			str = br.readLine();
			int i = Integer.parseInt(str);
			//br.close();

		} catch (IOException | NumberFormatException e) {
			str = "Exception";

		} finally {// error တက်လည်းလုပ်,မတက်လည်းအလုပ်လုပ်
			str = str + " with change number of : " + res;
		}
		return str;
	}

	public int useUncheckedWithTryMultiCatch(int[] array, String index) {
		try {
			int i = Integer.parseInt(index);
			return array[i];

		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			return -1;
		}
	}

	public String useUncheckedWithTryCatch(Integer num) {
		try {
			int i = num / 0;
			Object b = num;
			return (String) b;

		} catch (ClassCastException e) {
			return "ClassCastException";
		} catch (ArithmeticException e) {
			return "ArithmeticException";
		} catch (RuntimeException e) {
			return "RuntimeException";
		}
	}
}
