package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface zzfrj {
    zzfrj c(zzfma zzfmaVar);

    zzfrj d(int i);

    zzfrj e(Throwable th);

    zzfrj f(com.google.android.gms.ads.internal.client.zze zzeVar);

    zzfrj g(zzfry zzfryVar);

    zzfrj zza();

    boolean zzb();

    zzfrj zzc();

    zzfrj zzd(boolean z);

    zzfrj zze(String str);

    zzfrj zzi(String str);

    zzfrj zzk(String str);

    boolean zzl();

    zzfrm zzm();

    static zzfrj a(Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        boolean zMatches;
        zzfrj zzfrjVarB = b(context, i);
        if (zzfrjVarB instanceof zzfrl) {
            zzfrl zzfrlVar = (zzfrl) zzfrjVarB;
            zzfrlVar.h();
            zzfrlVar.d(i2);
            zzfrlVar.g(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.pa), str);
            }
            if (zMatches) {
                zzfrlVar.zze(str);
            }
        }
        return zzfrjVarB;
    }

    static zzfrj b(Context context, int i) {
        boolean zBooleanValue;
        if (zzfrw.a()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                if (i2 != 110) {
                    switch (i2) {
                        case 2:
                        case 3:
                        case 6:
                        case 7:
                        case 8:
                            zBooleanValue = ((Boolean) zzbll.c.c()).booleanValue();
                            break;
                        case 4:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            zBooleanValue = ((Boolean) zzbll.d.c()).booleanValue();
                            break;
                        case 5:
                            zBooleanValue = ((Boolean) zzbll.b.c()).booleanValue();
                            break;
                    }
                } else {
                    zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.xa)).booleanValue();
                }
            } else {
                zBooleanValue = ((Boolean) zzbll.e.c()).booleanValue();
            }
            if (zBooleanValue) {
                return new zzfrl(context, i);
            }
        }
        return new zzfso();
    }
}
