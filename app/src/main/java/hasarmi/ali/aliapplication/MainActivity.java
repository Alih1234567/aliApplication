package hasarmi.ali.aliapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.itmSettings) {
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.itmSignOut) {
            Toast.makeText(this, "SignOut", Toast.LENGTH_SHORT).show();
        }
        return true;

    }
}