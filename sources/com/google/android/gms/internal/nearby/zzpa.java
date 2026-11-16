package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.f75;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzpa extends zzb implements zzpb {
    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        String statusCodeString;
        if (i != 2) {
            return false;
        }
        int i2 = parcel.readInt();
        zzc.b(parcel);
        TaskCompletionSource taskCompletionSource = ((f75) this).a;
        if (i2 == 42004) {
            taskCompletionSource.setException(new SecurityException("Missing UWB_RANGING permission"));
            return true;
        }
        if (i2 == 0) {
            taskCompletionSource.setResult(null);
            return true;
        }
        switch (i2) {
            case 42000:
                statusCodeString = "SERVICE_NOT_AVAILABLE";
                break;
            case 42001:
                statusCodeString = "NULL_RANGING_DEVICE";
                break;
            case 42002:
                statusCodeString = "INVALID_API_CALL";
                break;
            case 42003:
                statusCodeString = "RANGING_ALREADY_STARTED";
                break;
            case 42004:
                statusCodeString = "MISSING_PERMISSION_UWB_RANGING";
                break;
            case 42005:
                statusCodeString = "UWB_SYSTEM_CALLBACK_FAILURE";
                break;
            default:
                statusCodeString = CommonStatusCodes.getStatusCodeString(i2);
                break;
        }
        taskCompletionSource.setException(new ApiException(new Status(i2, statusCodeString)));
        return true;
    }

    public zzpa() {
        super("com.google.android.gms.nearby.uwb.internal.IResultListener");
    }
}
