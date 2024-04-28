package hasarmi.ali.aliapplication.data.MyUserTable;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MyUserQuery
{
    @Query("SELECT * FROM MyUser")
    List<MyUser> getAll();
    @Query("SELECT * FROM MyUser WHERE Keyid IN (:userIds)")
    List<MyUser> loadAllByIds(int[] userIds);
    @Query("SELECT * FROM MyUser WHERE email = :myEmail AND passw = :myPassw LIMIT 1")
    MyUser checkEmailPassw (String myEmail, String myPassw);
    @Query("SELECT * FROM MyUser WHERE email = :myEmail LIMIT 1")
    MyUser checkEmail (String myEmail);
    @Insert
    void insertAll (MyUser...users);
    @Delete
    void delete (MyUser user);
    @Query("Delete From MyUser WHERE Keyid=:id")
    void delete (int id);
    @Insert
    void insert (MyUser myUser);
    @Update
    void update (MyUser...values);

}
