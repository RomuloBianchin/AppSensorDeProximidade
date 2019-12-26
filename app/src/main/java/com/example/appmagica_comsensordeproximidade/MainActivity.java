package com.example.appmagica_comsensordeproximidade;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;

// Para que seja possível interagir com os sensores, precisamos implementar a classe SensorEventListener conforme abaixo.
// E por obrigatoriedade, teremos que implementar os métodos onSensorChanged e onSensorAccuracy.
public class MainActivity extends AppCompatActivity implements SensorEventListener {

    // Objeto do tipo SensorManager.
    private SensorManager mSensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instanciando a variável do tipo SensorManager para que seja possível ter acessos aos sensores.
        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);


    }

    //No método onSensorChanged(), será invocado sempre que ocorrer uma altera-ção no sensor escolhido,
    // resumindo, sempre que houver um disparo do mesmo.
    @Override
    public void onSensorChanged(SensorEvent event) {
        if(event.values[0] == 0){
            // Caso seja disparado o sensor, irá alterar o layout.
            setContentView(R.layout.layout_sem_coelho);
        }
        else {
            // Caso não ocorra o disparo ou pare de receber a ação de desparo, o
            // layout principal retorna.
            setContentView(R.layout.activity_main);
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    //No método onResume() teremos de ligar a “escuta” ao sensor.
    // passando o objeto listener, e indicando qual o sensor e a velocidade de atualização do mesmo.
    @Override
    protected void onResume() {
        super.onResume();
        mSensorManager.registerListener(this,mSensorManager.getDefaultSensor(
                Sensor.TYPE_PROXIMITY), // Indicamos que o sensor será o de proximidade.
                SensorManager.SENSOR_DELAY_NORMAL); // Informamos que a velocidade de atualização será a normal.
    }

    // Para não usarmos recursos desnecessários quando a aplicação não estiver ativa,
    // devemos desligar a “escuta” do sensor no método onStop(), poupando assim recursos e
    //bateria do dispositivo.
    @Override
    protected void onStop() {
        mSensorManager.unregisterListener(this,mSensorManager.getDefaultSensor(
                Sensor.TYPE_PROXIMITY));
        super.onStop();
    }
}
