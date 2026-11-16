package com.google.android.gms.internal.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.m45;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zze extends zzb implements zzf {
    @Override // com.google.android.gms.internal.appset.zzb
    public final boolean r(int i, Parcel parcel) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i2 = zzc.a;
        Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        com.google.android.gms.appset.zzc zzcVarCreateFromParcel = parcel.readInt() == 0 ? null : com.google.android.gms.appset.zzc.CREATOR.createFromParcel(parcel);
        TaskUtil.setResultOrApiException(statusCreateFromParcel, zzcVarCreateFromParcel != null ? new AppSetIdInfo(zzcVarCreateFromParcel.zzb(), zzcVarCreateFromParcel.zza()) : null, (TaskCompletionSource<AppSetIdInfo>) ((m45) this).a);
        return true;
    }

    public zze() {
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }
}
