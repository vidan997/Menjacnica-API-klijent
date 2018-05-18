package menjacnica.gui.kontroler;

import java.awt.EventQueue;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import menjacnica.Country;
import menjacnica.Menjacnica;
import menjacnica.gui.MenjacnicaGUI;

public class GUIKontroler {
	
	public static Menjacnica menjacnica = new Menjacnica();
	public static MenjacnicaGUI gp;
	public static LinkedList<Country> countries = new LinkedList<Country>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIKontroler.gp = new MenjacnicaGUI();
					GUIKontroler.gp.setVisible(true);
					GUIKontroler.prikaz();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void prikaz() {
		try {
			String zemljeJ = menjacnica.getContent("http://free.currencyconverterapi.com/api/v3/countries");
			JsonParser par = new JsonParser();
			Gson g = new GsonBuilder().create();
			JsonObject obj = par.parse(zemljeJ).getAsJsonObject().getAsJsonObject("results");
			for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
				Country c = g.fromJson(entry.getValue(), Country.class);
				countries.add(c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		gp.dodajCB(gp.domacaZ,countries);
		gp.dodajCB(gp.stranaZ,countries);

	}
	
}