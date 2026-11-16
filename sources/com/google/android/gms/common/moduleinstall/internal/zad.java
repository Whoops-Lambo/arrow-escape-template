package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zad extends com.google.android.gms.internal.base.zab implements zae {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Status status = (Status) com.google.android.gms.internal.base.zac.a(parcel, Status.CREATOR);
            ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) com.google.android.gms.internal.base.zac.a(parcel, ModuleAvailabilityResponse.CREATOR);
            com.google.android.gms.internal.base.zac.d(parcel);
            zab(status, moduleAvailabilityResponse);
        } else if (i == 2) {
            Status status2 = (Status) com.google.android.gms.internal.base.zac.a(parcel, Status.CREATOR);
            ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) com.google.android.gms.internal.base.zac.a(parcel, ModuleInstallResponse.CREATOR);
            com.google.android.gms.internal.base.zac.d(parcel);
            zac(status2, moduleInstallResponse);
        } else if (i == 3) {
            Status status3 = (Status) com.google.android.gms.internal.base.zac.a(parcel, Status.CREATOR);
            ModuleInstallIntentResponse moduleInstallIntentResponse = (ModuleInstallIntentResponse) com.google.android.gms.internal.base.zac.a(parcel, ModuleInstallIntentResponse.CREATOR);
            com.google.android.gms.internal.base.zac.d(parcel);
            zad(status3, moduleInstallIntentResponse);
        } else {
            if (i != 4) {
                return false;
            }
            Status status4 = (Status) com.google.android.gms.internal.base.zac.a(parcel, Status.CREATOR);
            com.google.android.gms.internal.base.zac.d(parcel);
            zae(status4);
        }
        return true;
    }

    public zad() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }
}
