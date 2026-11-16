package com.google.android.gms.internal.consent_sdk;

import defpackage.x55;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class zzra {
    public volatile zzrq a;
    public volatile zzpm b;

    public int hashCode() {
        return 1;
    }

    public final int a() {
        if (this.b != null) {
            return ((x55) this.b).c.length;
        }
        if (this.a != null) {
            return this.a.zzn();
        }
        return 0;
    }

    public final zzpm b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.a == null) {
                    this.b = zzpm.b;
                } else {
                    this.b = this.a.zzk();
                }
                return this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(zzrq zzrqVar) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a != null) {
                return;
            }
            try {
                this.a = zzrqVar;
                this.b = zzpm.b;
            } catch (zzqu unused) {
                this.a = zzrqVar;
                this.b = zzpm.b;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzra)) {
            return false;
        }
        zzra zzraVar = (zzra) obj;
        zzrq zzrqVar = this.a;
        zzrq zzrqVar2 = zzraVar.a;
        if (zzrqVar == null && zzrqVar2 == null) {
            return b().equals(zzraVar.b());
        }
        if (zzrqVar != null && zzrqVar2 != null) {
            return zzrqVar.equals(zzrqVar2);
        }
        if (zzrqVar != null) {
            zzraVar.c(zzrqVar.zzl());
            return zzrqVar.equals(zzraVar.a);
        }
        c(zzrqVar2.zzl());
        return this.a.equals(zzrqVar2);
    }
}
