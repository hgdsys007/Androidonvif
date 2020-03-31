package com.swx.myapplication;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.czht.onnvif.server.OnvifServer;

import net.majorkernelpanic.streaming.SessionBuilder;
import net.majorkernelpanic.streaming.gl.SurfaceView;
import net.majorkernelpanic.streaming.rtsp.RtspServer;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class MainActivity extends AppCompatActivity {

    private SurfaceView surface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CAMERA},1);
        }
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.RECORD_AUDIO},1);
        }
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.INTERNET},1);
        }

        initView();

        new Thread(new Runnable() {
            @Override
            public void run() {

                OnvifServer onvifServer = new OnvifServer("192.168.10.175",8000,"rtsp://192.168.10.175:8086/av0_0");
                onvifServer.initServer();
            }
        }).start();


        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(this).edit();
        editor.putString(RtspServer.KEY_PORT,"8086");
        editor.commit();
        SessionBuilder.getInstance()
                .setAudioEncoder(SessionBuilder.AUDIO_AMRNB)
                .setVideoEncoder(SessionBuilder.VIDEO_H264)
                .setContext(getApplicationContext())
                .setPreviewOrientation(270)
                .setSurfaceView(surface);
        startService(new Intent(this,RtspServer.class));

//        new Thread(() -> {
//            try {
//                DatagramSocket datagramSocket = new DatagramSocket();
//                byte[] buf = new byte[1024];
//                int len = 0;
//                DatagramPacket packet = new DatagramPacket(buf, len);
//                while (true){
//                    datagramSocket.receive(packet);
//                    if ((len = packet.getLength()) > 0){
//                        String str = new String(packet.getData(), 0, len);
//                        InetAddress address = packet.getAddress();
//                        Log.i("aaa","来自主机："+address+"的消息："+str);
//                    }
//                }
//            } catch (SocketException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }).start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    StartServer startServer = new StartServer();
//                    startServer.start();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();

    }

    private void initView() {
        surface = (SurfaceView) findViewById(R.id.surface);
    }
}
