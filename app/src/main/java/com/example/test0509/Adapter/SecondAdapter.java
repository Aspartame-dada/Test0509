package com.example.test0509.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.test0509.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * date：2021/5/9 on 12:27
 * author: 老鬼
 * e-mail: 3625988453@qq.com
 * description:
 */
public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.ViewHolder> {
    private final Context context;
    private  final List<SecondInfo> data;

    public SecondAdapter(Context context, List<SecondInfo> data) {
        this.context = context;
        this.data = data;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.second_item_layout2,
                parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SecondInfo secondInfo=data.get(position);
        holder.textView.setText(secondInfo.getTv());



    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        LinearLayout layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.tv_second);
            layout=itemView.findViewById(R.id.second_layout);
        }
    }
}
