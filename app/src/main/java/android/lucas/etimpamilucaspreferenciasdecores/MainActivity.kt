package android.lucas.etimpamilucaspreferenciasdecores

import android.os.Bundle
import android.graphics.Color
import android.lucas.etimpamilucaspreferenciasdecores.databinding.ActivityMainBinding
import android.view.inputmethod.InputBinding
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    companion object {
        const val NOME_ARQUIVO = "arquivo_prefs.xml"
    }

    private var cor = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        supportActionBar!!.hide()
        window.statusBarColor = Color.WHITE
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.cor1.setOnClickListener {
            cor = "#FF0000"
            salvarCor(cor)
        }

        binding.cor2.setOnClickListener {
            cor = "#00DDFF"
            salvarCor(cor)
        }

        binding.cor3.setOnClickListener {
            cor = "#08E700"
            salvarCor(cor)
        }

        binding.cor4.setOnClickListener {
            cor = "FFE400"
            salvarCor(cor)
        }

        binding.cor5.setOnClickListener {
            cor = "#673AB7"
            salvarCor(cor)
        }

        binding.cor6.setOnClickListener {
            cor = "FF5722"
            salvarCor(cor)
        }



    }

    private fun salvarCor(cor: String) {

        binding.main.setBackgroundColor(Color.parseColor(cor))

        binding.btnTrocar.setOnClickListener { view ->
            val preferencias = getSharedPreferences(NOME_ARQUIVO, MODE_PRIVATE)
            val editor = preferencias.edit()
            editor.putString("cor", cor)
            editor.putString("nome", "Lucas")
            editor.putString("sobrenome", "Camilo")
            editor.putInt("Idade", 16)
            editor.apply()

            snackBar(view)
        }
    }

            private fun snackBar(view: View) {
                val snackbar = Snackbar.make(
                    view,
                    "Cor de fundo alterada com sucesso!",
                    Snackbar.LENGTH_INDEFINITE
                )
                snackbar.setAction("OK") {

                }

                snackbar.setActionTextColor(Color.BLUE)
                snackbar.setBackgroundTint(Color.LTGRAY)
                snackbar.setTextColor(Color.GREEN)
                snackbar.show()

            }


        }

