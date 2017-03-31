package com.example.dell.fragmentbestpractice;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
}
