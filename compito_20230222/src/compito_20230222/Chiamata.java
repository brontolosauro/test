package compito_20230222;

public class Chiamata {
	
	private double costoMinuti;
	private double durataMinuti;
	private String nazioneDestinazione;
	private Utente destinatario;
	
	public Chiamata() {
		this.destinatario = new Utente();
	}
	
	public double getCostoMinuti() {
		return costoMinuti;
	}
	public void setCostoMinuti(double costoMinuti) {
		this.costoMinuti = costoMinuti;
	}
	public double getDurataMinuti() {
		return durataMinuti;
	}
	public void setDurataMinuti(double durataMinuti) {
		this.durataMinuti = durataMinuti;
	}
	public String getNazioneDestinazione() {
		return nazioneDestinazione;
	}
	public void setNazioneDestinazione(String nazioneDestinazione) {
		this.nazioneDestinazione = nazioneDestinazione;
	}
	public Utente getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(Utente destinatario) {
		this.destinatario = destinatario;
	}
	
	

}
