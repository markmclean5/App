package com.example.mark.app;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.FragmentContainer;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.SeekBar;


public class MainActivity extends AppCompatActivity {

    private GLSurfaceView glView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Create a GLSurfaceView instance and set it
        // as the ContentView for this Activity.
        glView = new TexampleSurfaceView( this );
        setContentView( glView );

       /* Button resetbutton = (Button)findViewById(R.id.button1);
        resetbutton.setOnClickListener(resetbuttonListener);

        SeekBar rotateseek = (SeekBar)findViewById(R.id.seekBar);
        rotateseek.setOnSeekBarChangeListener(rotateSeekListener);*/


       /* FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        graphics_fragment fragment = new graphics_fragment();
        fragmentTransaction.add(R.id.fragment_container, fragment);
        fragmentTransaction.commit();*/
    }
    /*
    private OnClickListener resetbuttonListener = new OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked
            graphics_fragment frag = (graphics_fragment) getFragmentManager().findFragmentById(R.id.fragment_container);
            frag.setNeedleAngle(90);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            graphics_fragment fragment = new graphics_fragment();
            fragmentTransaction.add(R.id.fragment_container2, fragment);
            fragmentTransaction.commit();
        }
    };


    private SeekBar.OnSeekBarChangeListener rotateSeekListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            graphics_fragment frag = (graphics_fragment) getFragmentManager().findFragmentById(R.id.fragment_container);
            float angle = i * (360/100);
            frag.setNeedleAngle(angle);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };*/
}
class TexampleSurfaceView extends GLSurfaceView {

    public TexampleSurfaceView(Context context){
        super( context );

        // Set to use OpenGL ES 2.0
        setEGLContextClientVersion(2);

        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer( new Texample2Renderer( context ) );
    }
}
