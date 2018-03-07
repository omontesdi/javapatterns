package com.patterns.creational.factorymethod;

/***
 * https://dzone.com/articles/java-the-factory-pattern
 * 
 * @author oscar
 *
 */
public class Main {

	public static void main(String[] args) {
		PersistedFile file = new PersistedFile("/foo/bar/text.txt", "Hello, world!", new Sha256Encryptor());

	}

}
