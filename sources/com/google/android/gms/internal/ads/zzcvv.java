package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.ku4;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcvv implements zzbfr {
    public zzcly a;
    public final Executor b;
    public final zzcvh c;
    public final Clock d;
    public boolean e = false;
    public boolean f = false;
    public final zzcvk g = new zzcvk();

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final void K(zzbfq zzbfqVar) {
        boolean z = this.f ? false : zzbfqVar.j;
        zzcvk zzcvkVar = this.g;
        zzcvkVar.a = z;
        zzcvkVar.c = this.d.elapsedRealtime();
        zzcvkVar.e = zzbfqVar;
        if (this.e) {
            d();
        }
    }

    public final void d() {
        try {
            JSONObject jSONObjectZzb = this.c.zzb(this.g);
            if (this.a != null) {
                this.b.execute(new ku4(15, this, jSONObjectZzb));
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e);
        }
    }

    public zzcvv(Executor executor, zzcvh zzcvhVar, Clock clock) {
        this.b = executor;
        this.c = zzcvhVar;
        this.d = clock;
    }
}
