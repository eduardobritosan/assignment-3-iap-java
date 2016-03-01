package exercise4;

/**
 * Class that defines a Word, coupled with the strings and the amount of times it repeats.
 * 
 * Subject: Interactive Apps Programming
 * @author eebritos eduardobritosanchez@gmail.com
 * @version 1.0.0
 * @since 2016-19-02
 */
public class Word {
	
	private String string;
	private Integer duplicates;
	
	public Word(String string) {
		setString(string);
		setDuplicates(1);
	}
	
	public Word(){
		setString("");
		setDuplicates(1);
	}
	
	public Word(String string, Integer duplicate){
		setString(string);
		setDuplicates(duplicate);
	}

	/**
	 * @return the string
	 */
	protected String getString() {
		return string;
	}

	/**
	 * @param string the string to set
	 */
	protected void setString(String string) {
		this.string = string;
	}

	/**
	 * @return the duplicates
	 */
	protected Integer getDuplicates() {
		return duplicates;
	}

	/**
	 * @param duplicates the duplicates to set
	 */
	protected void setDuplicates(Integer duplicates) {
		this.duplicates = duplicates;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Word [string=" + string + ", duplicates=" + duplicates + "]";
	}

}
