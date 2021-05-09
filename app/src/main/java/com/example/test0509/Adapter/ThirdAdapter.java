package com.example.test0509.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.test0509.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * date：2021/5/9 on 11:42
 * author: 老鬼
 * e-mail: 3625988453@qq.com
 * description:
 */
public class ThirdAdapter extends RecyclerView.Adapter<ThirdAdapter.ViewHolder> {
    private final Context context;
    private final List<ThirdInfo> data;

    public ThirdAdapter(Context context, List<ThirdInfo> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.third_item_layout,
                parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ThirdInfo thirdInfo=data.get(position);
        holder.imageId.setImageResource(thirdInfo.getImageId());
        holder.iconID.setText(thirdInfo.getIconId());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageId;
        TextView iconID;
        LinearLayout layout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageId=itemView.findViewById(R.id.imageId);
            iconID=itemView.findViewById(R.id.iconId);
            layout=itemView.findViewById(R.id.third_layout);
        }
    }
}
