package com.daogenerator.gen;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class DDaoGenerator {
    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(3, "generator");
        addAll(schema);
        new DaoGenerator().generateAll(schema, "E:\\project3\\OneToTow\\app\\src\\main\\java\\com\\example\\administrator\\onetotow\\main");
    }

    /**
     * @param schema
     */
   private static void addAll(Schema schema) {
       Entity box = schema.addEntity("User");
       box.addStringProperty("objectId").notNull().primaryKey();
       box.addStringProperty("username");
       box.addStringProperty("password");
       box.addStringProperty("mobilePhoneNumber");
       box.addStringProperty("email");



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
