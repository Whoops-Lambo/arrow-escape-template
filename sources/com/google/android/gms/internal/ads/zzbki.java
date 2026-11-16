package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.rl3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzbki extends zzbfg implements zzbkj {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(((zzbkh) this).b);
            return true;
        }
        if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(((zzbkh) this).c);
            return true;
        }
        if (i == 3) {
            IObjectWrapper iObjectWrapperI = rl3.i(parcel, parcel);
            zzbkh zzbkhVar = (zzbkh) this;
            if (iObjectWrapperI != null) {
                zzbkhVar.a.zza((View) ObjectWrapper.z1(iObjectWrapperI));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            ((zzbkh) this).a.mo1397zzb();
            parcel2.writeNoException();
            return true;
        }
        if (i != 5) {
            return false;
        }
        ((zzbkh) this).a.zzc();
        parcel2.writeNoException();
        return true;
    }

    public zzbki() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }
}
