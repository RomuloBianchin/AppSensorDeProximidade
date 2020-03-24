# AppSensorDeProximidade ( Android Studio + Java )

<< Algoritmo >>

1. Criar um novo projeto Android no Android Studio.
2. Criar dois layouts, um com o mágico contendo o coelho na cartola e um sem o coelho.
3. A atividade deve implementar a escuta de sensores.
4. Implementação do sensor.
5. Tomada de decisão (escolha do layout) caso o sensor seja “disparado”.


<< Objetivo >>

Entender melhor o funcionamento da classe SensorManager, mais especificamente da função TYPE_PROXIMITY da classe Sensor e utilizar o método onSensorChanged para que o sistema responda a cada evento disparado no sensor de proximidade, realizando uma troca de imagem quando o sensor for disparado, fazendo com que o "Mágico faça o coelho sumir e reaparecer da cartola.


<< Observação>>

No emulador será impossível testar o sensor, assim como na maioria dos tablets, este sensor, também não se encontra disponível, e a melhor forma de testar essa aplicação, é utilizando um disposítivo físico ( celular ).

![Telas da Aplicação](https://github.com/RomuloBianchin/AppSensorDeProximidade/blob/master/TelasAppSensor.png)



