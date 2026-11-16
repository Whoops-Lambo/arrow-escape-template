package com.google.android.recaptcha.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import defpackage.h50;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzjh {
    private boolean zza;
    private long zzb;
    private long zzc;

    public static zzjh zzb() {
        zzjh zzjhVar = new zzjh();
        zzjhVar.zze();
        return zzjhVar;
    }

    public static zzjh zzc() {
        return new zzjh();
    }

    private final long zzg() {
        return this.zza ? (System.nanoTime() - this.zzc) + this.zzb : this.zzb;
    }

    public final zzjh zzd() {
        this.zzb = 0L;
        this.zza = false;
        return this;
    }

    public final zzjh zze() {
        zzjf.zze(!this.zza, "This stopwatch is already running.");
        this.zza = true;
        this.zzc = System.nanoTime();
        return this;
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long jZzg = zzg();
        long j = jZzg / 86400000000000L;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (j > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (jZzg / 3600000000000L > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (jZzg / 60000000000L > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (jZzg / 1000000000 > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (jZzg / 1000000 > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (jZzg / 1000 > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = timeUnit2;
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jZzg / timeUnit2.convert(1L, timeUnit)));
        switch (zzjg.zza[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = CmcdData.STREAMING_FORMAT_HLS;
                break;
            case 7:
                str = "d";
                break;
            default:
                y.o();
                return null;
        }
        return h50.i(str2, " ", str);
    }

    public final long zza(TimeUnit timeUnit) {
        return timeUnit.convert(zzg(), TimeUnit.NANOSECONDS);
    }

    public final zzjh zzf() {
        long jNanoTime = System.nanoTime();
        zzjf.zze(this.zza, "This stopwatch is already stopped.");
        this.zza = false;
        this.zzb = (jNanoTime - this.zzc) + this.zzb;
        return this;
    }
}
