package ca.ulaval.ima.tp1


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            val intent= Intent(this, SiteWeb::class.java)
            intent.putExtra("STRING_I_NEED", UrlToLoad)
            startActivity(intent)

        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            val intent= Intent(this, Ulaval::class.java)
            startActivity(intent)
        }

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener{
            val intent= Intent(this, MonProfil::class.java)
            startActivity(intent)
        }


    }


    public class Profil(var nom: String, var prenom: String, var dateNaissance : Date, var idul: String)

    var format = SimpleDateFormat("yyyyMMdd")
    private var date : Date = format.parse("20000427") as Date

    public var zoe = Profil("Ferfaille", "Zoé", date, "537028237")

    var UrlToLoad = "https://www.google.com/"

    fun getUrlFromIntent(view: View) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(UrlToLoad)
        startActivity(intent)
    }



}