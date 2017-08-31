package com.example.donadonydonaji.listaalumnos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private String[] Nombres={
            "ABREGO DELGADO ALEXIA ARIANA",
            "CARO LOPEZ LUIS RICARDO",
            "CARVAJAL GUTIERREZ RAUL RAFAEL",
            "CASILLAS UREÑA FERMIN MICHET",
            "CRESPO DURAN PABLO ARTURO",
            "ESPINO SERRANO CESAR RAMSES",
            "ESPINOZA ORONIA CARLOS EDUARDO",
            "FREGOSO CORONA JESÚS EDUARDO",
            "GALAVIZ ARROYO OLIVER JASIEL",
            "GALINDO DELGADO DONADONY DONAJI",
            "GONZALEZ CASTELLANOS EDGAR FABRIZIO",
            "HERNANDEZ SANDOVAL ABRIL YARELI",
            "JIMENEZ ORTIZ JUAN DANIEL",
            "LIZOLA CHAVARÍN LUIS FERNANDO",
            "MEDRANO BARAJAS JUAN DANIEL",
            "RAMIREZ GARCIA JUAN RAMON",
            "RODRIGUEZ ADAME OLIVER GIOVANNY",
            "SANCHEZ JIMENEZ ANA PATRICIA",
            "SÁNCHEZ PARTIDA HÉCTOR OMAR",
            "VALDEZ CORREA CARLOS GERMAN",
            "CARRILLO GONZÁLEZ CARLOS ARTURO",
            "HERNANDEZ BAEZA JAVIER",
            "IBARRA MARAVILLAS JONATHAN GUADALUPE",
            "MARIN BAUTISTA IRVING ALDAHYR",
            "OCAMPO AGUILAR JESÚS ANDRÉS",
            "SALAZAR NAVARRO IRAN JAIR",
            "TEJEDA MORA CESAR"
    };
    private Integer[] Foto={
        R.drawable.f2,
            R.drawable.f2,
            R.drawable.f2,
            R.drawable.f2,
            R.drawable.f2,
            R.drawable.f2,
            R.drawable.f2,
            R.drawable.f2,
            R.drawable.f2,
            R.drawable.f2,R.drawable.f2,
            R.drawable.f2,
            R.drawable.f2,R.drawable.f2,R.drawable.f2,R.drawable.f2,R.drawable.f2,R.drawable.f2,R.drawable.f2,R.drawable.f2,R.drawable.f2,R.drawable.f2,R.drawable.f2,R.drawable.f2,R.drawable.f2,R.drawable.f2,R.drawable.f2,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Adaptador adapter=new Adaptador(this,Nombres,Foto);
        ListView lista=(ListView)findViewById(R.id.Lista);
        lista.setAdapter(adapter);
    }
}
