package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.R6;
import com.singular.sdk.internal.Constants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzevt implements zzfdt {
    public final zzfmj a;
    public final long b;
    public final long c;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfmj zzfmjVar = this.a;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfmjVar.d;
        bundle.putInt("http_timeout_millis", zzmVar.zzw);
        bundle.putString("slotname", zzfmjVar.g);
        int i = zzfmjVar.p.a;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i2 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        long j = this.b;
        bundle.putLong("start_signals_timestamp", j);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Bf)).booleanValue()) {
            bundle.putLong("tsi", j - this.c);
        }
        zzfmy.d(bundle, "is_sdk_preload", true, zzmVar.zzc());
        zzfmy.b(bundle, "prefetch_type", "zenith_v2", zzmVar.zzd());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j2 = zzmVar.zzb;
        String str = simpleDateFormat.format(new Date(j2));
        boolean z = false;
        zzfmy.b(bundle, "cust_age", str, j2 != -1);
        Bundle bundle2 = zzmVar.zzc;
        if (bundle2 != null) {
            bundle.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, bundle2);
        }
        int i3 = zzmVar.zzd;
        zzfmy.c(bundle, "cust_gender", i3, i3 != -1);
        List list = zzmVar.zze;
        if (list != null) {
            bundle.putStringArrayList("kw", new ArrayList<>(list));
        }
        int i4 = zzmVar.zzg;
        zzfmy.c(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzmVar.zzy);
        int i5 = zzmVar.zza;
        zzfmy.c(bundle, "d_imp_hdr", 1, i5 >= 2 && zzmVar.zzh);
        String str2 = zzmVar.zzi;
        zzfmy.b(bundle, "ppid", str2, i5 >= 2 && !TextUtils.isEmpty(str2));
        Location location = zzmVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", accuracy);
            bundle3.putLong(R6.s, (long) latitude);
            bundle3.putLong(Constants.LONG, (long) longitude);
            bundle3.putLong("time", time);
            bundle.putBundle("uule", bundle3);
        }
        zzfmy.e("url", bundle, zzmVar.zzl);
        List list2 = zzmVar.zzv;
        if (list2 != null) {
            bundle.putStringArrayList("neighboring_content_urls", new ArrayList<>(list2));
        }
        Bundle bundle4 = zzmVar.zzn;
        if (bundle4 != null) {
            bundle.putBundle("custom_targeting", bundle4);
        }
        List list3 = zzmVar.zzo;
        if (list3 != null) {
            bundle.putStringArrayList("category_exclusions", new ArrayList<>(list3));
        }
        zzfmy.e("request_agent", bundle, zzmVar.zzp);
        zzfmy.e("request_pkg", bundle, zzmVar.zzq);
        zzfmy.d(bundle, "is_designed_for_families", zzmVar.zzr, i5 >= 7);
        if (i5 >= 8) {
            int i6 = zzmVar.zzt;
            zzfmy.c(bundle, "tag_for_under_age_of_consent", i6, i6 != -1);
            zzfmy.e("max_ad_content_rating", bundle, zzmVar.zzu);
        }
        int i7 = zzmVar.zzB;
        zzfmy.c(bundle, "tfat", i7, i7 != -1);
        Bundle bundle5 = zzfmjVar.e;
        bundle.putInt("plcs", bundle5.getInt("plcs"));
        bundle.putInt("plbs", bundle5.getInt("plbs"));
        zzfmy.e("plid", bundle, bundle5.getString("plid"));
        if (zzfmjVar.v && (zzmVar.zzs != null || zzmVar.zzx != null)) {
            z = true;
        }
        zzfmy.c(bundle, "s2s_rr", 1, z);
    }

    public zzevt(zzfmj zzfmjVar, long j, long j2) {
        this.a = zzfmjVar;
        this.b = j;
        this.c = j2;
    }
}
