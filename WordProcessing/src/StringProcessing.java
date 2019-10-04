class StringProcessing {
	public void PrintVertical(String msg) {
		int i = 0;
		for (i = 0; i < msg.length(); i++) {
			System.out.println(msg.substring(i, i + 1));
		}
	}

	public void wordCount(String msg) {
		int spacecount = 0;
		int i = 0;
		String alpha;
		for (i = 0; i < msg.length(); i++) {
			alpha = msg.substring(i, i + 1);
			if (alpha.equals(" ")) {
				spacecount++;
			}
		}
		System.out.println("We have " + (spacecount + 1) + " words:");
	}

	public void PrintVertical2(String msg) {
		String Word = "", Alpha;
		int i = 0;

		for (; i < msg.length(); i++) {
			Alpha = msg.substring(i, i + 1);
			if (Alpha.equals(" ")) {
				System.out.println(Word);
				Word = "";
			} else {
				Word += Alpha;
			}
		}
		System.out.println(Word);

	}

	public void PrintReversed(String msg) {
		String Word = "", Alpha;
		int i = msg.length() - 1;

		for (; i >= 0; i--) {
			Alpha = msg.substring(i, i + 1);
			if (Alpha.equals("")) {
				System.out.println(Word);
				Word = "";
			} else {
				Word = Alpha + Word;
			}
		}
	}

	public void findString(String msg, String lookFor) {
		int count = 0;
		String Alpha;
		int i;
		for (i = 0; i < msg.length(); i++) {
			Alpha = msg.substring(i, i + 1);

			if (Alpha.equals(lookFor.substring(0, 1))) {
				if (msg.substring(i, i + lookFor.length()).equals(lookFor)) {
					count++;
					i += lookFor.length() - 1;
				}
			}
		}
		System.out.println("The number of " + lookFor + "'s in the sentence is " + count);

	}

	public void LongestWord(String msg) {
		String alpha;
		int currentCharCount = 0;
		int largestCharCount = 0;
		int i = 0;
		String longestWord = "";
		String currentWord = "";

		for (; i < msg.length() - longestWord.length() - 1; i++) {
			alpha = msg.substring(i, i + 1);
			if (alpha.equals(" ") || alpha.equals(",") || alpha.equals(".")) {
				if (currentCharCount > largestCharCount) {
					longestWord = currentWord;
					largestCharCount = currentWord.length();
					currentWord = "";
					currentCharCount = 0;
				} else {
					currentWord = "";
					currentCharCount = 0;
				}
			} else {
				currentCharCount += 1;
				currentWord += alpha;
			}
		}
		System.out.println("The longest word is: " + longestWord);
	}
}
