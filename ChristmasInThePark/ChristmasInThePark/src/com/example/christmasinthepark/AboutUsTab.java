package com.example.christmasinthepark;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AboutUsTab extends Fragment {
	  public View onCreateView(LayoutInflater inflater, ViewGroup container, 
	                           Bundle savedInstanceState){
		View view = inflater.inflate(R.layout.about, container, false);
		//TextView textview = (TextView) view.findViewById(R.id.tabtextview);
		//textview.setText(R.string.AboutUs);
		return view;
	  }
	}