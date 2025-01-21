package internship.january;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CustomSecondAdapter extends BaseAdapter {

    Context context;
    ArrayList<CustomList> arrayList;

    public CustomSecondAdapter(Context context, ArrayList<CustomList> arrayList) {
        this.context =  context;
        this.arrayList = arrayList;
    }


    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.custom_second,null);

        ImageView imageView = view.findViewById(R.id.custom_second_image);
        TextView title =  view.findViewById(R.id.custom_second_title);
        TextView offer = view.findViewById(R.id.custom_second_offer);
        TextView desc = view.findViewById(R.id.custom_second_desc);

        title.setText(arrayList.get(i).getTitle());
        desc.setText(arrayList.get(i).getDesc());
        offer.setText(arrayList.get(i).getOffer());

        Glide.with(context).load(arrayList.get(i).getImage()).placeholder(R.mipmap.ic_launcher).into(imageView);

        return view;
    }
}
