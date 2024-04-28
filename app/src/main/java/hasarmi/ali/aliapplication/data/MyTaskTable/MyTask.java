package hasarmi.ali.aliapplication.data.MyTaskTable;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class MyTask
{
  @PrimaryKey(autoGenerate = true)
  public long KeyId;
  public int importance;
  public String shortTitle;
  public String text;
  public long time;
  public boolean isCompleted;
  public long subjId;
  public long userId;

    public long getKeyId() {
        return KeyId;
    }

    public int getImportance() {
        return importance;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public String getText() {
        return text;
    }

    public long getTime() {
        return time;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public long getUserId() {
        return userId;
    }

    public void setKeyId(long keyId) {
        KeyId = keyId;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "MyTask{" +
                "KeyId=" + KeyId +
                ", importance=" + importance +
                ", shortTitle='" + shortTitle + '\'' +
                ", text='" + text + '\'' +
                ", time=" + time +
                ", isCompleted=" + isCompleted +
                ", userId=" + userId +
                '}';
    }
}
