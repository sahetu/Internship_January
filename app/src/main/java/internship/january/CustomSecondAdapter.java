package internship.january;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Image Clicked : "+i, Toast.LENGTH_SHORT).show();
            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, CustomDetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("TITLE",arrayList.get(i).getTitle());
                bundle.putString("OFFER",arrayList.get(i).getOffer());
                bundle.putString("DESC",arrayList.get(i).getDesc());
                bundle.putString("IMAGE",arrayList.get(i).getImage());
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });

        return view;
    }
}
