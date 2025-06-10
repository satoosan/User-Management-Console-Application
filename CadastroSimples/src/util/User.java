package util;

import java.util.Date;

public class User {

	private String name;
	private Integer idade;
	private Date dataDeNascimento;
	
	public User(String name, Integer idade, Date dataDeNascimento) {
		this.name = name;
		this.idade = idade;
		this.dataDeNascimento = dataDeNascimento;
	}

	public User() {
		
	}
	
	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	
	
}
