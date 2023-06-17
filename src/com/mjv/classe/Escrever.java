package com.mjv.classe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Escrever {

	/**
	 * @author JOELSON CERQUEIRA
	 * @param objeto   - objeto do tipo Cadastro que será convertido em bytes
	 * @param extensao - tipo do arquivo a ser criado
	 * @return retorna um arquivo na área de trabalho
	 * @throws NoSuchFileException
	 */
	public static String arquivo(Cadastro cadastro, String extensao) throws IOException {

		String stringFormatada = String.valueOf(cadastro);
		String novaString = stringFormatada.replace("habilidades = [", " habilidades = [ \n ");
		List<String> collection = Arrays.asList(novaString.split(","));
		String resultado = "";
		for (String string : collection) {
			resultado += string + " \n";
		}
		Path caminho = Paths.get("C:\\Users\\JOELSON\\OneDrive\\Área de Trabalho\\Arquivo." + extensao);
		try {
			Files.write(caminho, resultado.getBytes());
		} catch (IOException e) {
			throw new NoSuchFileException("Algo deu errado!");
		}

		return resultado;
	}

}
