/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables.records;

import com.epam.ta.reportportal.store.jooq.tables.JItemTag;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JItemTagRecord extends UpdatableRecordImpl<JItemTagRecord> implements Record3<Integer, String, Long> {

	private static final long serialVersionUID = 1483871124;

	/**
	 * Setter for <code>public.item_tag.id</code>.
	 */
	public void setId(Integer value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.item_tag.id</code>.
	 */
	public Integer getId() {
		return (Integer) get(0);
	}

	/**
	 * Setter for <code>public.item_tag.value</code>.
	 */
	public void setValue(String value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.item_tag.value</code>.
	 */
	public String getValue() {
		return (String) get(1);
	}

	/**
	 * Setter for <code>public.item_tag.item_id</code>.
	 */
	public void setItemId(Long value) {
		set(2, value);
	}

	/**
	 * Getter for <code>public.item_tag.item_id</code>.
	 */
	public Long getItemId() {
		return (Long) get(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, String, Long> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, String, Long> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return JItemTag.ITEM_TAG.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return JItemTag.ITEM_TAG.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field3() {
		return JItemTag.ITEM_TAG.ITEM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer component1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component2() {
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component3() {
		return getItemId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value3() {
		return getItemId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JItemTagRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JItemTagRecord value2(String value) {
		setValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JItemTagRecord value3(Long value) {
		setItemId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JItemTagRecord values(Integer value1, String value2, Long value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JItemTagRecord
	 */
	public JItemTagRecord() {
		super(JItemTag.ITEM_TAG);
	}

	/**
	 * Create a detached, initialised JItemTagRecord
	 */
	public JItemTagRecord(Integer id, String value, Long itemId) {
		super(JItemTag.ITEM_TAG);

		set(0, id);
		set(1, value);
		set(2, itemId);
	}
}
