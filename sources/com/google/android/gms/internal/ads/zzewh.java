package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.Insets;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzewh implements zzfdt {
    public final com.google.android.gms.ads.internal.client.zzr a;
    public final String b;
    public final boolean c;
    public final String d;
    public final float e;
    public final int f;
    public final int g;
    public final String h;
    public final int i;
    public final boolean j;
    public final Insets k;
    public final io.p071bidmachine.media3.exoplayer.upstream.f l;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.a;
        int i = zzrVar.zze;
        zzfmy.b(bundle, "smart_w", "full", i == -1);
        int i2 = zzrVar.zzb;
        zzfmy.b(bundle, "smart_h", "auto", i2 == -2);
        zzfmy.d(bundle, "ene", true, zzrVar.zzj);
        zzfmy.b(bundle, "rafmt", "102", zzrVar.zzm);
        zzfmy.b(bundle, "rafmt", "108", zzrVar.zzp);
        zzfmy.b(bundle, "rafmt", "103", zzrVar.zzn);
        zzfmy.b(bundle, "rafmt", "105", zzrVar.zzo);
        zzfmy.d(bundle, "inline_adaptive_slot", true, this.j);
        zzfmy.d(bundle, "interscroller_slot", true, zzrVar.zzo);
        zzfmy.e("format", bundle, this.b);
        zzfmy.b(bundle, "fluid", "height", this.c);
        String str = this.d;
        zzfmy.b(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.e);
        bundle.putInt("sw", this.f);
        bundle.putInt(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, this.g);
        String str2 = this.h;
        zzfmy.b(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        int i3 = this.i;
        if (i3 != -1) {
            bundle.putInt("u_mso", i3);
        }
        Insets insets = this.k;
        if (insets != null) {
            bundle.putInt("sam_t", insets.top);
            bundle.putInt("sam_b", insets.bottom);
            bundle.putInt("sam_l", insets.left);
            bundle.putInt("sam_r", insets.right);
        }
        io.p071bidmachine.media3.exoplayer.upstream.f fVar = this.l;
        if (fVar != null) {
            bundle.putInt("rc_tl", fVar.a);
            bundle.putInt("rc_tr", fVar.b);
            bundle.putInt("rc_bl", fVar.c);
            bundle.putInt("rc_br", fVar.d);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i2);
            bundle2.putInt("width", i);
            bundle2.putBoolean("is_fluid_height", zzrVar.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzrVar2.zzi);
                bundle3.putInt("height", zzrVar2.zzb);
                bundle3.putInt("width", zzrVar2.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    public zzewh(com.google.android.gms.ads.internal.client.zzr zzrVar, String str, boolean z, String str2, float f, int i, int i2, String str3, int i3, boolean z2, Insets insets, io.p071bidmachine.media3.exoplayer.upstream.f fVar) {
        Preconditions.checkNotNull(zzrVar, "the adSize must not be null");
        this.a = zzrVar;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = str3;
        this.i = i3;
        this.j = z2;
        this.k = insets;
        this.l = fVar;
    }
}
