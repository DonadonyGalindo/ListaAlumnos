package com.example.donadonydonaji.listaalumnos;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by donadonydonaji on 31/08/2017.
 */

public class Adaptador extends ArrayAdapter<String> {


        private final Activity context;
        private final String[] itemname;
        private final Integer[] integers;

    public Adaptador(Activity context, String[] itemname, Integer[] integers) {
            super(context, R.layout.fila_lista, itemname);
            // TODO Auto-generated constructor stub

            this.context=context;
            this.itemname=itemname;
            this.integers=integers;
        }

    public View getView(int posicion, View view, ViewGroup parent){


        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.fila_lista,null,true);

        TextView txtNombre = (TextView) rowView.findViewById(R.id.Nombre);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.foto);
        TextView txtControl = (TextView) rowView.findViewById(R.id.NoCont);
        TextView txtCarrera = (TextView) rowView.findViewById(R.id.Carrera);
        String[] Control={"13400378",
                "13400395",
                "13400396",
                "12400256",
                "13400397",
                "13400402",
                "12401119",
                "13400405",
                "13400406",
                "13400408",
                "13400419",
                "13400430",
                "13400436",
                "13400441",
                "13400457",
                "13400478",
                "13400507",
                "13400491",
                "12400322",
                "12400326",
                "13401087",
                "13401367",
                "13401097",
                "12400663",
                "13401100",
                "11400309",
                "13401105"};

        String[] Carrera={
                "ISC",
                "ISC",
                "ISC",
                "ISC",
                "ISC",
                "ISC",
                "ISC",
                "ISC",
                "ISC",
                "ISC",
                "ISC",
                "ISC",
                "ISC",
                "ISC",
                "ISC",
                "ISC",
                "ISC",
                "ISC",
                "ISC",
                "ISC",
                "ITIC",
                "ITIC",
                "ITIC",
                "ITIC",
                "ITIC",
                "ITIC",
                "ITIC"
        };

        txtNombre.setText(itemname[posicion]);
        txtControl.setText(Control[posicion]);
        txtCarrera.setText(Carrera[posicion]);
        imageView.setImageResource(integers[posicion]);

        return rowView;
    }


}

