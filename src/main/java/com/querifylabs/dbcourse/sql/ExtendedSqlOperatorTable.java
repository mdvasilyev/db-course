package com.querifylabs.dbcourse.sql;

import org.apache.calcite.sql.util.ReflectiveSqlOperatorTable;

public class ExtendedSqlOperatorTable extends ReflectiveSqlOperatorTable {
    private static ExtendedSqlOperatorTable instance;

    public static synchronized ExtendedSqlOperatorTable instance() {
        if (instance == null) {
            instance = new ExtendedSqlOperatorTable();
            instance.init();
        }

        return instance;
    }

    // TODO: Task 2 add lower() and upper() functions.
}
