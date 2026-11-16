package com.google.android.gms.internal.measurement;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzaaq implements zzaai {
    public final Level a;
    public final Set b;
    public final zzzq c;

    private zzaaq() {
        this(Level.ALL, zzaas.f, zzaas.g);
    }

    @Override // com.google.android.gms.internal.measurement.zzaai
    public final zzzf zza(String str) {
        return new zzaas(str, this.a, this.b, this.c);
    }

    public zzaaq(Level level, Set set, zzzq zzzqVar) {
        this.a = level;
        this.b = set;
        this.c = zzzqVar;
    }
}
