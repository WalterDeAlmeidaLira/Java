package entidades.enumeracoes;

import java.util.Date;

public class OrdemPedidos {
	private Integer id;
	private Date momento;
	private StatusPedido status;
	
	public OrdemPedidos(Integer id, Date momento, StatusPedido status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	
	public Date getMomento() {
		return momento;
	}
	
	public StatusPedido getStatus() {
		return status;
	}
	
	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "OrdemPedidos [id=" + id + ", momento=" + momento + ", status=" + status + "]";
	}
}
