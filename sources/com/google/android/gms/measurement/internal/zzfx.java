package com.google.android.gms.measurement.internal;

import defpackage.hz3;
import defpackage.wx;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfx {
    public static final Object f = new Object();
    public final String a;
    public final hz3 b;
    public final Object c;
    public final Object d = new Object();
    public volatile Object e = null;

    public final Object a(Object obj) {
        synchronized (this.d) {
        }
        if (obj != null) {
            return obj;
        }
        if (wx.d == null) {
            return this.c;
        }
        synchronized (f) {
            try {
                if (zzae.a()) {
                    return this.e == null ? this.c : this.e;
                }
                try {
                    for (zzfx zzfxVar : zzfy.a) {
                        if (zzae.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objMo1232zza = null;
                        try {
                            hz3 hz3Var = zzfxVar.b;
                            if (hz3Var != null) {
                                objMo1232zza = hz3Var.mo1232zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f) {
                            zzfxVar.e = objMo1232zza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                hz3 hz3Var2 = this.b;
                if (hz3Var2 != null) {
                    try {
                        return hz3Var2.mo1232zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ zzfx(String str, Object obj, hz3 hz3Var) {
        this.a = str;
        this.c = obj;
        this.b = hz3Var;
    }
}
