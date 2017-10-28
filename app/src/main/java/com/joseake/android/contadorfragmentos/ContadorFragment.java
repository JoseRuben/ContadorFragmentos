package com.joseake.android.contadorfragmentos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by CASA III on 28/10/2017.
 */

public class ContadorFragment extends Fragment {

    TextView mEtiquetaConteo;
    EditText mCampoConteo;
    Button mBotonContar, mBotonReiniciar;
    int conteo = 0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_contador, container, false);

        mEtiquetaConteo = (TextView) v.findViewById(R.id.EtiquetaConteo);
        mCampoConteo = (EditText) v.findViewById(R.id.campoConteo);
        mBotonContar = (Button) v.findViewById(R.id.botonContar);
        mBotonReiniciar = (Button) v.findViewById(R.id.botonReiniciar);

        mBotonContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conteo++;
                mCampoConteo.setText("" + conteo);
            }
        });

        mBotonReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conteo = 0;
                mCampoConteo.setText(""+conteo);
            }
        });
        return v;
    }
}
