package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.p003activity.ComponentActivity$activityResultRegistry$1;
import androidx.p003activity.result.contract.ActivityResultContract;
import androidx.profileinstaller.DeviceProfileWriter;
import com.applovin.impl.x2;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinPostbackListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.inmobi.media.C4101ib;
import com.inmobi.media.C4398t2;
import com.inmobi.media.Ej;
import com.unity3d.ads.InitializationListener;
import com.unity3d.services.core.properties.SdkProperties;
import com.vungle.ads.internal.util.i;
import com.vungle.ads.internal.util.j;
import io.p071bidmachine.media3.common.util.l;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vv(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = i;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.c;
        Object obj = this.d;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ComponentActivity$activityResultRegistry$1 componentActivity$activityResultRegistry$1 = (ComponentActivity$activityResultRegistry$1) obj2;
                componentActivity$activityResultRegistry$1.getClass();
                componentActivity$activityResultRegistry$1.a(i2, ((ActivityResultContract.SynchronousResult) obj).a);
                return;
            case 1:
                ComponentActivity$activityResultRegistry$1 componentActivity$activityResultRegistry$2 = (ComponentActivity$activityResultRegistry$1) obj2;
                componentActivity$activityResultRegistry$2.getClass();
                componentActivity$activityResultRegistry$2.b(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                return;
            case 2:
                ((DeviceProfileWriter) obj2).b.a(i2, obj);
                return;
            case 3:
                ((DrmSessionEventListener.EventDispatcher) obj2).lambda$drmSessionAcquired$0((DrmSessionEventListener) obj, i2);
                return;
            case 4:
                ((com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher) obj2).lambda$drmSessionAcquired$0((com.google.android.exoplayer2.drm.DrmSessionEventListener) obj, i2);
                return;
            case 5:
                m32 m32Var = (m32) obj2;
                Context context = (Context) obj;
                if (lz.a.contains(y31.class)) {
                    return;
                }
                try {
                    if (i2 == 0) {
                        throw null;
                    }
                    ((z31) m32Var.a).a(k41.SUBS, new x31(i2, context, 1));
                    return;
                } catch (Throwable th) {
                    lz.a(y31.class, th);
                    return;
                }
            case 6:
                ListenerSet.lambda$queueEvent$0((CopyOnWriteArraySet) obj2, i2, (ListenerSet.Event) obj);
                return;
            case 7:
                androidx.media3.common.util.ListenerSet.lambda$queueEvent$0((CopyOnWriteArraySet) obj2, i2, (androidx.media3.common.util.ListenerSet.Event) obj);
                return;
            case 8:
                ((MaxAdPlacer) obj2).a(i2, (Collection) obj);
                return;
            case 9:
                SdkProperties.lambda$notifyInitializationFailed$3((InitializationListener) obj2, i2, (String) obj);
                return;
            case 10:
                i.a((j) obj2, (Bitmap) obj, i2);
                return;
            case 11:
                C4101ib.a((Ej) obj2, (C4101ib) obj, i2);
                return;
            case 12:
                io.p071bidmachine.media3.common.util.j jVar = (io.p071bidmachine.media3.common.util.j) obj;
                for (l lVar : (CopyOnWriteArraySet) obj2) {
                    if (!lVar.d) {
                        if (i2 != -1) {
                            lVar.b.c(i2);
                        }
                        lVar.c = true;
                        jVar.invoke(lVar.a);
                    }
                }
                return;
            case 13:
                C4398t2.a((C4398t2) obj2, (Ej) obj, i2);
                return;
            case 14:
                x2.b((AppLovinPostbackListener) obj2, (String) obj, i2);
                return;
            default:
                x2.b((AppLovinAdRewardListener) obj2, (AppLovinAd) obj, i2);
                return;
        }
    }

    public /* synthetic */ vv(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.d = obj2;
        this.c = i;
    }
}
