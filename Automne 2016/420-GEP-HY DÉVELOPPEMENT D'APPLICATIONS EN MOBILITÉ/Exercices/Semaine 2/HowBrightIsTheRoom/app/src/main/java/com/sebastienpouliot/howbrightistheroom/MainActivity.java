package com.sebastienpouliot.howbrightistheroom;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SensorEventListener{
    private SensorManager aSensorManager;
    private Sensor lightSensor;
    private float maxLight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSensorManager = (SensorManager) this.getSystemService(Context.SENSOR_SERVICE);
        lightSensor = aSensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        aSensorManager.registerListener(this, lightSensor, SensorManager.SENSOR_DELAY_NORMAL);
        maxLight = lightSensor.getMaximumRange();
    }

    protected void onPause(){
        super.onPause();
        aSensorManager.unregisterListener(this, lightSensor);
    }

    protected void onResume(){
        super.onResume();
        aSensorManager.registerListener(this, lightSensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    protected void onDestroy(){
        super.onDestroy();
        aSensorManager.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        float currentLight = sensorEvent.values[0];

        Toast.makeText(this, String.valueOf(currentLight), Toast.LENGTH_SHORT).show();
        TextView tValeur = (TextView) this.findViewById(R.id.tBrightness);
        if (currentLight < 1)
            tValeur.setText("Dark as night\n");
        else
            tValeur.setText(String.valueOf(currentLight) + "\n");
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
