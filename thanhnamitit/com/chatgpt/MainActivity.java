package thanhnamitit.com.chatgpt;

import fi.b;
import fi.c;
import ge.k;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin;
import sd.p;

public final class MainActivity extends FlutterActivity {
    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        k.f(flutterEngine, "flutterEngine");
        super.configureFlutterEngine(flutterEngine);
        for (p pVar : r.m(new p("ConversationsAdFactory", new c(this)), new p("CharactersAdFactory", new b(this)))) {
            GoogleMobileAdsPlugin.registerNativeAdFactory(flutterEngine, (String) pVar.c(), (GoogleMobileAdsPlugin.NativeAdFactory) pVar.d());
        }
    }
}
