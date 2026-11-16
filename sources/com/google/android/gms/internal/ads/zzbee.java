package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class zzbee implements Callable {
    public final zzbcr a;
    public final String b;
    public final String c;
    public final zzayj d;
    public Method e;
    public final int f;
    public final int g;

    public abstract void a();

    public zzbee(zzbcr zzbcrVar, String str, String str2, zzayj zzayjVar, int i, int i2) {
        this.a = zzbcrVar;
        this.b = str;
        this.c = str2;
        this.d = zzayjVar;
        this.f = i;
        this.g = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        try {
            long jNanoTime = System.nanoTime();
            zzbcr zzbcrVar = this.a;
            Method methodD = zzbcrVar.d(this.b, this.c);
            this.e = methodD;
            if (methodD != null) {
                a();
                zzbbi zzbbiVar = zzbcrVar.k;
                if (zzbbiVar != null && (i = this.f) != Integer.MIN_VALUE) {
                    zzbbiVar.a(this.g, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
                    return null;
                }
                return null;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
