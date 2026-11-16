package defpackage;

import com.google.android.gms.internal.ads.zzgjd;
import com.google.android.gms.internal.ads.zzgmo;
import com.google.android.gms.internal.ads.zzgmq;
import com.google.android.gms.internal.ads.zzgms;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class hl4 implements zzgmo, zzgjd, zzgmq, zzgms {
    public final k a;

    @Override // com.google.android.gms.internal.ads.zzgms
    public k54 a() {
        return new k54(this.a, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzgmq
    public k54 b() {
        return new k54(this.a, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzgmo
    public k54 zza() {
        return new k54(this.a, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzgjd
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public ne4 mo1135zza() {
        return new ne4(this.a);
    }
}
