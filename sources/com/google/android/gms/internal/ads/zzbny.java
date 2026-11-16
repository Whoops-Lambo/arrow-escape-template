package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbny {
    public final zzbnx a;

    public zzbny(zzbnx zzbnxVar) {
        Context context;
        this.a = zzbnxVar;
        try {
            context = (Context) ObjectWrapper.z1(zzbnxVar.zzm());
        } catch (RemoteException | NullPointerException e) {
            zzo.zzg("", e);
            context = null;
        }
        if (context != null) {
            try {
                this.a.S1(new ObjectWrapper(new MediaView(context)));
            } catch (RemoteException e2) {
                zzo.zzg("", e2);
            }
        }
    }
}
