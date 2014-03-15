package com.example.christmasinthepark;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MyTabListener implements ActionBar.TabListener {
	Fragment fragment;
	
	public MyTabListener(Fragment fragment) {
		this.fragment = fragment;
	}
	
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
    	Toast.makeText(MainActivity.gloabeContext, "This is from TabListener!!!!", Toast.LENGTH_LONG).show();
		
    	ft.replace(R.id.fragment_container, fragment);
		
	}
	
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		ft.remove(fragment);
	}
	
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// nothing done here
	}
}