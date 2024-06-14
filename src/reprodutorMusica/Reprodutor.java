package reprodutorMusica;

public class Reprodutor implements MusicService {
    public void tocar() {
		System.out.println("Tocando a Musica");
	}
	public void selecionarMusica() {
		System.out.println("Selecione sua musica");
	}
	public void pausar() {
		System.out.println("Pausando a Musica");
	}
}
