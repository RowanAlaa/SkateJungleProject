package com.example.skatejungleproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SkateboardAdapter extends RecyclerView.Adapter<SkateboardAdapter.Viewholder> {

    private Context context;
    private ArrayList<SkateboardModel> skateboardModelArrayList;

    // Constructor
    public SkateboardAdapter(Context context, ArrayList<SkateboardModel> skateboardModelArrayList) {
        this.context = context;
        this.skateboardModelArrayList = skateboardModelArrayList;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        SkateboardModel model = skateboardModelArrayList.get(position);
        holder.skateboardNameTV.setText(model.getSkateboard_name());
        holder.skateboardDescTV.setText(model.getSkateboard_desc());
        holder.skateboardPriceTV.setText("" + model.getSkateboard_price());
        holder.skateboardImageTV.setImageResource(model.getSkateboard_image());
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return skateboardModelArrayList.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView skateboardImageTV;
        private TextView skateboardNameTV, skateboardPriceTV, skateboardDescTV;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            skateboardImageTV = itemView.findViewById(R.id.idIVCourseImage);
            skateboardNameTV = itemView.findViewById(R.id.idTVCourseName);
            skateboardDescTV = itemView.findViewById(R.id.idTVSkateboard_desc);

            skateboardPriceTV = itemView.findViewById(R.id.idTVCourseRating);
        }
    }
}

