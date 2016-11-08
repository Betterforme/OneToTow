package com.daogenerator.gen;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class DDaoGenerator {
    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(3, "greendao");
        Entity box = schema.addEntity("Box");
        box.addIdProperty();
        box.addStringProperty("name");
        box.addIntProperty("slots");
        box.addStringProperty("description");
        new DaoGenerator().generateAll(schema, "E:\\project3\\OneToTow\\app\\src\\main\\java-gen");
    }

    /**
     * @param schema
     */
   private static void addAll(Schema schema) {

//        Entity sQLDataVer = schema.addEntity("SqlDataVerMstDB");
//        sQLDataVer.setTableName(DaoUtil.dbName("SqlDataVer"));
//
//        sQLDataVer.addLongProperty("id").notNull().primaryKey();
//        sQLDataVer.addStringProperty("sql_name").notNull();
//        sQLDataVer.addLongProperty("version_id").index();
//        sQLDataVer.addStringProperty("sql_str");
//
//
//        Entity localGj = schema.addEntity("LocalGjMstDB");
//        localGj.setTableName(DaoUtil.dbName("LocalGj"));
//        localGj.addLongProperty("group_id").notNull().index();
//        localGj.addStringProperty("user_id").notNull().index();
//        localGj.addStringProperty("hw_id");
//        localGj.addLongProperty("start_date");
//        localGj.addLongProperty("end_date");
//        localGj.addLongProperty("gj_qty");
//        localGj.addLongProperty("gj_qty_used");
//
//
//
//        Entity groupDataVer = schema.addEntity("GroupDataVerMstDB");
//        groupDataVer.setTableName(DaoUtil.dbName("GroupDataVer"));
//        groupDataVer.addLongProperty("group_id").notNull().primaryKey();
//        groupDataVer.addStringProperty("user_id").index();
//        groupDataVer.addLongProperty("hw_ver");
//        groupDataVer.addLongProperty("grp_ver");
//        groupDataVer.addLongProperty("ana_ver");
//        groupDataVer.addLongProperty("rank_ver");
//        groupDataVer.addLongProperty("ot_ver");
//
//
//
//        Entity groupMst = schema.addEntity("GroupMstDB");
//        groupMst.setTableName(DaoUtil.dbName("GroupMst"));
//        groupMst.addLongProperty("group_id").notNull().primaryKey();
//        groupMst.addStringProperty("province");
//        groupMst.addStringProperty("city");
//        groupMst.addStringProperty("school_name");
//        groupMst.addStringProperty("class_name");
//        groupMst.addLongProperty("start_school_year").notNull();
//        groupMst.addStringProperty("grade").notNull();
//        groupMst.addStringProperty("remark").notNull();
//        groupMst.addDateProperty("create_time").notNull();
//        groupMst.addDateProperty("update_time").notNull();
//        groupMst.addStringProperty("create_user").notNull();
//        groupMst.addStringProperty("update_user").notNull();
//        groupMst.addStringProperty("group_icon");
//        groupMst.addLongProperty("no_of_members");
//        groupMst.addLongProperty("school_type");
//        groupMst.addLongProperty("status").notNull();
//
//        Entity groupUser = schema.addEntity("GroupUserDB");
//        groupUser.setTableName(DaoUtil.dbName("GroupUser"));
//        groupUser.addStringProperty("group_user_id").notNull().primaryKey();
//        groupUser.addStringProperty("student_no");
//        groupUser.addLongProperty("role");
//        groupUser.addDateProperty("create_time");
//        groupUser.addDateProperty("update_time");
//        groupUser.addStringProperty("create_user");
//        groupUser.addStringProperty("update_user");
//        groupUser.addLongProperty("status").notNull();
//        groupUser.addStringProperty("child_user_id");
//
//        groupUser.addStringProperty("user_name").notNull();
//        groupUser.addLongProperty("sex").notNull();
//        groupUser.addDateProperty("dob");
//        groupUser.addStringProperty("province");
//        groupUser.addStringProperty("city");
//        groupUser.addStringProperty("email");
//        groupUser.addStringProperty("user_icon");
//        groupUser.addStringProperty("big_user_icon");
//        groupUser.addStringProperty("video_addr");
//        groupUser.addLongProperty("openid_type").notNull();
//        groupUser.addStringProperty("openid").notNull();
//        groupUser.addStringProperty("F_NO").index();
//
//
//
//        Entity hw = schema.addEntity("HwDB");
//        hw.setTableName(DaoUtil.dbName("Hw"));
//        hw.addStringProperty("hw_id").notNull().primaryKey();;
//        hw.addStringProperty("grade").notNull();
//        hw.addLongProperty("status_id").notNull();
//        hw.addDateProperty("start_date").notNull();
//        hw.addDateProperty("end_date").notNull();
//        hw.addDateProperty("create_time").notNull();
//        hw.addDateProperty("update_time").notNull();
//        hw.addStringProperty("create_user").notNull();
//        hw.addStringProperty("update_user").notNull();
//        hw.addLongProperty("is_delete").notNull();
//
//        Entity hwD = schema.addEntity("HwDDB");
//        hwD.setTableName(DaoUtil.dbName("HwD"));
//        hwD.addStringProperty("hw_d_id").notNull().primaryKey();
//        hwD.addLongProperty("exp_time_minutes").notNull();
//        hwD.addLongProperty("group_id").notNull();
//        hwD.addStringProperty("grade").notNull();
//        hwD.addStringProperty("remarks").notNull();
//        hwD.addDateProperty("create_time").notNull();
//        hwD.addDateProperty("update_time").notNull();
//        hwD.addStringProperty("create_user").notNull();
//        hwD.addStringProperty("update_user").notNull();
//        hwD.addLongProperty("is_delete").notNull();
//
//
//        Entity examDetail = schema.addEntity("ExamDetailDB");
//        examDetail.setTableName(DaoUtil.dbName("ExamDetail"));
//        examDetail.addStringProperty("exam_id").notNull().primaryKey();
//        examDetail.addLongProperty("exam_num").notNull().index();
//        examDetail.addStringProperty("exam_name").notNull().index();
//        examDetail.addLongProperty("group_id").notNull().index();
//        examDetail.addStringProperty("grade").notNull().index();
//        examDetail.addStringProperty("exam_type").notNull().index();
//        examDetail.addStringProperty("user_id").notNull().index();
//        examDetail.addDateProperty("exam_date");
//        examDetail.addStringProperty("evaluation");
//        examDetail.addFloatProperty("score_value").notNull();
//        examDetail.addDateProperty("create_time").notNull();
//        examDetail.addDateProperty("update_time").notNull();
//        examDetail.addStringProperty("create_user").notNull();
//        examDetail.addStringProperty("update_user").notNull();
//        examDetail.addLongProperty("is_delete");
//
//
//        Entity hwDUser = schema.addEntity("HwDUserDB");
//        hwDUser.setTableName(DaoUtil.dbName("HwDUser"));
//        hwDUser.addStringProperty("hw_d_user_id").primaryKey();
//        hwDUser.addStringProperty("hw_template_id").notNull();
//        hwDUser.addLongProperty("group_id").notNull();
//        hwDUser.addStringProperty("grade").notNull();;
//        hwDUser.addStringProperty("evaluation");
//        hwDUser.addStringProperty("hw_type").notNull();
//        hwDUser.addStringProperty("hw_item").notNull();
//        hwDUser.addStringProperty("hw_id");
//        hwDUser.addStringProperty("hw_d_id");
//        hwDUser.addStringProperty("remark");
//        hwDUser.addLongProperty("exp_time_minutes").notNull();
//        hwDUser.addLongProperty("act_time_seconds").notNull();
//        hwDUser.addLongProperty("pause_times").notNull();
//        hwDUser.addLongProperty("pause_second").notNull();
//        hwDUser.addDateProperty("act_start_time");
//        hwDUser.addDateProperty("act_end_time");
//        hwDUser.addFloatProperty("score_value").notNull();
//        hwDUser.addStringProperty("score_value_by");
//        hwDUser.addDateProperty("score_time");
//        hwDUser.addFloatProperty("ev_value").notNull();
//        hwDUser.addLongProperty("delay_reason_id").notNull();
//        hwDUser.addLongProperty("ev_status").notNull();
//        hwDUser.addLongProperty("status_id").notNull();
//        hwDUser.addDateProperty("create_time");
//        hwDUser.addDateProperty("update_time");
//        hwDUser.addStringProperty("create_user");
//        hwDUser.addStringProperty("update_user");
//        hwDUser.addLongProperty("is_delete").notNull();
//
//        Entity hwTemplate = schema.addEntity("HwTemplateDB");
//        hwTemplate.setTableName(DaoUtil.dbName("HwTemplate"));
//        hwTemplate.addStringProperty("hw_template_id").notNull().primaryKey();
//        hwTemplate.addStringProperty("grade").notNull();
//        hwTemplate.addStringProperty("hw_type").notNull();
//        hwTemplate.addStringProperty("hw_item").notNull();
//        hwTemplate.addLongProperty("is_delete").notNull();
//        hwTemplate.addDateProperty("create_time").notNull();
//        hwTemplate.addDateProperty("update_time").notNull();
//        hwTemplate.addStringProperty("create_user").notNull();
//        hwTemplate.addStringProperty("update_user").notNull();
//        hwTemplate.addLongProperty("exp_time_minutes").notNull();
//
//        Entity users = schema.addEntity("UsersDB");
//        users.setTableName(DaoUtil.dbName("Users"));
//        users.addStringProperty("user_id").notNull().primaryKey();
//        users.addStringProperty("user_name").notNull();
//        users.addLongProperty("sex").notNull();
//        users.addDateProperty("dob");
//        users.addStringProperty("province");
//        users.addStringProperty("city");
//        users.addStringProperty("email");
//        users.addStringProperty("user_icon");
//        users.addStringProperty("big_user_icon");
//        users.addStringProperty("video_addr");
//        users.addLongProperty("openid_type").notNull();
//        users.addStringProperty("openid").notNull();
//        users.addDateProperty("create_time").notNull();
//        users.addDateProperty("update_time").notNull();
//        users.addStringProperty("create_user").notNull();
//        users.addStringProperty("update_user").notNull();
//        users.addLongProperty("status").notNull();
//        users.addStringProperty("F_NO");
//        users.addLongProperty("last_group_id");
//
//
//
//        Entity hwRanking = schema.addEntity("HwRankingDB");
//        hwRanking.setTableName(DaoUtil.dbName("HwRanking"));
//        hwRanking.addStringProperty("hw_ranking_id").notNull().primaryKey();
//        hwRanking.addLongProperty("group_id").notNull().index();
//        hwRanking.addStringProperty("grade").notNull().index();
//        hwRanking.addStringProperty("user_id").notNull().index();
//        hwRanking.addStringProperty("hw_id").notNull().index();
//        hwRanking.addDateProperty("ranking_date").notNull();
//        hwRanking.addLongProperty("ranking_type").notNull().index();
//        hwRanking.addLongProperty("ranking_value").notNull();
//        hwRanking.addFloatProperty("act_value").notNull();
//        hwRanking.addDateProperty("create_time").notNull();
//        hwRanking.addDateProperty("update_time").notNull();
//        hwRanking.addStringProperty("create_user").notNull();
//        hwRanking.addStringProperty("update_user").notNull();
//        hwRanking.addLongProperty("is_delete").notNull();
//
//        Entity hwRankingD = schema.addEntity("HwRankingDDB");
//        hwRankingD.setTableName(DaoUtil.dbName("HwRankingD"));
//        hwRankingD.addStringProperty("hw_d_ranking_id").notNull().primaryKey();
//        hwRankingD.addLongProperty("group_id").notNull().index();
//        hwRankingD.addStringProperty("grade").notNull().index();
//        hwRankingD.addStringProperty("user_id").notNull().index();
//        hwRankingD.addStringProperty("hw_id").notNull().index();
//        hwRankingD.addStringProperty("hw_d_id").notNull().index();
//        hwRankingD.addDateProperty("ranking_date").notNull();
//        hwRankingD.addLongProperty("ranking_type").notNull().index();
//        hwRankingD.addLongProperty("ranking_value").notNull();
//        hwRankingD.addDateProperty("create_time").notNull();
//        hwRankingD.addDateProperty("update_time").notNull();
//        hwRankingD.addStringProperty("create_user").notNull();
//        hwRankingD.addStringProperty("update_user").notNull();
//        hwRankingD.addLongProperty("is_delete");
//
//        Entity hwGj = schema.addEntity("HwGjDB");
//        hwGj.setTableName(DaoUtil.dbName("HwGj"));
//        hwGj.addStringProperty("hw_gj_id").notNull().primaryKey();
//        hwGj.addStringProperty("hw_id").notNull();
//        hwGj.addLongProperty("group_id").notNull();
//        hwGj.addStringProperty("grade").notNull();
//        hwGj.addStringProperty("user_id").notNull();
//        hwGj.addStringProperty("gj_by_user").notNull();
//        hwGj.addLongProperty("gj_type").notNull();
//        hwGj.addDateProperty("create_time").notNull();
//        hwGj.addDateProperty("update_time").notNull();
//        hwGj.addStringProperty("create_user").notNull();
//        hwGj.addStringProperty("update_user").notNull();
//        hwGj.addLongProperty("is_delete");
//
//        Entity hwRankingType = schema.addEntity("HwRankingTypeDB");
//        hwRankingType.setTableName(DaoUtil.dbName("HwRankingType"));
//        hwRankingType.addStringProperty("hw_ranking_type_id").notNull().primaryKey();
//        hwRankingType.addLongProperty("group_id").notNull();
//        hwRankingType.addStringProperty("grade").notNull();
//        hwRankingType.addLongProperty("user_id").notNull();
//        hwRankingType.addStringProperty("hw_id").notNull();
//        hwRankingType.addFloatProperty("act_value").notNull();
//        hwRankingType.addStringProperty("hw_type").notNull();
//        hwRankingType.addDateProperty("ranking_date").notNull();
//        hwRankingType.addLongProperty("ranking_type").notNull();
//        hwRankingType.addLongProperty("ranking_value").notNull();
//        hwRankingType.addDateProperty("create_time").notNull();
//        hwRankingType.addDateProperty("update_time").notNull();
//        hwRankingType.addStringProperty("create_user").notNull();
//        hwRankingType.addStringProperty("update_user").notNull();
//        hwRankingType.addLongProperty("is_delete").notNull();
//
//
//        /*********** Relations pour GroupMst table ***********/
//        Property groupMstToGroupUser = groupUser.addLongProperty("group_id").notNull().getProperty();
//        groupUser.addToOne(groupMst,groupMstToGroupUser);
//        groupMst.addToMany(groupUser,groupMstToGroupUser);
//
//        Property groupMstToHw = hw.addLongProperty("group_id").notNull().getProperty();
//        hw.addToOne(groupMst,groupMstToHw);
//        groupMst.addToMany(hw,groupMstToHw);
//
//        Property groupMstToHwTemplate = hwTemplate.addLongProperty("group_id").notNull().getProperty();
//        hwTemplate.addToOne(groupMst,groupMstToHwTemplate);
//        groupMst.addToMany(hwTemplate,groupMstToHwTemplate);
//
//
//        /*********** Relations pour GroupUser table ***********/
//
//        /*********** Relations pour Hw table ***********/
//        Property hwToHwD = hwD.addStringProperty("hw_id").notNull().getProperty();
//        hwD.addToOne(hw,hwToHwD);
//        hw.addToMany(hwD,hwToHwD);
//
//
//        /*********** Relations pour HwD table ***********/
//
//        /*********** Relations pour HwDUser table ***********/
//
//        /*********** Relations pour HwTemplate table ***********/
//        Property hwTemplateToHwD = hwD.addStringProperty("hw_template_id").notNull().getProperty();
//        hwD.addToOne(hwTemplate,hwTemplateToHwD);
//        hwTemplate.addToMany(hwD,hwTemplateToHwD);
//
//
//        /*********** Relations pour Users table ***********/
//        Property usersToGroupUser = groupUser.addStringProperty("user_id").notNull().getProperty();
//        groupUser.addToOne(users,usersToGroupUser);
//        users.addToMany(groupUser,usersToGroupUser);
//
//        Property usersToHwDUser = hwDUser.addStringProperty("user_id").notNull().getProperty();
//        hwDUser.addToOne(users,usersToHwDUser);
//        users.addToMany(hwDUser,usersToHwDUser);
//
//
//
//    }
}
}
