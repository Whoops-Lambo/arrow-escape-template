package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4962rg;
import com.safedk.android.utils.j;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityServices;
import com.unity3d.services.ads.IUnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import defpackage.az2;
import defpackage.cz;
import defpackage.dy;
import defpackage.dz2;
import defpackage.e32;
import defpackage.ek2;
import defpackage.ez2;
import defpackage.j52;
import defpackage.jh0;
import defpackage.k52;
import defpackage.ov1;
import defpackage.p32;
import defpackage.t50;
import defpackage.tb5;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b*\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004STUVB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\t\u0010\rJ+\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\t\u0010\u0010J5\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\t\u0010\u0011J#\u0010\u0015\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0015\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0015\u0010\u0019J-\u0010\u0015\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u0015\u0010\u001cJ7\u0010\u0015\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0015\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\u001e\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b\u001e\u0010\"J-\u0010\u001e\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b\u001e\u0010%J\u0019\u0010'\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0004\b'\u0010(J\u001f\u0010'\u001a\u00020\b2\u0006\u0010*\u001a\u00020)2\u0006\u0010!\u001a\u00020&H\u0007¢\u0006\u0004\b'\u0010+J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010*\u001a\u00020,2\u0006\u0010!\u001a\u00020-H\u0007¢\u0006\u0004\b\t\u0010.R*\u0010/\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b/\u00100\u0012\u0004\b4\u0010\u0003\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u001fR*\u00105\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b5\u00106\u0012\u0004\b;\u0010\u0003\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010<\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b<\u00106\u0012\u0004\b?\u0010\u0003\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R*\u0010@\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b@\u00106\u0012\u0004\bC\u0010\u0003\u001a\u0004\bA\u00108\"\u0004\bB\u0010:R\u001a\u0010D\u001a\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\bF\u0010\u0003\u001a\u0004\bD\u0010ER\u001a\u0010G\u001a\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\bH\u0010\u0003\u001a\u0004\bG\u0010ER\u001a\u0010K\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\bJ\u0010\u0003\u001a\u0004\bI\u00102R*\u0010L\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020\u000e8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bP\u0010\u0003\u001a\u0004\bM\u0010E\"\u0004\bN\u0010OR\u001c\u0010R\u001a\u0004\u0018\u00010\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\bQ\u0010\u0003\u001a\u0004\b'\u00102¨\u0006W"}, d2 = {"Lcom/unity3d/ads/UnityAds;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", AndroidGetAdPlayerContext.KEY_GAME_ID, "Laz2;", "initialize", "(Landroid/content/Context;Ljava/lang/String;)V", "Lcom/unity3d/ads/IUnityAdsInitializationListener;", "initializationListener", "(Landroid/content/Context;Ljava/lang/String;Lcom/unity3d/ads/IUnityAdsInitializationListener;)V", "", "testMode", "(Landroid/content/Context;Ljava/lang/String;Z)V", "(Landroid/content/Context;Ljava/lang/String;ZLcom/unity3d/ads/IUnityAdsInitializationListener;)V", "Landroid/app/Activity;", "activity", "placementId", "show", "(Landroid/app/Activity;Ljava/lang/String;)V", "Lcom/unity3d/ads/IUnityAdsShowListener;", "showListener", "(Landroid/app/Activity;Ljava/lang/String;Lcom/unity3d/ads/IUnityAdsShowListener;)V", "Lcom/unity3d/ads/UnityAdsShowOptions;", "options", "(Landroid/app/Activity;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;)V", "(Landroid/app/Activity;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;Lcom/unity3d/ads/IUnityAdsShowListener;)V", "load", "(Ljava/lang/String;)V", "Lcom/unity3d/ads/IUnityAdsLoadListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Ljava/lang/String;Lcom/unity3d/ads/IUnityAdsLoadListener;)V", "Lcom/unity3d/ads/UnityAdsLoadOptions;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "(Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/unity3d/ads/IUnityAdsLoadListener;)V", "Lcom/unity3d/ads/IUnityAdsTokenListener;", "getToken", "(Lcom/unity3d/ads/IUnityAdsTokenListener;)V", "Lcom/unity3d/ads/TokenConfiguration;", j.c, "(Lcom/unity3d/ads/TokenConfiguration;Lcom/unity3d/ads/IUnityAdsTokenListener;)V", "Lcom/unity3d/ads/InitializationConfiguration;", "Lcom/unity3d/ads/InitializationListener;", "(Lcom/unity3d/ads/InitializationConfiguration;Lcom/unity3d/ads/InitializationListener;)V", "userIdentifier", "Ljava/lang/String;", "getUserIdentifier", "()Ljava/lang/String;", "setUserIdentifier", "getUserIdentifier$annotations", "userConsent", "Ljava/lang/Boolean;", "getUserConsent", "()Ljava/lang/Boolean;", "setUserConsent", "(Ljava/lang/Boolean;)V", "getUserConsent$annotations", "userOptOut", "getUserOptOut", "setUserOptOut", "getUserOptOut$annotations", "nonBehavioral", "getNonBehavioral", "setNonBehavioral", "getNonBehavioral$annotations", "isInitialized", "()Z", "isInitialized$annotations", "isSupported", "isSupported$annotations", C4962rg.b, "getVersion$annotations", "version", "debugMode", "getDebugMode", "setDebugMode", "(Z)V", "getDebugMode$annotations", "getToken$annotations", "token", "UnityAdsShowCompletionState", "UnityAdsInitializationError", "UnityAdsLoadError", "UnityAdsShowError", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnityAds {

    @NotNull
    public static final UnityAds INSTANCE = new UnityAds();

    @Nullable
    private static Boolean nonBehavioral;

    @Nullable
    private static Boolean userConsent;

    @Nullable
    private static String userIdentifier;

    @Nullable
    private static Boolean userOptOut;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsInitializationError;", "", "<init>", "(Ljava/lang/String;I)V", "INTERNAL_ERROR", "INVALID_ARGUMENT", "AD_BLOCKER_DETECTED", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum UnityAdsInitializationError {
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        AD_BLOCKER_DETECTED;

        private static final /* synthetic */ jh0 $ENTRIES = ek2.m(values());

        @NotNull
        public static jh0 getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsLoadError;", "", "<init>", "(Ljava/lang/String;I)V", "INITIALIZE_FAILED", "INTERNAL_ERROR", "INVALID_ARGUMENT", "NO_FILL", "TIMEOUT", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum UnityAdsLoadError {
        INITIALIZE_FAILED,
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        NO_FILL,
        TIMEOUT;

        private static final /* synthetic */ jh0 $ENTRIES = ek2.m(values());

        @NotNull
        public static jh0 getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;", "", "<init>", "(Ljava/lang/String;I)V", "SKIPPED", "COMPLETED", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum UnityAdsShowCompletionState {
        SKIPPED,
        COMPLETED;

        private static final /* synthetic */ jh0 $ENTRIES = ek2.m(values());

        @NotNull
        public static jh0 getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_INITIALIZED", "NOT_READY", "VIDEO_PLAYER_ERROR", "INVALID_ARGUMENT", "NO_CONNECTION", "ALREADY_SHOWING", "INTERNAL_ERROR", "TIMEOUT", "EXPIRED", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum UnityAdsShowError {
        NOT_INITIALIZED,
        NOT_READY,
        VIDEO_PLAYER_ERROR,
        INVALID_ARGUMENT,
        NO_CONNECTION,
        ALREADY_SHOWING,
        INTERNAL_ERROR,
        TIMEOUT,
        EXPIRED;

        private static final /* synthetic */ jh0 $ENTRIES = ek2.m(values());

        @NotNull
        public static jh0 getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.UnityAds$initialize$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcz;", "Laz2;", "<anonymous>", "(Lcz;)V"}, k = 3, mv = {2, 1, 0})
    @t50(c = "com.unity3d.ads.UnityAds$initialize$7", f = "UnityAds.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass7 extends ul2 implements zr0 {
        final /* synthetic */ InitializationConfiguration $configuration;
        final /* synthetic */ InitializationListener $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(InitializationConfiguration initializationConfiguration, InitializationListener initializationListener, dy dyVar) {
            super(2, dyVar);
            this.$configuration = initializationConfiguration;
            this.$listener = initializationListener;
        }

        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            return new AnonymousClass7(this.$configuration, this.$listener, dyVar);
        }

        @Override // defpackage.ph
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj);
            if (this.$configuration.getMediationInfo() != null) {
                MediationMetaData mediationMetaData = new MediationMetaData(ClientProperties.getApplicationContext());
                InitializationConfiguration initializationConfiguration = this.$configuration;
                mediationMetaData.setName(initializationConfiguration.getMediationInfo().getName());
                mediationMetaData.setVersion(initializationConfiguration.getMediationInfo().getVersion());
                mediationMetaData.set("adapter_version", initializationConfiguration.getMediationInfo().getAdapterVersion());
                mediationMetaData.commit();
            }
            UnityServices.initialize(ClientProperties.getApplicationContext(), this.$configuration.getGameId(), this.$configuration.getIsTestModeEnabled(), this.$configuration, this.$listener);
            return az2.a;
        }

        @Override // defpackage.zr0
        public final Object invoke(cz czVar, dy dyVar) {
            return ((AnonymousClass7) create(czVar, dyVar)).invokeSuspend(az2.a);
        }
    }

    public static /* synthetic */ void getDebugMode$annotations() {
    }

    public static /* synthetic */ void getNonBehavioral$annotations() {
    }

    public static /* synthetic */ void getToken$annotations() {
    }

    public static /* synthetic */ void getUserConsent$annotations() {
    }

    public static /* synthetic */ void getUserIdentifier$annotations() {
    }

    public static /* synthetic */ void getUserOptOut$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static /* synthetic */ void isSupported$annotations() {
    }

    @Nullable
    public static final Boolean getNonBehavioral() {
        return nonBehavioral;
    }

    @Nullable
    public static final Boolean getUserConsent() {
        return userConsent;
    }

    @Nullable
    public static final String getUserIdentifier() {
        return userIdentifier;
    }

    @Nullable
    public static final Boolean getUserOptOut() {
        return userOptOut;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$4$lambda$3$lambda$2(IUnityAdsInitializationListener iUnityAdsInitializationListener, Throwable th) {
        iUnityAdsInitializationListener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + th.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$9$lambda$8$lambda$7(IUnityAdsInitializationListener iUnityAdsInitializationListener, Throwable th) {
        iUnityAdsInitializationListener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + th.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$22$lambda$21$lambda$20(IUnityAdsLoadListener iUnityAdsLoadListener, String str, Throwable th) {
        if (str == null) {
            str = "unknown";
        }
        iUnityAdsLoadListener.onUnityAdsFailedToLoad(str, UnityAdsLoadError.INTERNAL_ERROR, "Unity Ads SDK load failed due to unexpected error: " + th.getMessage());
    }

    public static final void setNonBehavioral(@Nullable Boolean bool) {
        nonBehavioral = bool;
    }

    public static final void setUserConsent(@Nullable Boolean bool) {
        userConsent = bool;
    }

    public static final void setUserIdentifier(@Nullable String str) {
        userIdentifier = str;
    }

    public static final void setUserOptOut(@Nullable Boolean bool) {
        userOptOut = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$16$lambda$15$lambda$14(IUnityAdsShowListener iUnityAdsShowListener, String str, Throwable th) {
        if (str == null) {
            str = "unknown";
        }
        iUnityAdsShowListener.onUnityAdsShowFailure(str, UnityAdsShowError.INTERNAL_ERROR, "Unity Ads SDK show failed due to unexpected error: " + th.getMessage());
    }

    private UnityAds() {
    }

    public static final boolean getDebugMode() {
        return UnityAdsImplementation.getInstance().getDebugMode();
    }

    public static final void getToken(@NotNull TokenConfiguration configuration, @NotNull IUnityAdsTokenListener listener) {
        Object j52Var;
        configuration.getClass();
        listener.getClass();
        try {
            UnityAdsImplementation.getInstance().getToken(configuration, listener);
            j52Var = az2.a;
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        if (k52.b(j52Var) != null) {
            Utilities.wrapCustomerListener(new dz2(listener, 1));
        }
    }

    @NotNull
    public static final String getVersion() {
        String version = UnityAdsImplementation.getInstance().getVersion();
        version.getClass();
        return version;
    }

    public static final void initialize(@NotNull InitializationConfiguration configuration, @NotNull InitializationListener listener) {
        configuration.getClass();
        listener.getClass();
        tb5.t((cz) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, p32.a(cz.class))), null, null, new AnonymousClass7(configuration, listener, null), 3);
    }

    public static final boolean isInitialized() {
        return UnityAdsImplementation.getInstance().isInitialized();
    }

    public static final boolean isSupported() {
        return UnityAdsImplementation.getInstance().isSupported();
    }

    public static final void load(@Nullable String placementId, @Nullable UnityAdsLoadOptions loadOptions, @Nullable IUnityAdsLoadListener listener) {
        Object j52Var;
        try {
            IUnityAds unityAdsImplementation = UnityAdsImplementation.getInstance();
            if (loadOptions == null) {
                loadOptions = new UnityAdsLoadOptions();
            }
            unityAdsImplementation.load(placementId, loadOptions, listener);
            j52Var = az2.a;
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        Throwable thB = k52.b(j52Var);
        if (thB != null && listener != null) {
            Utilities.wrapCustomerListener(new ov1(6, listener, placementId, thB));
        }
    }

    public static final void setDebugMode(boolean z) {
        try {
            UnityAdsImplementation.getInstance().setDebugMode(z);
        } catch (Throwable unused) {
        }
    }

    public static final void show(@Nullable Activity activity, @Nullable String placementId, @Nullable UnityAdsShowOptions options, @Nullable IUnityAdsShowListener showListener) {
        Object j52Var;
        try {
            UnityAdsImplementation.getInstance().show(activity, placementId, options, showListener);
            j52Var = az2.a;
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        Throwable thB = k52.b(j52Var);
        if (thB != null && showListener != null) {
            Utilities.wrapCustomerListener(new ov1(5, showListener, placementId, thB));
        }
    }

    public static final void show(@Nullable Activity activity, @Nullable String placementId, @Nullable IUnityAdsShowListener showListener) {
        try {
            UnityAdsImplementation.getInstance().show(activity, placementId, new UnityAdsShowOptions(), showListener);
        } catch (Throwable unused) {
        }
    }

    public static final void show(@Nullable Activity activity, @Nullable String placementId, @Nullable UnityAdsShowOptions options) {
        try {
            UnityAdsImplementation.getInstance().show(activity, placementId, options, null);
        } catch (Throwable unused) {
        }
    }

    public static final void show(@Nullable Activity activity, @Nullable String placementId) {
        try {
            UnityAdsImplementation.getInstance().show(activity, placementId, new UnityAdsShowOptions(), null);
        } catch (Throwable unused) {
        }
    }

    public static final void getToken(@Nullable IUnityAdsTokenListener listener) {
        Object j52Var;
        try {
            UnityAdsImplementation.getInstance().getToken(listener);
            j52Var = az2.a;
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        if (k52.b(j52Var) == null || listener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new dz2(listener, 0));
    }

    public static final void initialize(@Nullable Context context, @Nullable String gameId, @Nullable IUnityAdsInitializationListener initializationListener) {
        Object j52Var;
        try {
            UnityAdsImplementation.getInstance().initialize(context, gameId, false, initializationListener);
            j52Var = az2.a;
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        Throwable thB = k52.b(j52Var);
        if (thB == null || initializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new ez2(initializationListener, thB, 1));
    }

    @Nullable
    public static final String getToken() {
        return UnityAdsImplementation.getInstance().getToken();
    }

    public static final void load(@Nullable String placementId, @Nullable IUnityAdsLoadListener listener) {
        load(placementId, new UnityAdsLoadOptions(), listener);
    }

    public static final void load(@Nullable String placementId) {
        try {
            load(placementId, new IUnityAdsLoadListener() { // from class: com.unity3d.ads.UnityAds$load$1$1
                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsAdLoaded(String placementId2) {
                    placementId2.getClass();
                }

                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsFailedToLoad(String placementId2, UnityAds.UnityAdsLoadError error, String message) {
                    placementId2.getClass();
                    error.getClass();
                    message.getClass();
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static final void initialize(@Nullable Context context, @Nullable String gameId, boolean testMode) {
        try {
            UnityAdsImplementation.getInstance().initialize(context, gameId, testMode, null);
        } catch (Throwable unused) {
        }
    }

    public static final void initialize(@Nullable Context context, @Nullable String gameId, boolean testMode, @Nullable IUnityAdsInitializationListener initializationListener) {
        Object j52Var;
        try {
            UnityAdsImplementation.getInstance().initialize(context, gameId, testMode, initializationListener);
            j52Var = az2.a;
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        Throwable thB = k52.b(j52Var);
        if (thB == null || initializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new ez2(initializationListener, thB, 0));
    }

    public static final void initialize(@Nullable Context context, @Nullable String gameId) {
        try {
            UnityAdsImplementation.getInstance().initialize(context, gameId, false, null);
        } catch (Throwable unused) {
        }
    }
}
