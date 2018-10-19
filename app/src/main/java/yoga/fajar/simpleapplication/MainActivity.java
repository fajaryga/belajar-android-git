package yoga.fajar.simpleapplication;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

import yoga.fajar.simpleapplication.activity.AddUserActivity;
import yoga.fajar.simpleapplication.activity.DetailActivity;
import yoga.fajar.simpleapplication.util.PreferencesHelper;

public class MainActivity extends AppCompatActivity {


    private TextView name;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.etName);
        editText = findViewById(R.id.inputText);

        name.setText("Hello : "+PreferencesHelper.getInstance(getApplicationContext()).getName());
    }

        public void toAct(View view) {
            Intent pindahAct = new Intent(MainActivity.this, pindahActivity.class);
            startActivity(pindahAct);
        }

        public void toFrg(View view) {
            Intent pindahFrg = new Intent(MainActivity.this, FragmentActivity.class);
            startActivity(pindahFrg);
        }

    public void addBtn(View view) {
        Intent addAct = new Intent(MainActivity.this, AddUserActivity.class);
        startActivity(addAct);
    }

    public void listBtn(View view) {
        Intent listAct = new Intent(MainActivity.this, DetailActivity.class);
        startActivity(listAct);
    }
}
