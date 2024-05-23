package exemploENUM;

public enum DiaSemana {
	DOMINGO("DOM", "Domingo"),
	SEGUNDA("SEG", "Segunda"),
	TERCA("TER", "Terça"),
	QUARTA("QUA", "Quarta"),
	QUINTA("QUI", "Quinta"),
	SEXTA("SEX", "Sexta"),
	SABADO("SAB", "Sábado");
	
	private String dia;
	private String sigla;
	
	private DiaSemana(String dia, String sigla) {
		this.dia = dia;
		this.sigla = sigla;
	}

	public String getDia() {
		return dia;
	}

	public String getSigla() {
		return sigla;
	}
	public String getDiaMaiusculo() {
		return dia.toUpperCase();
	}
	
}
