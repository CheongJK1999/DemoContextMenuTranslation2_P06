package sg.edu.rp.c346.id19043996.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText = findViewById(R.id.textViewTranslatedText);
        registerForContextMenu(tvTranslatedText);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menu_main,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.EnglishSelection) { //check whether the selected menu item ID is 0
            //code for action
            tvTranslatedText.setText("Hello");
            Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();

            return true; //menu item successfully handled
        }
        else if(id == R.id.italianSelection) { //check if the selected menu item ID is 1
            //code for action
            tvTranslatedText.setText("Ciao");
            Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();

            return true;  //menu item successfully handled
        }
        return super.onContextItemSelected(item);
    }


}
