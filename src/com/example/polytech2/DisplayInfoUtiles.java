package com.example.polytech2;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DisplayInfoUtiles extends Activity implements View.OnClickListener {
	
	Button bWebmail, bMonULB, bBEP;
	ImageButton bUV;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_info_utiles);
		
		bWebmail = (Button) findViewById(R.id.bWebmail);
		bUV = (ImageButton) findViewById(R.id.bUV);
		bMonULB = (Button) findViewById(R.id.bMonULB);
		bBEP = (Button) findViewById(R.id.bBEP);
		
		bWebmail.setOnClickListener(this);
		bUV.setOnClickListener(this);
		bMonULB.setOnClickListener(this);
		bBEP.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_display_info_utiles, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()){
		case R.id.bWebmail:
			Intent browserCP = new Intent(Intent.ACTION_VIEW, Uri.parse("https://roundcube.ulb.ac.be/"));
			startActivity(browserCP);
		case R.id.bUV:
			Intent browserTD = new Intent(Intent.ACTION_VIEW, Uri.parse("http://webctapp.ulb.ac.be/webct/entryPageIns.dowebct"));
			startActivity(browserTD);
		case R.id.bMonULB:
			Intent browserACE = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mon-ulb.ulb.ac.be/cp/home/displaylogin"));
			startActivity(browserACE);
		case R.id.bBEP:
			Intent browserBEP = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bepolytech.be/"));
			startActivity(browserBEP);
		}
		
	}

}
