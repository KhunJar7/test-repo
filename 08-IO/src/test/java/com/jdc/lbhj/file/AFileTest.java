package com.jdc.lbhj.file;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AFileTest {

	@Test
	void createFileWithURI() throws URISyntaxException {
		URI uri = new URI("file:///C:/Users/jnadora/Desktop/TestforIOJava/datas/test.txt");
		File file = new File(uri);
		assertTrue(file.exists());

		URI ur = file.toURI();
		System.out.println(ur.getPath());
	}

	@Test
	void checkFileTest() throws IOException {
		File dir = new File("C:\\Users\\jnadora\\Desktop\\TestforIOJava");
		assertTrue(dir.isDirectory());
		assertFalse(dir.isFile());

		File newDir = new File(dir, "datas");
		// assertTrue(newDir.mkdir());

		File file = new File(newDir, "test.txt");
		file.createNewFile();
	}

	@Test
	@Disabled
	void createFileTest() throws IOException {
		File file = createFile("C:\\Users\\jnadora\\Desktop\\TestforIOJava", "test.txt");
		assertFalse(file.exists());

		file.createNewFile();// path မထည့်ပေးရင် project directory ထဲဝင်သွား, မြင်ရဖို့ pj refresh လုပ်
		assertTrue(file.exists());

		// file.delete();
		file.deleteOnExit();// program အကုန် run ပြီးမှ/program ပြီးမှ delete လုပ်
		assertTrue(file.exists());
	}

	private File createFile(String path, String name) {
		// return (path != null && path.isEmpty()) ? new File(path, name) : new
		// File(name);

		if (null != path && !path.isEmpty()) {
			File p = new File(path);
			return new File(p, name);
		}

		return new File(name);
	}
}
