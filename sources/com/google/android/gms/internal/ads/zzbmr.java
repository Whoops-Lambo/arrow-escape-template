package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbmr extends zzbnf {
    public final Drawable a;
    public final Uri b;
    public final double c;
    public final int d;
    public final int e;
    public final Map f;

    @Override // com.google.android.gms.internal.ads.zzbng
    public final IObjectWrapper zza() {
        return new ObjectWrapper(this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final Uri zzb() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final double zzc() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final int zzd() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final int zze() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final Map zzf() {
        return this.f;
    }

    public zzbmr(Drawable drawable, Uri uri, double d, int i, int i2, HashMap map) {
        this.a = drawable;
        this.b = uri;
        this.c = d;
        this.d = i;
        this.e = i2;
        this.f = map;
    }
}
