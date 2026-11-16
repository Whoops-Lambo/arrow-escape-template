package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import com.inmobi.media.AbstractC3977e;
import com.inmobi.media.AbstractC4072ha;
import com.inmobi.media.AbstractC4221mk;
import com.inmobi.media.AbstractC4303pi;
import com.inmobi.media.C4080hi;
import com.inmobi.media.C4093i3;
import com.inmobi.media.C4111im;
import com.inmobi.media.C4178l5;
import com.inmobi.media.C4539y7;
import com.ironsource.C4710de;
import com.ironsource.C4789i3;
import com.ironsource.C4980sg;
import com.ironsource.C5055x1;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.dk2;
import defpackage.sr0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d0 implements sr0 {
    public final /* synthetic */ int a;

    public /* synthetic */ d0(com.moloco.sdk.xenoss.sdkdevkit.android.core.b bVar) {
        this.a = 7;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e eVarB;
        switch (this.a) {
            case 0:
                return e.a.a();
            case 1:
                return g.a();
            case 2:
                return l.a();
            case 3:
                return v.a();
            case 4:
                return x.a();
            case 5:
                return y.a();
            case 6:
                return new com.moloco.sdk.xenoss.sdkdevkit.android.core.b();
            case 7:
                try {
                    String property = System.getProperty("http.agent");
                    return (property == null || dk2.Z(property)) ? "" : property;
                } catch (Exception e) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "WebBrowserUserAgentService", e.toString(), null, false, 12, null);
                    return "";
                }
            case 8:
                try {
                    eVarB = com.moloco.sdk.service_locator.j.b();
                    break;
                } catch (Exception e2) {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "BestAttemptHttpRequest", "Failed to create PersistentHttpRequest, invoking NonPersistendHttpRequest", e2, false, 8, null);
                    eVarB = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h) com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i.a.getValue();
                }
                return new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c(eVarB);
            case 9:
                return new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h(com.moloco.sdk.service_locator.j.a());
            case 10:
                return C4710de.b();
            case 11:
                return Boolean.valueOf(AbstractC3977e.a());
            case 12:
                return AbstractC4072ha.b();
            case 13:
                return C4080hi.a();
            case 14:
                return C4080hi.g();
            case 15:
                return C4789i3.b();
            case 16:
                return C4789i3.c();
            case 17:
                return C4093i3.b();
            case 18:
                return C4111im.c();
            case 19:
                CopyOnWriteArrayList copyOnWriteArrayList = io.p071bidmachine.iab.bridge.a.a;
                return "handleJsCommand not found";
            case 20:
                return C4178l5.b();
            case 21:
                return AbstractC4221mk.a();
            case 22:
                return Boolean.valueOf(AbstractC4303pi.c());
            case 23:
                return Long.valueOf(System.currentTimeMillis());
            case 24:
                return C4980sg.b();
            case 25:
                return Boolean.valueOf(C5055x1.a());
            case 26:
                return Boolean.valueOf(C4539y7.f());
            case 27:
                return Boolean.valueOf(C4539y7.a());
            case 28:
                return Boolean.valueOf(C4539y7.c());
            default:
                return Long.valueOf(C4539y7.d());
        }
    }

    public /* synthetic */ d0(int i) {
        this.a = i;
    }
}
