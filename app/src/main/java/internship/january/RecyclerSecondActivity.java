package internship.january;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class RecyclerSecondActivity extends AppCompatActivity {

    RecyclerView recyclerView;
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
    ArrayList<CustomList> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_second);

        recyclerView = findViewById(R.id.recycler_second);

        //Set Data In List Formate
        //recyclerView.setLayoutManager(new LinearLayoutManager(RecyclerSecondActivity.this));

        //Set Data In Grid Formate
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));

        arrayList = new ArrayList<>();
        for (int i=0;i<titleArray.length;i++){
            CustomList list = new CustomList();
            list.setTitle(titleArray[i]);
            list.setOffer(priceArray[i]);
            list.setDesc(descArray[i]);
            list.setImage(imageArray[i]);
            arrayList.add(list);
        }
        RecyclerSecondAdapter adapter = new RecyclerSecondAdapter(RecyclerSecondActivity.this,arrayList);
        recyclerView.setAdapter(adapter);

    }
}