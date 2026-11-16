package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import defpackage.dt1;
import defpackage.qh1;
import defpackage.s71;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbd extends Exception {
    public static final /* synthetic */ int zza = 0;

    @NotNull
    private static final Map zzb;

    @NotNull
    private final zzbb zzc;

    @NotNull
    private final zzba zzd;

    @Nullable
    private final String zze;

    @NotNull
    private final Map zzf;

    static {
        dt1 dt1Var = new dt1(zztv.JS_NETWORK_ERROR, new zzbd(zzbb.zzc, zzba.zzd, null));
        zztv zztvVar = zztv.JS_INTERNAL_ERROR;
        zzbb zzbbVar = zzbb.zzb;
        zzb = qh1.Y(dt1Var, new dt1(zztvVar, new zzbd(zzbbVar, zzba.zzc, null)), new dt1(zztv.JS_INVALID_SITE_KEY, new zzbd(zzbb.zzd, zzba.zze, null)), new dt1(zztv.JS_INVALID_SITE_KEY_TYPE, new zzbd(zzbb.zze, zzba.zzf, null)), new dt1(zztv.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzbd(zzbb.zzf, zzba.zzg, null)), new dt1(zztv.JS_INVALID_ACTION, new zzbd(zzbb.zzg, zzba.zzh, null)), new dt1(zztv.JS_PROGRAM_ERROR, new zzbd(zzbbVar, zzba.zzj, null)));
    }

    @NotNull
    public final zzba zza() {
        return this.zzd;
    }

    @NotNull
    public final zzbb zzb() {
        return this.zzc;
    }

    @NotNull
    public final RecaptchaException zzc() {
        zzba zzbaVar = this.zzd;
        if (s71.b(zzbaVar, zzba.zzI)) {
            return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
        }
        if (s71.b(zzbaVar, zzba.zzao)) {
            return new RecaptchaException(RecaptchaErrorCode.NO_NETWORK_FOUND, null, 2, null);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzf.get(this.zzc);
        return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null) : recaptchaException;
    }

    @Nullable
    public final String zzd() {
        return this.zze;
    }

    public zzbd(@NotNull zzbb zzbbVar, @NotNull zzba zzbaVar, @Nullable String str) {
        this.zzc = zzbbVar;
        this.zzd = zzbaVar;
        this.zze = str;
        zzbb zzbbVar2 = zzbb.zzc;
        RecaptchaErrorCode recaptchaErrorCode = RecaptchaErrorCode.NETWORK_ERROR;
        this.zzf = qh1.Y(new dt1(zzbbVar2, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new dt1(zzbb.zzh, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new dt1(zzbb.zzi, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new dt1(zzbb.zzd, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), new dt1(zzbb.zze, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), new dt1(zzbb.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), new dt1(zzbb.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), new dt1(zzbb.zzb, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)), new dt1(zzbb.zzj, new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null)));
    }
}
