package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zak extends com.google.android.gms.internal.base.zaa implements IInterface {
    public zak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
    }

    public final void zae(com.google.android.gms.common.internal.zab zabVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.b(parcelZaa, zabVar);
        zad(1, parcelZaa);
    }
}
