package defpackage;

import com.applovin.impl.i0;
import com.applovin.impl.x2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.inmobi.media.C4026fk;
import com.inmobi.media.Lj;
import com.inmobi.media.Mj;
import com.ironsource.Ha;
import com.ironsource.sdk.controller.v;
import com.tiktok.appevents.TTAppEventLogger;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class uv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uv0(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                Ha.a(z, (LevelPlayAdInfo) obj2, (Ha) obj);
                break;
            case 1:
                Lj.a((Mj) obj2, (C4026fk) obj, z);
                break;
            case 2:
                ((TTAppEventLogger) obj2).lambda$trackPurchase$3((List) obj, z);
                break;
            case 3:
                ((i0) obj2).a(z, (Runnable) obj);
                break;
            case 4:
                ((v.s) obj2).a(z, (String) obj);
                break;
            case 5:
                x2.a(z, (MaxAdRevenueListener) obj2, (MaxAd) obj);
                break;
            default:
                x2.a(z, (MaxAdRequestListener) obj2, (String) obj);
                break;
        }
    }

    public /* synthetic */ uv0(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ uv0(boolean z, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
