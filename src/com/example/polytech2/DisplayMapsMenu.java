package com.example.polytech2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DisplayMapsMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_maps_menu);
		
		WebView wvSolbosch = new WebView(this);
		wvSolbosch=(WebView)findViewById(R.id.webViewPlanSolbosch);
		wvSolbosch.setWebViewClient(new WebViewClient());
		wvSolbosch.loadUrl("file:///android_asset/solbosch.html");
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_display_maps_menu, menu);
		return true;
	}

}
