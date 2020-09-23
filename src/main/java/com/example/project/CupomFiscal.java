package com.example.project;

public class CupomFiscal {

	public static String NOME_LOJA = "Arcos Dourados Com. de Alimentos LTDA";
	public static String LOGRADOURO = "Av. Projetada Leste";
	public static int NUMERO = 500;
	public static String COMPLEMENTO = "EUC F32/33/34";
	public static String BAIRRO = "Br. Sta Genebra";
	public static String MUNICIPIO = "Campinas";
	public static String ESTADO = "SP";
	public static String CEP = "13080-395";
	public static String TELEFONE = "(19) 3756-7408";
	public static String OBSERVACAO = "Loja 1317 (PDP)";
	public static String CNPJ = "42.591.651/0797-34";
	public static String INSCRICAO_ESTADUAL = "244.898.500.113";
	
	public static void exercicio01() {
        	String imprimirCupom = NOME_LOJA + "\n";
        	imprimirCupom += LOGRADOURO + ", " + NUMERO + " " + COMPLEMENTO + "\n";
        	imprimirCupom += BAIRRO + " - " +MUNICIPIO+ " - " +ESTADO + "\n";
        	imprimirCupom += "CEP: " + CEP + "Tel " + TELEFONE + "\n";
        	imprimirCupom += OBSERVACAO + "\n";
        	imprimirCupom += "CNPJ: " + CNPJ + "\n";
        	imprimirCupom += "IE: " + INSCRICAO_ESTADUAL + "\n";
        
        	System.out.println(imprimirCupom);
    	}
	
	public void exercicio02_tudoVazio() {
        System.out.println(
                "\n" +
                ", " + "\n" +
                " -  - " + "\n" +
                "CEP: Tel " + "\n" +
                "\n" +
                "CNPJ: " + "\n" +
                "IE: "
        );
    }
	
	public static void main(final String[] args) {
		//Implemente aqui
		exercicio01();
	}
	
}
