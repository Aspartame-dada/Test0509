package com.example.test0509.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.test0509.Adapter.ThirdAdapter;
import com.example.test0509.Adapter.ThirdInfo;
import com.example.test0509.R;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ThirdFragment extends Fragment {
    private int[] imageId = {R.drawable.ic_myfriend, R.drawable.ic_shoucang, R.drawable.ic_shezhisvg};
    private String[] iconId = {"好友", "收藏", "设置"};
    private RecyclerView rvThird;
    private ArrayList<ThirdInfo> list;
    private ThirdAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        initView(view);
        initDta();
        return view;
    }


    private void initView(View view) {
        rvThird = view. findViewById(R.id.rv_third);
        list=new ArrayList<>();
        adapter=new ThirdAdapter(this.getContext(),list);
        rvThird.setAdapter(adapter);
        rvThird.setLayoutManager(new LinearLayoutManager(this.getContext()));

    }
    private void initDta(){
        for (int i=0;i<imageId.length;i++){
            list.add(new ThirdInfo(imageId[i],iconId[i]));

        }

    }
}