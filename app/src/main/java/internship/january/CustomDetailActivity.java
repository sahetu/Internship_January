package internship.january;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class CustomDetailActivity extends AppCompatActivity {

    ImageView imageView;
    TextView title,desc,offer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_detail);

        imageView = findViewById(R.id.custom_detail_image);
        title = findViewById(R.id.custom_detail_title);
        desc = findViewById(R.id.custom_detail_desc);
        offer = findViewById(R.id.custom_detail_offer);

        Bundle bundle = getIntent().getExtras();
        title.setText(bundle.getString("TITLE"));
        desc.setText(bundle.getString("DESC"));
        offer.setText(bundle.getString("OFFER"));

        Glide.with(CustomDetailActivity.this).load(bundle.getString("IMAGE")).placeholder(R.mipmap.ic_launcher).into(imageView);
    }
}