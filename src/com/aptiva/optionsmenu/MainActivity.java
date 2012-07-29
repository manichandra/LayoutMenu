package com.aptiva.optionsmenu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
 
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	// TODO Auto-generated method stub
    	if(item.getItemId()==R.id.menu_settings){
    		Intent intent1= new Intent(android.provider.MediaStore.INTENT_ACTION_MUSIC_PLAYER);
    		startActivity(intent1);
    		//System.out.println("settings1");
    	}
    		else if (item.getItemId()==R.id.menu_settings1){
    			Intent intent2= new Intent(android.provider.MediaStore.ACTION_VIDEO_CAPTURE);
        		startActivity(intent2);
    			//System.out.println("settings2");
    		}
    			else if(item.getItemId()==R.id.AdvancedSettings){
    				Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND); 
    				emailIntent.setType("plain/text");  
            		startActivity(emailIntent);

    				//System.out.println("advanced settings");
    			}
    		
    	
    	return super.onOptionsItemSelected(item);
    }

    
}
