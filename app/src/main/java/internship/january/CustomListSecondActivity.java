package internship.january;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class CustomListSecondActivity extends AppCompatActivity {

    ListView listView;
    String[] imageArray = {
            "https://rukminim2.flixcart.com/image/200/200/kzegk280/action-figure/9/v/t/3-30155-mcfarlane-2-5-original-imagbeyyzehpyk2m.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/xif0q/musical-keyboard/h/v/n/37-0-2-a128-piano-keyboard-with-recording-mic-mobile-charger-original-imah3wpfgguypzb7.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/kx50gi80/pen/h/z/k/119766-flair-original-imag9nzubznagufg.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/xif0q/microphone/y/c/x/lapel-mic-mobile-collar-metal-mic-clip-microphone-for-voice-original-imah2z4mahbhmzs5.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/acoustic-guitar/e/y/y/dd-380c-blk-jixing-original-imaeff94e9tczafp.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/kdbzqfk0/bar/8/h/q/push-up-bar-0-8-long-ankaro-original-imafu9dmvdk3rzvy.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/jxz0brk0/stuffed-toy/n/t/s/4-feet-pink-very-beautiful-best-quality-for-special-gift-125-13-original-imafgv92puzkdytg.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/l58iaa80/electric-cycle/i/y/f/-original-imagfykthgudy4qz.jpeg?q=70"
    };

    String[] titleArray = {"Best of Action Toys","Musical Keyboards","Top Selling Stationery","Microphones","String Instruments","Gym Essentials","Soft Toys","Electric Cycle"};
    String[] offerArray = {"Up to 70% Off","up to 70% off","From ₹49","Up to 70% off","Up to 70% Off","From ₹139","Upto 70% Off","Up to 40% Off"};
    String[] descArray = {"Figurines, Battle Toys & more","Beston, Redbox & more","Pens, Notebooks & more","Explore Now!","Guitars, Ukuleles & More","Shop Now","Stuffed Toys, Plush Toys & more","Nuze, Motovolt & more"};
    ArrayList<CustomList> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_second);

        listView = findViewById(R.id.custom_list_second);

        arrayList = new ArrayList<>();
        for(int i=0;i<imageArray.length;i++){
            CustomList list = new CustomList();
            list.setImage(imageArray[i]);
            list.setTitle(titleArray[i]);
            list.setOffer(offerArray[i]);
            list.setDesc(descArray[i]);
            arrayList.add(list);
        }
        CustomSecondAdapter adapter = new CustomSecondAdapter(CustomListSecondActivity.this,arrayList);
        listView.setAdapter(adapter);

        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(CustomListSecondActivity.this, CustomDetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("TITLE",arrayList.get(i).getTitle());
                bundle.putString("OFFER",arrayList.get(i).getOffer());
                bundle.putString("DESC",arrayList.get(i).getDesc());
                bundle.putString("IMAGE",arrayList.get(i).getImage());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });*/


    }
}