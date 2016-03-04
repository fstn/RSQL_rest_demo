package com.fstn.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

// TODO: Auto-generated Javadoc
/**
 * The Class SearchResultMetadata.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchResultMetadata {

	/** The count. */
	private Long count;
	
	/** The max result. */
	private Long maxResult;

	/**
	 * Instantiates a new search result metadata.
	 *
	 * @param aCount the a count
	 * @param aMaxResult the a max result
	 */
	public SearchResultMetadata(Long aCount, Long aMaxResult) {
		count = aCount;
		maxResult = aMaxResult;
	}

	/**
	 * Gets the count.
	 *
	 * @return the count
	 */
	public Long getCount() {
		return count;
	}

	/**
	 * Sets the count.
	 *
	 * @param count the new count
	 */
	public void setCount(Long count) {
		this.count = count;
	}

	/**
	 * Gets the max result.
	 *
	 * @return the max result
	 */
	public Long getMaxResult() {
		return maxResult;
	}

	/**
	 * Sets the max result.
	 *
	 * @param maxResult the new max result
	 */
	public void setMaxResult(Long maxResult) {
		this.maxResult = maxResult;
	}

	

}
