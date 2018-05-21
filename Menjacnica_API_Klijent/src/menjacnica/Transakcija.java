package menjacnica;


public class Transakcija {
	private String datum;
	private String izValuta;
	private String uValuta;
	private String kurs;

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getIzValuta() {
		return izValuta;
	}

	public void setIzValuta(String izValuta) {
		this.izValuta = izValuta;
	}

	public String getuValuta() {
		return uValuta;
	}

	public void setuValuta(String uValuta) {
		this.uValuta = uValuta;
	}

	public String getKurs() {
		return kurs;
	}

	public void setKurs(String kurs) {
		this.kurs = kurs;
	}

}
