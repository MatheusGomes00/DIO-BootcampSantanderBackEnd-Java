package exemploENUM;

public class EnumExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiaSemana hoje = DiaSemana.SEXTA;
		
		System.out.println("Hoje é " + hoje);
		
		if(hoje == DiaSemana.SABADO || hoje == DiaSemana.DOMINGO) {
			System.out.println("É fim de semana!");	
		} else if(hoje == DiaSemana.SEXTA) {
			System.out.println("SEXTOU bb... começou final de semana");
		}
		else {
			System.out.println("Ainda é dia de trabalho.");
		}
	}

}
