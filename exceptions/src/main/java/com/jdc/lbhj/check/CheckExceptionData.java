package com.jdc.lbhj.check;

import java.io.File;
import java.io.IOException;

public class CheckExceptionData {

	public String createFile(String dir) {
		try {
			File file = new File(dir+"test.txt");//2 arguments , first => directory, second => file name
			file.createNewFile();
			return file.exists() ? "exist" : "empty";
		} catch (IOException e) {
			return "IOException";
		}
	}
}
