package com.example.nick.rss.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.nick.rss.R;

public class MultiListFragment extends android.support.v4.app.ListFragment {

    @NonNull
    public static MultiListFragment newInstance(){
        return new MultiListFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.list_fragment,null);
    }

    public void onActivityCreated(Bundle SavedInstanceState){
        super.onActivityCreated(SavedInstanceState);
        String[] data = new String[]{"sd","sddf"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1,data);
        setListAdapter(adapter);

    }
}
