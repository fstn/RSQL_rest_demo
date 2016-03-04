package com.fstn.utils;


// TODO: Auto-generated Javadoc
/**
 * The Class SortParameterParser.
 */
public class SortParameterParser {

	/** The parameter. */
	String parameter = "";

	/**
	 * Instantiates a new sort parameter parser.
	 *
	 * @param parameter
	 *            the parameter
	 */
	public SortParameterParser(String parameter) {
		super();
		this.parameter = parameter;
	}

	/**
	 * Parses the.
	 *
	 * @param parameter
	 *            the parameter
	 * @return the sort parameter parser
	 */
	public static SortParameterParser parse(String parameter) {
		return new SortParameterParser(parameter);
	}

	/**
	 * Gets the direction.
	 *
	 * @return the direction
	 */
	public String getDirection() {
		String result = null;
		if (parameter != null && parameter.length() > 0) {
			switch (parameter.charAt(0)) {
			case '-':
				result = "DESC";
				break;
			default:
				result = "ASC";
				break;
			}
		}
		return result;
	}

	/**
	 * Gets the fields.
	 *
	 * @return the fields
	 */
	public String getField() {
		String result = null;
		if (parameter != null && parameter.length() > 0) {
			switch (parameter.charAt(0)) {
			case '-':
				result = parameter.substring(1);
				break;
			case '+':
				result = parameter.substring(1);
				break;
			// dans certain cas le + est un espace
			case ' ':
				result = parameter.substring(1);
				break;
			default:
				result = parameter;
				break;
			}
		}
		return result;

	}
}
