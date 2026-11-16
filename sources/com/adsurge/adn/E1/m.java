package com.adsurge.adn.E1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class m implements l.a {
    public l a;
    public l b;

    @Override // com.adsurge.adn.E1.l.a
    public void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        l lVar = this.a;
        if (lVar instanceof l.a) {
            ((l.a) lVar).a(webView, webResourceRequest, webResourceResponse);
        }
        l lVar2 = this.b;
        if (lVar2 instanceof l.a) {
            ((l.a) lVar2).a(webView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // com.adsurge.adn.E1.l
    public void b(String str) {
        l lVar = this.a;
        if (lVar != null) {
            lVar.b(str);
        }
        l lVar2 = this.b;
        if (lVar2 != null) {
            lVar2.b(str);
        }
    }

    @Override // com.adsurge.adn.E1.l
    public void c(String str) {
        l lVar = this.a;
        if (lVar != null) {
            lVar.c(str);
        }
        l lVar2 = this.b;
        if (lVar2 != null) {
            lVar2.c(str);
        }
    }

    @Override // com.adsurge.adn.E1.l
    public void d(String str) {
        l lVar = this.a;
        if (lVar != null) {
            lVar.d(str);
        }
        l lVar2 = this.b;
        if (lVar2 != null) {
            lVar2.d(str);
        }
    }

    @Override // com.adsurge.adn.E1.l.a
    public void i() {
        l lVar = this.a;
        if (lVar instanceof l.a) {
            ((l.a) lVar).i();
        }
        l lVar2 = this.b;
        if (lVar2 instanceof l.a) {
            ((l.a) lVar2).i();
        }
    }

    @Override // com.adsurge.adn.E1.l.a
    public void n() {
        l lVar = this.a;
        if (lVar instanceof l.a) {
            ((l.a) lVar).n();
        }
        l lVar2 = this.b;
        if (lVar2 instanceof l.a) {
            ((l.a) lVar2).n();
        }
    }

    public void b(l lVar) {
        this.a = lVar;
    }

    @Override // com.adsurge.adn.E1.l
    public void a(String str, Bitmap bitmap) {
        l lVar = this.a;
        if (lVar != null) {
            lVar.a(str, bitmap);
        }
        l lVar2 = this.b;
        if (lVar2 != null) {
            lVar2.a(str, bitmap);
        }
    }

    @Override // com.adsurge.adn.E1.l
    public void a(int i, String str, String str2) {
        l lVar = this.a;
        if (lVar != null) {
            lVar.a(i, str, str2);
        }
        l lVar2 = this.b;
        if (lVar2 != null) {
            lVar2.a(i, str, str2);
        }
    }

    @Override // com.adsurge.adn.E1.l
    public void a(int i) {
        l lVar = this.a;
        if (lVar != null) {
            lVar.a(i);
        }
        l lVar2 = this.b;
        if (lVar2 != null) {
            lVar2.a(i);
        }
    }

    @Override // com.adsurge.adn.E1.l
    public boolean a(ValueCallback valueCallback, Intent intent) {
        l lVar = this.b;
        if (lVar != null) {
            lVar.a(valueCallback, intent);
        }
        l lVar2 = this.a;
        if (lVar2 != null) {
            return lVar2.a(valueCallback, intent);
        }
        return false;
    }

    public void a(l lVar) {
        this.b = lVar;
    }

    @Override // com.adsurge.adn.E1.l.a
    public void a(String str) {
        l lVar = this.a;
        if (lVar instanceof l.a) {
            ((l.a) lVar).a(str);
        }
        l lVar2 = this.b;
        if (lVar2 instanceof l.a) {
            ((l.a) lVar2).a(str);
        }
    }
}
