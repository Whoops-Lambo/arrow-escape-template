package com.adsurge.adn.E1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class u implements l.a {
    public final List a;

    @Override // com.adsurge.adn.E1.l
    public boolean a(ValueCallback valueCallback, Intent intent) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((l.a) it.next()).a(valueCallback, intent);
        }
        return false;
    }

    @Override // com.adsurge.adn.E1.l
    public void b(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((l.a) it.next()).b(str);
        }
    }

    @Override // com.adsurge.adn.E1.l
    public void c(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((l.a) it.next()).c(str);
        }
    }

    @Override // com.adsurge.adn.E1.l
    public void d(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((l.a) it.next()).d(str);
        }
    }

    @Override // com.adsurge.adn.E1.l.a
    public void i() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((l.a) it.next()).i();
        }
    }

    @Override // com.adsurge.adn.E1.l.a
    public void n() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((l.a) it.next()).n();
        }
    }

    @Override // com.adsurge.adn.E1.l.a
    public void onDestroy() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((l.a) it.next()).onDestroy();
        }
    }

    public u(List list) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.a = copyOnWriteArrayList;
        copyOnWriteArrayList.addAll(list);
    }

    @Override // com.adsurge.adn.E1.l.a
    public void a(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((l.a) it.next()).a(str);
        }
    }

    @Override // com.adsurge.adn.E1.l
    public void a(String str, Bitmap bitmap) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((l.a) it.next()).a(str, bitmap);
        }
    }

    @Override // com.adsurge.adn.E1.l
    public void a(int i, String str, String str2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((l.a) it.next()).a(i, str, str2);
        }
    }

    @Override // com.adsurge.adn.E1.l
    public void a(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((l.a) it.next()).a(i);
        }
    }

    @Override // com.adsurge.adn.E1.l.a
    public void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((l.a) it.next()).a(webView, webResourceRequest, webResourceResponse);
        }
    }
}
