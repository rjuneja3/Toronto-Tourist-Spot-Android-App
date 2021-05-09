package com.rohan.rohanjuneja_jaikunwarsidhu_comp304lab5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ItemViewHolder> {
    private LayoutInflater layoutInflater;
    private List<LandmarkType> landmarks;
    onClickInterface onCInterface;
    ViewAdapter(Context context, List<LandmarkType> landmarks, onClickInterface onCInterface){
        this.landmarks = landmarks;
        this.layoutInflater = LayoutInflater.from(context);
        this.onCInterface = onCInterface;
    }
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout, parent, false);
            ItemViewHolder itemViewHolder = new ItemViewHolder(v);
            return  itemViewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.landmarkTypeButton.setText(landmarks.get(position).getName());
        holder.landmarkTypeButton.setOnClickListener(v -> {
            onCInterface.setClick(position);
        });
    }
    @Override
    public int getItemCount() {
        return landmarks.size();
    }
    public static class ItemViewHolder extends RecyclerView.ViewHolder{
        private Button landmarkTypeButton;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            landmarkTypeButton = itemView.findViewById(R.id.landmarkTypeButton);
        }
    }


}
