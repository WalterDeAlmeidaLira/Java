package ObjetoAcessoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import banco_de_dados.Conecta;
import gerenciadorDeAbastecimento.Veiculo;

public class VeiculoDao {

	public void adicionar(Veiculo veiculo) {
		Connection con = Conecta.getConnection();
		PreparedStatement pstm = null;
		try {
			String sql = "insert into veiculo(modelo,placa,km)values(?,?,?);";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, veiculo.getModelo());
			pstm.setString(2, veiculo.getPlaca());
			pstm.setDouble(3, veiculo.getKm());
			pstm.execute();			
			JOptionPane.showInternalMessageDialog(null, "Veículo adicionado com sucesso","Veículo",JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showInternalMessageDialog(null, "Erro ao adicinar veículo","Veículo",JOptionPane.ERROR_MESSAGE);
		}finally {
			Conecta.closeDB(con,pstm);
		}
	}
	
	public void alterar(Veiculo veiculo, int idveiculo,double km ) {
		Connection con = Conecta.getConnection();
		PreparedStatement pstm = null;
		try {
			String sql = "update veiculo set km=? where idveiculo=?;";
			pstm = con.prepareStatement(sql);
			pstm.setDouble(1, km);
			pstm.setInt(2, idveiculo);
			pstm.execute();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO" + e,"ERRO",JOptionPane.ERROR_MESSAGE);
		}finally {
			Conecta.closeDB(con, pstm);
		}
	}
	
	public List<Veiculo> Listar(){
		List<Veiculo> veiculos = new ArrayList<>();
		Connection con = Conecta.getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			
			pstm = con.prepareStatement("select * from veiculo;");
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				Veiculo veiculo = new Veiculo();
				
				veiculo.setIdVeiculo(rs.getInt(1));
				veiculo.setModelo(rs.getString(2));
				veiculo.setPlaca(rs.getString(3));
				veiculo.setKm(rs.getDouble(4));
				
				veiculos.add(veiculo);
			}
			
		} catch (Exception e) {
			JOptionPane.showInternalMessageDialog(null, "Erro ao listar valores","Erro na lista",JOptionPane.ERROR_MESSAGE);
		}finally {
			Conecta.closeDB(con,pstm,rs);
		}
		
		
		return veiculos;
	}
}


