package internship.january;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.MyHolder> {

    Context context;
    String[] titleArray;
    String[] priceArray;
    String[] descArray;
    String[] imageArray;

    public CustomRecyclerAdapter(Context context, String[] titleArray, String[] priceArray, String[] descArray, String[] imageArray) {
        this.context = context;
        this.titleArray = titleArray;
        this.priceArray = priceArray;
        this.descArray = descArray;
        this.imageArray = imageArray;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_recycler,parent,false);
        return new MyHolder(view);
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView title,desc,offer;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.custom_recycler_image);
            title = itemView.findViewById(R.id.custom_recycler_title);
            desc = itemView.findViewById(R.id.custom_recycler_desc);
            offer = itemView.findViewById(R.id.custom_recycler_price);

        }
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.title.setText(titleArray[position]);
        holder.desc.setText(descArray[position]);
        holder.offer.setText(priceArray[position]);

        Glide.with(context).load(imageArray[position]).placeholder(R.mipmap.ic_launcher).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return titleArray.length;
    }
}
