package com.genesis.ginvoice.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.genesis.ginvoice.db.PersonalInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PERSONAL_INFO".
*/
public class PersonalInfoDao extends AbstractDao<PersonalInfo, Long> {

    public static final String TABLENAME = "PERSONAL_INFO";

    /**
     * Properties of entity PersonalInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "ID");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Company = new Property(2, String.class, "company", false, "COMPANY");
        public final static Property Phone = new Property(3, String.class, "phone", false, "PHONE");
        public final static Property BankId = new Property(4, String.class, "bankId", false, "BANK_ID");
        public final static Property BankAddr = new Property(5, String.class, "bankAddr", false, "BANK_ADDR");
        public final static Property Email = new Property(6, String.class, "email", false, "EMAIL");
    };


    public PersonalInfoDao(DaoConfig config) {
        super(config);
    }
    
    public PersonalInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PERSONAL_INFO\" (" + //
                "\"ID\" INTEGER PRIMARY KEY ," + // 0: id
                "\"NAME\" TEXT," + // 1: name
                "\"COMPANY\" TEXT," + // 2: company
                "\"PHONE\" TEXT," + // 3: phone
                "\"BANK_ID\" TEXT," + // 4: bankId
                "\"BANK_ADDR\" TEXT," + // 5: bankAddr
                "\"EMAIL\" TEXT);"); // 6: email
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PERSONAL_INFO\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, PersonalInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String company = entity.getCompany();
        if (company != null) {
            stmt.bindString(3, company);
        }
 
        String phone = entity.getPhone();
        if (phone != null) {
            stmt.bindString(4, phone);
        }
 
        String bankId = entity.getBankId();
        if (bankId != null) {
            stmt.bindString(5, bankId);
        }
 
        String bankAddr = entity.getBankAddr();
        if (bankAddr != null) {
            stmt.bindString(6, bankAddr);
        }
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(7, email);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public PersonalInfo readEntity(Cursor cursor, int offset) {
        PersonalInfo entity = new PersonalInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // company
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // phone
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // bankId
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // bankAddr
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // email
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, PersonalInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCompany(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPhone(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setBankId(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setBankAddr(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setEmail(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(PersonalInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(PersonalInfo entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}