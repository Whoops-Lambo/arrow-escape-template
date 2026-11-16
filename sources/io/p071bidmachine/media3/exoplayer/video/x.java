package io.p071bidmachine.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.WindowInsets;
import android.webkit.WebView;
import com.applovin.impl.k4;
import com.applovin.impl.k6;
import com.applovin.impl.l6;
import com.applovin.impl.m8;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.facebook.gamingservices.b;
import com.inmobi.media.AbstractC4151k6;
import com.inmobi.media.AbstractC4230n1;
import com.inmobi.media.Ej;
import com.ironsource.C4806j3;
import com.ironsource.C4863m6;
import com.ironsource.C4868mb;
import com.ironsource.InterfaceC4904ob;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.unity3d.mediation.LevelPlayAdError;
import com.vungle.ads.internal.load.l;
import defpackage.m32;
import io.p071bidmachine.DeviceInfo;
import io.p071bidmachine.media3.exoplayer.analytics.a;
import io.p071bidmachine.media3.exoplayer.audio.h;
import io.p071bidmachine.media3.exoplayer.f;
import io.p071bidmachine.media3.exoplayer.source.d0;
import io.p071bidmachine.media3.exoplayer.t;
import io.p071bidmachine.media3.exoplayer.video.spherical.j;
import io.p071bidmachine.protobuf.InitRequest;
import io.p071bidmachine.rendering.ad.view.i;
import io.p071bidmachine.rendering.internal.adform.html.d;
import io.p071bidmachine.rendering.internal.adform.video.c;
import io.p071bidmachine.rendering.internal.controller.k;
import io.p071bidmachine.rendering.internal.view.m;
import io.p071bidmachine.rendering.model.n;
import io.p071bidmachine.rendering.model.s0;
import io.p071bidmachine.rendering.model.z0;
import io.p071bidmachine.t1;
import io.p071bidmachine.util.e;
import io.p071bidmachine.util.o;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar;
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                f fVar = (f) this.c;
                synchronized (fVar) {
                }
                t tVar = hVar.b;
                int i = io.p071bidmachine.media3.common.util.x.a;
                io.p071bidmachine.media3.exoplayer.analytics.f fVar2 = tVar.a.s;
                a aVarW = fVar2.w((d0) fVar2.d.e);
                fVar2.z(aVarW, 1020, new b(aVarW, (Object) fVar, 16));
                break;
            case 1:
                j jVar = (j) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                SurfaceTexture surfaceTexture2 = jVar.g;
                Surface surface = jVar.h;
                Surface surface2 = new Surface(surfaceTexture);
                jVar.g = surfaceTexture;
                jVar.h = surface2;
                Iterator it = jVar.a.iterator();
                while (it.hasNext()) {
                    ((t) it.next()).a.J(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                }
                break;
            case 2:
                io.p071bidmachine.media3.ui.d0.a((io.p071bidmachine.media3.ui.d0) this.b, (Bitmap) this.c);
                break;
            case 3:
                i iVar = (i) this.b;
                n nVar = (n) this.c;
                io.p071bidmachine.rendering.ad.view.j jVar2 = iVar.m;
                if (jVar2 != null) {
                    jVar2.q(iVar, nVar);
                }
                break;
            case 4:
                i iVar2 = (i) this.b;
                s0 s0Var = (s0) this.c;
                io.p071bidmachine.rendering.ad.view.j jVar3 = iVar2.m;
                if (jVar3 != null) {
                    jVar3.j(iVar2, s0Var);
                }
                break;
            case 5:
                d dVar = (d) this.b;
                z0 z0Var = (z0) this.c;
                k kVar = dVar.g;
                try {
                    dVar.F();
                    dVar.B = z0Var;
                    kVar.c(dVar);
                } catch (Throwable th) {
                    t1.r(th);
                    kVar.b(dVar, new e(th));
                    return;
                }
                break;
            case 6:
                io.p071bidmachine.rendering.internal.adform.video.d dVar2 = (io.p071bidmachine.rendering.internal.adform.video.d) this.b;
                Uri uri = (Uri) this.c;
                uri.getClass();
                try {
                    io.p071bidmachine.rendering.internal.adform.video.player.b bVar = dVar2.y;
                    if (bVar != null) {
                        try {
                            bVar.j(uri);
                            bVar.j = uri;
                            break;
                        } catch (Throwable unused) {
                        }
                        try {
                            bVar.s();
                        } catch (Exception e) {
                            e eVar = new e(e);
                            if (bVar.f.get() || (cVar = bVar.h) == null) {
                                return;
                            }
                            cVar.a.F(eVar);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    t1.r(th2);
                    dVar2.F(new e(th2));
                    return;
                }
                break;
            case 7:
                io.p071bidmachine.rendering.internal.view.n nVar2 = (io.p071bidmachine.rendering.internal.view.n) this.b;
                n nVar3 = (n) this.c;
                m mVar = nVar2.d;
                if (mVar != null) {
                    ((io.p071bidmachine.rendering.internal.controller.a) mVar).a.b(nVar3);
                }
                break;
            case 8:
                DeviceInfo deviceInfo = (DeviceInfo) this.b;
                InitRequest.Builder builder = (InitRequest.Builder) this.c;
                String model = deviceInfo.getModel();
                int i2 = o.a;
                if (model != null) {
                    builder.setModel(model);
                }
                String hwv = deviceInfo.getHWV();
                if (hwv != null) {
                    builder.setHwv(hwv);
                }
                break;
            case 9:
                try {
                    ((io.p071bidmachine.util.f) this.b).a((io.p071bidmachine.util.h) this.c);
                } catch (Throwable unused2) {
                    return;
                }
                break;
            case 10:
                C4806j3.a((BannerAdView) this.b, (C4806j3) this.c);
                break;
            case 11:
                C4806j3.a((IronSourceError) this.b, (C4806j3) this.c);
                break;
            case 12:
                com.vungle.ads.internal.load.k.a((l) this.b, (Throwable) this.c);
                break;
            case 13:
                ((k4) this.b).a((String) this.c);
                break;
            case 14:
                ((k4) this.b).b((WebView) this.c);
                break;
            case 15:
                AbstractC4151k6.b((WindowInsets) this.b, (Context) this.c);
                break;
            case 16:
                ((k6) this.b).b((MaxErrorImpl) this.c);
                break;
            case 17:
                AbstractC4151k6.a((Integer) this.b, (Context) this.c);
                break;
            case 18:
                AbstractC4151k6.a((Map) this.b, (Context) this.c);
                break;
            case 19:
                ((com.applovin.impl.sdk.l) this.b).a((AppLovinSdkInitializationConfiguration) this.c);
                break;
            case 20:
                ((com.applovin.impl.sdk.l) this.b).b((String) this.c);
                break;
            case 21:
                ((l6) this.b).b((MaxErrorImpl) this.c);
                break;
            case 22:
                ((com.applovin.impl.sdk.m) this.b).b((AppLovinBidTokenCollectionListener) this.c);
                break;
            case 23:
                C4863m6.a((C4863m6) this.b, (m32) this.c);
                break;
            case 24:
                C4863m6.a((Throwable) this.b, (C4863m6) this.c);
                break;
            case 25:
                ((m8) this.b).a((WeakReference) this.c);
                break;
            case 26:
                C4868mb.a((C4868mb) this.b, (LevelPlayAdError) this.c);
                break;
            case 27:
                C4868mb.a((C4868mb) this.b, (String) this.c);
                break;
            case 28:
                C4868mb.a((C4868mb) this.b, (InterfaceC4904ob) this.c);
                break;
            default:
                AbstractC4230n1.a((AbstractC4230n1) this.b, (Ej) this.c);
                break;
        }
    }
}
