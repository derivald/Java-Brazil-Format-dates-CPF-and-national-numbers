package br.com.alura;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

public class ValidacaoDocumento {

	public static void main(String[] args) {
		String cpf = "86288366757";
		try {
			validarDocumentos(new CPFValidator(), cpf);
			System.out.println("CPF VÁLIDO");
			
		}catch(InvalidStateException e) {
			System.out.println("CPF INVALIDO: " + e);
			
		}
		String cnpj = "51731003000136";
		try {
			
			validarDocumentos(new CNPJValidator(), cnpj);
			System.out.println("CNPJ VÁLIDO");
			
		}catch (InvalidStateException e) {
			System.out.println("CNPJ INVÁLIDO" + e);
			
		}
		String tituloEleitor = "387887740116";
		
		try {
			validarDocumentos(new TituloEleitoralValidator(), tituloEleitor);
			System.out.println("TITULO  VÁLIDO");
			
		} catch (InvalidStateException e) {
			System.out.println("TITULO  INVÁLIDO" + e);
		}
	}
	
	private static void validarDocumentos(Validator<String>validador, String documento ) {
		validador.assertValid(documento);
	}

}
