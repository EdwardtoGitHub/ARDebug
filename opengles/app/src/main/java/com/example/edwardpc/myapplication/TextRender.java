package com.example.edwardpc.myapplication;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import com.vuforia.Renderer;
import com.vuforia.State;

import javax.microedition.khronos.opengles.GL;

/**
 * Created by EdwardPC on 2016/7/28.
 */
public class TextRender implements GLSurfaceView.Renderer{
    private Renderer text;
    public void onDrawFrame(GL10 gl){
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT | GLES20.GL_DEPTH_BUFFER_BIT);

        State state = text.begin();
        text.drawVideoBackground();
    }

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {

    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {

    }
}
