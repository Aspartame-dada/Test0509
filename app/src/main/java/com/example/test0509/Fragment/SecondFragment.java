package com.example.test0509.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.test0509.Adapter.SecondAdapter;
import com.example.test0509.Adapter.SecondInfo;
import com.example.test0509.R;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class SecondFragment extends Fragment {


    private RecyclerView tvSecond;
    private ArrayList<SecondInfo> mlist;
    private SecondAdapter adapter;
    private String[] text= {"生活本身就是一本最好的剧本。",
            "我们曾以为这个世界只有黑白，不曾想雨后的天空会有更多的色彩。",
            "愿你保持初心和善良，笑里尽是温暖与坦荡。",
            "当我们踮起脚尖，就会更靠近黎明。",
            "彼此善良一些，彼此的生活就好过一些。",
             "这世界有时候其实也没你想象的那么差。",
            "所有的感动其实都来源于真正的生活。",
            "你说你喜欢雨，但是你在下雨的时候打伞。",
            "你说你喜欢太阳，但你在阳光明媚的时候躲在阴凉的地方。",
             "你说你喜欢风，但是在刮风的时候你却关上了窗户。",
            "温暖在人间。",
            "余生好长，你好难忘。",
            "我从未拥有过你一秒钟，心里却失去过你千万次。",
            "你还记得她吗？”“早忘了，哈哈”“我还没说是谁。",
            "你别皱眉，我走就好。",
            "祝你们幸福是假的，祝你的幸福是真的。",
            "我想做一个能在你的葬礼上描述你一生的人。",
            "谢谢你陪我校服到礼服。",
            "你说少年明媚如昨，怎知年少时光如梦。",
           "我不喜欢这世界，我只喜欢你。"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        initView(view);
        initData();
        return view;
    }

    private void initView(View view) {
        tvSecond = (RecyclerView) view.findViewById(R.id.tv_second);
        mlist = new ArrayList<>();
        adapter=new SecondAdapter(this.getContext(),mlist);
        tvSecond.setAdapter(adapter);


        StaggeredGridLayoutManager staggeredGridLayoutManager =
                new StaggeredGridLayoutManager(2,
                        StaggeredGridLayoutManager.VERTICAL);
        tvSecond.setLayoutManager(staggeredGridLayoutManager);

    }
    private void initData(){
        for(int i=0;i<text.length;i++){
            mlist.add(new SecondInfo(text[i]));
        }


    }
}