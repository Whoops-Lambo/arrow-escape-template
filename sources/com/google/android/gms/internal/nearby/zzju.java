package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import defpackage.ej4;
import defpackage.fi4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzju extends zzb implements zzjv {
    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        int i2 = 0;
        int i3 = 2;
        if (i == 2) {
            zzks zzksVar = (zzks) zzc.a(parcel, zzks.CREATOR);
            zzc.b(parcel);
            ej4 ej4Var = (ej4) this;
            synchronized (ej4Var) {
                ej4Var.b.add(zzksVar.a);
                ej4Var.a.notifyListener(new fi4(zzksVar, i2));
            }
            return true;
        }
        int i4 = 3;
        if (i == 3) {
            zzky zzkyVar = (zzky) zzc.a(parcel, zzky.CREATOR);
            zzc.b(parcel);
            ej4 ej4Var2 = (ej4) this;
            synchronized (ej4Var2) {
                try {
                    ej4Var2.b.remove(zzkyVar.a);
                    Status statusB = zzgy.b(zzkyVar.b);
                    if (statusB.isSuccess()) {
                        ej4Var2.c.add(zzkyVar.a);
                    }
                    ej4Var2.a.notifyListener(new fi4(zzkyVar, statusB));
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i != 4) {
            if (i != 5) {
                return false;
            }
            zzkq zzkqVar = (zzkq) zzc.a(parcel, zzkq.CREATOR);
            zzc.b(parcel);
            ((ej4) this).a.notifyListener(new fi4(zzkqVar, i4));
            return true;
        }
        zzla zzlaVar = (zzla) zzc.a(parcel, zzla.CREATOR);
        zzc.b(parcel);
        ej4 ej4Var3 = (ej4) this;
        synchronized (ej4Var3) {
            ej4Var3.c.remove(zzlaVar.a);
            ej4Var3.a.notifyListener(new fi4(zzlaVar, i3));
        }
        return true;
    }

    public zzju() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
    }
}
