package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  // TODO: Steps 4 & 8 - Declare member variables here:
  TextView txt_story;
  Button btn_top;
  Button btn_bottom;
  int fStoryIndex = 1;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


    // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
    txt_story = (TextView) findViewById(R.id.txt_story);
    btn_top = (Button) findViewById(R.id.btn_top);
    btn_bottom = (Button) findViewById(R.id.btn_bottom);


    // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
    btn_top.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if (fStoryIndex == 1) {
          txt_story.setText(R.string.T3_Story);
          btn_top.setText(R.string.T3_Ans1);
          btn_bottom.setText(R.string.T3_Ans2);
          fStoryIndex = 3;
        } else if(fStoryIndex == 3) {
          txt_story.setText(R.string.T6_End);
          btn_top.setVisibility(View.GONE);
          btn_bottom.setVisibility(View.GONE);
          fStoryIndex = 6;
        } else if (fStoryIndex == 2) {
          txt_story.setText(R.string.T3_Story);
          btn_top.setText(R.string.T3_Ans1);
          btn_bottom.setText(R.string.T3_Ans2);
          fStoryIndex = 3;
        }
      }
    });


    // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
    btn_bottom.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if (fStoryIndex == 1) {
          txt_story.setText(R.string.T2_Story);
          btn_top.setText(R.string.T2_Ans1);
          btn_bottom.setText(R.string.T2_Ans2);
          fStoryIndex = 2;
        } else if(fStoryIndex == 2) {
          txt_story.setText(R.string.T4_End);
          btn_top.setVisibility(View.GONE);
          btn_bottom.setVisibility(View.GONE);
          fStoryIndex = 4;
        } else if (fStoryIndex == 3) {
          txt_story.setText(R.string.T5_End);
          btn_top.setVisibility(View.GONE);
          btn_bottom.setVisibility(View.GONE);
          fStoryIndex = 5;
        }
      }
    });

  }
}
