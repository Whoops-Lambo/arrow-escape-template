package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import defpackage.el4;
import defpackage.fi4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzkb extends zzb implements zzkc {
    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        String str;
        int i2 = 5;
        boolean z = false;
        if (i == 2) {
            zzle zzleVar = (zzle) zzc.a(parcel, zzle.CREATOR);
            zzc.b(parcel);
            el4 el4Var = (el4) this;
            synchronized (el4Var) {
                try {
                    if (zzleVar.d != null && ((str = zzleVar.a) == null || "__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(str))) {
                        z = true;
                    }
                    if (!z) {
                        el4Var.b.add(zzleVar.a);
                    }
                    el4Var.a.notifyListener(new fi4(zzleVar, i2));
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i != 3) {
            int i3 = 4;
            if (i == 4) {
                zzc.b(parcel);
            } else {
                if (i != 5) {
                    return false;
                }
                zzlc zzlcVar = (zzlc) zzc.a(parcel, zzlc.CREATOR);
                zzc.b(parcel);
                el4 el4Var2 = (el4) this;
                synchronized (el4Var2) {
                    el4Var2.a.notifyListener(new fi4(zzlcVar, i3));
                }
            }
        } else {
            zzlg zzlgVar = (zzlg) zzc.a(parcel, zzlg.CREATOR);
            zzc.b(parcel);
            el4 el4Var3 = (el4) this;
            synchronized (el4Var3) {
                el4Var3.b.remove(zzlgVar.a);
                el4Var3.a.notifyListener(new fi4(zzlgVar, 6));
            }
        }
        return true;
    }

    public zzkb() {
        super("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
    }
}
