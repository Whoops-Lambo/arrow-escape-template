package com.google.android.gms.internal.games_v2;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzae {
    public final int b;
    public int c = -1;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public IBinder a = null;

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("popupLocationInfo.gravity", this.b);
        bundle.putInt("popupLocationInfo.displayId", this.c);
        bundle.putInt("popupLocationInfo.left", this.d);
        bundle.putInt("popupLocationInfo.top", this.e);
        bundle.putInt("popupLocationInfo.right", this.f);
        bundle.putInt("popupLocationInfo.bottom", this.g);
        return bundle;
    }

    public zzae(int i) {
        this.b = i;
    }
}
