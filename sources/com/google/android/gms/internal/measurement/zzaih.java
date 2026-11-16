package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzaih implements zzaig {
    public static final zzpo a = new zzpo(zzagr.c, 11);

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzc() {
        return ((Boolean) a.a(2, "measurement.rb.attribution.service.trigger_uris_high_priority", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzd() {
        return ((Boolean) a.a(4, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zze() {
        return ((Boolean) a.a(6, "measurement.rb.attribution.service", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzf() {
        return ((Boolean) a.a(7, "measurement.rb.attribution.enable_trigger_redaction", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzb() {
        return ((Boolean) a.a(1, "measurement.rb.attribution.client2", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzg() {
        return ((Boolean) a.a(8, "measurement.rb.attribution.uuid_generation", true).get()).booleanValue();
    }
}
