package br.com.fernando.jdbc.controller;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.fernando.jdbc.dao.CategoriaDAO;
import br.com.fernando.jdbc.dao.ProdutoDAO;
import br.com.fernando.jdbc.factory.ConnectionFactory;
import br.com.fernando.jdbc.modelo.Produto;

public class ProdutoController {
	
	private ProdutoDAO produtoDAO;
	
	public ProdutoController() {
		Connection connection = new ConnectionFactory().recuperarConexao(); // recuperando a conexão com o BD
		this.produtoDAO = new ProdutoDAO(connection); // instanciando a DAO e passando conexão
	}

	public void deletar(Integer id) {
		this.produtoDAO.deletar(id);
	}

	public void salvar(Produto produto) {
		this.produtoDAO.salvar(produto);
	}

	public List<Produto> listar() {
		return this.produtoDAO.listar();
	}

	public void alterar(String nome, String descricao, Integer id) {
		this.produtoDAO.alterar(nome, descricao, id);
	}
}
