package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbp;
import com.ironsource.C4682c4;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdri extends zzdrj {
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final JSONObject h;

    @Override // com.google.android.gms.internal.ads.zzdrj
    public final boolean a() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzdrj
    public final boolean b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzdrj
    public final boolean c() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzdrj
    public final boolean d() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzdrj
    public final String e() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzdrj
    public final zzfmm f() {
        JSONObject jSONObject = this.h;
        return jSONObject != null ? new zzfmm(jSONObject) : this.a.V;
    }

    public zzdri(zzflq zzflqVar, JSONObject jSONObject) {
        super(zzflqVar);
        this.b = zzbp.zzi(jSONObject, "tracking_urls_and_actions", "active_view");
        this.c = zzbp.zzj(false, jSONObject, "allow_pub_owned_ad_view");
        this.d = zzbp.zzj(false, jSONObject, C4682c4.c, "allow_pub_rendering");
        this.e = zzbp.zzj(false, jSONObject, "enable_omid");
        this.g = zzbp.zzk("", jSONObject, "watermark_overlay_png_base64");
        this.f = jSONObject.optJSONObject("overlay") != null;
        this.h = jSONObject.optJSONObject("omid_settings");
    }
}
