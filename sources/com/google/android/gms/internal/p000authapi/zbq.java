package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.tj3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zbq extends zbb implements zbr {
    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zbc.a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) zbc.a(parcel, PendingIntent.CREATOR);
        zbc.b(parcel);
        TaskUtil.setResultOrApiException(status, pendingIntent, (TaskCompletionSource<PendingIntent>) ((tj3) this).a);
        return true;
    }

    public zbq() {
        super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback");
    }
}
