package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbiw;
import com.google.android.gms.internal.ads.zzcly;
import com.google.android.gms.internal.ads.zzcmj;
import com.google.android.gms.internal.ads.zzemc;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class zzz {
    @Nullable
    public CookieManager zza(Context context) {
        throw null;
    }

    public zzcmj zzb(zzcly zzclyVar, zzbiq zzbiqVar, boolean z, @Nullable zzemc zzemcVar) {
        throw null;
    }

    public WebResourceResponse zzc(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        throw null;
    }

    public void zze(Context context, String str, String str2) {
    }

    public boolean zzf(Context context, String str) {
        return false;
    }

    public void zzh(Activity activity) {
    }

    public int zzi(AudioManager audioManager) {
        return 0;
    }

    public zzbiw.zzq zzd(Context context, TelephonyManager telephonyManager) {
        return zzbiw.zzq.ENUM_UNKNOWN;
    }

    @Nullable
    public Intent zzg(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public int zzk(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    public /* synthetic */ zzz(byte[] bArr) {
    }
}
