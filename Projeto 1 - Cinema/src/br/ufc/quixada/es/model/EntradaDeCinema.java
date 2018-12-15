package br.ufc.quixada.es.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EntradaDeCinema {
	//ATRIBUTOS
	
	private String tituloDoFilme, horario;
	private int sala, poltrona;
	private float valorOriginal;
	private boolean disponivel;
	
	// METODOS E AÇÕES
	
	public EntradaDeCinema(String tituloDoFilme, String horario, int sala, int poltrona, float valorOriginal,
			boolean disponivel) {
		super();
		this.tituloDoFilme = tituloDoFilme;
		this.horario = horario;
		this.sala = sala;
		this.poltrona = poltrona;
		this.valorOriginal = valorOriginal;
		this.disponivel = disponivel;
	}

	public String getTituloDoFilme() {
		return tituloDoFilme;
	}

	public String getHorario() {
		return horario;
	}

	public int getSala() {
		return sala;
	}

	public int getPoltrona() {
		return poltrona;
	}

	public float getValorOriginal() {
		return valorOriginal;
	}

	public boolean isDisponivel() {
		return disponivel;
	}
	
	public float calculaValorComDesconto(int dia, int mes, int ano) {
		Date dataAtual = new Date();
		SimpleDateFormat day = new SimpleDateFormat("dd");
		SimpleDateFormat mounth = new SimpleDateFormat("MM");
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
		int diaAtual = Integer.parseInt(day.format(dataAtual));
		int mesAtual = Integer.parseInt(mounth.format(dataAtual));
		int anoAtual = Integer.parseInt(year.format(dataAtual));
		if(anoAtual - ano > 12) {
			return this.valorOriginal;
		}
		else if(anoAtual - ano == 12) {
			if(mesAtual > mes) {
				return this.valorOriginal;
			}
			else if(mesAtual == mes) {
				if(diaAtual >= dia) {
					return this.valorOriginal;
				}
				else {
					return this.valorOriginal/2;
				}
			}
			else {
				return this.valorOriginal/2;
			}
		}else {
			return this.valorOriginal/2;
		}
	}
	
	public float calcularValorComDesconto(int dia, int mes, int ano, int carteira) {
		Date dataAtual = new Date();
		SimpleDateFormat day = new SimpleDateFormat("dd");
		SimpleDateFormat mounth = new SimpleDateFormat("MM");
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
		int diaAtual = Integer.parseInt(day.format(dataAtual));
		int mesAtual = Integer.parseInt(mounth.format(dataAtual));
		int anoAtual = Integer.parseInt(year.format(dataAtual));
		int difeAno = anoAtual - ano;
		if(carteira > 0) {
			if(mesAtual > mes) {
				if(difeAno >= 12 && difeAno <= 15) {
					return (float) (this.valorOriginal*0.6); 
				}
				else if(difeAno <= 20) {
					return (float) (this.valorOriginal*0.7);
				}
				else {
					return (float) (this.valorOriginal*0.8);
				}
			}
			else if(mesAtual == mes) {
				if(diaAtual >= dia) {
					if(difeAno >= 12 && difeAno <= 15) {
						return (float) (this.valorOriginal*0.6); 
					}
					else if(difeAno <= 20) {
						return (float) (this.valorOriginal*0.7);
					}
					else {
						return (float) (this.valorOriginal*0.8);
					}
				}
				else {
					difeAno--;
					if(difeAno >= 12 && difeAno <= 15) {
						return (float) (this.valorOriginal*0.6); 
					}
					else if(difeAno <= 20) {
						return (float) (this.valorOriginal*0.7);
					}
					else {
						return (float) (this.valorOriginal*0.8);
					}
				}
			
			}
			else {
				difeAno--;
				if(difeAno >= 12 && difeAno <= 15) {
					return (float) (this.valorOriginal*0.6); 
				}
				else if(difeAno <= 20) {
					return (float) (this.valorOriginal*0.7);
				}
				else {
					return (float) (this.valorOriginal*0.8);
				}
			}
		}
		else {
			return this.valorOriginal;
		}
		
	}
	
	public void realizarVenda() {
		if(this.disponivel) {
			this.disponivel = false;
		}
			
	}

	public String toString() {
		return "EntradaDeCinema [tituloDoFilme=" + tituloDoFilme + ", horario=" + horario + ", sala=" + sala
				+ ", poltrona=" + poltrona + ", valorOriginal=" + valorOriginal + ", disponivel=" + disponivel + "]";
	}
	
	
	
	
}
