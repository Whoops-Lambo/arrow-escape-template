package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzexd implements zzfdt {
    public final ArrayList a;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            bundle.putStringArrayList("android_permissions", new ArrayList<>(arrayList));
        }
    }

    public zzexd(ArrayList arrayList) {
        this.a = arrayList;
    }
}
