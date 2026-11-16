package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzbwo extends zzbfg implements zzbwp {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            IObjectWrapper iObjectWrapperZze = ((zzbxi) this).zze();
            parcel2.writeNoException();
            zzbfh.e(parcel2, iObjectWrapperZze);
            return true;
        }
        if (i != 2) {
            return false;
        }
        boolean zShouldDelegateInterscrollerEffect = ((zzbxi) this).a.shouldDelegateInterscrollerEffect();
        parcel2.writeNoException();
        ClassLoader classLoader = zzbfh.a;
        parcel2.writeInt(zShouldDelegateInterscrollerEffect ? 1 : 0);
        return true;
    }

    public zzbwo() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }
}
