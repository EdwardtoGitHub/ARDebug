package com.example.edwardpc.myapplication;

import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    // GLSurfaceView是一个视图，继承至SurfaceView，它内嵌的surface专门负责OpenGL渲染。
    private GLSurfaceView glSurfaceView;
    // 这是渲染器(Render)的公共接口，它的任务就是调用OpenGL的API来作帧的渲染。
    private MyRenderer renderer;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 实例化MyRenderer,GLSurfaceView类
        renderer = new MyRenderer();
        glSurfaceView = new GLSurfaceView(this);
        // 设置渲染器
        glSurfaceView.setRenderer(renderer);
        // 为当前Activity类指定视图
        setContentView(glSurfaceView);
    }
}
