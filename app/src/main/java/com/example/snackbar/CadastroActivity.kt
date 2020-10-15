package com.example.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.cadastro_body.*

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        btnCadastrar.setOnClickListener {
            val pwd = edPassword.text.toString()
            val pwdConfirm = edPasswordConfirm.text.toString()

            val msg = if (pwd.length < 6)
                "Sua senha é muito curta."
            else if (pwd == pwdConfirm)
                "Cadastrado com sucesso!"
            else "Repita a senha corretamente"

            Snackbar.make(it, msg, Snackbar.LENGTH_LONG).show()
        }
    }
}