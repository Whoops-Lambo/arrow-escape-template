package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaException;
import defpackage.dy;
import defpackage.eu;
import defpackage.gd1;
import defpackage.kc2;
import defpackage.kk2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzff {

    @NotNull
    private final gd1 zza;

    @NotNull
    private final gd1 zzb;

    @NotNull
    private final gd1 zzc;

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) zzffVar.zza.getValue();
    }

    private final zzaq zzf() {
        return (zzaq) this.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) this.zzc.getValue();
    }

    @Nullable
    public final Object zzc(@NotNull String str, @NotNull zzto zztoVar, @NotNull dy dyVar) throws RecaptchaException {
        return kc2.j(new zzfb(this, str, zztoVar, null), dyVar);
    }

    public zzff() {
        int i = zzav.zza;
        this.zza = eu.w(zzfc.zza);
        this.zzb = eu.w(zzfd.zza);
        this.zzc = eu.w(zzfe.zza);
    }

    public static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, dy dyVar) throws Exception {
        try {
            String strZzl = zzscVar.zzl();
            String strZzM = zzscVar.zzM();
            zzaq zzaqVarZzf = zzffVar.zzf();
            String strZzb = null;
            if (zzaqVarZzf != null && zzaqVarZzf.zzd(strZzM)) {
                zzen zzenVarZzf = zzekVar.zzf(25);
                try {
                    String strZza = zzffVar.zzf().zza(strZzM);
                    if (strZza != null) {
                        zzenVarZzf.zza();
                        strZzb = strZza;
                    } else {
                        zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
                    }
                } catch (Exception e) {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzR, e.getMessage()));
                }
            }
            if (strZzb == null) {
                zzaq zzaqVarZzf2 = zzffVar.zzf();
                if (zzaqVarZzf2 != null) {
                    zzaqVarZzf2.zzb();
                }
                zzen zzenVarZzf2 = zzekVar.zzf(23);
                try {
                    strZzb = zzffVar.zzg().zzb(strZzl);
                    zzenVarZzf2.zza();
                    zzen zzenVarZzf3 = zzekVar.zzf(24);
                    try {
                        zzaq zzaqVarZzf3 = zzffVar.zzf();
                        if (zzaqVarZzf3 != null) {
                            zzaqVarZzf3.zzc(strZzM, strZzb);
                        }
                        zzenVarZzf3.zza();
                    } catch (Exception e2) {
                        zzenVarZzf3.zzb(new zzbd(zzbb.zzk, zzba.zzT, e2.getMessage()));
                    }
                } catch (zzbd e3) {
                    zzenVarZzf2.zzb(e3);
                    throw e3;
                }
            }
            return kk2.I(zzscVar.zzk(), "JAVASCRIPT_TAG", strZzb, false);
        } catch (Exception e4) {
            if (e4 instanceof zzbd) {
                throw e4;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e4.getMessage());
        }
    }

    @Nullable
    public final Object zzd(@NotNull zzsc zzscVar, @NotNull zzek zzekVar, @NotNull dy dyVar) throws zzbd {
        return zze(this, zzscVar, zzekVar, dyVar);
    }
}
