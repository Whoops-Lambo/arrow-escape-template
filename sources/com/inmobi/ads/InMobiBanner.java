package com.inmobi.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import androidx.annotation.IntRange;
import androidx.annotation.UiThread;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.media.A2;
import com.inmobi.media.AbstractC3889am;
import com.inmobi.media.AbstractC4038g4;
import com.inmobi.media.AbstractC4151k6;
import com.inmobi.media.AbstractC4211ma;
import com.inmobi.media.AbstractC4221mk;
import com.inmobi.media.AbstractC4230n1;
import com.inmobi.media.AbstractC4249nk;
import com.inmobi.media.AbstractC4342r2;
import com.inmobi.media.AbstractC4506x1;
import com.inmobi.media.AbstractC4507x2;
import com.inmobi.media.C3913bi;
import com.inmobi.media.C4111im;
import com.inmobi.media.C4207m6;
import com.inmobi.media.C4370s2;
import com.inmobi.media.C4398t2;
import com.inmobi.media.C4452v1;
import com.inmobi.media.C4479w1;
import com.inmobi.media.C4480w2;
import com.inmobi.media.C4534y2;
import com.inmobi.media.E9;
import com.inmobi.media.Eg;
import com.inmobi.media.EnumC4223mm;
import com.inmobi.media.EnumC4259o2;
import com.inmobi.media.EnumC4453v2;
import com.inmobi.media.F9;
import com.inmobi.media.G9;
import com.inmobi.media.HandlerC4561z2;
import com.inmobi.media.Kc;
import com.inmobi.media.U1;
import com.inmobi.media.Z9;
import com.inmobi.media.ads.network.common.model.Ad;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.ironsource.C4681c3;
import com.ironsource.Ue;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.singular.sdk.internal.Constants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.az2;
import defpackage.c91;
import defpackage.d21;
import defpackage.dt1;
import defpackage.ek2;
import defpackage.jh0;
import defpackage.n30;
import defpackage.pv1;
import defpackage.q41;
import defpackage.qh1;
import defpackage.s71;
import defpackage.sr0;
import defpackage.tb5;
import defpackage.tk0;
import defpackage.v5;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u0089\u00012\u00020\u0001:\u0006\u008a\u0001\u008b\u0001\u008c\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0014J#\u0010\u0018\u001a\u00020\u000b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u000b¢\u0006\u0004\b/\u0010\rJ\u000f\u00100\u001a\u00020\u000bH\u0014¢\u0006\u0004\b0\u0010\rJ\u000f\u00101\u001a\u00020\u000bH\u0014¢\u0006\u0004\b1\u0010\rJ\u0015\u00104\u001a\u00020\u000b2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J#\u00108\u001a\u00020\u000b2\b\b\u0001\u00106\u001a\u00020'2\b\b\u0001\u00107\u001a\u00020'H\u0007¢\u0006\u0004\b8\u00109J#\u0010;\u001a\u00020\u000b2\b\b\u0001\u00106\u001a\u00020'2\b\b\u0001\u00107\u001a\u00020'H\u0000¢\u0006\u0004\b:\u00109J\u000f\u0010<\u001a\u00020\u000bH\u0007¢\u0006\u0004\b<\u0010\rJ\u001f\u0010@\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020'H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020#H\u0016¢\u0006\u0004\bC\u0010&J\u000f\u0010E\u001a\u00020\u000bH\u0000¢\u0006\u0004\bD\u0010\rJ\u000f\u0010G\u001a\u00020\u000bH\u0001¢\u0006\u0004\bF\u0010\rJ\r\u0010H\u001a\u00020\u000b¢\u0006\u0004\bH\u0010\rJ\r\u0010I\u001a\u00020\u000b¢\u0006\u0004\bI\u0010\rJ\r\u0010J\u001a\u00020\b¢\u0006\u0004\bJ\u0010KJ\u0015\u0010N\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\u0015\u0010R\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bR\u0010SJ\u001d\u0010V\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020'2\u0006\u0010U\u001a\u00020P¢\u0006\u0004\bV\u0010WJ\r\u0010X\u001a\u00020#¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u000bH\u0007¢\u0006\u0004\bZ\u0010\rR$\u0010b\u001a\u0004\u0018\u00010[8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR$\u0010h\u001a\u0004\u0018\u00010L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010OR\"\u0010p\u001a\u00020i8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010x\u001a\u0004\u0018\u00010q8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u001a\u0010~\u001a\u00020y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R&\u0010\u0085\u0001\u001a\u00020\u007f8\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u0012\u0005\b\u0084\u0001\u0010\r\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0017\u0010\u0088\u0001\u001a\u00020\u00168BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u008d\u0001"}, d2 = {"Lcom/inmobi/ads/InMobiBanner;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "placementId", "(Landroid/content/Context;J)V", "Laz2;", "getSignals", "()V", "", Ue.n, "load", "([B)V", "refreshBanner$media_release", "refreshBanner", "(Landroid/content/Context;)V", "", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "setExtras", "(Ljava/util/Map;)V", "keywords", "setKeywords", "(Ljava/lang/String;)V", "contentUrl", "setContentUrl", "Lcom/inmobi/ads/listeners/BannerAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lcom/inmobi/ads/listeners/BannerAdEventListener;)V", "", "enabled", "setEnableAutoRefresh", "(Z)V", "", C4681c3.b, "setRefreshInterval", "(I)V", "Lcom/inmobi/ads/InMobiBanner$AnimationType;", "animationType", "setAnimationType", "(Lcom/inmobi/ads/InMobiBanner$AnimationType;)V", "disableHardwareAcceleration", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/inmobi/ads/WatermarkData;", "watermarkData", "setWatermarkData", "(Lcom/inmobi/ads/WatermarkData;)V", "widthInDp", "heightInDp", "setBannerSize", "(II)V", "updateLayoutParamsForResolvedSize$media_release", "updateLayoutParamsForResolvedSize", "setupBannerSizeObserver", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "hasWindowFocus", "onWindowFocusChanged", "scheduleRefresh$media_release", "scheduleRefresh", "swapAdUnitsAndDisplayAd$media_release", "swapAdUnitsAndDisplayAd", CampaignEx.JSON_NATIVE_VIDEO_RESUME, CampaignEx.JSON_NATIVE_VIDEO_PAUSE, "getPlacementId", "()J", "Lcom/inmobi/ads/banner/AudioListener;", "audioListener", "setAudioListener", "(Lcom/inmobi/ads/banner/AudioListener;)V", "", "minBidToWin", "notifyWin", "(D)V", "lossReason", "auctionPrice", "notifyLoss", "(ID)V", "isAudioAd", "()Z", "destroy", "Lcom/inmobi/media/r2;", "b", "Lcom/inmobi/media/r2;", "getMPubListener$media_release", "()Lcom/inmobi/media/r2;", "setMPubListener$media_release", "(Lcom/inmobi/media/r2;)V", "mPubListener", "c", "Lcom/inmobi/ads/banner/AudioListener;", "getMAudioListener$media_release", "()Lcom/inmobi/ads/banner/AudioListener;", "setMAudioListener$media_release", "mAudioListener", "Lcom/inmobi/media/o2;", "d", "Lcom/inmobi/media/o2;", "getAudioStatusInternal$media_release", "()Lcom/inmobi/media/o2;", "setAudioStatusInternal$media_release", "(Lcom/inmobi/media/o2;)V", "audioStatusInternal", "Lcom/inmobi/media/A2;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Lcom/inmobi/media/A2;", "getMAdManager$media_release", "()Lcom/inmobi/media/A2;", "setMAdManager$media_release", "(Lcom/inmobi/media/A2;)V", "mAdManager", "Lcom/inmobi/media/bi;", "o", "Lcom/inmobi/media/bi;", "getMPubSettings$media_release", "()Lcom/inmobi/media/bi;", "mPubSettings", "Lcom/inmobi/ads/PreloadManager;", "p", "Lcom/inmobi/ads/PreloadManager;", "getPreloadManager", "()Lcom/inmobi/ads/PreloadManager;", "getPreloadManager$annotations", "preloadManager", "getFrameSizeString", "()Ljava/lang/String;", "frameSizeString", "Companion", "AnimationType", "com/inmobi/media/E9", "a", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiBanner extends RelativeLayout {

    @NotNull
    public static final E9 Companion = new E9();
    public c91 a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public AbstractC4342r2 mPubListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public AudioListener mAudioListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public EnumC4259o2 audioStatusInternal;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public A2 mAdManager;
    public final a f;
    public int g;
    public boolean h;
    public final HandlerC4561z2 i;
    public int j;
    public int k;
    public AnimationType l;
    public long m;
    public WeakReference n;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final C3913bi mPubSettings;
    public final d p;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/inmobi/ads/InMobiBanner$AnimationType;", "", "<init>", "(Ljava/lang/String;I)V", "ANIMATION_OFF", "ROTATE_HORIZONTAL_AXIS", "ANIMATION_ALPHA", "ROTATE_VERTICAL_AXIS", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum AnimationType {
        ANIMATION_OFF,
        ROTATE_HORIZONTAL_AXIS,
        ANIMATION_ALPHA,
        ROTATE_VERTICAL_AXIS;

        private static final /* synthetic */ jh0 $ENTRIES = ek2.m(values());

        @NotNull
        public static jh0 getEntries() {
            return $ENTRIES;
        }
    }

    public static /* synthetic */ void getPreloadManager$annotations() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.i, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void updateLayoutParamsForResolvedSize$media_release(@IntRange int widthInDp, @IntRange int heightInDp) {
        int iB = (int) (AbstractC4151k6.b() * widthInDp);
        int iB2 = (int) (AbstractC4151k6.b() * heightInDp);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = iB;
            layoutParams.height = iB2;
        } else {
            layoutParams = new RelativeLayout.LayoutParams(iB, iB2);
        }
        setLayoutParams(layoutParams);
        requestLayout();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/ads/InMobiBanner$a;", "Lcom/inmobi/media/y2;", "Lcom/inmobi/ads/InMobiBanner;", "banner", "<init>", "(Lcom/inmobi/ads/InMobiBanner;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "Laz2;", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "status", "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "", "getType", "()B", "type", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C4534y2 {
        @Override // com.inmobi.media.C4534y2, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InMobiBanner inMobiBanner) {
            super(inMobiBanner);
            inMobiBanner.getClass();
        }

        @Override // com.inmobi.media.C4534y2, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(@NotNull InMobiAdRequestStatus status) {
            status.getClass();
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner == null) {
                return;
            }
            AbstractC4342r2 mPubListener = inMobiBanner.getMPubListener();
            if (mPubListener != null) {
                mPubListener.a(inMobiBanner, status);
            }
            inMobiBanner.scheduleRefresh$media_release();
        }

        @Override // com.inmobi.media.C4534y2, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(@NotNull AdMetaInfo info) {
            info.getClass();
            super.onAdFetchSuccessful(info);
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner != null) {
                try {
                    A2 mAdManager = inMobiBanner.getMAdManager();
                    if (mAdManager != null) {
                        mAdManager.a(inMobiBanner);
                    }
                    A2 mAdManager2 = inMobiBanner.getMAdManager();
                    if (mAdManager2 != null) {
                        mAdManager2.o();
                    }
                } catch (IllegalStateException e) {
                    String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
                    strAccess$getTAG$cp.getClass();
                    Kc.a((byte) 1, strAccess$getTAG$cp, e.getMessage());
                    AbstractC4342r2 mPubListener = inMobiBanner.getMPubListener();
                    if (mPubListener != null) {
                        mPubListener.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    }
                }
            }
        }
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiBanner";
    }

    public static final az2 e() {
        String str = U1.b;
        if (str == null) {
            str = "";
        }
        LinkedHashMap linkedHashMapZ = qh1.Z(new dt1("trigger", str));
        C4111im c4111im = C4111im.a;
        C4111im.b("BannerSetBannerSizeUsed", linkedHashMapZ, EnumC4223mm.SDK);
        return az2.a;
    }

    private final String getFrameSizeString() {
        return this.j + "x" + this.k;
    }

    public final void a(PublisherCallbacks publisherCallbacks, String str, boolean z) {
        Z9 z9;
        Z9 z10;
        Z9 z11;
        Z9 z12;
        Z9 z13;
        try {
            C3913bi c3913bi = this.mPubSettings;
            c3913bi.getClass();
            str.getClass();
            c3913bi.h = str;
            A2 a2 = this.mAdManager;
            if (a2 == null || !a2.l()) {
                f();
                d();
                Context context = getContext();
                context.getClass();
                a(this, context);
                A2 a3 = this.mAdManager;
                if (a3 != null) {
                    a3.g();
                }
                A2 a4 = this.mAdManager;
                if (a4 != null && (z10 = a4.f) != null) {
                    z10.a("InMobiBanner", "load called - placementType - " + str + " " + this);
                }
                a("load", new q41(this, publisherCallbacks, z));
                return;
            }
            A2 a5 = this.mAdManager;
            if (a5 != null) {
                a5.g();
            }
            A2 a6 = this.mAdManager;
            if (a6 != null && (z13 = a6.f) != null) {
                z13.a("InMobiBanner", "load called - placementType - " + str + " " + this);
            }
            A2 a7 = this.mAdManager;
            if (a7 != null && (z12 = a7.f) != null) {
                z12.b("InMobiBanner", "load already in progress");
            }
            A2 a8 = this.mAdManager;
            if (a8 != null) {
                a8.b((short) 2169);
            }
            AbstractC4342r2 abstractC4342r2 = this.mPubListener;
            if (abstractC4342r2 != null) {
                abstractC4342r2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
            }
            A2 a9 = this.mAdManager;
            if (a9 != null && (z11 = a9.f) != null) {
                z11.b("InMobiBanner", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
            }
            Kc.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
        } catch (Exception e) {
            A2 a10 = this.mAdManager;
            if (a10 != null) {
                a10.a((short) 2172);
            }
            AbstractC4342r2 abstractC4342r3 = this.mPubListener;
            if (abstractC4342r3 != null) {
                abstractC4342r3.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            A2 a11 = this.mAdManager;
            if (a11 == null || (z9 = a11.f) == null) {
                return;
            }
            z9.a("InMobiBanner", "Load failed with unexpected error: ", e);
        }
    }

    public final boolean c() {
        return this.j > 0 && this.k > 0;
    }

    public final void d() {
        String str;
        C3913bi c3913bi = this.mPubSettings;
        C4452v1 c4452v1A = AbstractC4506x1.a(c3913bi.h, c3913bi.d);
        C3913bi c3913bi2 = this.mPubSettings;
        c3913bi2.d = c4452v1A.a;
        C4479w1 c4479w1 = c4452v1A.b;
        if (c4479w1 != null) {
            str = c4479w1.a + "x" + c4479w1.b;
        } else {
            str = null;
        }
        c3913bi2.b = str;
        C4479w1 c4479w2 = c4452v1A.b;
        if (c4479w2 != null) {
            updateLayoutParamsForResolvedSize$media_release(c4479w2.a, c4479w2.b);
        }
    }

    public final void disableHardwareAcceleration() {
        this.mPubSettings.e = true;
    }

    @NotNull
    /* JADX INFO: renamed from: getAudioStatusInternal$media_release, reason: from getter */
    public final EnumC4259o2 getAudioStatusInternal() {
        return this.audioStatusInternal;
    }

    @Nullable
    /* JADX INFO: renamed from: getMAdManager$media_release, reason: from getter */
    public final A2 getMAdManager() {
        return this.mAdManager;
    }

    @Nullable
    /* JADX INFO: renamed from: getMAudioListener$media_release, reason: from getter */
    public final AudioListener getMAudioListener() {
        return this.mAudioListener;
    }

    @Nullable
    /* JADX INFO: renamed from: getMPubListener$media_release, reason: from getter */
    public final AbstractC4342r2 getMPubListener() {
        return this.mPubListener;
    }

    @NotNull
    /* JADX INFO: renamed from: getMPubSettings$media_release, reason: from getter */
    public final C3913bi getMPubSettings() {
        return this.mPubSettings;
    }

    public final long getPlacementId() {
        return this.mPubSettings.a;
    }

    @NotNull
    public final PreloadManager getPreloadManager() {
        return this.p;
    }

    public final void getSignals() {
        A2 a2 = this.mAdManager;
        if (a2 != null) {
            a2.a(this.f);
        }
    }

    public final boolean isAudioAd() {
        C4398t2 c4398t2;
        Ad adB;
        A2 a2 = this.mAdManager;
        if (a2 == null || (c4398t2 = a2.m) == null || (adB = c4398t2.b(0)) == null) {
            return false;
        }
        MetaInfo metaInfo = adB.getMetaInfo();
        return s71.b(metaInfo != null ? metaInfo.getCreativeType() : null, "audio");
    }

    public final void notifyLoss(int lossReason, double auctionPrice) {
        String strA = "loss notification failed to trigger";
        if (this.mAdManager == null) {
            Kc.a((byte) 1, "InMobi", "loss notification failed to trigger");
        }
        A2 a2 = this.mAdManager;
        if (a2 != null) {
            if (a2.f() != null) {
                AbstractC4230n1 abstractC4230n1F = a2.f();
                strA = abstractC4230n1F != null ? abstractC4230n1F.a(lossReason, auctionPrice) : null;
            }
            if (strA == null || strA.length() <= 0) {
                return;
            }
            Kc.a((byte) 1, "InMobi", strA);
        }
    }

    public final void notifyWin(double minBidToWin) {
        String strA = "win notification failed to trigger";
        if (this.mAdManager == null) {
            Kc.a((byte) 1, "InMobi", "win notification failed to trigger");
        }
        A2 a2 = this.mAdManager;
        if (a2 != null) {
            if (a2.f() != null) {
                AbstractC4230n1 abstractC4230n1F = a2.f();
                strA = abstractC4230n1F != null ? abstractC4230n1F.a(minBidToWin) : null;
            }
            if (strA == null || strA.length() <= 0) {
                return;
            }
            Kc.a((byte) 1, "InMobi", strA);
        }
    }

    public final void pause() {
        Z9 z9;
        A2 a2;
        try {
            if (this.n != null || (a2 = this.mAdManager) == null) {
                return;
            }
            a2.m();
        } catch (Exception e) {
            A2 a3 = this.mAdManager;
            if (a3 == null || (z9 = a3.f) == null) {
                return;
            }
            z9.a("InMobiBanner", "SDK encountered unexpected error in pausing ad; ", e);
        }
    }

    public final void refreshBanner$media_release() {
        a((PublisherCallbacks) this.f, "NonAB", true);
    }

    public final void resume() {
        Z9 z9;
        A2 a2;
        try {
            if (this.n != null || (a2 = this.mAdManager) == null) {
                return;
            }
            a2.p();
        } catch (Exception e) {
            A2 a3 = this.mAdManager;
            if (a3 == null || (z9 = a3.f) == null) {
                return;
            }
            z9.a("InMobiBanner", "SDK encountered unexpected error in resuming ad; ", e);
        }
    }

    public final void setBannerSize(@IntRange int widthInDp, @IntRange int heightInDp) {
        if (widthInDp > 0 && heightInDp > 0) {
            this.j = widthInDp;
            this.k = heightInDp;
        }
        Eg.a("BannerSetBannerSizeUsed", new d21(6));
    }

    public final void setEnableAutoRefresh(boolean enabled) {
        Z9 z9;
        try {
            if (this.h == enabled) {
                return;
            }
            this.h = enabled;
            if (enabled) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e) {
            A2 a2 = this.mAdManager;
            if (a2 == null || (z9 = a2.f) == null) {
                return;
            }
            z9.a("InMobiBanner", "Setting up auto-refresh failed with unexpected error: ", e);
        }
    }

    public final void setExtras(@Nullable Map<String, String> extras) {
        if (extras != null) {
            String str = extras.get("tp");
            if (!TextUtils.isEmpty(str)) {
                AbstractC4249nk.b = str;
            }
            String str2 = extras.get("tp-v");
            if (!TextUtils.isEmpty(str2)) {
                AbstractC4249nk.a = str2;
            }
        }
        this.mPubSettings.d = extras;
    }

    public final void setKeywords(@Nullable String keywords) {
        this.mPubSettings.c = keywords;
    }

    public final void setMAdManager$media_release(@Nullable A2 a2) {
        this.mAdManager = a2;
    }

    public final void setMAudioListener$media_release(@Nullable AudioListener audioListener) {
        this.mAudioListener = audioListener;
    }

    public final void setMPubListener$media_release(@Nullable AbstractC4342r2 abstractC4342r2) {
        this.mPubListener = abstractC4342r2;
    }

    public final void setRefreshInterval(int refreshInterval) {
        Z9 z9;
        try {
            C3913bi c3913bi = this.mPubSettings;
            c3913bi.getClass();
            c3913bi.h = "NonAB";
            Context context = getContext();
            context.getClass();
            a(this, context);
            A2 a2 = this.mAdManager;
            this.g = a2 != null ? a2.a(refreshInterval, this.g) : 0;
        } catch (Exception e) {
            A2 a3 = this.mAdManager;
            if (a3 == null || (z9 = a3.f) == null) {
                return;
            }
            z9.a("InMobiBanner", "Setting refresh interval failed with unexpected error: ", e);
        }
    }

    @UiThread
    public final void swapAdUnitsAndDisplayAd$media_release() {
        Z9 z9;
        A2 a2 = this.mAdManager;
        if (a2 != null) {
            a2.s();
        }
        try {
            Animation animationA = b.a(this.l, getWidth(), getHeight());
            A2 a3 = this.mAdManager;
            if (a3 != null) {
                a3.b(this);
            }
            if (animationA != null) {
                startAnimation(animationA);
            }
        } catch (Exception e) {
            A2 a4 = this.mAdManager;
            if (a4 == null || (z9 = a4.f) == null) {
                return;
            }
            z9.a("InMobiBanner", "Unexpected error while displaying Banner Ad : ", e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiBanner(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        int iK;
        int i;
        boolean z;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.audioStatusInternal = EnumC4259o2.d;
        this.f = new a(this);
        this.h = true;
        this.l = AnimationType.ROTATE_HORIZONTAL_AXIS;
        C3913bi c3913bi = new C3913bi();
        this.mPubSettings = c3913bi;
        this.p = new d(this);
        if (AbstractC4221mk.c()) {
            if (context instanceof Activity) {
                this.n = new WeakReference(context);
            }
            this.mAdManager = new A2();
            String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "placementId");
            String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", C4681c3.b);
            if (attributeValue != null) {
                long jA = a(attributeValue);
                if (jA != Long.MIN_VALUE) {
                    c3913bi.a = jA;
                } else {
                    throw new InvalidPlacementIdException();
                }
            }
            Context context2 = getContext();
            context2.getClass();
            a(this, context2);
            A2 a2 = this.mAdManager;
            if (a2 != null) {
                iK = a2.k();
            } else {
                iK = 0;
            }
            this.g = iK;
            this.i = new HandlerC4561z2(this);
            if (attributeValue2 != null) {
                try {
                    int length = attributeValue2.length() - 1;
                    int i2 = 0;
                    boolean z2 = false;
                    while (i2 <= length) {
                        if (!z2) {
                            i = i2;
                        } else {
                            i = length;
                        }
                        if (s71.h(attributeValue2.charAt(i), 32) <= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z2) {
                            if (!z) {
                                z2 = true;
                            } else {
                                i2++;
                            }
                        } else if (!z) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    setRefreshInterval(Integer.parseInt(attributeValue2.subSequence(i2, length + 1).toString()));
                    return;
                } catch (NumberFormatException unused) {
                    Kc.a((byte) 1, "InMobiBanner", "Refresh interval value supplied in XML layout is not valid. Falling back to default value.");
                    return;
                }
            }
            return;
        }
        throw new SdkNotInitializedException("InMobiBanner");
    }

    public static final void access$captureStandardBannerSize(InMobiBanner inMobiBanner, int i, int i2) {
        inMobiBanner.getClass();
        if (i > 0 && i2 > 0) {
            inMobiBanner.j = i;
            inMobiBanner.k = i2;
        }
    }

    public final boolean b(String str) {
        Z9 z9;
        Z9 z10;
        if (!c()) {
            if (getLayoutParams() == null) {
                A2 a2 = this.mAdManager;
                if (a2 != null && (z10 = a2.f) != null) {
                    z10.b("InMobiBanner", pv1.o("The layout params of the banner must be set before calling ", str, " or call setBannerSize(int widthInDp, int heightInDp) before ", str));
                }
                return false;
            }
            if (getLayoutParams().width != -2 && getLayoutParams().height != -2) {
                f();
                return true;
            }
            A2 a3 = this.mAdManager;
            if (a3 != null && (z9 = a3.f) != null) {
                n30.v("The height or width of a Banner ad can't be WRAP_CONTENT or call setBannerSize(int widthInDp, int heightInDp) before ", str, z9, "InMobiBanner");
            }
            return false;
        }
        return true;
    }

    @UiThread
    public final void destroy() {
        a();
        c91 c91Var = this.a;
        if (c91Var != null) {
            c91Var.cancel(null);
        }
        this.a = null;
        removeAllViews();
        A2 a2 = this.mAdManager;
        if (a2 != null) {
            a2.j();
        }
        this.mPubListener = null;
    }

    public final void f() {
        if (getLayoutParams() != null && !c()) {
            int iB = AbstractC4038g4.b(getLayoutParams().width / AbstractC4151k6.b());
            int iB2 = AbstractC4038g4.b(getLayoutParams().height / AbstractC4151k6.b());
            if (iB > 0 && iB2 > 0) {
                this.j = iB;
                this.k = iB2;
            }
        }
    }

    public final void load(@Nullable byte[] response) {
        b();
        C3913bi c3913bi = this.mPubSettings;
        c3913bi.getClass();
        c3913bi.h = "AB";
        f();
        d();
        A2 a2 = this.mAdManager;
        if (a2 == null || a2.k == null || a2.l == null || a2.a == 0) {
            Context context = getContext();
            context.getClass();
            a(this, context);
        }
        A2 a3 = this.mAdManager;
        if (a3 != null) {
            a3.g();
        }
        a("load(byte[])", new v5(21, this, response));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Z9 z9;
        try {
            super.onAttachedToWindow();
            c91 c91Var = this.a;
            if (c91Var != null) {
                c91Var.cancel(null);
            }
            this.a = null;
            A2 a2 = this.mAdManager;
            if (a2 != null) {
                a2.n();
            }
            f();
            if (!c()) {
                setupBannerSizeObserver();
            }
            scheduleRefresh$media_release();
            if (Build.VERSION.SDK_INT >= 29) {
                C4207m6 c4207m6 = AbstractC4151k6.a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                rootWindowInsets.getClass();
                AbstractC4151k6.a(rootWindowInsets, context);
            }
        } catch (Exception e) {
            A2 a3 = this.mAdManager;
            if (a3 != null && (z9 = a3.f) != null) {
                z9.a("InMobiBanner", "InMobiBanner#onAttachedToWindow() handler threw unexpected error: ", e);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Z9 z9;
        String str;
        EnumC4453v2 enumC4453v2;
        try {
            super.onDetachedFromWindow();
            a();
            A2 a2 = this.mAdManager;
            if (a2 != null) {
                a2.t();
            }
            Map map = this.mPubSettings.d;
            if (map != null) {
                str = (String) map.get("tp");
            } else {
                str = null;
            }
            C4480w2 c4480w2A = AbstractC4507x2.a(str);
            if (c4480w2A.a) {
                enumC4453v2 = EnumC4453v2.RELEASE;
            } else if (c4480w2A.b) {
                enumC4453v2 = EnumC4453v2.OBSERVE;
            } else {
                enumC4453v2 = EnumC4453v2.OFF;
            }
            EnumC4453v2 enumC4453v3 = enumC4453v2;
            if (enumC4453v3 != EnumC4453v2.OFF) {
                long j = AbstractC4507x2.a(str).c;
                WeakReference weakReference = new WeakReference(this);
                c91 c91Var = this.a;
                if (c91Var != null) {
                    c91Var.cancel(null);
                }
                this.a = tb5.t(AbstractC4211ma.g, null, null, new F9(j, weakReference, enumC4453v3, null), 3);
            }
        } catch (Exception e) {
            A2 a3 = this.mAdManager;
            if (a3 != null && (z9 = a3.f) != null) {
                z9.a("InMobiBanner", "InMobiBanner.onDetachedFromWindow() handler threw unexpected error: ", e);
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int visibility) {
        Z9 z9;
        changedView.getClass();
        try {
            super.onVisibilityChanged(changedView, visibility);
            if (visibility == 0) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e) {
            A2 a2 = this.mAdManager;
            if (a2 != null && (z9 = a2.f) != null) {
                z9.a("InMobiBanner", "InMobiBanner$1.onVisibilityChanged() handler threw unexpected error: ", e);
            }
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        Z9 z9;
        try {
            super.onWindowFocusChanged(hasWindowFocus);
            if (hasWindowFocus) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e) {
            A2 a2 = this.mAdManager;
            if (a2 != null && (z9 = a2.f) != null) {
                z9.a("InMobiBanner", "InMobiBanner$1.onWindowFocusChanged() handler threw unexpected error: ", e);
            }
        }
    }

    public final void scheduleRefresh$media_release() {
        HandlerC4561z2 handlerC4561z2;
        if (isShown() && hasWindowFocus()) {
            HandlerC4561z2 handlerC4561z3 = this.i;
            if (handlerC4561z3 != null) {
                handlerC4561z3.removeMessages(1);
            }
            A2 a2 = this.mAdManager;
            if (a2 != null && a2.i() && this.h && (handlerC4561z2 = this.i) != null) {
                handlerC4561z2.sendEmptyMessageDelayed(1, this.g * 1000);
            }
        }
    }

    public final void setAnimationType(@NotNull AnimationType animationType) {
        animationType.getClass();
        this.l = animationType;
    }

    public final void setAudioListener(@NotNull AudioListener audioListener) {
        AudioStatus audioStatus;
        audioListener.getClass();
        this.mAudioListener = audioListener;
        EnumC4259o2 enumC4259o2 = this.audioStatusInternal;
        if (enumC4259o2 != EnumC4259o2.d) {
            EnumC4259o2.b.getClass();
            enumC4259o2.getClass();
            int iOrdinal = enumC4259o2.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    audioStatus = AudioStatus.COMPLETED;
                } else {
                    audioStatus = AudioStatus.PAUSED;
                }
            } else {
                audioStatus = AudioStatus.PLAYING;
            }
            audioListener.onAudioStatusChanged(this, audioStatus);
        }
    }

    public final void setAudioStatusInternal$media_release(@NotNull EnumC4259o2 enumC4259o2) {
        enumC4259o2.getClass();
        this.audioStatusInternal = enumC4259o2;
    }

    public final void setContentUrl(@NotNull String contentUrl) {
        contentUrl.getClass();
        this.mPubSettings.f = contentUrl;
    }

    public final void setListener(@NotNull BannerAdEventListener listener) {
        listener.getClass();
        this.mPubListener = new C4370s2(listener);
    }

    public final void setWatermarkData(@NotNull WatermarkData watermarkData) {
        watermarkData.getClass();
        A2 a2 = this.mAdManager;
        if (a2 != null) {
            a2.a(watermarkData);
        }
    }

    @TargetApi(16)
    public final void setupBannerSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new G9(this));
    }

    @UiThread
    public final void load() {
        b();
        a((PublisherCallbacks) this.f, "NonAB", false);
    }

    @UiThread
    public final void load(@NotNull Context context) {
        context.getClass();
        b();
        this.n = context instanceof Activity ? new WeakReference(context) : null;
        a((PublisherCallbacks) this.f, "NonAB", false);
    }

    public final boolean b() {
        Z9 z9;
        A2 a2 = this.mAdManager;
        if (a2 == null || (z9 = a2.f) == null) {
            return true;
        }
        z9.c("InMobiBanner", "checkStateAndLogError");
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiBanner(@NotNull Context context, long j) {
        super(context);
        context.getClass();
        this.audioStatusInternal = EnumC4259o2.d;
        this.f = new a(this);
        this.h = true;
        this.l = AnimationType.ROTATE_HORIZONTAL_AXIS;
        C3913bi c3913bi = new C3913bi();
        this.mPubSettings = c3913bi;
        this.p = new d(this);
        if (AbstractC4221mk.c()) {
            if (context instanceof Activity) {
                this.n = new WeakReference(context);
            }
            this.mAdManager = new A2();
            c3913bi.a = j;
            a(this, context);
            A2 a2 = this.mAdManager;
            this.g = a2 != null ? a2.k() : 0;
            this.i = new HandlerC4561z2(this);
            return;
        }
        throw new SdkNotInitializedException("InMobiBanner");
    }

    public static final az2 a(InMobiBanner inMobiBanner, byte[] bArr) {
        Z9 z9;
        A2 a2 = inMobiBanner.mAdManager;
        if (a2 != null && (z9 = a2.f) != null) {
            z9.c("InMobiBanner", "load with response");
        }
        A2 a3 = inMobiBanner.mAdManager;
        if (a3 != null) {
            a3.a(bArr, inMobiBanner.f);
        }
        return az2.a;
    }

    public static final az2 a(InMobiBanner inMobiBanner, PublisherCallbacks publisherCallbacks, boolean z) {
        A2 a2;
        inMobiBanner.a();
        long j = inMobiBanner.m;
        if (j == 0 || (a2 = inMobiBanner.mAdManager) == null || a2.a(j)) {
            inMobiBanner.m = SystemClock.elapsedRealtime();
            A2 a3 = inMobiBanner.mAdManager;
            if (a3 != null) {
                a3.a(publisherCallbacks, inMobiBanner.getFrameSizeString(), z);
            }
        }
        return az2.a;
    }

    public final void a(String str, sr0 sr0Var) {
        Z9 z9;
        Z9 z10;
        A2 a2 = this.mAdManager;
        if (a2 != null && (z10 = a2.f) != null) {
            z10.c("InMobiBanner", "validateSizeAndLoad");
        }
        if (!b(str)) {
            A2 a3 = this.mAdManager;
            if (a3 != null && (z9 = a3.f) != null) {
                z9.b("InMobiBanner", "invalid banner size. fail.");
            }
            A2 a4 = this.mAdManager;
            if (a4 != null) {
                a4.a((short) 2170);
            }
            AbstractC4342r2 abstractC4342r2 = this.mPubListener;
            if (abstractC4342r2 != null) {
                abstractC4342r2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
                return;
            }
            return;
        }
        if (!c()) {
            ((Handler) AbstractC3889am.a.getValue()).postDelayed(new tk0(18, this, sr0Var), 200L);
        } else {
            sr0Var.invoke();
        }
    }

    public static final void a(InMobiBanner inMobiBanner, sr0 sr0Var) {
        Z9 z9;
        Z9 z10;
        try {
            if (inMobiBanner.c()) {
                sr0Var.invoke();
                return;
            }
            A2 a2 = inMobiBanner.mAdManager;
            if (a2 != null && (z10 = a2.f) != null) {
                z10.b("InMobiBanner", "The height or width of the banner can not be determined");
            }
            A2 a3 = inMobiBanner.mAdManager;
            if (a3 != null) {
                a3.a((short) 2171);
            }
            AbstractC4342r2 abstractC4342r2 = inMobiBanner.mPubListener;
            if (abstractC4342r2 != null) {
                abstractC4342r2.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
            }
        } catch (Exception e) {
            A2 a4 = inMobiBanner.mAdManager;
            if (a4 != null) {
                a4.a((short) 2172);
            }
            AbstractC4342r2 abstractC4342r3 = inMobiBanner.mPubListener;
            if (abstractC4342r3 != null) {
                abstractC4342r3.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            A2 a5 = inMobiBanner.mAdManager;
            if (a5 == null || (z9 = a5.f) == null) {
                return;
            }
            z9.a("InMobiBanner", "InMobiBanner$4.run() threw unexpected error: ", e);
        }
    }

    public static void a(InMobiBanner inMobiBanner, Context context) {
        int iA;
        A2 a2 = inMobiBanner.mAdManager;
        if (a2 != null) {
            a2.a(context, inMobiBanner.mPubSettings, inMobiBanner.getFrameSizeString());
        }
        A2 a3 = inMobiBanner.mAdManager;
        if (a3 != null) {
            int i = inMobiBanner.g;
            iA = a3.a(i, i);
        } else {
            iA = 0;
        }
        inMobiBanner.g = iA;
    }

    public final void a() {
        HandlerC4561z2 handlerC4561z2 = this.i;
        if (handlerC4561z2 != null) {
            handlerC4561z2.removeMessages(1);
        }
    }

    public final long a(String str) {
        Z9 z9;
        Z9 z10;
        Z9 z11;
        try {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = s71.h(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            StringBuilder sb = new StringBuilder(str.subSequence(i, length + 1).toString());
            if ("plid-".equalsIgnoreCase(sb.substring(0, 5))) {
                String strSubstring = sb.substring(5, sb.length());
                strSubstring.getClass();
                int length2 = strSubstring.length() - 1;
                int i2 = 0;
                boolean z3 = false;
                while (i2 <= length2) {
                    boolean z4 = s71.h(strSubstring.charAt(!z3 ? i2 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        }
                        length2--;
                    } else if (z4) {
                        i2++;
                    } else {
                        z3 = true;
                    }
                }
                return Long.parseLong(strSubstring.subSequence(i2, length2 + 1).toString());
            }
            A2 a2 = this.mAdManager;
            if (a2 != null && (z11 = a2.f) != null) {
                z11.b("InMobiBanner", "Invalid Placement id: " + str);
                return Long.MIN_VALUE;
            }
            return Long.MIN_VALUE;
        } catch (NumberFormatException unused) {
            A2 a3 = this.mAdManager;
            if (a3 != null && (z10 = a3.f) != null) {
                n30.v("Invalid Placement id: ", str, z10, "InMobiBanner");
            }
        } catch (StringIndexOutOfBoundsException unused2) {
            A2 a4 = this.mAdManager;
            if (a4 != null && (z9 = a4.f) != null) {
                n30.v("Invalid Placement id: ", str, z9, "InMobiBanner");
            }
        }
    }
}
