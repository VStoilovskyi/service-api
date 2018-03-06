/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables.pojos;

import javax.annotation.Generated;
import java.io.Serializable;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTestItemStructure implements Serializable {

	private static final long serialVersionUID = 18230142;

	private Long id;
	private Long itemId;
	private Long launchId;
	private Long parentId;
	private Long retryOf;

	public JTestItemStructure() {
	}

	public JTestItemStructure(JTestItemStructure value) {
		this.id = value.id;
		this.itemId = value.itemId;
		this.launchId = value.launchId;
		this.parentId = value.parentId;
		this.retryOf = value.retryOf;
	}

	public JTestItemStructure(Long id, Long itemId, Long launchId, Long parentId, Long retryOf) {
		this.id = id;
		this.itemId = itemId;
		this.launchId = launchId;
		this.parentId = parentId;
		this.retryOf = retryOf;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getLaunchId() {
		return this.launchId;
	}

	public void setLaunchId(Long launchId) {
		this.launchId = launchId;
	}

	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getRetryOf() {
		return this.retryOf;
	}

	public void setRetryOf(Long retryOf) {
		this.retryOf = retryOf;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("JTestItemStructure (");

		sb.append(id);
		sb.append(", ").append(itemId);
		sb.append(", ").append(launchId);
		sb.append(", ").append(parentId);
		sb.append(", ").append(retryOf);

		sb.append(")");
		return sb.toString();
	}
}
