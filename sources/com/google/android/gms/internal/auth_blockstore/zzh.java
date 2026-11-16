package com.google.android.gms.internal.auth_blockstore;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.ac5;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzh extends zzb implements zzi {
    @Override // com.google.android.gms.internal.auth_blockstore.zzb
    public final boolean r(int i, Parcel parcel) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zzc.a(parcel, Status.CREATOR);
        boolean z = parcel.readInt() != 0;
        zzb.z1(parcel);
        TaskUtil.setResultOrApiException(status, Boolean.valueOf(z), (TaskCompletionSource<Boolean>) ((ac5) this).a);
        return true;
    }

    public zzh() {
        super("com.google.android.gms.auth.blockstore.internal.IDeleteBytesCallback");
    }
}
