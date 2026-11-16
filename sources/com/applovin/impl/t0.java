package com.applovin.impl;

import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class t0 {
    public static int c = -100;
    public static int d = -200;
    public static int e = -300;
    private final int a;
    private final String b;

    public String toString() {
        StringBuilder sb = new StringBuilder("AppLovinConsentFlowErrorImpl{code=");
        sb.append(this.a);
        sb.append(", message='");
        return nj.q(sb, this.b, "'}");
    }

    public t0(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
