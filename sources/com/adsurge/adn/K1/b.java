package com.adsurge.adn.K1;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adsurge.adn.E1.o;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.x1.l;
import com.adsurge.adn.x1.r;
import defpackage.pv1;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class b {
    public final Map a = new ConcurrentHashMap();
    public final Map b = new ConcurrentHashMap();
    public final com.adsurge.adn.L1.a c;
    public final com.adsurge.adn.L1.b d;
    public final com.adsurge.adn.L1.c e;
    public volatile Boolean f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public static final b a = new b();
    }

    public b() {
        d();
        File fileF = l.f();
        this.c = new com.adsurge.adn.L1.a(fileF);
        this.d = new com.adsurge.adn.L1.b(fileF);
        this.e = new com.adsurge.adn.L1.c();
    }

    public final String a(String str) {
        int iLastIndexOf;
        if (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(47)) >= 0 && iLastIndexOf < str.length() - 1) {
            String strSubstring = str.substring(iLastIndexOf + 1);
            int iLastIndexOf2 = strSubstring.lastIndexOf(46);
            if (iLastIndexOf2 > 0) {
                strSubstring = strSubstring.substring(0, iLastIndexOf2);
            }
            int iLastIndexOf3 = strSubstring.lastIndexOf(95);
            if (iLastIndexOf3 >= 0 && iLastIndexOf3 < strSubstring.length() - 1) {
                return strSubstring.substring(iLastIndexOf3 + 1);
            }
        }
        return null;
    }

    public final String b(String str) {
        int iLastIndexOf;
        if (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(47)) < 0 || iLastIndexOf >= str.length() - 1) {
            return null;
        }
        return str.substring(iLastIndexOf + 1);
    }

    public String c(String str) {
        InputStream inputStreamE = e(str);
        if (inputStreamE == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamE, StandardCharsets.UTF_8));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append("\n");
            }
            bufferedReader.close();
            inputStreamE.close();
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    public final void d() {
        List listA = a();
        String strA = com.adsurge.adn.N.b.a("odcpaa", ",");
        if (TextUtils.isEmpty(strA)) {
            strA = ",";
        }
        String[] strArrSplit = strA.split(",", -1);
        if (strArrSplit.length == listA.size()) {
            for (int i = 0; i < listA.size(); i++) {
                String str = (String) listA.get(i);
                String str2 = strArrSplit[i];
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    this.a.put(str, str2);
                }
            }
        }
        this.b.put("exitapi.js", "adsurge-adapter");
    }

    public final InputStream e(String str) {
        InputStream inputStreamA;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = (String) this.a.get(str);
        String strA = a(str, a(str2));
        if (strA != null && (inputStreamA = this.c.a(str2, strA)) != null) {
            return inputStreamA;
        }
        InputStream inputStreamA2 = this.e.a(str2, str);
        if (inputStreamA2 == null) {
            return null;
        }
        return inputStreamA2;
    }

    public void f() {
        if (!e()) {
            for (Map.Entry entry : this.a.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                String strA = a(str, a(str2));
                if (strA != null && !this.c.a(strA)) {
                    this.d.a(str2, strA);
                }
            }
        }
    }

    public boolean g(String str) {
        if (e()) {
            return false;
        }
        return TextUtils.equals(Uri.parse(str).getHost(), "f.adsurge.com");
    }

    public static b b() {
        return a.a;
    }

    public boolean e() {
        if (this.f == null) {
            this.f = Boolean.valueOf(com.adsurge.adn.N.b.a("odcpai", 0, (AdSurgeAdFormat) null, (String) null) == 0);
        }
        return this.f.booleanValue();
    }

    public String c() {
        if (e()) {
            return null;
        }
        return "\nwindow.adsurgeOpen = function(url, target) {\n    if (window.__adsurgeOpenBridge__) {\n         window.__adsurgeOpenBridge__.open(url);\n    }\n};";
    }

    public String f(String str) {
        if (e()) {
            return null;
        }
        String strB = b(str);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        return (String) this.b.get(strB);
    }

    public final String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return pv1.w(str, "_", str2, ".js");
    }

    public List a() {
        if (e()) {
            return new ArrayList();
        }
        Object[] objArr = {"adsurge-adapter", "adsurge-mraid"};
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public o a(WebViewClient webViewClient, WebView webView) {
        if (e()) {
            return null;
        }
        return new com.adsurge.adn.K1.a(webViewClient, webView);
    }

    public Pair d(String str) {
        InputStream inputStreamE = e(str);
        if (inputStreamE == null) {
            return null;
        }
        return Pair.create(inputStreamE, r.a.JS);
    }
}
