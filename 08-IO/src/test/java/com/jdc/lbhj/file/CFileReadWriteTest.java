package com.jdc.lbhj.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CFileReadWriteTest {

	private static File file;

	@BeforeAll
	static void init() throws IOException {
		file = new File("test.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
	}

	@Test
	void fileIOTest() {
		writeFile("Hello Java");
		readFile();

	}

	private void readFile() {
		try (FileReader in = new FileReader(file)) {

			while (in.ready()) {
				System.out.println((char) in.read()); // read => decimal နဲ့ထွက်လာတာကို char နဲ့တိုက်ရိုက် cast လုပ်လို့ရ
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void writeFile(String message) {
		try (FileWriter out = new FileWriter(file)) {

			out.write(message);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
