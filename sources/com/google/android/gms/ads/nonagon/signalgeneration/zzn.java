package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
final class zzn extends LinkedHashMap {
    final /* synthetic */ zzq zza;

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        zzq zzqVar = this.zza;
        synchronized (zzqVar) {
            try {
                if (size() <= zzqVar.zzg()) {
                    return false;
                }
                zzqVar.zzh().add(new Pair((String) entry.getKey(), ((zzo) entry.getValue()).zzb));
                return size() > zzqVar.zzg();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzn(zzq zzqVar) {
        Objects.requireNonNull(zzqVar);
        this.zza = zzqVar;
    }
}
