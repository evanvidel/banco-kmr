package com.axweb.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.axweb.bancomr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saldo.setOnClickListener {
            val intent = Intent(this, SaldoActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.faturas.setOnClickListener {
            val intent = Intent(this, FaturasActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.transferencia.setOnClickListener {
            val intent = Intent(this, TranferenciaActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.poupanca.setOnClickListener {
            val intent = Intent(this, PoupancaActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}