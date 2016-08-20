/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serie;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ana
 */
public class Conexao {
    
    	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
		}
	}
	
	//Propriedades da conexão
	private final String usuario = "root";
	private final String senha = "legiao1234";
	private final String servidor = "localhost";
	private final String baseDeDados = "Serie";

	//Objeto que irá manter a conexaão
	Connection conexao = null;

	//Abre uma conexão com o banco
	public void abreConexao() {
		try{
			conexao = (Connection) DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/" + this.baseDeDados, this.usuario, this.senha);
			System.out.println("Conectado!");
		}catch(SQLException e){
			System.out.println("Falha na conexão!");
		}
	}
	
	public void fechaConexao(){
		try{
			conexao.close();
		}catch(SQLException e){
			System.out.println("Falha ao fecahr a conexão!");
		}
	}
    
    
    
}
