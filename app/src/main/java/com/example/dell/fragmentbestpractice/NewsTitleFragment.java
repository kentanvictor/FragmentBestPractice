package com.example.dell.fragmentbestpractice;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by DELL on 2017/3/31.
 */

public class NewsTitleFragment extends Fragment{
    private boolean isTwoPane;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.news_title_frag);
        return view;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        if(getActivity().findViewById(R.id.news_content_layout)!= null )
        {
            isTwoPane = true;//可以找的到news_content_layout布局的时候，为双页模式
        }
        else
        {
            isTwoPane = false;//找不到的时候，为单页模式
        }
    }
    class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder>
    {
        private List<News> mNewsList;
        class ViewHolder extends RecyclerView.ViewHolder
        {
            TextView newsTitleText;
            public ViewHolder (View view)
            {
                super(view);
                newsTitleText = (TextView)view.findViewById(R.id.news_title);
            }
        }
        public NewsAdapter (List<News> newsList)
        {
            mNewsList = newsList;
        }
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parebt,int viewType)
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item,parent,false);
        }
    }
}
