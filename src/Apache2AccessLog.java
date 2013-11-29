import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Apache2AccessLog {
	private String directory = "/var/log/apache2/";
	private String file = "access.log";

	private int noLines = 25;
	private String[] logContent;

	public Apache2AccessLog() {
		logContent = new String[noLines];
	}

	public void setNoLines(int lines) {
		noLines = lines;
	}

	public void read() {
		BufferedReader reader;
		String line = null;

		try {
			reader = new BufferedReader(new FileReader(directory + file));
			try {
				int i = 0;
				while ((line = reader.readLine()) != null) {
					if (i >= noLines) {
						for (int j = 0; j < noLines - 1; j++) {
							logContent[j] = logContent[j + 1];
						}
						logContent[noLines - 1] = line;
					} else {
						logContent[i++] = line;
					}
				}
			} catch (IOException e) {
				System.out.println("Read error");
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}

	public void print() {
		for (String line : logContent) {
			System.out.println(line);
		}
	}
}
