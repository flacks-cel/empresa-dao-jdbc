package application;

import java.util.Date;

import model.entity.Cliente;
import model.entity.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Cliente obj = new Cliente(5, "EmpresaE", "Projeto5");

		Funcionario func = new Funcionario(6, "Armani", "didi@gmail.com", new Date(), 1000.0, obj);
		System.out.println(func);
		
	}

}
