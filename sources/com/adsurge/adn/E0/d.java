package com.adsurge.adn.E0;

import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.nj;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class d {
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;
    public final String e;

    public String a() {
        return this.e;
    }

    public int b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public d(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i > 0 ? nj.k(i, str, UserDetailsUtils.UserDetailsLiterals.DOT) : str;
        this.d = z;
        this.e = UUID.randomUUID().toString();
    }
}
