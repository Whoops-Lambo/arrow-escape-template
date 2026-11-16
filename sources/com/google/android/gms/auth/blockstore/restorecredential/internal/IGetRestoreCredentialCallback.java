package com.google.android.gms.auth.blockstore.restorecredential.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.auth_blockstore.zzb;
import com.google.android.gms.internal.auth_blockstore.zzc;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface IGetRestoreCredentialCallback extends IInterface {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class Stub extends zzb implements IGetRestoreCredentialCallback {
        @Override // com.google.android.gms.internal.auth_blockstore.zzb
        public final boolean r(int i, Parcel parcel) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) zzc.a(parcel, Status.CREATOR);
            GetRestoreCredentialResponse getRestoreCredentialResponse = (GetRestoreCredentialResponse) zzc.a(parcel, GetRestoreCredentialResponse.CREATOR);
            zzb.z1(parcel);
            status.getClass();
            getRestoreCredentialResponse.getClass();
            TaskUtil.setResultOrApiException(status, getRestoreCredentialResponse, (TaskCompletionSource<GetRestoreCredentialResponse>) ((InternalRestoreCredentialClient$getRestoreCredential$1$callback$1) this).a);
            return true;
        }

        public Stub() {
            super("com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback");
        }
    }
}
