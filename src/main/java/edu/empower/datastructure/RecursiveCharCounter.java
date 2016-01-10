package edu.empower.datastructure;

/**
 * @author reddysr
 */
public class RecursiveCharCounter {
	public String count(int position, String content, int counter) {
		verifyInputData(content, counter);
		if (position + 1 >= content.length()) {
			return "" + content.charAt(position) + counter;
		}
		if (content.charAt(position) == content.charAt(position + 1)) {
			return count(++position, content, ++counter);
		}
		return "" + content.charAt(position) + counter + count(++position, content, 1);
	}

	private void verifyInputData(String content, int counter) {
		if (content == null || content.isEmpty())
			throw new IllegalArgumentException("Input content must be provided");
		if (counter > content.length())
			throw new IllegalArgumentException("Invalid counter value, it always will be less than conent size");
	}

}
