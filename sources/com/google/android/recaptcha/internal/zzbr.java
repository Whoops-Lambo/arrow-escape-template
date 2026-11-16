package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbr {

    @NotNull
    private final String zza;

    @NotNull
    private final String zzb;

    @NotNull
    private final String zzc;

    @NotNull
    private final String zzd;

    @NotNull
    public final String zza() {
        return this.zza;
    }

    @NotNull
    public final String zzb() {
        return this.zzb;
    }

    @NotNull
    public final String zzc() {
        return this.zzc;
    }

    @NotNull
    public final String zzd() {
        return this.zzd;
    }

    public zzbr(@NotNull String str) {
        this.zza = "https://www.recaptcha.net/recaptcha/api3";
        this.zzb = "https://www.recaptcha.net/recaptcha/api3".concat("/mri");
        this.zzc = "https://www.recaptcha.net/recaptcha/api3".concat("/mlg");
        this.zzd = "https://www.recaptcha.net/recaptcha/api3".concat("/mrr");
    }

    public zzbr() {
        this("https://www.recaptcha.net/recaptcha/api3");
    }
}
