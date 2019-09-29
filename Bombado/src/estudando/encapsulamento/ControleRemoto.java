package estudando.encapsulamento;

public class ControleRemoto implements Controlador  {
private int volume;
private boolean ligado;
private boolean tocando;
public ControleRemoto() {
	this.volume = 50;
	this.ligado = false;
	this.tocando =  false;
}
public int getVolume() {
	return volume;
}
public void setVolume(int volume) {
	this.volume = volume;
}
public boolean getLigado() {
	return ligado;
}
public void setLigado(boolean ligado) {
	this.ligado = ligado;
}
public boolean getTocando() {
	return tocando;
}
public void setTocando(boolean tocando) {
	this.tocando = tocando;
}
//Metodos abstratos
@Override
public void ligar() {
	this.setLigado(true);
	
}
@Override
public void desligar() {
	this.setLigado(false);
	
}
@Override
public void abrirMenu() {
	System.out.println("O controle está ligado: "+this.getLigado());
	System.out.println("O volume está em  " +this.getVolume());
	System.out.println("O controle está tocando: " +this.getTocando());
	for(int i=0; i< getVolume(); i+=10 ) {
		System.out.print("|");
		
	}
	this.getTocando();
	
}
@Override
public void fecharMenu() {
	System.out.println("Fechando menu");
	
}
@Override
public void maisVolume() {
	if(getLigado() == true) {
		setVolume(getVolume() + 10);
	}
	
}
@Override
public void menosVolume() {
	if(getLigado() == true) {
		setVolume(getVolume() -10);
	}

}
@Override
public void ligarMudo() {
	if(getLigado() == true &&  getVolume() > 0) {
		this.setVolume(0);
	}
	
}
@Override
public void desligarMudo() {
	if(getLigado() == true && getVolume() == 0) {
		this.setVolume(50);
	}
	
}
@Override
public void play() {
	if(this.getLigado() == true &&  !(this.getTocando())) {
		this.setTocando(true);
	}
	
}
@Override
public void pause() {
if(this.getLigado() == true && this.getTocando() == true) {
	this.setTocando(false);
	
}

	
}
@Override
public String toString() {
	return "ControleRemoto [volume=" + volume + ", ligado=" + ligado + ", tocando=" + tocando + "]";
}



}
