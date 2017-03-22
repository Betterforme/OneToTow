package com.daogenerator.gen;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class DDaoGenerator {
    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(3, "greendao");
        addAll(schema);
        new DaoGenerator().generateAll(schema, "E:\\project3\\OneToTow\\app\\src\\main\\java-gen\\greendao");
    }

    /**
     * @param schema
     */
   private static void addAll(Schema schema) {
       Entity box = schema.addEntity("User");
       box.addIdProperty();
       box.addStringProperty("objectId");
       box.addStringProperty("username");
       box.addStringProperty("password");
       box.addStringProperty("mobilePhoneNumber");



//        Entity sQLDataVer = schema.addEntity("SqlDataVerMstDB");
//        sQLDataVer.setTableName(DaoUtil.dbName("SqlDataVer"));
//
//        sQLDataVer.addLongProperty("id").notNull().primaryKey();
//        sQLDataVer.addStringProperty("sql_name").notNull();
//        sQLDataVer.addLongProperty("version_id").index();
//        sQLDataVer.addStringProperty("sql_str");
//
//
//    localGj.addLongProperty("gj_qty_used");


    }
}
