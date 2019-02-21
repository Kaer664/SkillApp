package edevelopmentandroidcompanydomain.skillapplication.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by lucky on 2019/2/21.
 */

public class MySQLiteHelp1 extends SQLiteOpenHelper {
    /**
     * @param context 在那个上下文中创建
     * @param name    数据库名称
     * @param factory 创建工厂
     * @param version 数据库版本
     */
    public MySQLiteHelp1(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
