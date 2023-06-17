package com.mjv.saida;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import com.mjv.classe.Cadastro;
import com.mjv.classe.Escrever;
import com.mjv.classe.enums.Sexo;

public class Main {

	public static void main(String[] args) throws IOException {

		Cadastro joelson = new Cadastro("Joelson", "000.111.222-01",
				LocalDate.parse("14/05/1989", DateTimeFormatter.ofPattern("dd/MM/yyyy")), Sexo.MASCULINO, "Rua Minas",
				"33A", "Luz Divina", "próximo aos hippies", "Petrópolis", "Pernambuco", "joelson01@email.com",
				1125261314L, 22998643385L, 22998643385L, "Desenvolvedor Java", "MJV Technology & Innovation", 5.000,
				true, 2.200, 10.000);
		joelson.getHabilidades().addAll(Arrays.asList("Java", "JavaScript", "Spring Boot", "HTML", "CSS"));

		Cadastro marlon = new Cadastro("Marlon", "333.444.222-01",
				LocalDate.parse("18/01/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy")), Sexo.MASCULINO, "Rua Nantes",
				"50-F", "Quebrada Mística", "próximo ao Bar do Alcolatras", "Rio bonito", "Rio de Janeiro",
				"marlon147@email.com", 2225261314L, 71998643385L, 71998643385L, "Desenvolvedor Frontend",
				"MJV Technology & Innovation", 5.000, true, 2.200, 10.000);

		Escrever.arquivo(joelson, "csv");
		Escrever.arquivo(marlon, "docx");
		Escrever.arquivo(marlon, "doc");
		Escrever.arquivo(joelson, "docx");

		System.out.println("Criado com sucesso!");

	}

}
