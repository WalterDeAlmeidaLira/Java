package banco_de_dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.mysql.cj.xdevapi.PreparableStatement;

public class Conecta {
	//private final static String DRIVER = "com.mysql.jdbc.Driver";
	private final static String URL = "jdbc:mysql://localhost:3308/gerenciador";
	private final static String USUARIO = "root";
	private final static String SENHA = "";
	
	public static Connection getConnection () {
		try {
			//Class.forName(DRIVER);
			return DriverManager.getConnection(URL,USUARIO,SENHA);
		}catch(Exception e) {
			JOptionPane.showInternalMessageDialog(null, "nao foi possivel realizar a conexão com o banco!! ");
			return null;
		}		
	}
	
	public static void closeDB(Connection conexao) {
		try {
			if(conexao != null)
				conexao.close();
		}catch(Exception e) {
			System.out.println("Nao foi possivel fechar a conexão" + e);
		}
	}
	
	public static void closeDB(Connection conexao, PreparedStatement pstm) {
		closeDB(conexao);
		try {
			if( pstm != null)
				pstm.close();
		}catch(Exception e) {
			System.out.println("Nao foi possivel fechar a conexão" + e);
		}
	}
	
	public static void closeDB(Connection conexao, PreparedStatement pstm, ResultSet rs) {
		closeDB(conexao,pstm);
		try {
			if( rs != null)
				rs.close();
		}catch(Exception e) {
			System.out.println("Nao foi possivel fechar a conexão" + e);
		}
	}
	
	
	
}
