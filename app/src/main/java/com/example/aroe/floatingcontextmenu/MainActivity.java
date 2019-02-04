 package com.example.aroe.floatingcontextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
     //https://www.youtube.com/watch?v=IVDKyIOVrBU

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvHello  = findViewById(R.id.tvHello);

        registerForContextMenu(tvHello); //It's basically a pop-up menu that is displayed when you long-click certain UI elements
    }



     @Override
     public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) { //creating the context menu
         super.onCreateContextMenu(menu, v, menuInfo);

         getMenuInflater().inflate(R.menu.georgewashington, menu);
     }


     @Override
     public boolean onContextItemSelected(MenuItem item) {

         if (item.getItemId() == R.id.menuItem1){
             Toast.makeText(this, "Item 1 selected", Toast.LENGTH_SHORT).show();
         }

         if(item.getItemId() == R.id.menuItem2){
             Toast.makeText(this, "Item 2 selected", Toast.LENGTH_SHORT).show();
         }

         return super.onContextItemSelected(item);
     }
 }
