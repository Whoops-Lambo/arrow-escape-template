package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.bk3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zbi extends zbb implements zbj {
    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zbc.a(parcel, Status.CREATOR);
        AuthorizationResult authorizationResult = (AuthorizationResult) zbc.a(parcel, AuthorizationResult.CREATOR);
        zbc.b(parcel);
        boolean zIsSuccess = status.isSuccess();
        TaskCompletionSource taskCompletionSource = ((bk3) this).a;
        if (zIsSuccess) {
            taskCompletionSource.setResult(authorizationResult);
            return true;
        }
        taskCompletionSource.setException(ApiExceptionUtil.fromStatus(status));
        return true;
    }

    public zbi() {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
    }
}
