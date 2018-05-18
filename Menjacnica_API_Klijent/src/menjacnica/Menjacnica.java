package menjacnica;

import java.io.IOException;

import menjacnica.SO.SOgetContent;

public class Menjacnica {
	public String getContent(String url) throws IOException {
		return SOgetContent.izvrsi(url);
	}
}
