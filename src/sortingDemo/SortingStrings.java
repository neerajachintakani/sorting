package sortingDemo;

public class SortingStrings {
	
	//

	/**
	 * Removes any punctuation and special characters
	 * 
	 * @param inputString
	 * @return  returns formatted String
	 */

	private  String removeSpecialChars(String inputString) {
		String remove = "[\\.:', ]";
		String formattedString = inputString.replaceAll(remove, "").toLowerCase();		
		return formattedString;
	}
	
	/**
	 * sort using actual logic comparison 
	 * @param inputString
	 * @return returns sorted String
	 */
	public  String sortingStrings(String inputString) {
		String sortedString =null;
		if (null!=inputString && !"".equals(inputString)){	
		char[] charArray = removeSpecialChars(inputString).toCharArray();
		int length = charArray.length;

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (charArray[j] < charArray[i]) {
					char temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;

				}

			}

		}

		 sortedString = new String(charArray);
		}
		
		
		return sortedString;
	}

}
