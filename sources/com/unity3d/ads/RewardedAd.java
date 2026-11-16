package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.safedk.android.utils.j;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.datasource.CurrentActivityDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.ShowConfigurationInternal;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import defpackage.az2;
import defpackage.cz;
import defpackage.dy;
import defpackage.e32;
import defpackage.e80;
import defpackage.hg0;
import defpackage.p32;
import defpackage.t50;
import defpackage.tb5;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import gatewayprotocol.v1.ErrorOuterClass;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/unity3d/ads/RewardedAd;", "", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "safeCallbackInvoke", "<init>", "(Lcom/unity3d/ads/core/data/model/AdObject;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;)V", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/ShowConfiguration;", j.c, "Lcom/unity3d/ads/RewardedShowListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Laz2;", "show", "(Landroid/content/Context;Lcom/unity3d/ads/ShowConfiguration;Lcom/unity3d/ads/RewardedShowListener;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "Lcom/unity3d/ads/AdExpiredListener;", "onAdExpired", "Lcom/unity3d/ads/AdExpiredListener;", "getOnAdExpired", "()Lcom/unity3d/ads/AdExpiredListener;", "setOnAdExpired", "(Lcom/unity3d/ads/AdExpiredListener;)V", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RewardedAd {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AdObject adObject;

    @Nullable
    private AdExpiredListener<RewardedAd> onAdExpired;

    @NotNull
    private final SafeCallbackInvoke safeCallbackInvoke;

    /* JADX INFO: renamed from: com.unity3d.ads.RewardedAd$show$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcz;", "Laz2;", "<anonymous>", "(Lcz;)V"}, k = 3, mv = {2, 1, 0})
    @t50(c = "com.unity3d.ads.RewardedAd$show$1", f = "RewardedAd.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends ul2 implements zr0 {
        final /* synthetic */ ShowConfiguration $configuration;
        final /* synthetic */ Context $context;
        final /* synthetic */ RewardedShowListener $listener;
        int label;
        final /* synthetic */ RewardedAd this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShowConfiguration showConfiguration, RewardedAd rewardedAd, Context context, RewardedShowListener rewardedShowListener, dy dyVar) {
            super(2, dyVar);
            this.$configuration = showConfiguration;
            this.this$0 = rewardedAd;
            this.$context = context;
            this.$listener = rewardedShowListener;
        }

        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            return new AnonymousClass1(this.$configuration, this.this$0, this.$context, this.$listener, dyVar);
        }

        @Override // defpackage.ph
        public final Object invokeSuspend(Object obj) {
            Map<String, String> extras;
            String str = null;
            byte b = 0;
            byte b2 = 0;
            byte b3 = 0;
            byte b4 = 0;
            byte b5 = 0;
            byte b6 = 0;
            byte b7 = 0;
            if (this.label != 0) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj);
            ShowConfiguration showConfiguration = this.$configuration;
            String customRewardString = showConfiguration != null ? showConfiguration.getCustomRewardString() : null;
            ShowConfiguration showConfiguration2 = this.$configuration;
            if (showConfiguration2 == null || (extras = showConfiguration2.getExtras()) == null) {
                extras = hg0.a;
            }
            ShowConfigurationInternal showConfigurationInternal = new ShowConfigurationInternal(customRewardString, extras);
            UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
            unityAdsShowOptions.setObjectId(ProtobufExtensionsKt.toUUID(this.this$0.adObject.getOpportunityId()).toString());
            unityAdsShowOptions.showConfiguration = showConfigurationInternal;
            this.this$0.adObject.setShowConfiguration(this.$configuration);
            AdObject adObject = this.this$0.adObject;
            ShowConfiguration showConfiguration3 = this.$configuration;
            adObject.setPlayerServerId(showConfiguration3 != null ? showConfiguration3.getCustomRewardString() : null);
            ServiceProvider serviceProvider = ServiceProvider.INSTANCE;
            int i = 1;
            CurrentActivityDataSource currentActivityDataSource = (CurrentActivityDataSource) serviceProvider.getRegistry().resolveService(new ServiceKey(str, p32.a(CurrentActivityDataSource.class), i, b7 == true ? 1 : 0));
            SendDiagnosticEvent sendDiagnosticEvent = (SendDiagnosticEvent) serviceProvider.getRegistry().resolveService(new ServiceKey(b6 == true ? 1 : 0, p32.a(SendDiagnosticEvent.class), i, b5 == true ? 1 : 0));
            SessionRepository sessionRepository = (SessionRepository) serviceProvider.getRegistry().resolveService(new ServiceKey(b4 == true ? 1 : 0, p32.a(SessionRepository.class), i, b3 == true ? 1 : 0));
            Activity currentActivity = currentActivityDataSource.getCurrentActivity();
            ShowActivityResolverKt.commitExtras(this.$context, currentActivity, this.$configuration);
            Activity activityResolveEffectiveActivity = ShowActivityResolverKt.resolveEffectiveActivity(this.$context, currentActivity, this.this$0.adObject, sendDiagnosticEvent, sessionRepository);
            this.this$0.adObject.setActivity(activityResolveEffectiveActivity != null ? new WeakReference<>(activityResolveEffectiveActivity) : null);
            UnityAdsSDK unityAdsSDK = new UnityAdsSDK(b2 == true ? 1 : 0, i, b == true ? 1 : 0);
            String placementId = this.this$0.adObject.getPlacementId();
            final RewardedShowListener rewardedShowListener = this.$listener;
            final RewardedAd rewardedAd = this.this$0;
            unityAdsSDK.show(placementId, unityAdsShowOptions, new Listeners() { // from class: com.unity3d.ads.RewardedAd.show.1.2

                /* JADX INFO: renamed from: com.unity3d.ads.RewardedAd$show$1$2$WhenMappings */
                /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

                    static {
                        int[] iArr = new int[UnityAds.UnityAdsShowError.values().length];
                        try {
                            iArr[UnityAds.UnityAdsShowError.TIMEOUT.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[UnityAds.UnityAdsShowError.EXPIRED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                        int[] iArr2 = new int[UnityAds.UnityAdsShowCompletionState.values().length];
                        try {
                            iArr2[UnityAds.UnityAdsShowCompletionState.COMPLETED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr2[UnityAds.UnityAdsShowCompletionState.SKIPPED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused5) {
                        }
                        $EnumSwitchMapping$1 = iArr2;
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onClick(String placementId2) {
                    placementId2.getClass();
                    RewardedShowListener rewardedShowListener2 = rewardedShowListener;
                    if (rewardedShowListener2 != null) {
                        rewardedShowListener2.onClicked(rewardedAd);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onComplete(String placementId2, UnityAds.UnityAdsShowCompletionState state) {
                    ShowFinishState showFinishState;
                    placementId2.getClass();
                    state.getClass();
                    int i2 = WhenMappings.$EnumSwitchMapping$1[state.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            showFinishState = ShowFinishState.SKIPPED;
                        } else {
                            e.b();
                            return;
                        }
                    } else {
                        showFinishState = ShowFinishState.COMPLETED;
                    }
                    RewardedShowListener rewardedShowListener2 = rewardedShowListener;
                    if (rewardedShowListener2 != null) {
                        rewardedShowListener2.onCompleted(rewardedAd, showFinishState);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onError(String placementId2, UnityAds.UnityAdsShowError error, String message) {
                    ErrorOuterClass.PublicErrorCode publicErrorCode;
                    placementId2.getClass();
                    error.getClass();
                    message.getClass();
                    int i2 = WhenMappings.$EnumSwitchMapping$0[error.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL;
                            } else {
                                publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN;
                            }
                        } else {
                            publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_EXPIRED;
                        }
                    } else {
                        publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT;
                    }
                    RewardedShowListener rewardedShowListener2 = rewardedShowListener;
                    if (rewardedShowListener2 != null) {
                        rewardedShowListener2.onFailed(rewardedAd, new UnityAdsError(publicErrorCode.getNumber(), UnityAdsErrorKt.getShowErrorMsg(publicErrorCode)));
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onLeftApplication(String placementId2) {
                    placementId2.getClass();
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onRewarded(String placementId2) {
                    placementId2.getClass();
                    RewardedShowListener rewardedShowListener2 = rewardedShowListener;
                    if (rewardedShowListener2 != null) {
                        rewardedShowListener2.onRewarded(rewardedAd);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onStart(String placementId2) {
                    placementId2.getClass();
                    RewardedShowListener rewardedShowListener2 = rewardedShowListener;
                    if (rewardedShowListener2 != null) {
                        rewardedShowListener2.onStarted(rewardedAd);
                    }
                }
            });
            return az2.a;
        }

        @Override // defpackage.zr0
        public final Object invoke(cz czVar, dy dyVar) {
            return ((AnonymousClass1) create(czVar, dyVar)).invokeSuspend(az2.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/RewardedAd$Companion;", "", "<init>", "()V", "Lcom/unity3d/ads/LoadConfiguration;", j.c, "Lcom/unity3d/ads/LoadListener;", "Lcom/unity3d/ads/RewardedAd;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Laz2;", "load", "(Lcom/unity3d/ads/LoadConfiguration;Lcom/unity3d/ads/LoadListener;)V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        public final void load(@NotNull LoadConfiguration configuration, @NotNull LoadListener<RewardedAd> listener) {
            configuration.getClass();
            listener.getClass();
            tb5.t((cz) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, p32.a(cz.class))), null, null, new RewardedAd$Companion$load$1(configuration, listener, null), 3);
        }

        private Companion() {
        }
    }

    public static final void load(@NotNull LoadConfiguration loadConfiguration, @NotNull LoadListener<RewardedAd> loadListener) {
        INSTANCE.load(loadConfiguration, loadListener);
    }

    public static /* synthetic */ void show$default(RewardedAd rewardedAd, Context context, ShowConfiguration showConfiguration, RewardedShowListener rewardedShowListener, int i, Object obj) {
        if ((i & 2) != 0) {
            showConfiguration = null;
        }
        if ((i & 4) != 0) {
            rewardedShowListener = null;
        }
        rewardedAd.show(context, showConfiguration, rewardedShowListener);
    }

    @Nullable
    public final AdExpiredListener<RewardedAd> getOnAdExpired() {
        return this.onAdExpired;
    }

    public final void setOnAdExpired(@Nullable AdExpiredListener<RewardedAd> adExpiredListener) {
        this.onAdExpired = adExpiredListener;
    }

    public final void show(@Nullable Context context, @Nullable ShowConfiguration configuration, @Nullable RewardedShowListener listener) {
        tb5.t((cz) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, p32.a(cz.class))), null, null, new AnonymousClass1(configuration, this, context, listener, null), 3);
    }

    public RewardedAd(@NotNull AdObject adObject, @NotNull SafeCallbackInvoke safeCallbackInvoke) {
        cz scope;
        adObject.getClass();
        safeCallbackInvoke.getClass();
        this.adObject = adObject;
        this.safeCallbackInvoke = safeCallbackInvoke;
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer != null && (scope = adPlayer.getScope()) != null) {
            tb5.t(scope, null, null, new RewardedAd$1$1(this, null), 3);
        }
    }
}
