/*
 * Vormerkkarte für Medien
 * 
 * @author Carl, Phil, Benedikt
 */

package de.uni_hamburg.informatik.swt.se2.mediathek.ui.vormerken;

import de.uni_hamburg.informatik.swt.se2.mediathek.entitaeten.medien.Medium;
import de.uni_hamburg.informatik.swt.se2.mediathek.entitaeten.Kunde;
import java.util.Queue;
public class VormerkKarte {
	
	private Medium _medium;
	private Queue<Kunde> _vormerkkunden;
	
	/**
	 * Konstruktor der Vormerkkarte
	 * 
	 * @param medium Medium für Vormerkkarte
	 * @param kunde Kunde, der als nächstes ausleihen will
	 */
	public VormerkKarte(Medium medium, Kunde kunde)
	{
		assert medium != null;
		assert kunde != null;
		
		_medium = medium;
		_vormerkkunden.add(kunde);
	}
	
	
	/**
	 * Überprüft, ob Vormerkkarte leer ist
	 * @return True wenn Vormerkkarte leer ist
	 */
	public boolean istLeer()
	{
		return _vormerkkunden.isEmpty();
	}
	
	/**
	 * Gibt den nächsten Kunden zurück 
	 * @return Nächster Kunde
	 */
	public Kunde getNaechstenKunden()
	{
		return _vormerkkunden.peek();
	}
	
	/**
	 * Überprüft ob Kunde vorgemerkt ist
	 * @param kunde Kunde der überprüft werden soll
	 * @return True, wenn Kunde vorgemerkt ist
	 */
	public boolean istKundeVorgemerkt(Kunde kunde)
	{
		assert kunde != null;
		
		return _vormerkkunden.contains(kunde);
	}
}
