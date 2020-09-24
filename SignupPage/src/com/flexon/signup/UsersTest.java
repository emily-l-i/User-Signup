package com.flexon.signup;

import java.io.*;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class UsersTest {

	@Test
	public void test() {
		String data = "User Input"+"\nA second line of user input";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		System.setIn(stdin);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Line 1: "+scanner.nextLine());
		System.out.println("Line 2: "+scanner.nextLine());
	    scanner.close();

	}

}
