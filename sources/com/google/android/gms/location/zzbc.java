package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzc;
import defpackage.aw3;
import defpackage.sv3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzbc extends com.google.android.gms.internal.location.zzb implements zzbd {
    public static final /* synthetic */ int a = 0;

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean r(int i, Parcel parcel) {
        if (i != 1) {
            return false;
        }
        Location location = (Location) zzc.a(parcel, Location.CREATOR);
        aw3 aw3Var = (aw3) this;
        synchronized (aw3Var) {
            aw3Var.b.notifyListener(new sv3(location));
        }
        return true;
    }

    public zzbc() {
        super("com.google.android.gms.location.ILocationListener");
    }
}
