package ObjetoAcessoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import banco_de_dados.Conecta;
import gerenciadorDeAbastecimento.Abastecimento;

public class AbastecimentoDao{
	
	public void adicionar(Abastecimento abastecimento) {

		Connection con = Conecta.getConnection();
		PreparedStatement pstm = null;
		try {
			String sql = "insert into abastecimento(idveiculo,idposto,dataabastecimento,litros,tipo,precolitro)values(?,?,?,?,?,?);";
			pstm = con.prepareStatement(sql);
			pstm.setInt(1,abastecimento.getIdVeiculo());
			pstm.setInt(2,abastecimento.getIdPosto());
			pstm.setDate(3, abastecimento.getData());
			pstm.setDouble(4,abastecimento.getLitros());
			pstm.setString(5, abastecimento.getTipo());
			pstm.setDouble(6, abastecimento.getPrecolitro());
			pstm.execute();
			JOptionPane.showInternalMessageDialog(null, "Abastecimento realizado com sucesso","Abastecimento",JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showInternalMessageDialog(null, "Erro no registro do abastecimento"+e,"Abastecimento",JOptionPane.INFORMATION_MESSAGE);
		}finally {
			Conecta.closeDB(con,pstm);
		}
	}
	
	public List<Abastecimento> listarAbastecimento(){
		
		List<Abastecimento> abastecimentos = new ArrayList<>();
		Connection con = Conecta.getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			
			pstm = con.prepareStatement("select * from abastecimento;");
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				
				Abastecimento abast = new Abastecimento();
				
				abast.setIdAbastecimento(rs.getInt(1));
				abast.setIdVeiculo(rs.getInt(2));
				abast.setIdPosto(rs.getInt(3));
				abast.setData(rs.getDate(4));
				abast.setLitros(rs.getDouble(5));
				abast.setTipo(rs.getString(6));
				abast.setPrecolitro(rs.getDouble(7));
				
				abastecimentos.add(abast);
				
			}
			
		} catch (Exception e) {
			JOptionPane.showInternalMessageDialog(null, "Erro ao registrar abastecimeto","Abastecimento",JOptionPane.ERROR_MESSAGE);
		}finally {
			Conecta.closeDB(con,pstm,rs);
		}
		
		
		
		return abastecimentos;
	}
}
