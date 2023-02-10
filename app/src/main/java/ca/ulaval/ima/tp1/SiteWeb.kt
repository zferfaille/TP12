package ca.ulaval.ima.tp1


import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SiteWeb : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_site_web)



        val Url = intent.getStringExtra("STRING_I_NEED").toString()

        val webView = findViewById<WebView>(R.id.webView)
        webView.webViewClient = WebViewClient()
        webView.loadUrl(Url)
        webView.settings.javaScriptEnabled = true
        webView.settings.setSupportZoom(true)

        val buttonRetour = findViewById<Button>(R.id.buttonAct3)
        buttonRetour.setOnClickListener {
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}