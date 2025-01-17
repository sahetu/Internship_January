package internship.january;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class CustomListAdapter extends BaseAdapter {

    Context context;
    String[] titleArray;
    String[] priceArray;
    String[] descArray;
    String[] imageArray;

    public CustomListAdapter(
            Context context,
            String[] titleArray,
            String[] priceArray,
            String[] descArray,
            String[] imageArray
    ) {
        this.context = context;
        this.titleArray = titleArray;
        this.priceArray = priceArray;
        this.descArray = descArray;
        this.imageArray = imageArray;
    }

    @Override
    public int getCount() {
        return titleArray.length;
    }

    @Override
    public Object getItem(int i) {
        return titleArray[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.custom_list,null);
        TextView title = view.findViewById(R.id.custom_list_title);
        TextView price = view.findViewById(R.id.custom_list_price);
        TextView desc = view.findViewById(R.id.custom_list_desc);
        ImageView imageView = view.findViewById(R.id.custom_list_image);

        title.setText(titleArray[i]);
        price.setText(priceArray[i]);
        desc.setText(descArray[i]);

        Glide.with(context).load(imageArray[i]).placeholder(R.mipmap.ic_launcher).into(imageView);

        return view;
    }
}
