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
import jp.co.toshiba.ppok.jooq.tables.records.CountryRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function16;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row16;
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
public class Country extends TableImpl<CountryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.country</code>
     */
    public static final Country COUNTRY = new Country();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CountryRecord> getRecordType() {
        return CountryRecord.class;
    }

    /**
     * The column <code>public.country.code</code>.
     */
    public final TableField<CountryRecord, String> CODE = createField(DSL.name("code"), SQLDataType.VARCHAR(3).nullable(false), this, "");

    /**
     * The column <code>public.country.name</code>.
     */
    public final TableField<CountryRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(52).nullable(false), this, "");

    /**
     * The column <code>public.country.continent</code>.
     */
    public final TableField<CountryRecord, String> CONTINENT = createField(DSL.name("continent"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.country.region</code>.
     */
    public final TableField<CountryRecord, String> REGION = createField(DSL.name("region"), SQLDataType.VARCHAR(26).nullable(false), this, "");

    /**
     * The column <code>public.country.surface_area</code>.
     */
    public final TableField<CountryRecord, BigDecimal> SURFACE_AREA = createField(DSL.name("surface_area"), SQLDataType.NUMERIC(23, 5).nullable(false), this, "");

    /**
     * The column <code>public.country.independence_year</code>.
     */
    public final TableField<CountryRecord, Short> INDEPENDENCE_YEAR = createField(DSL.name("independence_year"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>public.country.population</code>.
     */
    public final TableField<CountryRecord, Integer> POPULATION = createField(DSL.name("population"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.country.life_expectancy</code>.
     */
    public final TableField<CountryRecord, BigDecimal> LIFE_EXPECTANCY = createField(DSL.name("life_expectancy"), SQLDataType.NUMERIC(5, 2), this, "");

    /**
     * The column <code>public.country.gnp_usd</code>.
     */
    public final TableField<CountryRecord, BigDecimal> GNP_USD = createField(DSL.name("gnp_usd"), SQLDataType.NUMERIC(23, 5), this, "");

    /**
     * The column <code>public.country.gnp_usd_old</code>.
     */
    public final TableField<CountryRecord, BigDecimal> GNP_USD_OLD = createField(DSL.name("gnp_usd_old"), SQLDataType.NUMERIC(23, 5), this, "");

    /**
     * The column <code>public.country.local_name</code>.
     */
    public final TableField<CountryRecord, String> LOCAL_NAME = createField(DSL.name("local_name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>public.country.government_form</code>.
     */
    public final TableField<CountryRecord, String> GOVERNMENT_FORM = createField(DSL.name("government_form"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>public.country.head_of_state</code>.
     */
    public final TableField<CountryRecord, String> HEAD_OF_STATE = createField(DSL.name("head_of_state"), SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>public.country.capital</code>.
     */
    public final TableField<CountryRecord, Integer> CAPITAL = createField(DSL.name("capital"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.country.code2</code>.
     */
    public final TableField<CountryRecord, String> CODE2 = createField(DSL.name("code2"), SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>public.country.delete_flg</code>.
     */
    public final TableField<CountryRecord, String> DELETE_FLG = createField(DSL.name("delete_flg"), SQLDataType.VARCHAR(7).nullable(false), this, "");

    private Country(Name alias, Table<CountryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Country(Name alias, Table<CountryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.country</code> table reference
     */
    public Country(String alias) {
        this(DSL.name(alias), COUNTRY);
    }

    /**
     * Create an aliased <code>public.country</code> table reference
     */
    public Country(Name alias) {
        this(alias, COUNTRY);
    }

    /**
     * Create a <code>public.country</code> table reference
     */
    public Country() {
        this(DSL.name("country"), null);
    }

    public <O extends Record> Country(Table<O> child, ForeignKey<O, CountryRecord> key) {
        super(child, key, COUNTRY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<CountryRecord> getPrimaryKey() {
        return Keys.COUNTRY_PKEY;
    }

    @Override
    public List<ForeignKey<CountryRecord, ?>> getReferences() {
        return Arrays.asList(Keys.COUNTRY__FK_CITY_COUNTRY);
    }

    private transient City _city;

    /**
     * Get the implicit join path to the <code>public.city</code> table.
     */
    public City city() {
        if (_city == null)
            _city = new City(this, Keys.COUNTRY__FK_CITY_COUNTRY);

        return _city;
    }

    @Override
    public Country as(String alias) {
        return new Country(DSL.name(alias), this);
    }

    @Override
    public Country as(Name alias) {
        return new Country(alias, this);
    }

    @Override
    public Country as(Table<?> alias) {
        return new Country(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Country rename(String name) {
        return new Country(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Country rename(Name name) {
        return new Country(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Country rename(Table<?> name) {
        return new Country(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<String, String, String, String, BigDecimal, Short, Integer, BigDecimal, BigDecimal, BigDecimal, String, String, String, Integer, String, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function16<? super String, ? super String, ? super String, ? super String, ? super BigDecimal, ? super Short, ? super Integer, ? super BigDecimal, ? super BigDecimal, ? super BigDecimal, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function16<? super String, ? super String, ? super String, ? super String, ? super BigDecimal, ? super Short, ? super Integer, ? super BigDecimal, ? super BigDecimal, ? super BigDecimal, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}