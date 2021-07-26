package com.imsjkumar.fragmentintro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DemoFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater, @Nullable ViewGroup container, @Nullable  Bundle savedInstanceState) {
        View view = inflater.from(getContext()).inflate(R.layout.fragmentlayout,container,false);
        ArrayAdapter adapter = new ArrayAdapter(getContext(),
                android.R.layout.simple_list_item_single_choice,
                getResources().getStringArray(R.array.android_version));
        ListView listView = view.findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        return view;

    }
}
