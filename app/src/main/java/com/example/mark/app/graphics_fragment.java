package com.example.mark.app;

import android.app.Activity;
import android.app.Fragment;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;


/**
 * Created by mark on 12/9/2016.
 */

public class graphics_fragment extends Fragment {


    MyGLRenderer renderer;
    public graphics_fragment()
    {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        GLSurfaceView glSurfaceView = new GLSurfaceView(getActivity());
        renderer = new MyGLRenderer();
        glSurfaceView.setEGLContextClientVersion(2);
        glSurfaceView.setRenderer(renderer);

        return glSurfaceView;

    }

    public void setNeedleAngle(float angle) {
        renderer.setAngle(angle);
    }
}