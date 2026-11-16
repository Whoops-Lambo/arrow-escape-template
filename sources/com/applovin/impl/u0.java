package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class u0 {
    private final StringBuilder a = new StringBuilder();

    public void b(String str) {
        a(n30.y("Invalid state: ", str));
    }

    public String toString() {
        return this.a.toString();
    }

    private String a(w0 w0Var) {
        w0.b bVarD = w0Var.d();
        if (bVarD == w0.b.EVENT) {
            return ((z0) w0Var).g();
        }
        if (bVarD == w0.b.DECISION) {
            return StringUtils.emptyIfNull(w0Var.b());
        }
        return StringUtils.emptyIfNull(w0Var.e());
    }

    public void b() {
        a("Invalid Activity");
    }

    public void a(w0 w0Var, boolean z, long j) {
        a(a(w0Var) + ": " + z, j);
    }

    public void a() {
        this.a.setLength(0);
    }

    private void a(String str, long j) {
        a(str + " after " + j + "ms");
    }

    private void a(String str) {
        StringBuilder sb = this.a;
        sb.append(str);
        sb.append("\n");
    }

    public void a(w0 w0Var, long j) {
        if (w0Var.d() == w0.b.DECISION) {
            return;
        }
        a(a(w0Var), j);
    }
}
