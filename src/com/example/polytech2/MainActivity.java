package com.example.polytech2;

import android.os.Bundle;
import android.content.Intent;
//import android.view.MenuInflater;
//import android.view.MenuItem;
import android.view.View;
import android.app.Activity;
//import android.view.Menu;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

	Button bNews, bHoraire,bPlan, bCours,bFolklore,bInfo;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			initializeVars();

		}
	 
		private void initializeVars() {
			// TODO Auto-generated method stub
			
			bNews = (Button) findViewById(R.id.bNews);
			bHoraire = (Button) findViewById(R.id.bHoraire);
			bPlan = (Button) findViewById(R.id.bPlan);
			bCours = (Button) findViewById(R.id.bCours);
			bFolklore = (Button) findViewById(R.id.bFolklore);
			bInfo = (Button) findViewById(R.id.bInfo);

			bNews.setOnClickListener(this);
			bHoraire.setOnClickListener(this);
			bPlan.setOnClickListener(this);
			bCours.setOnClickListener(this);
			bFolklore.setOnClickListener(this);
			bInfo.setOnClickListener(this);
			
		}
			
	 
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()){
			case R.id.bNews:
				Intent a = new Intent (this, DisplayNewsMenu.class);
				startActivity(a);
				break;
			case R.id.bHoraire:
				Intent b = new Intent (this, DisplayHoraireMenu.class);
				startActivity(b);
				break;
			case R.id.bPlan:
				Intent c = new Intent (this, DisplayMapsMenu.class);
				startActivity(c);
			case R.id.bCours:
				Intent d = new Intent (this, DisplayMesCoursMenu.class);
				startActivity(d);
				break;
			case R.id.bFolklore:
				Intent e = new Intent (this, DisplayFolkloreMenu.class);
				startActivity(e);
				break;
			case R.id.bInfo:
				Intent f = new Intent (this, DisplayInfoUtiles.class);
				startActivity(f);
				break;
			}
		}
		/*
		@Override
		public boolean onCreateOptionsMenu(android.view.Menu menu) {
			// TODO Auto-generated method stub
			super.onCreateOptionsMenu(menu);
			MenuInflater menuUp= getMenuInflater();
			//menuUp.inflate(R.menu.inflate_menu, menu);
			return true;
		}
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			// TODO Auto-generated method stub
			switch (item.getItemId()){
			case R.id.informations:
				Intent i =new Intent("com.ulbpolytech.android.INFORMATIONS");
				startActivity(i);
				break;
			case R.id.preferences:
				Intent j =new Intent("com.ulbpolytech.android.PREFS");
				startActivity(j);
				break;
			case R.id.exit:
				finish();
				break;
			}
			return false;// we took off the return coming when we imported the
	class and change it
		}*/
}


