package ca.ulaval.ima.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MonProfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mon_profil)


        var zoe = MainActivity().zoe



        var nom : TextView = findViewById(R.id.nom)
        nom.text = "Nom : " + zoe.nom

        var prenom : TextView = findViewById(R.id.prenom)
        prenom.text = "Prénom : " + zoe.prenom

        var date : TextView = findViewById(R.id.date)
        date.text = "Date de naissance : " + zoe.dateNaissance.toString()

        var idul : TextView = findViewById(R.id.idul)
        idul.text = "Idul : " + zoe.idul





    }
}