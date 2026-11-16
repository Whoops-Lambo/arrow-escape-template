package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzglw implements zzglv {
    public final String a;
    public final String b;
    public final zzgko c;
    public final zzayj d;
    public final zzgsu e;

    public abstract void a(Method method, zzayj zzayjVar);

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzgsu zzgsuVar = this.e;
        try {
            zzgsuVar.a();
            Method methodZzc = this.c.zzc(this.a, this.b);
            if (methodZzc != null) {
                a(methodZzc, this.d);
            }
            zzgsuVar.c();
            return null;
        } catch (Throwable th) {
            try {
                zzgsuVar.b(th);
                throw th;
            } catch (Throwable th2) {
                zzgsuVar.c();
                throw th2;
            }
        }
    }

    public zzglw(String str, String str2, zzayj zzayjVar, zzgko zzgkoVar, zzgsu zzgsuVar) {
        this.a = str;
        this.b = str2;
        this.d = zzayjVar;
        this.c = zzgkoVar;
        this.e = zzgsuVar;
    }
}
