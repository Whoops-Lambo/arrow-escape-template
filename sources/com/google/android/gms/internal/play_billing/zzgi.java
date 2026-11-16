package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class zzgi {
    public volatile zzhb a;
    public volatile zzev b;

    public int hashCode() {
        return 1;
    }

    public final int a() {
        if (this.b != null) {
            return this.b.i();
        }
        if (this.a != null) {
            return this.a.zzn();
        }
        return 0;
    }

    public final zzev b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.a == null) {
                    this.b = zzev.b;
                } else {
                    this.b = this.a.zzj();
                }
                return this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(zzhb zzhbVar) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a != null) {
                return;
            }
            try {
                this.a = zzhbVar;
                this.b = zzev.b;
            } catch (zzgc unused) {
                this.a = zzhbVar;
                this.b = zzev.b;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgi)) {
            return false;
        }
        zzgi zzgiVar = (zzgi) obj;
        zzhb zzhbVar = this.a;
        zzhb zzhbVar2 = zzgiVar.a;
        if (zzhbVar == null && zzhbVar2 == null) {
            return b().equals(zzgiVar.b());
        }
        if (zzhbVar != null && zzhbVar2 != null) {
            return zzhbVar.equals(zzhbVar2);
        }
        if (zzhbVar != null) {
            zzgiVar.c(zzhbVar.zzl());
            return zzhbVar.equals(zzgiVar.a);
        }
        c(zzhbVar2.zzl());
        return this.a.equals(zzhbVar2);
    }
}
