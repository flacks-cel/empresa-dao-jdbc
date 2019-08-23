package model.dao;

import java.util.List;

import model.entity.Funcionario;

public interface FuncionarioDao {
	
	void insert (Funcionario obj);
	void update (Funcionario obj);
	void deleteById(Integer id);
	Funcionario findById(Integer id);
	List<Funcionario> findAll();

}
