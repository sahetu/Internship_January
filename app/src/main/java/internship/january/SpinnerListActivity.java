package internship.january;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class SpinnerListActivity extends AppCompatActivity {

    Spinner spinner;
    //String[] countryArray = {"India","Australia","England","Canada","Demo","France"};
    ArrayList<String> countryArray;

    GridView gridView;

    AutoCompleteTextView autoTxt;
    MultiAutoCompleteTextView multiTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_list);

        spinner = findViewById(R.id.spinner);

        countryArray = new ArrayList<>();
        countryArray.add("India");
        countryArray.add("Australia");
        countryArray.add("Canada");
        countryArray.add("France");
        countryArray.add("England");
        countryArray.add("Demo");
        countryArray.add("Irrland");

        countryArray.remove(5);
        countryArray.set(5,"Ireland");

        countryArray.add(3,"Singapore");

        ArrayAdapter adapter = new ArrayAdapter(SpinnerListActivity.this, android.R.layout.simple_list_item_1,countryArray);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_checked);
        spinner.setAdapter(adapter);
        spinner.setSelection(3);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(SpinnerListActivity.this,countryArray.get(i) , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        gridView = findViewById(R.id.listview);
        ArrayAdapter listAdapter = new ArrayAdapter(SpinnerListActivity.this, android.R.layout.simple_list_item_1,countryArray);
        gridView.setAdapter(listAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(SpinnerListActivity.this, countryArray.get(i), Toast.LENGTH_SHORT).show();
            }
        });

        autoTxt = findViewById(R.id.autocomplete);
        ArrayAdapter autoAdapter = new ArrayAdapter(SpinnerListActivity.this, android.R.layout.simple_list_item_1,countryArray);
        autoTxt.setAdapter(autoAdapter);
        autoTxt.setThreshold(1);

        multiTxt = findViewById(R.id.multiautocomplete);
        ArrayAdapter multiautoAdapter = new ArrayAdapter(SpinnerListActivity.this, android.R.layout.simple_list_item_1,countryArray);
        multiTxt.setAdapter(multiautoAdapter);
        multiTxt.setThreshold(1);
        multiTxt.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

    }
}