package com.adsurge.adn.p053r;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.adsurge.adn.E1.e;
import com.adsurge.adn.p036k1.q;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class h extends e {
    public final q a;
    public long b = -1;
    public boolean c = true;
    public boolean d = true;
    public boolean e = false;

    public long b(long j) {
        if (this.c) {
            return 0L;
        }
        if (this.b < 0) {
            this.b = j;
        }
        return j - this.b;
    }

    public h(q qVar) {
        this.a = qVar;
    }

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l.a
    public void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (!webResourceRequest.isForMainFrame()) {
            return;
        }
        super.a(webView, webResourceRequest, webResourceResponse);
        q qVar = this.a;
        if (qVar != null) {
            qVar.c(webResourceResponse.getStatusCode());
            if (!this.e && this.c) {
                this.a.p();
            }
        }
        this.d = false;
        this.e = true;
    }

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l
    public void c(String str) {
        super.c(str);
        this.c = false;
        this.d = false;
        q qVar = this.a;
        if (qVar != null) {
            qVar.c("0");
        }
    }

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l
    public void d(String str) {
        super.d(str);
        this.c = false;
        this.d = false;
        q qVar = this.a;
        if (qVar != null) {
            qVar.d(str);
        }
    }

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l.a
    public void i() {
        super.i();
        if (this.e) {
            return;
        }
        this.c = false;
        this.a.c("f0");
    }

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l
    public void a(int i, String str, String str2) {
        super.a(i, str, str2);
        q qVar = this.a;
        if (qVar != null) {
            qVar.c(i);
            if (!this.e && this.c) {
                this.a.p();
            }
        }
        this.d = false;
        this.e = true;
    }

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l
    public void a(String str, Bitmap bitmap) {
        super.a(str, bitmap);
    }

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l.a
    public void a(String str) {
        super.a(str);
        q qVar = this.a;
        if (qVar != null) {
            qVar.d(str);
        }
    }

    public long a(long j) {
        if (this.d || this.e) {
            return 0L;
        }
        if (this.b < 0) {
            this.b = j;
        }
        return j - this.b;
    }
}
