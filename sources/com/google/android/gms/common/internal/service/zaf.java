package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class zaf extends zaa {
    private final BaseImplementation.ResultHolder zaa;

    @Override // com.google.android.gms.common.internal.service.zaa, com.google.android.gms.common.internal.service.zao
    public final void zab(int i) throws RemoteException {
        this.zaa.setResult(new Status(i));
    }

    public zaf(BaseImplementation.ResultHolder resultHolder) {
        this.zaa = resultHolder;
    }
}
