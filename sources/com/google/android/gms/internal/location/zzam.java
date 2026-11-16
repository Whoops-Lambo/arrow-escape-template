package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.location.LocationAvailability;
import defpackage.bc5;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public interface zzam extends IInterface {
    void E(zzbc zzbcVar);

    void E1(boolean z);

    LocationAvailability W2(String str);

    void o2(bc5 bc5Var);

    void p2(Location location);

    Location zzm();

    Location zzn(String str);
}
