/**
 * 
 */
package converter;

import java.io.File;
import java.io.IOException;

import data.PhotometricData;

/**
 * 
 * @author mateusz
 * 
 */
public interface Converter {
	/**
	 * Metoda bierze dane, i zapisuje je do pliku, w okreslonym formacie. Nazwa
	 * 'converter' jest chyba troche na wyrost.
	 * 
	 * @param data
	 *            dane fotometryczne
	 * @param file
	 *            plik
	 * @throws IOException
	 */
	void saveToFile(PhotometricData data, File file) throws IOException;

	/**
	 * Analogiczna metoda do tej powyzej.
	 * 
	 * @param data
	 *            dane
	 * @param filename
	 *            nazwa pliku
	 * @throws IOException
	 */
	void saveToFile(PhotometricData data, String filename) throws IOException;
}