package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import androidx.room.TransactionExecutor;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.utils.WorkForegroundRunnable;
import androidx.work.impl.utils.futures.SettableFuture;
import com.adsurge.adn.ads.AdSurgeAdError;
import com.facebook.appevents.codeless.ViewIndexer;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.unity.ads.UnityAppOpenAd;
import com.google.unity.ads.UnityRewardedAd;
import com.google.unity.ads.admanager.UnityAdManagerBannerView;
import com.inmobi.media.C4250nl;
import com.inmobi.media.Vl;
import com.inmobi.media.Wk;
import com.inmobi.media.X1;
import com.ironsource.Y8;
import com.mbridge.msdk.config.component.info.provider.subprovider.a;
import com.mbridge.msdk.config.component.style.StyleCpt;
import com.mbridge.msdk.config.component.style.model.b;
import com.tiktok.appevents.TTAppEventLogger;
import com.unity.androidnotifications.UnityNotificationManager;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.services.ads.UnityAdsImplementation;
import java.io.IOException;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ok2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ok2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((StyleCpt) obj2).f((b) obj);
                return;
            case 1:
                ((StyleCpt) obj2).e((View) obj);
                return;
            case 2:
                ((TTAppEventLogger) obj2).lambda$flushWithReason$6((TTAppEventLogger.FlushReason) obj);
                return;
            case 3:
                TransactionExecutor transactionExecutor = (TransactionExecutor) obj;
                try {
                    ((Runnable) obj2).run();
                    return;
                } finally {
                    transactionExecutor.a();
                }
            case 4:
                ((UnityAdManagerBannerView) obj2).lambda$setAdSizes$0((List) obj);
                return;
            case 5:
                ((UnityAdManagerBannerView) obj2).lambda$loadAd$0((AdManagerAdRequest) obj);
                return;
            case 6:
                UnityAdsImplementation.lambda$load$1((IUnityAdsLoadListener) obj2, (String) obj);
                return;
            case 7:
                ((UnityAppOpenAd) obj2).lambda$pollAd$0((LoadAdError) obj);
                return;
            case 8:
                UnityNotificationManager unityNotificationManager = (UnityNotificationManager) obj2;
                Integer num = (Integer) obj;
                UnityNotificationManager unityNotificationManager2 = UnityNotificationManager.i;
                Notification.Builder builderE = unityNotificationManager.e(num);
                if (builderE == null) {
                    Log.e("UnityNotifications", "Failed to recover builder, can't send notification");
                    return;
                } else {
                    unityNotificationManager.m(builderE, num.intValue());
                    return;
                }
            case 9:
                ((UnityRewardedAd) obj2).lambda$setServerSideVerificationOptions$0((ServerSideVerificationOptions) obj);
                return;
            case 10:
                ((UnityRewardedAd) obj2).lambda$pollAd$0((LoadAdError) obj);
                return;
            case 11:
                ((VideoRendererEventListener.EventDispatcher) obj2).lambda$videoSizeChanged$5((VideoSize) obj);
                return;
            case 12:
                ((androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher) obj2).lambda$videoSizeChanged$5((androidx.media3.common.VideoSize) obj);
                return;
            case 13:
                ((VideoRendererEventListener.EventDispatcher) obj2).lambda$decoderReleased$7((String) obj);
                return;
            case 14:
                ((VideoRendererEventListener.EventDispatcher) obj2).lambda$videoCodecError$9((Exception) obj);
                return;
            case 15:
                ((androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher) obj2).lambda$videoCodecError$9((Exception) obj);
                return;
            case 16:
                ((androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher) obj2).lambda$decoderReleased$7((String) obj);
                return;
            case 17:
                ViewIndexer.schedule$lambda$0((ViewIndexer) obj2, (t6) obj);
                return;
            case 18:
                ViewIndexer.sendToServer$lambda$1((String) obj2, (ViewIndexer) obj);
                return;
            case 19:
                Vl.a((Intent) obj2, (Context) obj);
                return;
            case 20:
                Wk.a((C4250nl) obj2, (Bitmap) obj);
                return;
            case 21:
                WorkForegroundRunnable workForegroundRunnable = (WorkForegroundRunnable) obj2;
                SettableFuture settableFuture = (SettableFuture) obj;
                if (workForegroundRunnable.a.isCancelled()) {
                    settableFuture.cancel(true);
                    return;
                } else {
                    settableFuture.k(workForegroundRunnable.d.getForegroundInfoAsync());
                    return;
                }
            case 22:
                ListenableFuture listenableFuture = (ListenableFuture) obj;
                if (((WorkerWrapper) obj2).q.isCancelled()) {
                    listenableFuture.cancel(true);
                    return;
                }
                return;
            case 23:
                X1.a((Context) obj2, (X1) obj);
                return;
            case 24:
                Y8.a((Y8) obj2, (Set) obj);
                return;
            case 25:
                Y8.a((Y8) obj2, (LevelPlayImpressionDataListener) obj);
                return;
            case 26:
                ((a) obj2).b((com.mbridge.msdk.config.component.info.provider.listener.a) obj);
                return;
            case 27:
                ((com.adsurge.adn.K1.a) obj2).a((String) obj);
                return;
            case 28:
                ((com.adsurge.adn.p009b1.a) obj2).b((com.adsurge.adn.b1.a.c) obj);
                return;
            default:
                ((com.adsurge.adn.p022g.a) obj2).a((AdSurgeAdError) obj);
                return;
        }
    }
}
