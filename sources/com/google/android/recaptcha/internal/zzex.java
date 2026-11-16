package com.google.android.recaptcha.internal;

import defpackage.e80;
import java.net.HttpURLConnection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzex {

    @NotNull
    private final zzfm zza;

    public /* synthetic */ zzex(zzfm zzfmVar, int i, e80 e80Var) {
        this.zza = new zzfm();
    }

    @NotNull
    public final zzew zza(@NotNull String str) throws zzbd {
        try {
            HttpURLConnection httpURLConnectionZza = this.zza.zza(str);
            httpURLConnectionZza.setRequestMethod("POST");
            httpURLConnectionZza.setDoOutput(true);
            httpURLConnectionZza.setRequestProperty("Content-Type", "application/x-protobuffer");
            return new zzew(httpURLConnectionZza);
        } catch (zzbd e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzc, zzba.zzai, e2.getMessage());
        }
    }

    public zzex() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
