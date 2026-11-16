package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import defpackage.vq2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzic implements zzhw {
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final zzih c;
    public zzij d;
    public zzhn e;
    public zzht f;
    public zzhw g;
    public zziw h;
    public zzhu i;
    public zzis j;
    public zzhw k;

    public final void k(zzhw zzhwVar) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            zzhwVar.a((zziu) arrayList.get(i));
            i++;
        }
    }

    public static final void l(zzhw zzhwVar, zziu zziuVar) {
        if (zzhwVar != null) {
            zzhwVar.a(zziuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final long e(zzia zziaVar) {
        zzgvz.f(this.k == null);
        Uri uri = zziaVar.a;
        String scheme = uri.getScheme();
        String str = zzfq.a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    zzij zzijVar = new zzij();
                    this.d = zzijVar;
                    k(zzijVar);
                }
                this.k = this.d;
            } else {
                if (this.e == null) {
                    zzhn zzhnVar = new zzhn(context);
                    this.e = zzhnVar;
                    k(zzhnVar);
                }
                this.k = this.e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                zzhn zzhnVar2 = new zzhn(context);
                this.e = zzhnVar2;
                k(zzhnVar2);
            }
            this.k = this.e;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                zzht zzhtVar = new zzht(context);
                this.f = zzhtVar;
                k(zzhtVar);
            }
            this.k = this.f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            zzih zzihVar = this.c;
            if (zEquals) {
                if (this.g == null) {
                    try {
                        zzhw zzhwVar = (zzhw) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.g = zzhwVar;
                        k(zzhwVar);
                    } catch (ClassNotFoundException unused) {
                        zzeh.c("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        vq2.n("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    if (this.g == null) {
                        this.g = zzihVar;
                    }
                }
                this.k = this.g;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    zziw zziwVar = new zziw(0);
                    this.h = zziwVar;
                    k(zziwVar);
                }
                this.k = this.h;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    zzhu zzhuVar = new zzhu();
                    this.i = zzhuVar;
                    k(zzhuVar);
                }
                this.k = this.i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    zzis zzisVar = new zzis(context);
                    this.j = zzisVar;
                    k(zzisVar);
                }
                this.k = this.j;
            } else {
                this.k = zzihVar;
            }
        }
        return this.k.e(zziaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int i(byte[] bArr, int i, int i2) {
        zzhw zzhwVar = this.k;
        zzhwVar.getClass();
        return zzhwVar.i(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final Uri zzc() {
        zzhw zzhwVar = this.k;
        if (zzhwVar == null) {
            return null;
        }
        return zzhwVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzd() {
        zzhw zzhwVar = this.k;
        if (zzhwVar != null) {
            try {
                zzhwVar.zzd();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final Map zzj() {
        zzhw zzhwVar = this.k;
        return zzhwVar == null ? Collections.EMPTY_MAP : zzhwVar.zzj();
    }

    public zzic(Context context, zzih zzihVar) {
        this.a = context.getApplicationContext();
        this.c = zzihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void a(zziu zziuVar) {
        zziuVar.getClass();
        this.c.a(zziuVar);
        this.b.add(zziuVar);
        l(this.d, zziuVar);
        l(this.e, zziuVar);
        l(this.f, zziuVar);
        l(this.g, zziuVar);
        l(this.h, zziuVar);
        l(this.i, zziuVar);
        l(this.j, zziuVar);
    }
}
