package compito_20230222;

import utilita.input.Tastiera;

public class GestioneSim {
	
	private Sim sim = new Sim();
	private boolean nuovoInserimento = true;
	
	protected void esegui() {
		int scelta;
		do {
			stampaMenù();
			scelta = Tastiera.leggiInt();
			eseguiOpzioneMenù(scelta);
			
		} while (scelta != 0);
	}
	
	private void stampaMenù() {
		System.out.println("1 -- inserisci i dati della sim");
		System.out.println("2 -- inserisci chiamata");
		System.out.println("3 -- stampa totale spese effettuate");
		System.out.println("4 -- stampa dati destinatari chiamate");
		System.out.println("5 -- stampa dati sim");
		System.out.println("0 -- termina il programma");
		
		
	}
	
	private void eseguiOpzioneMenù(int scelta) {
		switch (scelta) {
		case 1: {
			if (nuovoInserimento ) {
				System.out.println("numero di telefono: ");
				sim.setNumeroTelefono(Tastiera.leggiString());
				System.out.println("nome proprietario: ");
				sim.setNomeProprietario(Tastiera.leggiString());
				System.out.println("nazione proprietario: ");
				sim.setNazioneProprietario(Tastiera.leggiString());
				nuovoInserimento = false;
			}else {
				System.out.println("i dati della sim sono già stati inseriti");
			}
			
			
			break;
		}
		case 2: {
			sim.addChiamata(istanziaChiamata());
			
			break;
		}
		case 3: {
			System.out.println("totale spesete effettuate: "+sim.getCostoTotale());
			break;
		}
		case 4: {
			for (Chiamata c: sim.getListaChiamate()) {
				System.out.println(c.getDestinatario().toString());
			}
			break;
		}
		case 5: {
			sim.stampaSim();
			break;
		}
		case 0: {
			System.out.println("Programma terminato con successo.");
			break;
		}
		default:
			System.out.println("Si è verificato un errore. Riprova.");
		}
	}
	
	private Chiamata istanziaChiamata() {
		Chiamata ch = new Chiamata();
		System.out.println("costo al minuto: ");
		ch.setCostoMinuti(Tastiera.leggiDouble());
		System.out.println("durata [minuti]: ");
		ch.setDurataMinuti(Tastiera.leggiDouble());
		System.out.println("nazione destinazione: ");
		ch.setNazioneDestinazione(Tastiera.leggiString());
		System.out.println("nome Destinatatio: ");
		ch.getDestinatario().setNome(Tastiera.leggiString());
		System.out.println("cognome destinatatio: ");
		ch.getDestinatario().setCognome(Tastiera.leggiString());
		System.out.println("numero telefonico destinatario: ");
		ch.getDestinatario().setNumeroTelefono(Tastiera.leggiInt());
		
		return ch;
		
	}

}
