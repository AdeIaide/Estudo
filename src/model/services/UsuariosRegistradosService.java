package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Cliente;

public class UsuariosRegistradosService {

	public List<Cliente> findAll(){
		List<Cliente> list = new ArrayList<>();
		list.add(new Cliente("luiz", 22411266, 20, "joao araujo", "luizaugusto@gmail"));
		list.add(new Cliente("nathalia", 989237704, 22, "joao araujo", "nathaliaadeladie@gmail"));
		list.add(new Cliente("Gonzaga", 31046821, 44, "joao araujo", "figueiredo@gmail"));
		return list;
	}

}
