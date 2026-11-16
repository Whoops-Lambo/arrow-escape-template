package com.google.android.gms.games;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class AnnotatedData<T> {

    @Nullable
    private final Object zza;
    private final boolean zzb;

    @Nullable
    public T get() {
        return (T) this.zza;
    }

    public boolean isStale() {
        return this.zzb;
    }

    public AnnotatedData(@Nullable Object obj, boolean z) {
        this.zza = obj;
        this.zzb = z;
    }
}
