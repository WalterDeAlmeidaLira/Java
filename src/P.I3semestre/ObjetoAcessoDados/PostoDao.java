package ObjetoAcessoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import banco_de_dados.Conecta;
import gerenciadorDeAbastecimento.Posto;
import gerenciadorDeAbastecimento.Veiculo;

public class PostoDao {
	public void adicionar(Posto posto) {
		Connection con = Conecta.getConnection();
		PreparedStatement pstm = null;
		try {
			String sql = "insert into Posto(nome,localizacao) values(?,?);";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, posto.getNome());
			pstm.setString(2, posto.getLocalizacao());
			pstm.execute();
			JOptionPane.showInternalMessageDialog(null, "Posto cadastrado com sucesso","Posto",JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showInternalMessageDialog(null, "Erro ao cadastrar posto","Posto",JOptionPane.ERROR_MESSAGE);
		}finally {
			Conecta.closeDB(con,pstm);
		}
	}
	
	public List<Posto> Listar(){
		List<Posto> postos = new ArrayList<>();
		Connection con = Conecta.getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			
			pstm = con.prepareStatement("select * from posto;");
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				Posto posto = new Posto();
				
				posto.setIdPosto(rs.getInt(1));
				posto.setNome(rs.getString(2));
				posto.setLocalizacao(rs.getString(3));
				
				postos.add(posto);
			}
			
		} catch (Exception e) {
			JOptionPane.showInternalMessageDialog(null, "Erro ao listar valores","Erro na lista",JOptionPane.ERROR_MESSAGE);
		}finally {
			Conecta.closeDB(con,pstm,rs);
		}
		
		
		return postos;
	}
}
