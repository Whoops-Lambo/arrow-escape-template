package com.google.android.gms.internal.nearby;

import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzkd extends zza implements IInterface {
    public final void w3(zzmk zzmkVar) {
        Parcel parcelR = r();
        ClassLoader classLoader = zzc.a;
        parcelR.writeInt(1);
        zzmkVar.writeToParcel(parcelR, 0);
        z1(2005, parcelR);
    }
}
