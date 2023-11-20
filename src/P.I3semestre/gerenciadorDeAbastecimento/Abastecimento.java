package gerenciadorDeAbastecimento;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Abastecimento {
	private int idAbastecimento;
	private int idVeiculo;
	private int idPosto;
	private Date dataabastecimento;
	private double litros;
	private String tipo;
	private double precolitro;
	
	public int getIdAbastecimento() {
		return idAbastecimento;
	}
	public void setIdAbastecimento(int idAbastecimento) {
		this.idAbastecimento = idAbastecimento;
	}
	public int getIdVeiculo() {
		return idVeiculo;
	}
	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	public int getIdPosto() {
		return idPosto;
	}
	public void setIdPosto(int idPosto) {
		this.idPosto = idPosto;
	}
	public Date getData() {
		return dataabastecimento;
	}
	public void setData(Date data) {
		this.dataabastecimento = data;
	}
	public double getLitros() {
		return litros;
	}
	public void setLitros(double litros) {
		this.litros = litros;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecolitro() {
		return precolitro;
	}
	public void setPrecolitro(double precolitro) {
		this.precolitro = precolitro;
	}
	
	@Override
	public String toString() {
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 String dataStrinig = sdf.format(getData());
		return dataStrinig + "    "+ getLitros() +"    "+ getTipo() +"    "+ getPrecolitro()+"\n";
	}
	
	
	
}
