package lnss.edu.sim.goez;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class NoteDatabase extends SQLiteOpenHelper {

    public static final String TABLE_NAME = "notes";
    public static final String CONTENT = "content";
    public static final String ID = "_id";
    public static final String TIME = "time";
    public static final String MODE = "mode";

    public NoteDatabase(Context context){
        super(context,"notes",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //执行sql语句
        db.execSQL("CREATE TABLE " + TABLE_NAME
                +"("
                //id主键自增长
                + ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                //内容非空
                + CONTENT + "TEXT NOT NULL,"
                //time非空
                + TIME + "TEXT NOT NULL,"
                //标签默认为1
                + MODE + "INTEGER DEFAULT 1)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
