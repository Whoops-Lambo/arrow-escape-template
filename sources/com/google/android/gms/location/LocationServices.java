package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.location.zzaf;
import com.google.android.gms.internal.location.zzz;
import defpackage.jy3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class LocationServices {
    public static final Api a;
    public static final Api.ClientKey b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        b = clientKey;
        a = new Api("LocationServices.API", new jy3(), clientKey);
        new zzz();
        new zzaf();
        new com.google.android.gms.internal.location.zzbi();
    }

    private LocationServices() {
    }
}
