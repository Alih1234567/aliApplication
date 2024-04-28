package hasarmi.ali.aliapplication.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import org.junit.runner.manipulation.Ordering;

import hasarmi.ali.aliapplication.data.MySubjectTable.MySubject;
import hasarmi.ali.aliapplication.data.MySubjectTable.MySubjectQuery;
import hasarmi.ali.aliapplication.data.MyTaskTable.MyTask;
import hasarmi.ali.aliapplication.data.MyTaskTable.MyTaskQuery;
import hasarmi.ali.aliapplication.data.MyUserTable.MyUser;
import hasarmi.ali.aliapplication.data.MyUserTable.MyUserQuery;
@Database(entities = {MyUser.class, MySubject.class, MyTask.class},version = 1)
public abstract class AppDatabase extends RoomDatabase{
  private static AppDatabase db;
    public abstract MyUserQuery getMyUserQuery();
    public abstract MySubjectQuery getMySubjectQuery();
    public abstract MyTaskQuery getMyTaskQuery();

    public static AppDatabase getDb(Context context) {
        if (db == null) {
            db = Room.databaseBuilder(context, AppDatabase.class, "aliDataBase")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries().build();
        }
        return db;
    }
        }


