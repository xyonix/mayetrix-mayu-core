package com.xyonix.mayetrix.mayu.io;

import java.io.IOException;

import com.xyonix.mayetrix.mayu.io.TableRow;
import com.xyonix.mayetrix.mayu.io.TabularFileLoader;

import junit.framework.TestCase;

public class TestTabularFileLoader extends TestCase {

	public void testLoad() throws IOException {
		for (TableRow r:TabularFileLoader.load("com/mayalogy/mayu/io/f1.txt","\\|")) {
			assertTrue(r.getNumberOfColumns()==5);
			for (int i=0;i<r.getNumberOfColumns();i++) {
				System.out.println(r.getValueForColumn(i));
			}
		}
	}
}
