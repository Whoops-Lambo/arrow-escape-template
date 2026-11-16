package defpackage;

import android.content.Context;
import com.facebook.appevents.p;
import com.google.android.gms.internal.ads.zzbq;
import com.google.android.gms.internal.ads.zzbs;
import com.google.android.gms.internal.ads.zzbt;
import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class vn3 implements zzbs {
    public final un3 a = new un3();

    @Override // com.google.android.gms.internal.ads.zzbs
    public final zzbu a(Context context, zzi zziVar, zzbt zzbtVar, qn3 qn3Var) {
        try {
            return ((zzbs) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(zzbq.class).newInstance(this.a)).a(context, zziVar, zzbtVar, qn3Var);
        } catch (Exception e) {
            p.g(e);
            return null;
        }
    }
}
