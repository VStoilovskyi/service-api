/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables.pojos;

import com.epam.ta.reportportal.store.jooq.enums.JProjectTypeEnum;

import javax.annotation.Generated;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JProjectConfiguration implements Serializable {

	private static final long serialVersionUID = -1218969846;

	private Integer id;
	private JProjectTypeEnum projectType;
	private Object interruptTimeout;
	private Object keepLogsInterval;
	private Object keepScreenshotsInterval;
	private Boolean aaEnabled;
	private Object metadata;
	private Integer emailConfigurationId;
	private Timestamp createdOn;

	public JProjectConfiguration() {
	}

	public JProjectConfiguration(JProjectConfiguration value) {
		this.id = value.id;
		this.projectType = value.projectType;
		this.interruptTimeout = value.interruptTimeout;
		this.keepLogsInterval = value.keepLogsInterval;
		this.keepScreenshotsInterval = value.keepScreenshotsInterval;
		this.aaEnabled = value.aaEnabled;
		this.metadata = value.metadata;
		this.emailConfigurationId = value.emailConfigurationId;
		this.createdOn = value.createdOn;
	}

	public JProjectConfiguration(Integer id, JProjectTypeEnum projectType, Object interruptTimeout, Object keepLogsInterval,
			Object keepScreenshotsInterval, Boolean aaEnabled, Object metadata, Integer emailConfigurationId, Timestamp createdOn) {
		this.id = id;
		this.projectType = projectType;
		this.interruptTimeout = interruptTimeout;
		this.keepLogsInterval = keepLogsInterval;
		this.keepScreenshotsInterval = keepScreenshotsInterval;
		this.aaEnabled = aaEnabled;
		this.metadata = metadata;
		this.emailConfigurationId = emailConfigurationId;
		this.createdOn = createdOn;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public JProjectTypeEnum getProjectType() {
		return this.projectType;
	}

	public void setProjectType(JProjectTypeEnum projectType) {
		this.projectType = projectType;
	}

	/**
	 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
	 */
	@java.lang.Deprecated
	public Object getInterruptTimeout() {
		return this.interruptTimeout;
	}

	/**
	 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
	 */
	@java.lang.Deprecated
	public void setInterruptTimeout(Object interruptTimeout) {
		this.interruptTimeout = interruptTimeout;
	}

	/**
	 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
	 */
	@java.lang.Deprecated
	public Object getKeepLogsInterval() {
		return this.keepLogsInterval;
	}

	/**
	 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
	 */
	@java.lang.Deprecated
	public void setKeepLogsInterval(Object keepLogsInterval) {
		this.keepLogsInterval = keepLogsInterval;
	}

	/**
	 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
	 */
	@java.lang.Deprecated
	public Object getKeepScreenshotsInterval() {
		return this.keepScreenshotsInterval;
	}

	/**
	 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
	 */
	@java.lang.Deprecated
	public void setKeepScreenshotsInterval(Object keepScreenshotsInterval) {
		this.keepScreenshotsInterval = keepScreenshotsInterval;
	}

	public Boolean getAaEnabled() {
		return this.aaEnabled;
	}

	public void setAaEnabled(Boolean aaEnabled) {
		this.aaEnabled = aaEnabled;
	}

	/**
	 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
	 */
	@java.lang.Deprecated
	public Object getMetadata() {
		return this.metadata;
	}

	/**
	 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
	 */
	@java.lang.Deprecated
	public void setMetadata(Object metadata) {
		this.metadata = metadata;
	}

	public Integer getEmailConfigurationId() {
		return this.emailConfigurationId;
	}

	public void setEmailConfigurationId(Integer emailConfigurationId) {
		this.emailConfigurationId = emailConfigurationId;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("JProjectConfiguration (");

		sb.append(id);
		sb.append(", ").append(projectType);
		sb.append(", ").append(interruptTimeout);
		sb.append(", ").append(keepLogsInterval);
		sb.append(", ").append(keepScreenshotsInterval);
		sb.append(", ").append(aaEnabled);
		sb.append(", ").append(metadata);
		sb.append(", ").append(emailConfigurationId);
		sb.append(", ").append(createdOn);

		sb.append(")");
		return sb.toString();
	}
}
