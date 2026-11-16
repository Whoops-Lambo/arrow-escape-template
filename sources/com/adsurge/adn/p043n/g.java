package com.adsurge.adn.p043n;

import android.content.Intent;
import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.adsurge.adn.E1.l;
import com.adsurge.adn.N.b;
import com.adsurge.adn.lib.callback.EndCardShownCallback;
import com.adsurge.adn.p018e1.d;
import com.adsurge.adn.p018e1.f;
import com.adsurge.adn.p037l.e;
import com.adsurge.adn.u1.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class g extends com.adsurge.adn.p043n.a implements l.a {
    public boolean n;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends d {
        public a(f fVar) {
            super(fVar);
        }

        @Override // com.adsurge.adn.p018e1.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(Void r1) {
            g gVar = g.this;
            if (gVar.n) {
                return;
            }
            gVar.n = true;
            gVar.e("onReceivedHttpError");
        }
    }

    @Override // com.adsurge.adn.E1.l
    public void b(String str) {
    }

    @Override // com.adsurge.adn.E1.l
    public void d(String str) {
    }

    @Override // com.adsurge.adn.E1.l.a
    public void n() {
    }

    @Override // com.adsurge.adn.p043n.a
    public int w() {
        return 3;
    }

    @Override // com.adsurge.adn.E1.l
    public void c(String str) {
        if (this.n) {
            return;
        }
        z();
    }

    @Override // com.adsurge.adn.E1.l.a
    public void i() {
        if (this.i.a0().v() && !this.n) {
            this.n = true;
            e("sppl onTimeout");
        }
    }

    @Override // com.adsurge.adn.p043n.a
    public long v() {
        return b.a("odcmed", 500, this.i);
    }

    public g(c cVar, int i, e eVar) {
        super(cVar, i, eVar);
        if (!cVar.S0()) {
            return;
        }
        ((EndCardShownCallback) com.adsurge.adn.p018e1.a.b(cVar.d(), EndCardShownCallback.class)).onEndCardShown().a((d) new a(this));
    }

    @Override // com.adsurge.adn.E1.l.a
    public void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (!webResourceRequest.isForMainFrame() || this.n) {
            return;
        }
        this.n = true;
        e("onReceivedHttpError");
    }

    @Override // com.adsurge.adn.E1.l.a
    public void a(String str) {
    }

    @Override // com.adsurge.adn.E1.l
    public void a(String str, Bitmap bitmap) {
    }

    @Override // com.adsurge.adn.E1.l
    public boolean a(ValueCallback valueCallback, Intent intent) {
        return false;
    }

    @Override // com.adsurge.adn.E1.l
    public void a(int i) {
    }

    @Override // com.adsurge.adn.E1.l
    public void a(int i, String str, String str2) {
        if (this.n) {
            return;
        }
        this.n = true;
        e("onReceivedError");
    }
}
