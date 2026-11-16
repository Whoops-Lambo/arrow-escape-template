package com.google.android.gms.dynamite;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import defpackage.rl3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzp extends zza implements IInterface {
    public final IObjectWrapper A1(ObjectWrapper objectWrapper, String str, int i, ObjectWrapper objectWrapper2) {
        Parcel parcelZza = zza();
        zzc.d(parcelZza, objectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        zzc.d(parcelZza, objectWrapper2);
        return rl3.h(zzB(8, parcelZza));
    }

    public final IObjectWrapper r(ObjectWrapper objectWrapper, String str, int i) {
        Parcel parcelZza = zza();
        zzc.d(parcelZza, objectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        return rl3.h(zzB(2, parcelZza));
    }

    public final IObjectWrapper z1(ObjectWrapper objectWrapper, String str, int i) {
        Parcel parcelZza = zza();
        zzc.d(parcelZza, objectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        return rl3.h(zzB(4, parcelZza));
    }
}
