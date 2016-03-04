package com.fstn.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


// TODO: Auto-generated Javadoc
/**
 * The Class ResultDTO.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ResultDTO {

	/** The search result metadata. */
	private SearchResultMetadata metadata;
	
	/** The result object. */
	private List<?> items;
	
	
	/**
	 * Instantiates a new result dto.
	 *
	 * @param metadata the search result metadata
	 * @param items the result object
	 */
	public ResultDTO(SearchResultMetadata metadata, List<?> items) {
		super();
		this.metadata = metadata;
		this.items = items;
	}
	
	/**
	 * Gets the search result metadata.
	 *
	 * @return the search result metadata
	 */
	public SearchResultMetadata getMetadata() {
		return metadata;
	}
	
	/**
	 * Sets the search result metadata.
	 *
	 * @param metadata the new search result metadata
	 */
	public void setMetadata(SearchResultMetadata metadata) {
		this.metadata = metadata;
	}
	
	/**
	 * Gets the result object.
	 *
	 * @return the result object
	 */
	public List<?> getItems() {
		return items;
	}
	
	/**
	 * Sets the result object.
	 *
	 * @param resultObject the new result object
	 */
	public void setItemst(List<Object> resultObject) {
		this.items = resultObject;
	}
	
	
}
