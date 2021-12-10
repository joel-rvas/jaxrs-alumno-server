package com.canvia.util;

public class Util {

	//@SuppressWarnings("resource")
	/*public void registrarCsv(String archivo, String[] cabeceraArchivo, String[] datos) {

		try {

			boolean existeArchivo = false;
			if (Files.exists(Paths.get(archivo))) {
				existeArchivo = true;
			}

			BufferedWriter writer = Files.newBufferedWriter(Paths.get(archivo), StandardOpenOption.APPEND,
					StandardOpenOption.CREATE);
			CSVPrinter csvPrinter = null;

			if (existeArchivo) {
				csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
			} else {
				csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(cabeceraArchivo));
			}

			csvPrinter.printRecord(datos);
			csvPrinter.flush();
		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}

	}

	public CSVParser leerCsv(String archivo) {
		Reader reader = null;
		CSVParser csvParser = null;

		try {
			reader = Files.newBufferedReader(Paths.get(archivo));

			csvParser = new CSVParser(reader,
					CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());

		} catch (IOException e) {
			e.printStackTrace();
		}
		return csvParser;
	}

	public String dateToString(Date fechaDate) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		return dateFormat.format(fechaDate);
	}

	public Date stringToDate(String fechaStr) {
		try {
			return new SimpleDateFormat("yyyy-mm-dd").parse(fechaStr);
		} catch (ParseException e) {
			return null;
		}
	}*/

}
