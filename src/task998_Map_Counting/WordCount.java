package task998_Map_Counting;

import java.util.HashMap;
import java.util.Map;

	class WordCount {
		
		public Map<String, Integer> phrase(String input) {
			String[] words = input
					.toLowerCase()
					.replaceAll("[!&@$%^:.\n\t]", "")
					.split("[. ,\\n]");
			
			Map<String, Integer> wordCount = new HashMap<String, Integer>();
   
			for (String word : words) {
				if (!word.isBlank()) {
					int count =
							(
								wordCount.containsKey(formatWord(word))
								? wordCount.get(formatWord(word))  // ? = If Else
								: 0								// : = if not, assign 0 to wordCount
							);
						wordCount.put(formatWord(word), count + 1);
				}
			}
			
			return wordCount;
		}
		
		public String formatWord(String word) {
			String tWord = word;
				if (!tWord.contains("n't")) {
					return tWord.replace("'", "").trim();
				}
				return tWord.trim();
		}
}
