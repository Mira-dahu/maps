package com.example.mapmanagementpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mapmanagementpage.observerelated.Pos2D;


public class Mark_new_observation_points extends AppCompatActivity {
    private static final float min_pos=0;
    private static final float max_pos=8;
    private Pos2D tap_position;
    private Pos2D moved_position;
    private Pos2D saved_point_position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mark_new_observation_points);
        View the_view=findViewById(R.id.mark_obz_background);
        tap_position=new Pos2D();
        moved_position=new Pos2D();
        saved_point_position=new Pos2D();
        the_view.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view,MotionEvent event) {
                return Mark_new_observation_points.this.onTouch(view,event,tap_position,moved_position);
            }
        });
    }
    private static Pos2D normalize_pos(Pos2D pos){
        pos.x=pos.x>max_pos?max_pos:pos.x;
        pos.y=pos.y>max_pos?max_pos:pos.y;
        pos.x=pos.x<min_pos?min_pos:pos.x;
        pos.y=pos.y<min_pos?min_pos:pos.y;
        return pos;
    }
    private boolean onTouch(View v, MotionEvent event,Pos2D tap_position,Pos2D moved_position) {
        if(event.getAction() == MotionEvent.ACTION_DOWN) {
            tap_position.x = event.getX()/100;
            tap_position.y = event.getY()/100;
            moved_position.x = event.getX()/100;
            moved_position.y = event.getY()/100;
            return true;
        } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
            TextView x_tag=findViewById(R.id.x_obzv_val);
            TextView y_tag=findViewById(R.id.y_obzv_val);
            ImageView cross_hair=findViewById(R.id.cross_hair);
            saved_point_position.x+= (event.getX()/100-moved_position.x);
            saved_point_position.y+= (event.getY()/100-moved_position.y);
            saved_point_position=normalize_pos(saved_point_position);
            moved_position.x = event.getX()/100;
            moved_position.y = event.getY()/100;
            x_tag.setText(String.format("%.2f",saved_point_position.x));
            y_tag.setText(String.format("%.2f",saved_point_position.y));
            cross_hair.setTranslationX(saved_point_position.x*100);
            cross_hair.setTranslationY(saved_point_position.y*100);
        }
        return super.onTouchEvent(event);
    }

    public void destroyTheActivity(View view){
        this.finish();
    }
}