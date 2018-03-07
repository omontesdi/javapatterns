package com.patterns.creational.factorymethod;

import org.apache.commons.codec.digest.DigestUtils;

public class Sha512EncryptionAlgorithm implements EncryptionAlgorithm {

	@Override
	public String encrypt(String plaintext) {

		return DigestUtils.sha512Hex(plaintext);
	}

}
