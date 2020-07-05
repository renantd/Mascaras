package br.sofex.com.mascaras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.github.pinball83.maskededittext.MaskedEditText;

import java.lang.ref.WeakReference;

public class MainActivity extends AppCompatActivity {

    EditText edtiFixo,edtiCelular,edtiEmail,edtiCep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtiFixo = findViewById(R.id.edtiFixo);
        //edtiFixo.addTextChangedListener(Mask_Telefone_Fixo.insert("(##) ####-####", edtiFixo));

        edtiCelular = findViewById(R.id.edtiCelular);
        //edtiCelular.addTextChangedListener(Mask_Telefone_Celular.insert(edtiCelular));

       /* Mask_Telefone_Celular addLineNumberFormatter = new Mask_Telefone_Celular(new WeakReference(edtiCelular));
        edtiCelular.addTextChangedListener(addLineNumberFormatter);*/

    }
}
