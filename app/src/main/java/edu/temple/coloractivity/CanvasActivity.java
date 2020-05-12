package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);
        final View selectedColor;
        selectedColor = this.getWindow().getDecorView();

        TextView colorText;
        colorText = findViewById(R.id.colorText);

        //sets the title of activity
        getSupportActionBar().setTitle("Canvas Activity");


        //position is getting each item in the array in the spinner
        //set.Text displays the color name once a color is clicked on in the spinner
        if(position==1){
            selectedColor.setBackgroundResource(R.color.Red);
            colorText.setText("Red");

        }else if(position==2){
            selectedColor.setBackgroundResource(R.color.Orange);
            colorText.setText("Orange");

        }else if(position==3){
            selectedColor.setBackgroundResource(R.color.Yellow);
            colorText.setText("Yellow");

        }else if(position==4){
            selectedColor.setBackgroundResource(R.color.Green);
            colorText.setText("Green");

        }else if(position==5){
            selectedColor.setBackgroundResource(R.color.Lime);
            colorText.setText("Lime");

        }else if(position==6){
            selectedColor.setBackgroundResource(R.color.Blue);
            colorText.setText("Blue");

        }else if(position==7){
            selectedColor.setBackgroundResource(R.color.Purple);
            colorText.setText("Purple");

        }else if(position==8){
            selectedColor.setBackgroundResource(R.color.Cyan);
            colorText.setText("Cyan");

        }else if(position==9){
            selectedColor.setBackgroundResource(R.color.Navy);
            colorText.setText("Navy");

        }else if(position==10){
            selectedColor.setBackgroundResource(R.color.Grey);
            colorText.setText("Grey");
        }

    }

}
