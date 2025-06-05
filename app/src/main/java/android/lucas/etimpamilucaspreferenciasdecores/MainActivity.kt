package android.lucas.etimpamilucaspreferenciasdecores

import android.os.Bundle
import android.graphics.Color
import android.lucas.etimpamilucaspreferenciasdecores.databinding.ActivityMainBinding
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    private var cor = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        supportActionBar!!.hide()
        window.statusBarColor = Color.WHITE
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.cor1.setOnClickListener{
            cor = "#FF0000"
        }

        binding.cor2.setOnClickListener{
            cor = "#00DDFF"
        }

        binding.cor3.setOnClickListener{
            cor = "#08E700"
        }

        binding.cor4.setOnClickListener{
            cor = "FFE400"
        }
        binding.cor5.setOnClickListener{
            cor = "#673AB7"
        }

        binding.cor6.setOnClickListener{

        }


    }
}