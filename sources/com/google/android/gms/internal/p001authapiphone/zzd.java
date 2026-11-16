package com.google.android.gms.internal.p001authapiphone;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.m55;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzd extends zzb implements zze {
    @Override // com.google.android.gms.internal.p001authapiphone.zzb
    public final boolean r(int i, Parcel parcel) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i2 = zzc.a;
        Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        int i3 = parcel.readInt();
        zzc.a(parcel);
        TaskUtil.setResultOrApiException(statusCreateFromParcel, Integer.valueOf(i3), (TaskCompletionSource<Integer>) ((m55) this).a);
        return true;
    }

    public zzd() {
        super("com.google.android.gms.auth.api.phone.internal.IAutofillPermissionStateCallback");
    }
}
