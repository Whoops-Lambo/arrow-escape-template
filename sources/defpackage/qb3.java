package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import com.adsurge.adn.J.b;
import com.adsurge.adn.p043n.d;
import com.adsurge.adn.p049p.f;
import com.adsurge.adn.z1.e;
import com.applovin.impl.a;
import com.applovin.impl.e1;
import com.applovin.impl.h6;
import com.applovin.impl.j5;
import com.applovin.impl.k6;
import com.applovin.impl.l6;
import com.applovin.impl.mediation.h;
import com.applovin.impl.sdk.g;
import com.inmobi.media.C3983e5;
import com.ironsource.C4694cg;
import com.ironsource.C4815jc;
import com.ironsource.W8;
import com.vungle.ads.internal.load.i;
import com.vungle.ads.internal.omsdk.c;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class qb3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qb3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((b) obj).a();
                break;
            case 1:
                ((com.applovin.impl.sdk.network.b) obj).e();
                break;
            case 2:
                com.vungle.ads.internal.session.b.b((File) obj);
                break;
            case 3:
                ((Activity) obj).finish();
                break;
            case 4:
                c.a((c) obj);
                break;
            case 5:
                ((com.adsurge.adn.p055s.c) obj).a();
                break;
            case 6:
                ((com.mbridge.msdk.config.component.common.network.connect.socket.c) obj).c();
                break;
            case 7:
                ((com.mbridge.msdk.config.component.common.network.retry.c) obj).b();
                break;
            case 8:
                ((com.adsurge.adn.J.c) obj).d();
                break;
            case 9:
                C4694cg.e((C4694cg) obj);
                break;
            case 10:
                C4694cg.a((W8) obj);
                break;
            case 11:
                C4694cg.b.a((C4694cg.b) obj);
                break;
            case 12:
                ((d) obj).w();
                break;
            case 13:
                ((com.adsurge.adn.p053r.d) obj).y();
                break;
            case 14:
                ((a) obj).b();
                break;
            case 15:
                ((e) obj).i();
                break;
            case 16:
                ((e1) obj).notifyDataSetChanged();
                break;
            case 17:
                C3983e5.a((C3983e5) obj);
                break;
            case 18:
                ((f) obj).b();
                break;
            case 19:
                ((com.mbridge.msdk.config.dynamic.utils.f) obj).b();
                break;
            case 20:
                ((SharedPreferences.Editor) obj).commit();
                break;
            case 21:
                ((g) obj).i();
                break;
            case 22:
                com.vungle.ads.internal.ui.view.g.a((com.vungle.ads.internal.ui.view.g) obj);
                break;
            case 23:
                ((h) obj).l();
                break;
            case 24:
                ((h6) obj).e();
                break;
            case 25:
                i.i((i) obj);
                break;
            case 26:
                ((j5) obj).c();
                break;
            case 27:
                C4815jc.a((C4815jc) obj);
                break;
            case 28:
                ((k6) obj).e();
                break;
            default:
                ((l6) obj).e();
                break;
        }
    }
}
