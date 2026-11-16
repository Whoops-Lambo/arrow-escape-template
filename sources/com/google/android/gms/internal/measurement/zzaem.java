package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class zzaem {
    public volatile zzafc a;
    public volatile zzacr b;

    public int hashCode() {
        return 1;
    }

    public final int a() {
        if (this.b != null) {
            return this.b.d();
        }
        if (this.a != null) {
            return this.a.i();
        }
        return 0;
    }

    public final zzacr b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.a == null) {
                    this.b = zzacr.b;
                } else {
                    this.b = this.a.b();
                }
                return this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(zzafc zzafcVar) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a != null) {
                return;
            }
            try {
                this.a = zzafcVar;
                this.b = zzacr.b;
            } catch (zzaeh unused) {
                this.a = zzafcVar;
                this.b = zzacr.b;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaem)) {
            return false;
        }
        zzaem zzaemVar = (zzaem) obj;
        zzafc zzafcVar = this.a;
        zzafc zzafcVar2 = zzaemVar.a;
        if (zzafcVar == null && zzafcVar2 == null) {
            return b().equals(zzaemVar.b());
        }
        if (zzafcVar != null && zzafcVar2 != null) {
            return zzafcVar.equals(zzafcVar2);
        }
        if (zzafcVar != null) {
            zzaemVar.c(zzafcVar.e());
            return zzafcVar.equals(zzaemVar.a);
        }
        c(zzafcVar2.e());
        return this.a.equals(zzafcVar2);
    }
}
