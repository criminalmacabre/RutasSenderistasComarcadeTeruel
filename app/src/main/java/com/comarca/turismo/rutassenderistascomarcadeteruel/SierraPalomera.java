
/*
 * CC BY Alberto Royuela Heras y Guillermo Royuela Heras 2017
 * Creative Commons may be contacted at creativecommons.org.
 */

package com.comarca.turismo.rutassenderistascomarcadeteruel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ScrollView;

public class SierraPalomera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sierra_palomera);
        //AQUI VA LA DIRECCION DEL MAPA CUSTOM si, hardcoded porque no deberia cambiar nunca
        String html = "<iframe src=\"https://www.google.com/maps/d/embed?mid=1jnijxx-n8m0mxcPoYlY4NYlVe78\" width=100% height=100%></iframe>";
        WebView webview;
        webview = (WebView) findViewById(R.id.mapasierrapalomera);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadData(html, "text/html", null);

    }
}
