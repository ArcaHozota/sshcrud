/*
 * This file is generated by jOOQ.
 */
package jp.co.toshiba.ppok.jooq.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import jp.co.toshiba.ppok.jooq.Keys;
import jp.co.toshiba.ppok.jooq.Public;
import jp.co.toshiba.ppok.jooq.tables.records.LanguageRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Language extends TableImpl<LanguageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.language</code>
     */
    public static final Language LANGUAGE = new Language();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LanguageRecord> getRecordType() {
        return LanguageRecord.class;
    }

    /**
     * The column <code>public.language.country_code</code>.
     */
    public final TableField<LanguageRecord, String> COUNTRY_CODE = createField(DSL.name("country_code"), SQLDataType.VARCHAR(3).nullable(false), this, "");

    /**
     * The column <code>public.language.language</code>.
     */
    public final TableField<LanguageRecord, String> LANGUAGE_ = createField(DSL.name("language"), SQLDataType.VARCHAR(30).nullable(false), this, "");

    /**
     * The column <code>public.language.is_official</code>.
     */
    public final TableField<LanguageRecord, String> IS_OFFICIAL = createField(DSL.name("is_official"), SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>public.language.percentage</code>.
     */
    public final TableField<LanguageRecord, BigDecimal> PERCENTAGE = createField(DSL.name("percentage"), SQLDataType.NUMERIC(5, 2).nullable(false), this, "");

    /**
     * The column <code>public.language.delete_flg</code>.
     */
    public final TableField<LanguageRecord, String> DELETE_FLG = createField(DSL.name("delete_flg"), SQLDataType.VARCHAR(7).nullable(false), this, "");

    private Language(Name alias, Table<LanguageRecord> aliased) {
        this(alias, aliased, null);
    }

    private Language(Name alias, Table<LanguageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.language</code> table reference
     */
    public Language(String alias) {
        this(DSL.name(alias), LANGUAGE);
    }

    /**
     * Create an aliased <code>public.language</code> table reference
     */
    public Language(Name alias) {
        this(alias, LANGUAGE);
    }

    /**
     * Create a <code>public.language</code> table reference
     */
    public Language() {
        this(DSL.name("language"), null);
    }

    public <O extends Record> Language(Table<O> child, ForeignKey<O, LanguageRecord> key) {
        super(child, key, LANGUAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<LanguageRecord> getPrimaryKey() {
        return Keys.LANGUAGE_PKEY;
    }

    @Override
    public List<ForeignKey<LanguageRecord, ?>> getReferences() {
        return Arrays.asList(Keys.LANGUAGE__FK_COUNTRY_LANGUAGE);
    }

    private transient Country _country;

    /**
     * Get the implicit join path to the <code>public.country</code> table.
     */
    public Country country() {
        if (_country == null)
            _country = new Country(this, Keys.LANGUAGE__FK_COUNTRY_LANGUAGE);

        return _country;
    }

    @Override
    public Language as(String alias) {
        return new Language(DSL.name(alias), this);
    }

    @Override
    public Language as(Name alias) {
        return new Language(alias, this);
    }

    @Override
    public Language as(Table<?> alias) {
        return new Language(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Language rename(String name) {
        return new Language(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Language rename(Name name) {
        return new Language(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Language rename(Table<?> name) {
        return new Language(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, BigDecimal, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super String, ? super String, ? super String, ? super BigDecimal, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super String, ? super String, ? super String, ? super BigDecimal, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}