package com.example.nick.rss.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.nick.rss.R;

import java.security.acl.LastOwnerException;

public class MultiListFragment extends android.support.v4.app.ListFragment  {
    public View view;

    @NonNull
    public static MultiListFragment newInstance(){
        return new MultiListFragment();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

         view =   inflater.inflate(R.layout.list_fragment,null);



        return view;
    }

    public void onActivityCreated(Bundle SavedInstanceState){
        super.onActivityCreated(SavedInstanceState);
        String[] data = new String[]{"sd","sddf"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_activated_1,data);
        setListAdapter(adapter);
        getListView().setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);
        getListView().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view,
                                           int position, long id) {
                ((ListView) parent).setItemChecked(position,
                        ((ListView) parent).isItemChecked(position));
                return false;
            }
        });
        getListView().setMultiChoiceModeListener(new AbsListView.MultiChoiceModeListener() {

            private int nr = 0;


            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                mode.getMenuInflater().inflate(R.menu.menu_action,
                        menu);
                return true;
            }


            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                return false;
            }


            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item1:
                        Toast.makeText(getActivity(), "Option1 clicked",
                                Toast.LENGTH_SHORT).show();
                        break;


                }
                return false;
            }


            public void onDestroyActionMode(ActionMode mode) {
                nr = 0;
            }


            public void onItemCheckedStateChanged(ActionMode mode,
                                                  int position, long id, boolean checked) {

                //mode.setTitle(nr + " rows selected!");
            }
        });




    }



}
