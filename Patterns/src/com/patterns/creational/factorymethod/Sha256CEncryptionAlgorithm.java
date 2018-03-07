package com.patterns.creational.factorymethod;

import org.apache.commons.codec.digest.DigestUtils;

public class Sha256CEncryptionAlgorithm implements EncryptionAlgorithm {

	@Override
	public String encrypt(String plaintext) {

		return DigestUtils.sha256Hex(plaintext);
	}

}
