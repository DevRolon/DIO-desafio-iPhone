package appTelefone;

public class Telefone implements TelefoneService {
    
    public void ligar() {
		System.out.println("Ligar para número: ");
	}
	public void atender() {
		System.out.println("Atendeu telefone");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio Voz");
	}
	public void desligar() {
		System.out.println("Fim da chamada");
	}

}
