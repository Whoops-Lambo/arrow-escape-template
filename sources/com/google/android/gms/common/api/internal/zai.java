package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zai {
    public final int zac;

    public abstract void zad(@NonNull Status status);

    public abstract void zae(@NonNull Exception exc);

    public abstract void zaf(@NonNull zaaa zaaaVar, boolean z);

    public abstract void zag(zabk zabkVar) throws DeadObjectException;

    public static /* synthetic */ Status zai(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public zai(int i) {
        this.zac = i;
    }
}
