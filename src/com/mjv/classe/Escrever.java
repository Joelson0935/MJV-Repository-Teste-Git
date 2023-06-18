package com.mjv.classe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;
import java.util.List;

public class Escrever {

	/**
	 * @author JOELSON CERQUEIRA
	 * @param objeto      - objeto do tipo Cadastro que será convertido em bytes
	 * @param nomeArquivo - escreve o nome do arquivo que deseja criar
	 * @param extensao    - tipo do arquivo a ser criado
	 * @return cria os arquivos dentro da pasta " resource " do proprio projeto.
	 * @throws NoSuchFileException
	 */
	public static String arquivo(Cadastro cadastro, String nomeArquivo, String extensao) throws IOException {

		String stringFormatada = String.valueOf(cadastro);

		String novaString = stringFormatada.replace("habilidades = [", " habilidades = [ \n ");

		List<String> collection = Arrays.asList(novaString.split(","));

		String resultado = "";

		for (String string : collection) {
			resultado += string + " \n";
		}

		File file = new File("resource\\" + nomeArquivo + "." + extensao);

		try {
			FileWriter fileWriter = new FileWriter(file, true);
			fileWriter.write(resultado);
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return resultado;
	}

}
