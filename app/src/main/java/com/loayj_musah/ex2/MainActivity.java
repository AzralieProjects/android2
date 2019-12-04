  package com.loayj_musah.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

  public class MainActivity extends AppCompatActivity implements SensorEventListener {
      private SensorManager sensorManager;

      private Sensor Orientation;
      private GameView gameView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Hide the Activity Action Bar
        getSupportActionBar().hide();

        // set SCREEN ORIENTATION
        // ===================================================
        // set Activity(screen) Orientation to LANDSCAPE
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        Orientation = sensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION);

        if(Orientation==null){

            Toast.makeText(this, "Orientation sensor not found", Toast.LENGTH_SHORT).show();
            finish();
        }

        gameView = findViewById(R.id.GameViewId);
    }
      @Override
      protected void onResume() {
          super.onResume();
          sensorManager.registerListener(this, Orientation, SensorManager.SENSOR_DELAY_NORMAL);
      }

      @Override
      protected void onPause() {
          super.onPause();
          sensorManager.unregisterListener(this);
      }

      @Override
      public void onSensorChanged(SensorEvent event) {
        float azimuth=event.values[1];
          gameView.setPitchRotation(azimuth);

      }

      @Override
      public void onAccuracyChanged(Sensor sensor, int accuracy) {

      }
  }

