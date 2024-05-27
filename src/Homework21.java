import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Homework21 {
	public static void main(String[] args) {

		// чтение содержимого файла построчно с сохранением в List<String> stringList
		BufferedReader br = null;
		String strLine = "";
		List<String> stringList = new ArrayList<>();
		try {
			br = new BufferedReader( new FileReader("text21"));
			while( (strLine = br.readLine()) != null){
				stringList.add(strLine);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			System.err.println("Unable to read the file.");
		}

		// конвертация List<String> stringList в String strOnlyWords
		// удаление символов пунктуации, чисел, лишних пробелов, чтобы между словами по одному пробелу
		String strOnlyWords = String.join(", ", stringList)
				.replaceAll("\\pP", "")
				.replaceAll("\\d", "")
				.replaceAll("[\\s]{2,}", " ");

		// массив String[] words, в переменнной int wordsLength длина массива или общее количество слов
		String[] words = strOnlyWords.split(" ");
		int wordsLength = words.length;

		// с помощью операций над Map<String, Integer> wordToCount выводим все слова
		// в алфавитном порядке с указанием количества повторов и процентного соотношения,
		// а также выводим слова, встречающиеся максимальное количество раз
		Map<String, Integer> wordToCount = new TreeMap<>();

		for (String word : words) {
			wordToCount.put(word, wordToCount.getOrDefault(word, 0) + 1);
		}

		for (Map.Entry<String, Integer> entry : wordToCount.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue() + " = " + entry.getValue() * wordsLength / 100 + "%");
		}

		String maxKey = Collections.max(wordToCount.entrySet(),
				Comparator.comparingInt(Map.Entry::getValue)).getKey();

		int maxValue = wordToCount.get(maxKey);

		System.out.println("Words that occur the maximum number of times" + " = " + maxValue + ": ");
		for (Map.Entry<String, Integer> entry : wordToCount.entrySet()) {
			if (entry.getValue() == maxValue) {
				System.out.println(entry.getKey());
			}
		}
	}
}
