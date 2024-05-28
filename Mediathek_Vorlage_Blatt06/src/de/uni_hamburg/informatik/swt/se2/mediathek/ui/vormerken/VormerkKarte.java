/*
 * Vormerkkarte für Medien
 * 
 * @author Carl, Phil, Benedikt
 */

package de.uni_hamburg.informatik.swt.se2.mediathek.ui.vormerken;

import de.uni_hamburg.informatik.swt.se2.mediathek.entitaeten.medien.Medium;
import de.uni_hamburg.informatik.swt.se2.mediathek.entitaeten.Kunde;

import java.util.ArrayList;
import java.util.LinkedList;
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
		
		_vormerkkunden = new LinkedList<>();
		_medium = medium;
		_vormerkkunden.add(kunde);
	}
	
	public VormerkKarte(Medium medium)
	{
		assert medium != null;
		_vormerkkunden = new LinkedList<>();
		
		_medium = medium;
	}
	
	/**
	 * Fuegt einen neuen Kunden zur Queue hinzu
	 * @param kunde
	 * @return True, wenn Kunde zur Liste hunzugefügt wurde
	 */
	public boolean fuegeKundenHinzu(Kunde kunde)
	{
		assert kunde != null;
		assert _vormerkkunden != null;
		
		if (_vormerkkunden.size() < 3)
		{
			_vormerkkunden.add(kunde);
			return true;
		} else
		{
			return false;
		}
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
	
	/**
	 * Entfernt den ersten Kunden in der Liste
	 */
	public void entferneErstenKunden()
	{
		_vormerkkunden.remove();
	}
	
	/**
	 * Gibt alle Kunden als Liste zurück
	 * @return Kunden als Liste
	 */
	public ArrayList<Kunde> getAlleKunden()
	{
		return new ArrayList<Kunde>(_vormerkkunden);
	}
}
