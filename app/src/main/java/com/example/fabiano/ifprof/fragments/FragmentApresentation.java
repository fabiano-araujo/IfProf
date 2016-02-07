package com.example.fabiano.ifprof.fragments;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.fabiano.ifprof.MenuMain;
import com.example.fabiano.ifprof.R;

public class FragmentApresentation extends Fragment {
    int layout;
    @SuppressLint("ValidFragment")
    public FragmentApresentation(int layout){
        this.layout = layout;
    }
    public FragmentApresentation(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (savedInstanceState != null){
            layout = savedInstanceState.getInt("layout");
        }
        View view = inflater.inflate(layout, container, false);
        return view;
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt("layout",layout);
        super.onSaveInstanceState(outState);
    }
}
