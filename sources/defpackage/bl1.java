package defpackage;

import android.app.Activity;
import com.applovin.impl.c3;
import com.applovin.impl.g3;
import com.applovin.impl.mediation.MaxAdapterParametersImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.h;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class bl1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ bl1(MediationServiceImpl mediationServiceImpl, g3 g3Var, h hVar, Activity activity, a.InterfaceC0165a interfaceC0165a, Map map, Map map2) {
        this.a = 1;
        this.b = mediationServiceImpl;
        this.f = g3Var;
        this.c = hVar;
        this.d = activity;
        this.e = interfaceC0165a;
        this.g = map;
        this.h = map2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.h;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                ((MediationServiceImpl) obj7).a((h) obj6, (String) obj5, (MaxAdapterParametersImpl) obj4, (c3) obj, (Activity) obj3, (a.InterfaceC0165a) obj2);
                break;
            case 1:
                ((MediationServiceImpl) obj7).a((g3) obj5, (h) obj6, (Activity) obj3, (a.InterfaceC0165a) obj2, (Map) obj4, (Map) obj);
                break;
            default:
                ((com.adsurge.adn.G.a) obj7).a((AtomicReference) obj6, (String) obj5, (Method) obj4, this.h, (Object[]) obj3, (CountDownLatch) obj2);
                break;
        }
    }

    public /* synthetic */ bl1(Object obj, Object obj2, String str, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.f = str;
        this.g = obj3;
        this.h = obj4;
        this.d = obj5;
        this.e = obj6;
    }
}
