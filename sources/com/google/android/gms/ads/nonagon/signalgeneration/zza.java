package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzblx;
import com.google.android.gms.internal.ads.zzgzl;
import com.singular.sdk.internal.Constants;
import defpackage.gr4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zza {
    private final Context zza;

    @Nullable
    private final ApplicationInfo zzb;
    private final List zzc;
    private final VersionInfoParcel zzd;
    private final JSONObject zze = new JSONObject();
    private final AtomicBoolean zzf = new AtomicBoolean(false);

    public final void zza(@Nullable WebView webView) {
        if (this.zzf.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfo = null;
        try {
            ApplicationInfo applicationInfo = this.zzb;
            if (applicationInfo != null) {
                packageInfo = Wrappers.packageManager(this.zza).getPackageInfo(applicationInfo.packageName, 0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo != null) {
            try {
                JSONObject jSONObject = this.zze;
                jSONObject.put("vc", packageInfo.versionCode);
                jSONObject.put("vnm", packageInfo.versionName);
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzt.zzh().d("PawAppSignalGenerator.initialize", e);
            }
        }
        ApplicationInfo applicationInfo2 = this.zzb;
        if (applicationInfo2 != null) {
            this.zze.put(Constants.REVENUE_PRODUCT_NAME_KEY, applicationInfo2.packageName);
        }
        JSONObject jSONObject2 = this.zze;
        List list = this.zzc;
        ArrayList arrayList = new ArrayList();
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Bb)).split(",", -1)) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        jSONObject2.put("eid", arrayList);
        jSONObject2.put("js", this.zzd.afmaVersion);
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject2.get(next);
            if (obj != null) {
                jSONObject2.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((Boolean) zzblx.b.c()).booleanValue() && WebViewFeature.a("DOCUMENT_START_SCRIPT") && webView != null) {
            String str2 = String.format(Locale.getDefault(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ab), zzb());
            int i = zzgzl.c;
            WebViewCompat.a(webView, str2, new gr4("*"));
        }
    }

    public final JSONObject zzb() {
        if (!this.zzf.get()) {
            zza(null);
        }
        return this.zze;
    }

    public zza(Context context, zzbjb zzbjbVar, List list, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = context.getApplicationInfo();
        this.zzc = list;
        this.zzd = versionInfoParcel;
    }
}
