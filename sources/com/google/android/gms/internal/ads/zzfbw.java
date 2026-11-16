package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.C4664b4;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfbw implements zzfdt {
    public final zzfmj a;
    public final PackageInfo b;
    public final com.google.android.gms.ads.internal.util.zzg c;

    /* JADX WARN: Code duplicated, block: B:67:0x00ea  */
    @Override // com.google.android.gms.internal.ads.zzfdt
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONArray jSONArrayOptJSONArray;
        String str;
        zzfmj zzfmjVar = this.a;
        ArrayList<String> arrayList = zzfmjVar.h;
        Bundle bundle = (Bundle) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            bundle.putInt("native_version", 0);
            return;
        }
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", zzfmjVar.i);
        zzbmv zzbmvVar = zzfmjVar.j;
        if (zzbmvVar != null) {
            String str2 = "any";
            if (zzbmvVar.a > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i = zzbmvVar.h;
                if (i == 1) {
                    str = "any";
                } else if (i == 2) {
                    str = C4664b4.i.C;
                } else if (i != 3) {
                    str = i != 4 ? "unknown" : "square";
                } else {
                    str = C4664b4.i.D;
                }
                if (!"unknown".equals(str)) {
                    bundle.putString("native_media_orientation", str);
                }
            }
            int i2 = zzbmvVar.c;
            if (i2 != 0) {
                if (i2 != 1) {
                    str2 = i2 != 2 ? "unknown" : C4664b4.i.C;
                } else {
                    str2 = C4664b4.i.D;
                }
            }
            if (!"unknown".equals(str2)) {
                bundle.putString("native_image_orientation", str2);
            }
            bundle.putBoolean("native_multiple_images", zzbmvVar.d);
            bundle.putBoolean("use_custom_mute", zzbmvVar.g);
            int i3 = zzbmvVar.i;
            if (i3 != 0) {
                bundle.putBoolean("sccg_tap", zzbmvVar.j);
                bundle.putInt("sccg_dir", i3);
            }
        }
        PackageInfo packageInfo = this.b;
        int i4 = packageInfo != null ? packageInfo.versionCode : 0;
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.c;
        if (i4 > zzgVar.zzg()) {
            zzgVar.zzt();
            zzgVar.zzf(i4);
        }
        JSONObject jSONObjectZzs = zzgVar.zzs();
        String string = null;
        if (jSONObjectZzs != null && (jSONArrayOptJSONArray = jSONObjectZzs.optJSONArray(zzfmjVar.g)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i5 = zzfmjVar.l;
        if (i5 > 1) {
            bundle.putInt("max_num_ads", i5);
        }
        zzbtf zzbtfVar = zzfmjVar.b;
        if (zzbtfVar != null) {
            String str3 = zzbtfVar.c;
            if (TextUtils.isEmpty(str3)) {
                String str4 = "p";
                if (zzbtfVar.a >= 2) {
                    int i6 = zzbtfVar.d;
                    if (i6 == 2 || i6 != 3) {
                        str4 = CmcdData.STREAM_TYPE_LIVE;
                    }
                } else {
                    int i7 = zzbtfVar.b;
                    if (i7 == 1) {
                        str4 = CmcdData.STREAM_TYPE_LIVE;
                    } else if (i7 != 2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 41);
                        sb.append("Instream ad video aspect ratio ");
                        sb.append(i7);
                        sb.append(" is wrong.");
                        zzo.zzf(sb.toString());
                        str4 = CmcdData.STREAM_TYPE_LIVE;
                    }
                }
                bundle.putString("ia_var", str4);
            } else {
                bundle.putString("ad_tag", str3);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Kd)).booleanValue() || zzbmvVar == null) {
            return;
        }
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzbmvVar.f;
        if (zzfwVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", zzfwVar.zza);
            bundle2.putBoolean("clickToExpandRequested", zzfwVar.zzc);
            bundle2.putBoolean("customControlsRequested", zzfwVar.zzb);
            bundle.putBundle("video", bundle2);
        }
        bundle.putBoolean("disable_image_loading", zzbmvVar.b);
        bundle.putInt("preferred_ad_choices_position", zzbmvVar.e);
    }

    public zzfbw(zzfmj zzfmjVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.a = zzfmjVar;
        this.b = packageInfo;
        this.c = zzgVar;
    }
}
