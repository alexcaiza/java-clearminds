package com.comparator;

import java.io.File;
import java.io.FileFilter;

public class FilesTest {

	public static void main(String[] args) {
		File[] files = new File(".").listFiles();
		
		for (File f : files) {
			System.out.println(f);
		}
		
		File[] hiddenFiles1 = new File(".").listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				return file.isHidden();
			}
		});
		
		System.out.println();
		
		for (File f : hiddenFiles1) {
			System.out.println(f);
		}
		
		File[] hiddenFiles2 = new File(".").listFiles(File::isHidden);
		
		System.out.println();
		
		for (File f : hiddenFiles2) {
			System.out.println(f);
		}
	}
}
