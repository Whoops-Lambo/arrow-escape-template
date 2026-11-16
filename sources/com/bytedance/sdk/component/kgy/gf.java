package com.bytedance.sdk.component.kgy;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import defpackage.d;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class gf {
    kgy ahm;
    Context ct;
    nu fi;
    at gf;
    WebView kgy;
    boolean noq;
    boolean twf;
    yo uq;
    boolean yo;
    String rz = "IESJSBridge";
    String ra = "host";
    final Set<String> nu = new LinkedHashSet();
    final Set<String> at = new LinkedHashSet();

    private void ahm() {
        if (!(this.kgy == null && !this.twf && this.ahm == null) && ((!TextUtils.isEmpty(this.rz) || this.kgy == null) && this.uq != null)) {
            return;
        }
        d.r("Requested arguments aren't set properly when building JsBridge.");
    }

    public gf(WebView webView) {
        this.kgy = webView;
    }

    public vs kgy() {
        ahm();
        return new vs(this);
    }

    public gf kgy(String str) {
        this.rz = str;
        return this;
    }

    public gf kgy(ra raVar) {
        this.uq = yo.kgy(raVar);
        return this;
    }

    public gf kgy(boolean z) {
        this.noq = z;
        return this;
    }

    public gf kgy(kgy kgyVar) {
        this.ahm = kgyVar;
        return this;
    }

    public gf() {
    }

    public gf ahm(boolean z) {
        this.yo = z;
        return this;
    }
}
