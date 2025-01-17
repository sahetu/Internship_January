package internship.january;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CustomListActivity extends AppCompatActivity {

    GridView listView;
    String[] titleArray = {"Bestselling Sarees","Open work, rugged jeans...","Kids'  Dresses, T-Shirts...","Tokyo Talkies, SASSAFRAS & More","T-Shirts,Shirts, Jeans..","Crazy Deals"};
    String[] priceArray = {"Under ₹499","Under ₹499","Under ₹499","Under ₹499","Under ₹499","Under ₹499"};
    String[] descArray = {"Festive Collection!","Top Picks!","Knockout Deals","Dresses, Jakcets & Top","Top Delas","Men's Sneakers..."};
    String[] imageArray = {
            "https://rukminim2.flixcart.com/image/200/200/xif0q/sari/z/k/e/free-sndlwod1311-tfh-sareemall-unstitched-original-imah3h4haavnmt8b.jpeg?q=70",
            "https://rukminim2.flixcart.com/fk-p-flap/200/200/image/39edc84c149b9ed7.jpg?q=70",
            "https://rukminim2.flixcart.com/flap/200/200/image/79c005.jpg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/xif0q/dress/k/j/x/s-ttj6009952-tokyo-talkies-original-imagxf68mzeekvnd.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/xif0q/shirt/g/x/i/xl-surhi-patta-lgreen-u-turn-original-imah8fnfmbvmwz2s.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/xif0q/shoe/6/k/z/9-106-white-black-43-jactooz-white-black-original-imah3p8mxcm3wfna.jpeg?q=70"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        listView = findViewById(R.id.custom_listview);

        CustomListAdapter adapter = new CustomListAdapter(CustomListActivity.this,titleArray,priceArray,descArray,imageArray);
        listView.setAdapter(adapter);

    }
}