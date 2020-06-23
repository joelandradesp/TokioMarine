package br.com.tokiomarine.seguradora.avaliacao.app.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Util {

	private static final Logger log = LoggerFactory.getLogger(Util.class);

	public String loadProperty(String property) {
		String value = System.getenv(property);

		if(value == null){
			log.error("Propriedade de sistema " + property + ", não definida.");
		}

		return value;
	}
}