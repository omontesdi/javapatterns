package com.patterns.creational.factorymethod;

public class Sha256Encryptor extends Encryptor {

	@Override
	public EncryptionAlgorithm getEncryptionAlgorithm() {

		return new Sha256CEncryptionAlgorithm();
	}

}
