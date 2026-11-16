package com.adsurge.adn.E1;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.fh3;
import defpackage.kf3;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class t extends AbstractC1626a {
    public final Set j;

    public final void b(p pVar) {
        if (pVar == null) {
            return;
        }
        String strC = com.adsurge.adn.K1.b.b().c();
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        com.adsurge.adn.I0.g.c(new fh3(pVar, strC, 1));
    }

    public final /* synthetic */ void c(p pVar) {
        LinkedList linkedList = new LinkedList();
        for (String str : com.adsurge.adn.K1.b.b().a()) {
            if (!this.j.contains(str)) {
                String strC = com.adsurge.adn.K1.b.b().c(str);
                if (!TextUtils.isEmpty(strC)) {
                    this.j.add(str);
                    linkedList.add(strC);
                }
            }
        }
        linkedList.size();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.adsurge.adn.I0.g.c(new fh3(pVar, (String) it.next(), 0));
        }
    }

    public t(p pVar, com.adsurge.adn.u1.c cVar) {
        super(pVar, cVar);
        this.j = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    @Override // com.adsurge.adn.E1.AbstractC1626a
    public Pair a(Uri uri) {
        Pair pairD;
        String strF = com.adsurge.adn.K1.b.b().f(uri.toString());
        if (!TextUtils.isEmpty(strF) && !this.j.contains(strF) && (pairD = com.adsurge.adn.K1.b.b().d(strF)) != null) {
            this.j.add(strF);
            uri.toString();
            return pairD;
        }
        if (com.adsurge.adn.H1.a.a().c()) {
            return com.adsurge.adn.H1.a.a().a(uri.toString());
        }
        return super.a(uri);
    }

    @Override // com.adsurge.adn.E1.AbstractC1626a
    public void b() {
        a(this.a);
    }

    @Override // com.adsurge.adn.E1.AbstractC1626a
    public boolean a(String str) {
        if (com.adsurge.adn.K1.b.b().g(str)) {
            com.adsurge.adn.u1.c cVar = this.b;
            if (cVar == null || TextUtils.isEmpty(cVar.d())) {
                return true;
            }
            com.adsurge.adn.K1.c.a(this.b.d(), new com.adsurge.adn.K1.c.b(0, str));
            return true;
        }
        return super.a(str);
    }

    @Override // com.adsurge.adn.E1.AbstractC1626a
    public void a(WebViewClient webViewClient) {
        a(webViewClient, this.a);
    }

    public final void a(WebViewClient webViewClient, p pVar) {
        o oVarA;
        if (pVar == null) {
            return;
        }
        View viewC = pVar.c();
        if ((viewC instanceof WebView) && (oVarA = com.adsurge.adn.K1.b.b().a(webViewClient, (WebView) viewC)) != null) {
            pVar.addJavascriptInterface(oVarA, oVarA.a());
        }
    }

    public final void a(p pVar) {
        if (pVar == null) {
            return;
        }
        com.adsurge.adn.X.q.b.submit(new kf3(15, this, pVar));
    }

    @Override // com.adsurge.adn.E1.AbstractC1626a
    public void c() {
        b(this.a);
    }
}
