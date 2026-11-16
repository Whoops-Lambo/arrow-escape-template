package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import com.ironsource.C4811j8;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import defpackage.at;
import defpackage.az2;
import defpackage.bp0;
import defpackage.cz;
import defpackage.dy;
import defpackage.hr1;
import defpackage.kc2;
import defpackage.lp1;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 <2\u00020\u0001:\u0001<J(\u0010\u0006\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005H\u0097@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0015\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0018\u0010\u000fJ\u0018\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H¦@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH¦@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH¦@¢\u0006\u0004\b!\u0010 J\u0018\u0010\"\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH¦@¢\u0006\u0004\b\"\u0010 J\u0018\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0003H¦@¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020\u00052\u0006\u0010#\u001a\u00020&H¦@¢\u0006\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000202018&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000206018&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00104R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u000209018&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u00104¨\u0006="}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayer;", "", "", "", "unityAdsShowOptions", "Laz2;", "requestShow", "(Ljava/util/Map;Ldy;)Ljava/lang/Object;", "dispatchShowCompleted", "()V", "Lcom/unity3d/ads/adplayer/ShowOptions;", "showOptions", "show", "(Lcom/unity3d/ads/adplayer/ShowOptions;)V", "destroy", "(Ldy;)Ljava/lang/Object;", "", "isMuted", "sendMuteChange", "(ZLdy;)Ljava/lang/Object;", C4811j8.k, "sendVisibilityChange", "isFocused", "sendFocusChange", "sendActivityDestroyed", "", "volume", "sendVolumeChange", "(DLdy;)Ljava/lang/Object;", "", "value", "sendUserConsentChange", "([BLdy;)Ljava/lang/Object;", "sendPrivacyFsmChange", "onAllowedPiiChange", "event", "onBroadcastEvent", "(Ljava/lang/String;Ldy;)Ljava/lang/Object;", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "sendOfferwallEvent", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Ldy;)Ljava/lang/Object;", "Lcz;", "getScope", "()Lcz;", "scope", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/WebViewContainer;", "webViewContainer", "Lbp0;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "()Lbp0;", "onShowEvent", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "getOnOfferwallEvent", "onOfferwallEvent", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "onLoadEvent", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AdPlayer {

    @NotNull
    public static final String AD_REFRESH_EVENT = "AD_REFRESH";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayer$Companion;", "", "<init>", "()V", "Llp1;", "", "broadcastEventChannel", "Llp1;", "getBroadcastEventChannel", "()Llp1;", "", "OFFERWALL_EVENT_QUEUE_SIZE", "I", "AD_REFRESH_EVENT", "Ljava/lang/String;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @NotNull
        public static final String AD_REFRESH_EVENT = "AD_REFRESH";
        public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final lp1 broadcastEventChannel = at.b(0, 0, 7);

        @NotNull
        public final lp1 getBroadcastEventChannel() {
            return broadcastEventChannel;
        }

        private Companion() {
        }
    }

    @CallSuper
    @Nullable
    Object destroy(@NotNull dy dyVar);

    void dispatchShowCompleted();

    @NotNull
    bp0 getOnLoadEvent();

    @NotNull
    bp0 getOnOfferwallEvent();

    @NotNull
    bp0 getOnShowEvent();

    @NotNull
    cz getScope();

    @NotNull
    WebViewContainer getWebViewContainer();

    @Nullable
    Object onAllowedPiiChange(@NotNull byte[] bArr, @NotNull dy dyVar);

    @Nullable
    Object onBroadcastEvent(@NotNull String str, @NotNull dy dyVar);

    @Nullable
    Object requestShow(@Nullable Map<String, ? extends Object> map, @NotNull dy dyVar);

    @Nullable
    Object sendActivityDestroyed(@NotNull dy dyVar);

    @Nullable
    Object sendFocusChange(boolean z, @NotNull dy dyVar);

    @Nullable
    Object sendMuteChange(boolean z, @NotNull dy dyVar);

    @Nullable
    Object sendOfferwallEvent(@NotNull OfferwallEvent offerwallEvent, @NotNull dy dyVar);

    @Nullable
    Object sendPrivacyFsmChange(@NotNull byte[] bArr, @NotNull dy dyVar);

    @Nullable
    Object sendUserConsentChange(@NotNull byte[] bArr, @NotNull dy dyVar);

    @Nullable
    Object sendVisibilityChange(boolean z, @NotNull dy dyVar);

    @Nullable
    Object sendVolumeChange(double d, @NotNull dy dyVar);

    void show(@NotNull ShowOptions showOptions);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @CallSuper
        @Nullable
        public static Object destroy(@NotNull AdPlayer adPlayer, @NotNull dy dyVar) {
            kc2.g(adPlayer.getScope(), null);
            return az2.a;
        }

        public static void show(@NotNull AdPlayer adPlayer, @NotNull ShowOptions showOptions) {
            showOptions.getClass();
            throw new hr1(null, 1, null);
        }
    }
}
