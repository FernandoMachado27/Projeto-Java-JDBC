package br.com.fernando.jdbc.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fernando.jdbc.dao.CategoriaDAO;
import br.com.fernando.jdbc.factory.ConnectionFactory;
import br.com.fernando.jdbc.modelo.Categoria;

public class CategoriaController {
	
	private CategoriaDAO categoriaDAO;
	
	public CategoriaController() {
		Connection connection = new ConnectionFactory().recuperarConexao(); // recuperando a conex?o com o BD
		this.categoriaDAO = new CategoriaDAO(connection); // instanciando a DAO e passando conex?o
	}

	public List<Categoria> listar()  {
		return this.categoriaDAO.listar();
	}
}
