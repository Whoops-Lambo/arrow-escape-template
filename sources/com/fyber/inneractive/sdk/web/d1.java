package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import defpackage.n30;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d1 {
    public final String a;
    public final String b;
    public final HashMap c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (this.a.equals(d1Var.a) && this.b.equals(d1Var.b)) {
            return this.c.equals(d1Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + n30.c(this.a.hashCode() * 31, 31, this.b);
    }

    public d1(WebResourceRequest webResourceRequest) {
        Map<String, String> requestHeaders;
        this.a = webResourceRequest.getUrl().toString();
        this.b = webResourceRequest.getMethod();
        if (webResourceRequest.getRequestHeaders() == null) {
            requestHeaders = Collections.EMPTY_MAP;
        } else {
            requestHeaders = webResourceRequest.getRequestHeaders();
        }
        this.c = new HashMap(requestHeaders);
    }
}
