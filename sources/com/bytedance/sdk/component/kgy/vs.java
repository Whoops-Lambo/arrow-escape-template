package com.bytedance.sdk.component.kgy;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class vs {
    private final WebView ahm;
    private volatile boolean ct;
    private final kgy kgy;
    private final gf rz;
    private final List<at> uq;

    private void ahm() {
        if (this.ct) {
            fi.kgy(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    public void kgy() {
        if (this.ct) {
            return;
        }
        this.kgy.ahm();
        this.ct = true;
        Iterator<at> it = this.uq.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public vs(gf gfVar) {
        ArrayList arrayList = new ArrayList();
        this.uq = arrayList;
        this.ct = false;
        this.rz = gfVar;
        WebView webView = gfVar.kgy;
        kgy kgyVar = gfVar.ahm;
        if (webView != null && kgyVar == null) {
            this.kgy = new sx();
        } else {
            this.kgy = kgyVar;
        }
        this.kgy.rz(gfVar);
        this.ahm = gfVar.kgy;
        arrayList.add(gfVar.gf);
        fpp.kgy(gfVar.yo);
    }

    public vs kgy(String str, uq<?, ?> uqVar) {
        return kgy(str, (String) null, uqVar);
    }

    public vs kgy(Set<String> set, um<?, ?> umVar) {
        return kgy(set, (String) null, umVar);
    }

    public vs kgy(String str, String str2, uq<?, ?> uqVar) {
        ahm();
        this.kgy.yo.kgy(str, uqVar);
        return this;
    }

    public vs kgy(Set<String> set, String str, um<?, ?> umVar) {
        ahm();
        this.kgy.yo.kgy(set, umVar);
        return this;
    }

    public vs kgy(String str, rz.ahm ahmVar) {
        return kgy(str, (String) null, ahmVar);
    }

    public vs kgy(String str, String str2, rz.ahm ahmVar) {
        ahm();
        this.kgy.yo.kgy(str, ahmVar);
        return this;
    }

    public static gf kgy(WebView webView) {
        return new gf(webView);
    }
}
