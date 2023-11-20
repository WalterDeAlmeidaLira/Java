package gerenciadorDeAbastecimento;

public class Veiculo {
	private int idVeiculo;
	private String modelo;
	private String placa;
	private double km;
	
	public double getKm() {
		return km;
	}
	
	public void setKm(double km) {
		this.km = km;
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}
	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "idveiculo: " + getIdVeiculo() + getModelo();
	}
	
	
}
