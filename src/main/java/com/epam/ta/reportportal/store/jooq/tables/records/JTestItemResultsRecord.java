/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables.records;

import com.epam.ta.reportportal.store.jooq.enums.JStatusEnum;
import com.epam.ta.reportportal.store.jooq.tables.JTestItemResults;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTestItemResultsRecord extends UpdatableRecordImpl<JTestItemResultsRecord> implements Record4<Long, Long, JStatusEnum, Float> {

	private static final long serialVersionUID = 710757723;

	/**
	 * Setter for <code>public.test_item_results.id</code>.
	 */
	public void setId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.test_item_results.id</code>.
	 */
	public Long getId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.test_item_results.item_id</code>.
	 */
	public void setItemId(Long value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.test_item_results.item_id</code>.
	 */
	public Long getItemId() {
		return (Long) get(1);
	}

	/**
	 * Setter for <code>public.test_item_results.status</code>.
	 */
	public void setStatus(JStatusEnum value) {
		set(2, value);
	}

	/**
	 * Getter for <code>public.test_item_results.status</code>.
	 */
	public JStatusEnum getStatus() {
		return (JStatusEnum) get(2);
	}

	/**
	 * Setter for <code>public.test_item_results.duration</code>.
	 */
	public void setDuration(Float value) {
		set(3, value);
	}

	/**
	 * Getter for <code>public.test_item_results.duration</code>.
	 */
	public Float getDuration() {
		return (Float) get(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Long, Long, JStatusEnum, Float> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Long, Long, JStatusEnum, Float> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JTestItemResults.TEST_ITEM_RESULTS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return JTestItemResults.TEST_ITEM_RESULTS.ITEM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<JStatusEnum> field3() {
		return JTestItemResults.TEST_ITEM_RESULTS.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Float> field4() {
		return JTestItemResults.TEST_ITEM_RESULTS.DURATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component2() {
		return getItemId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JStatusEnum component3() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Float component4() {
		return getDuration();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value2() {
		return getItemId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JStatusEnum value3() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Float value4() {
		return getDuration();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTestItemResultsRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTestItemResultsRecord value2(Long value) {
		setItemId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTestItemResultsRecord value3(JStatusEnum value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTestItemResultsRecord value4(Float value) {
		setDuration(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTestItemResultsRecord values(Long value1, Long value2, JStatusEnum value3, Float value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JTestItemResultsRecord
	 */
	public JTestItemResultsRecord() {
		super(JTestItemResults.TEST_ITEM_RESULTS);
	}

	/**
	 * Create a detached, initialised JTestItemResultsRecord
	 */
	public JTestItemResultsRecord(Long id, Long itemId, JStatusEnum status, Float duration) {
		super(JTestItemResults.TEST_ITEM_RESULTS);

		set(0, id);
		set(1, itemId);
		set(2, status);
		set(3, duration);
	}
}
