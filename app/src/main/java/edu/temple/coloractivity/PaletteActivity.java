package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class PaletteActivity extends AppCompatActivity {


    //Listing colors as Strings
    String[] Colors = new String[]{
            "Red" ,
            "Orange",
            "Yellow",
            "Green",
            "Lime" ,
            "Blue",
            "Purple",
            "Cyan",
            "Navy",
            "Grey",
    };


    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Palette Activity");

        //variable for items in spinner
        final int currentItem=0;


        final Spinner ColorSpinner = findViewById(R.id.coloredSpinner);
        final View selectedColor;
        selectedColor = this.getWindow().getDecorView();

        //Creating an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> ColorNames = ArrayAdapter.createFromResource(this,R.array.colorPalatte, android.R.layout.simple_spinner_item);

        //Specifying the layout for the choices
        ColorNames.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Apply the adapter to the spinner
        ColorSpinner.setAdapter( new ColorAdapter(this));



        ColorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            //Making an array of integers, the array refers to the colorPalatte array
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //Sets background color of selected name to white
                view.setBackgroundResource(R.color.White);

                //Once color name is clicked on, background color will change to color selected
                ArrayList<Integer> ColorNames;
                ColorNames = new ArrayList<Integer>();
                int[] getColors = getResources().getIntArray(R.array.colorPalatte);
                for (int i : getColors) {
                    ColorNames.add(i);

                }
                Object item = parent.getItemAtPosition(position);


                //each time a position is selected in the spinner, CanvasActivity will open
                if (position == 1) {
                    Intent thisI = new Intent(PaletteActivity.this, CanvasActivity.class);
                    thisI.putExtra("position", 1);
                    PaletteActivity.this.startActivity(thisI);

                } else if (position == 2) {
                    Intent thisI = new Intent(PaletteActivity.this, CanvasActivity.class);
                    thisI.putExtra("position", 2);
                    PaletteActivity.this.startActivity(thisI);

                } else if (position == 3) {
                    Intent thisI = new Intent(PaletteActivity.this, CanvasActivity.class);
                    thisI.putExtra("position", 3);
                    PaletteActivity.this.startActivity(thisI);

                } else if (position == 4) {
                    Intent thisI = new Intent(PaletteActivity.this, CanvasActivity.class);
                    thisI.putExtra("position", 4);
                    PaletteActivity.this.startActivity(thisI);

                } else if (position == 5) {
                    Intent thisI = new Intent(PaletteActivity.this, CanvasActivity.class);
                    thisI.putExtra("position", 5);
                    PaletteActivity.this.startActivity(thisI);

                } else if (position == 6) {
                    Intent thisI = new Intent(PaletteActivity.this, CanvasActivity.class);
                    thisI.putExtra("position", 6);
                    PaletteActivity.this.startActivity(thisI);

                } else if (position == 7) {
                    Intent thisI = new Intent(PaletteActivity.this, CanvasActivity.class);
                    thisI.putExtra("position", 7);
                    PaletteActivity.this.startActivity(thisI);

                } else if (position == 8) {
                    Intent thisI = new Intent(PaletteActivity.this, CanvasActivity.class);
                    thisI.putExtra("position", 8);
                    PaletteActivity.this.startActivity(thisI);

                } else if (position == 9) {
                    Intent thisI = new Intent(PaletteActivity.this, CanvasActivity.class);
                    thisI.putExtra("position", 9);
                    PaletteActivity.this.startActivity(thisI);

                } else if (position == 10) {
                    Intent thisI = new Intent(PaletteActivity.this, CanvasActivity.class);
                    thisI.putExtra("position", 10);
                    PaletteActivity.this.startActivity(thisI);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });

    }
}
