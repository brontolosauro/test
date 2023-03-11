package compito_20230222;

import java.util.Vector;

public class Sim {
	
	private String numeroTelefono;
	private String nomeProprietario;
	private String nazioneProprietario;
	private Vector <Chiamata> listaChiamate;
	
	public Sim() {
		this.listaChiamate = new Vector<Chiamata>();
	}
	
	public void addChiamata(Chiamata c) {
		listaChiamate.add(c);
	}
	
	public double getCostoTotale() {
		double costoTotale = 0.0;
		for (Chiamata c: listaChiamate) {
			costoTotale += c.getCostoMinuti()*c.getDurataMinuti();
		}
		
		return costoTotale;
	}
	
	public int contaChiamateInternazionali() {
		int numChiamateInternazionali = 0;
		for (Chiamata c: listaChiamate) {
			if (nazioneProprietario.equalsIgnoreCase(c.getNazioneDestinazione())) {
				
			}else {
				numChiamateInternazionali++;
			}
		}
		
		return numChiamateInternazionali;
	}
	
	public String stampaSim() {
		return toString();
	}

	@Override
	public String toString() {
		return "Sim [numeroTelefono=" + numeroTelefono + ", nomeProprietario=" + nomeProprietario
				+ ", nazioneProprietario=" + nazioneProprietario +  "]";
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getNazioneProprietario() {
		return nazioneProprietario;
	}

	public void setNazioneProprietario(String nazioneProprietario) {
		this.nazioneProprietario = nazioneProprietario;
	}

	public Vector<Chiamata> getListaChiamate() {
		return listaChiamate;
	}

	public void setListaChiamate(Vector<Chiamata> listaChiamate) {
		this.listaChiamate = listaChiamate;
	}
	
	
	
	
}
