package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzgwo;
import defpackage.xp4;
import defpackage.y94;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class zzo {
    protected static final zzgwo zzb = new zzgwo(new y94(10));

    public static void zzd(String str) {
        if (!zzm(3)) {
            return;
        }
        if (str.length() <= 4000) {
            Log.d("Ads", str);
            return;
        }
        zzgwo zzgwoVar = zzb;
        zzgwoVar.getClass();
        Iterator itG = zzgwoVar.c.g(zzgwoVar, str);
        boolean z = true;
        while (true) {
            xp4 xp4Var = (xp4) itG;
            if (!xp4Var.hasNext()) {
                return;
            }
            String str2 = (String) xp4Var.next();
            if (z) {
                Log.d("Ads", str2);
            } else {
                Log.d("Ads-cont", str2);
            }
            z = false;
        }
    }

    public static void zze(String str, Throwable th) {
        if (zzm(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void zzf(String str) {
        if (!zzm(6)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.e("Ads", str);
            return;
        }
        zzgwo zzgwoVar = zzb;
        zzgwoVar.getClass();
        Iterator itG = zzgwoVar.c.g(zzgwoVar, str);
        boolean z = true;
        while (true) {
            xp4 xp4Var = (xp4) itG;
            if (!xp4Var.hasNext()) {
                return;
            }
            String str2 = (String) xp4Var.next();
            if (z) {
                Log.e("Ads", str2);
            } else {
                Log.e("Ads-cont", str2);
            }
            z = false;
        }
    }

    public static void zzg(String str, Throwable th) {
        if (zzm(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void zzh(String str) {
        if (!zzm(4)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.i("Ads", str);
            return;
        }
        zzgwo zzgwoVar = zzb;
        zzgwoVar.getClass();
        Iterator itG = zzgwoVar.c.g(zzgwoVar, str);
        boolean z = true;
        while (true) {
            xp4 xp4Var = (xp4) itG;
            if (!xp4Var.hasNext()) {
                return;
            }
            String str2 = (String) xp4Var.next();
            if (z) {
                Log.i("Ads", str2);
            } else {
                Log.i("Ads-cont", str2);
            }
            z = false;
        }
    }

    public static void zzi(String str) {
        if (!zzm(5)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.w("Ads", str);
            return;
        }
        zzgwo zzgwoVar = zzb;
        zzgwoVar.getClass();
        Iterator itG = zzgwoVar.c.g(zzgwoVar, str);
        boolean z = true;
        while (true) {
            xp4 xp4Var = (xp4) itG;
            if (!xp4Var.hasNext()) {
                return;
            }
            String str2 = (String) xp4Var.next();
            if (z) {
                Log.w("Ads", str2);
            } else {
                Log.w("Ads-cont", str2);
            }
            z = false;
        }
    }

    public static void zzj(String str, Throwable th) {
        if (zzm(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void zzl(String str, @Nullable Throwable th) {
        if (zzm(5)) {
            if (th != null) {
                zzj(zzk(str), th);
            } else {
                zzi(zzk(str));
            }
        }
    }

    public static boolean zzm(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }

    @VisibleForTesting
    public static String zzk(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length >= 4) {
            int lineNumber = stackTrace[3].getLineNumber();
            StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(lineNumber).length());
            sb.append(str);
            sb.append(" @");
            sb.append(lineNumber);
            return sb.toString();
        }
        return str;
    }
}
