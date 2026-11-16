package com.adsurge.adn.E1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebViewClient;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: com.adsurge.adn.E1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1626a {
    public static final int g = com.adsurge.adn.s1.a.b().c().a("wvpgit", 2);
    public static final boolean h;
    public static int i;
    public final p a;
    public final com.adsurge.adn.u1.c b;
    public final com.adsurge.adn.Y0.c c;
    public int d = 0;
    public boolean e = true;
    public boolean f = false;

    public void c() {
    }

    public final WebResourceResponse a(WebResourceRequest webResourceRequest) {
        InputStream inputStream;
        WebResourceResponse webResourceResponse = null;
        if (this.f && webResourceRequest != null && webResourceRequest.getUrl() != null) {
            Pair pairA = a(webResourceRequest.getUrl());
            if (pairA == null || (inputStream = (InputStream) pairA.first) == null) {
                return null;
            }
            webResourceResponse = new WebResourceResponse(((com.adsurge.adn.x1.r.a) pairA.second).b(), "UTF-8", inputStream);
            String str = webResourceRequest.getRequestHeaders().get("Origin");
            if (x.d().c(str)) {
                HashMap map = new HashMap();
                map.put("Access-Control-Allow-Origin", str);
                webResourceResponse.setResponseHeaders(map);
            }
        }
        return webResourceResponse;
    }

    public void b(boolean z) {
        this.f = z;
    }

    static {
        boolean z = true;
        if (com.adsurge.adn.s1.a.b().c().a("wvpgrt", 0) != 1) {
            z = false;
        }
        h = z;
        i = 0;
    }

    public AbstractC1626a(p pVar, com.adsurge.adn.u1.c cVar) {
        this.a = pVar;
        this.b = cVar;
        this.c = com.adsurge.adn.Y0.c.a(cVar);
    }

    public void b() {
    }

    public void a(boolean z) {
        this.e = z;
    }

    public void a(WebViewClient webViewClient) {
    }

    public Pair a(Uri uri) {
        x xVarD = x.d();
        if (!xVarD.a() || xVarD.b(uri)) {
            return null;
        }
        return xVarD.a(uri);
    }

    public void a() {
        p pVar = this.a;
        if (pVar == null || pVar.a() == null) {
            return;
        }
        this.a.a().e();
    }

    public boolean a(String str) {
        boolean zB;
        Context contextA = com.adsurge.adn.s1.a.b().a();
        Intent intentB = com.adsurge.adn.p021f1.o.b(contextA, str);
        if (intentB == null || !this.e) {
            zB = false;
        } else {
            zB = com.adsurge.adn.p021f1.o.b(contextA, intentB);
            com.adsurge.adn.Y0.e eVar = new com.adsurge.adn.Y0.e(6000600);
            eVar.a(this.c);
            eVar.e(!zB ? 1 : 0);
            com.adsurge.adn.Y0.d dVar = new com.adsurge.adn.Y0.d();
            dVar.a("schema", str);
            eVar.a(dVar);
            com.adsurge.adn.w1.b.a(eVar);
        }
        return zB || !com.adsurge.adn.x1.r.c(str);
    }

    public boolean a(RenderProcessGoneDetail renderProcessGoneDetail) {
        if (!h) {
            if (Build.VERSION.SDK_INT >= 26 && renderProcessGoneDetail != null && renderProcessGoneDetail.didCrash()) {
                i++;
                com.adsurge.adn.w1.b.b(9130001, (com.adsurge.adn.Y0.c) null, (Integer) 2, Integer.valueOf(i));
                if (i > g) {
                    return false;
                }
            } else {
                com.adsurge.adn.w1.b.b(9130001, (com.adsurge.adn.Y0.c) null, (Integer) 3, Integer.valueOf(i));
                return false;
            }
        }
        return true;
    }
}
