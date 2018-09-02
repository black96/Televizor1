package edu.tv;

import edu.stanje.Stanja;

public class Televizor {
	private int kanal;
    private int zvuk;
    
   //={2,11,7,1,4}
   	Stanja s;
	
	

	public Stanja getS() {
		return s;
	}
	
	public void setS(Stanja s) {
		this.s = s;
	}
	
	public int getKanal() {
		return kanal;
	}
	/**
	 * Dodeljivanje vrednosti promenljive kanal
	 */
	public void setKanal(int kanal) {
		this.kanal = 1;
	}
	
	public int getZvuk() {
		return zvuk;
	}
	/**
	 * Dodeljivanje vrednosti promenljive zvuk
	 */
	public void setZvuk(int zvuk) {
		this.zvuk = 0;
	}
	/**
	 * Funkcija koja vrsi povecanje broja kanala do broja 16
	 */
	
	public int promenaKanala() {
		if(kanal<16){
			kanal=kanal+1;
		}
		return kanal;
	}
	/**
	 * Funkcija koja vrsi povecanje zvuka  do broja 20
	 */
	
	public int promenaZvuka() {
		if(zvuk<20){
			zvuk=zvuk+1;
		}
		return zvuk;
	}
	/**
	 * Funkcija koja vrsi smanjivanje broja kanala do broja 1
	 */
	
	public int smanjivanjeKanala() {
		if(kanal>1){
			kanal=kanal-1;
			}
			return kanal;
		
	}
	/**
	 * Funkcija koja vrsi smanjenje zvuka  do broja 0
	 */

	public int smanjivanjeZvuka() {
		if(zvuk>0){
			zvuk=zvuk-1;
		}
		return zvuk;
	}
	public Televizor() {
		super();
	}
	/**
	 * Funkcija koja ukljucuje televizor i postavlja vrednost kada se ukljuci televizor
	 */
	
	public void ukljucen() {
		if(s==s.sON){
			kanal=1;
			zvuk=10;
		}
		
	}
	/**
	 * Funkcija koja iskljucuje televizor
	 */
	
	public void iskljucen() {
		if(s==s.sOFF){
			kanal=0;
			zvuk=0;
		}
		
	}
	
    
}
