package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import defpackage.nj;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgv {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final Bundle e;

    public static zzgv a(zzbh zzbhVar) {
        String str = zzbhVar.a;
        String str2 = zzbhVar.c;
        return new zzgv(zzbhVar.d, zzbhVar.e, zzbhVar.b.v0(), str, str2);
    }

    public final zzbh b() {
        zzbf zzbfVar = new zzbf(new Bundle(this.e));
        return new zzbh(this.a, zzbfVar, this.b, this.c, this.d);
    }

    public final String toString() {
        String string = this.e.toString();
        String str = this.b;
        int length = String.valueOf(str).length();
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        q63.y(sb, "origin=", str, ",name=", str2);
        return nj.q(sb, ",params=", string);
    }

    public zzgv(long j, long j2, Bundle bundle, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.e = bundle;
        this.c = j;
        this.d = j2;
    }
}
