package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.zzblu;
import com.google.android.gms.internal.ads.zzgwo;
import defpackage.xp4;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zze extends com.google.android.gms.ads.internal.util.client.zzo {
    public static final /* synthetic */ int zza = 0;

    public static boolean zzc() {
        return com.google.android.gms.ads.internal.util.client.zzo.zzm(2) && ((Boolean) zzblu.a.c()).booleanValue();
    }

    public static void zza(String str) {
        if (zzc()) {
            if (str != null && str.length() > 4000) {
                zzgwo zzgwoVar = com.google.android.gms.ads.internal.util.client.zzo.zzb;
                zzgwoVar.getClass();
                Iterator itG = zzgwoVar.c.g(zzgwoVar, str);
                boolean z = true;
                while (true) {
                    xp4 xp4Var = (xp4) itG;
                    if (xp4Var.hasNext()) {
                        String str2 = (String) xp4Var.next();
                        if (z) {
                            Log.v("Ads", str2);
                        } else {
                            Log.v("Ads-cont", str2);
                        }
                        z = false;
                    } else {
                        return;
                    }
                }
            } else {
                Log.v("Ads", str);
            }
        }
    }

    public static void zzb(String str, Throwable th) {
        if (zzc()) {
            Log.v("Ads", str, th);
        }
    }
}
