package com.Giulia.webServices.entidades.enums;

public enum StatusPedido {
	
	AGUARDANDO_PAGAMENTO(1),
	PAGO(2),
	PROCESSANDO(3),
	ENVIADO(4),
	CANCELADO(5);
	
	private int code;

	private StatusPedido(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	
	public static StatusPedido valueOf(int code) {
		for(StatusPedido status : StatusPedido.values()) {
			if (status.getCode() == code) {
				return status;
			}
		}
		throw new IllegalArgumentException("Código de status inválido.");
	}
	
}
