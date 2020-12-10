package com.example.ifood_clone.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import com.example.ifood_clone.R;

public class authActivity extends AppCompatActivity {

    //variáveis:    editMail editSenha editSwitchAcesso  editCadastro  editButtonAcesso
    private Button editButtonAcesso;
    private EditText editMail ,editSenha;
    private Switch editSwitchAcesso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        getSupportActionBar().hide();
        inicializaComponents();

    }


        private void inicializaComponents() {

            editMail = findViewById(R.id.editMail);
            editSenha = findViewById(R.id.editSenha);
            editButtonAcesso = findViewById(R.id.editButtonAcesso);
            editSwitchAcesso = findViewById(R.id.editSwitchAcesso);

    }




}
