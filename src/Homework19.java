import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Homework19 {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("text19.txt");
			FileWriter fileWriter = new FileWriter("output.txt");

			int c;
			int vowelCount = 0;
			int consonantCount = 0;
			while ((c = fileReader.read()) != -1) {
				char character = (char) c;
				if (Character.isLetter(character)) {
					if (isVowel(character)) {
						fileWriter.write('a');
						vowelCount++;
					} else {
						fileWriter.write('м');
						consonantCount++;
					}
				} else {
					fileWriter.write(character);
				}
			}

			fileReader.close();
			fileWriter.close();

			System.out.println("Замена завершена. Результат записан в файл output.txt, в котором "
			                   + vowelCount + " гласных, " + consonantCount + " согласных.");
		} catch (IOException e) {
			System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
		}
	}

	private static boolean isVowel(char c) {
		return "аеёиоуыэюяАЕЁИОУЫЭЮЯ".indexOf(c) != -1;
	}
}
