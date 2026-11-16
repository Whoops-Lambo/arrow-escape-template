package com.google.android.gms.location;

import android.os.Parcel;
import defpackage.cv3;
import defpackage.gu3;
import defpackage.xu3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzaz extends com.google.android.gms.internal.location.zzb implements zzba {
    public static final /* synthetic */ int a = 0;

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean r(int i, Parcel parcel) {
        if (i == 1) {
            ((cv3) this).b.notifyListener(new gu3());
            return true;
        }
        if (i != 2) {
            return false;
        }
        ((cv3) this).b.notifyListener(new xu3());
        return true;
    }

    public zzaz() {
        super("com.google.android.gms.location.ILocationCallback");
    }
}
