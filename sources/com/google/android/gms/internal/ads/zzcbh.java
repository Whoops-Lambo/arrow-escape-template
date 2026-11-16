package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzcbh extends zzbfg implements zzcbi {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzh().d("FlagsAccessedBeforeInitialized", new m(null));
        parcel2.writeNoException();
        return true;
    }

    public zzcbh() {
        super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
    }
}
