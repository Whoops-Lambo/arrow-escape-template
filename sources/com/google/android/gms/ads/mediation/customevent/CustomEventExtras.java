package com.google.android.gms.ads.mediation.customevent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public final class CustomEventExtras {
    private final HashMap zza = new HashMap();

    @Nullable
    public Object getExtra(@NonNull String str) {
        return this.zza.get(str);
    }

    public void setExtra(@NonNull String str, @NonNull Object obj) {
        this.zza.put(str, obj);
    }
}
