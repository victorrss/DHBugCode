package com.example.snackbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.login_body.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {
            Snackbar.make(it,"Senha incorreta",Snackbar.LENGTH_LONG).show()
/*
            startActivity(
                Intent(this, MainActivity::class.java)
                    .putExtra("user", getUsuario())
            )

 */
        }

        tvCadastrar.setOnClickListener{
            startActivity(
                Intent(this, CadastroActivity::class.java)
                    .putExtra("user", getUsuario())
            )
        }
    }

    private fun getUsuario(): Usuario {
        return Usuario(1, edUserName.text.toString(), edPassword.text.toString())
    }
}