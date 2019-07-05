package com.genesis.ginvoice.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.genesis.ginvoice.db.Invoice;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "INVOICE".
*/
public class InvoiceDao extends AbstractDao<Invoice, Long> {

    public static final String TABLENAME = "INVOICE";

    /**
     * Properties of entity Invoice.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "ID");
        public final static Property Card_id = new Property(1, Long.class, "card_id", false, "CARD_ID");
        public final static Property Photo_file_path = new Property(2, String.class, "photo_file_path", false, "PHOTO_FILE_PATH");
        public final static Property Small_photo_path = new Property(3, String.class, "small_photo_path", false, "SMALL_PHOTO_PATH");
        public final static Property Price = new Property(4, Float.class, "price", false, "PRICE");
        public final static Property SellerName = new Property(5, String.class, "sellerName", false, "SELLER_NAME");
        public final static Property SellerBank = new Property(6, String.class, "sellerBank", false, "SELLER_BANK");
        public final static Property SellerAddress = new Property(7, String.class, "sellerAddress", false, "SELLER_ADDRESS");
        public final static Property PurchaserName = new Property(8, String.class, "purchaserName", false, "PURCHASER_NAME");
        public final static Property PurchaserAddress = new Property(9, String.class, "purchaserAddress", false, "PURCHASER_ADDRESS");
        public final static Property PurchaserRegisterNum = new Property(10, String.class, "purchaserRegisterNum", false, "PURCHASER_REGISTER_NUM");
        public final static Property AmountInWords = new Property(11, String.class, "amountInWords", false, "AMOUNT_IN_WORDS");
        public final static Property AmountInFiguers = new Property(12, Float.class, "amountInFiguers", false, "AMOUNT_IN_FIGUERS");
        public final static Property InvoiceNum = new Property(13, String.class, "InvoiceNum", false, "INVOICE_NUM");
        public final static Property Checker = new Property(14, String.class, "checker", false, "CHECKER");
        public final static Property Create_time = new Property(15, java.util.Date.class, "create_time", false, "CREATE_TIME");
    };


    public InvoiceDao(DaoConfig config) {
        super(config);
    }
    
    public InvoiceDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"INVOICE\" (" + //
                "\"ID\" INTEGER PRIMARY KEY ," + // 0: id
                "\"CARD_ID\" INTEGER," + // 1: card_id
                "\"PHOTO_FILE_PATH\" TEXT," + // 2: photo_file_path
                "\"SMALL_PHOTO_PATH\" TEXT," + // 3: small_photo_path
                "\"PRICE\" REAL," + // 4: price
                "\"SELLER_NAME\" TEXT," + // 5: sellerName
                "\"SELLER_BANK\" TEXT," + // 6: sellerBank
                "\"SELLER_ADDRESS\" TEXT," + // 7: sellerAddress
                "\"PURCHASER_NAME\" TEXT," + // 8: purchaserName
                "\"PURCHASER_ADDRESS\" TEXT," + // 9: purchaserAddress
                "\"PURCHASER_REGISTER_NUM\" TEXT," + // 10: purchaserRegisterNum
                "\"AMOUNT_IN_WORDS\" TEXT," + // 11: amountInWords
                "\"AMOUNT_IN_FIGUERS\" REAL," + // 12: amountInFiguers
                "\"INVOICE_NUM\" TEXT," + // 13: InvoiceNum
                "\"CHECKER\" TEXT," + // 14: checker
                "\"CREATE_TIME\" INTEGER);"); // 15: create_time
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"INVOICE\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Invoice entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long card_id = entity.getCard_id();
        if (card_id != null) {
            stmt.bindLong(2, card_id);
        }
 
        String photo_file_path = entity.getPhoto_file_path();
        if (photo_file_path != null) {
            stmt.bindString(3, photo_file_path);
        }
 
        String small_photo_path = entity.getSmall_photo_path();
        if (small_photo_path != null) {
            stmt.bindString(4, small_photo_path);
        }
 
        Float price = entity.getPrice();
        if (price != null) {
            stmt.bindDouble(5, price);
        }
 
        String sellerName = entity.getSellerName();
        if (sellerName != null) {
            stmt.bindString(6, sellerName);
        }
 
        String sellerBank = entity.getSellerBank();
        if (sellerBank != null) {
            stmt.bindString(7, sellerBank);
        }
 
        String sellerAddress = entity.getSellerAddress();
        if (sellerAddress != null) {
            stmt.bindString(8, sellerAddress);
        }
 
        String purchaserName = entity.getPurchaserName();
        if (purchaserName != null) {
            stmt.bindString(9, purchaserName);
        }
 
        String purchaserAddress = entity.getPurchaserAddress();
        if (purchaserAddress != null) {
            stmt.bindString(10, purchaserAddress);
        }
 
        String purchaserRegisterNum = entity.getPurchaserRegisterNum();
        if (purchaserRegisterNum != null) {
            stmt.bindString(11, purchaserRegisterNum);
        }
 
        String amountInWords = entity.getAmountInWords();
        if (amountInWords != null) {
            stmt.bindString(12, amountInWords);
        }
 
        Float amountInFiguers = entity.getAmountInFiguers();
        if (amountInFiguers != null) {
            stmt.bindDouble(13, amountInFiguers);
        }
 
        String InvoiceNum = entity.getInvoiceNum();
        if (InvoiceNum != null) {
            stmt.bindString(14, InvoiceNum);
        }
 
        String checker = entity.getChecker();
        if (checker != null) {
            stmt.bindString(15, checker);
        }
 
        java.util.Date create_time = entity.getCreate_time();
        if (create_time != null) {
            stmt.bindLong(16, create_time.getTime());
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Invoice readEntity(Cursor cursor, int offset) {
        Invoice entity = new Invoice( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // card_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // photo_file_path
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // small_photo_path
            cursor.isNull(offset + 4) ? null : cursor.getFloat(offset + 4), // price
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // sellerName
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // sellerBank
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // sellerAddress
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // purchaserName
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // purchaserAddress
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // purchaserRegisterNum
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // amountInWords
            cursor.isNull(offset + 12) ? null : cursor.getFloat(offset + 12), // amountInFiguers
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // InvoiceNum
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // checker
            cursor.isNull(offset + 15) ? null : new java.util.Date(cursor.getLong(offset + 15)) // create_time
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Invoice entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCard_id(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setPhoto_file_path(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSmall_photo_path(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPrice(cursor.isNull(offset + 4) ? null : cursor.getFloat(offset + 4));
        entity.setSellerName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setSellerBank(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setSellerAddress(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPurchaserName(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setPurchaserAddress(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setPurchaserRegisterNum(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setAmountInWords(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setAmountInFiguers(cursor.isNull(offset + 12) ? null : cursor.getFloat(offset + 12));
        entity.setInvoiceNum(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setChecker(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setCreate_time(cursor.isNull(offset + 15) ? null : new java.util.Date(cursor.getLong(offset + 15)));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Invoice entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Invoice entity) {
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