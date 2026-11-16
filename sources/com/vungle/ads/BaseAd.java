package com.vungle.ads;

import android.content.Context;
import android.os.Handler;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C5074y2;
import com.ironsource.Hd;
import com.ironsource.Yf;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.singular.sdk.internal.Constants;
import com.vungle.ads.internal.i2;
import com.vungle.ads.internal.load.a;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.model.l;
import com.vungle.ads.internal.o1;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.r;
import com.vungle.ads.internal.signals.j;
import com.vungle.ads.internal.signals.m;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.y;
import defpackage.cm2;
import defpackage.d;
import defpackage.eu;
import defpackage.gd1;
import defpackage.pd1;
import defpackage.r91;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H ¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010$\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0010¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b\u0013\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u00020\u00122\b\b\u0002\u0010+\u001a\u00020(H\u0007¢\u0006\u0004\b,\u0010-J\u0019\u0010/\u001a\u00020\u00122\b\b\u0002\u0010.\u001a\u00020(H\u0007¢\u0006\u0004\b/\u0010-R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R$\u0010C\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020\u000b8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010E\u001a\u0004\bK\u0010LR\u001a\u0010S\u001a\u00020N8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010Y\u001a\u00020T8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001a\u0010\\\u001a\u00020T8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010V\u001a\u0004\b[\u0010XR\u001a\u0010_\u001a\u00020T8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b]\u0010V\u001a\u0004\b^\u0010XR\u001a\u0010b\u001a\u00020T8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010V\u001a\u0004\ba\u0010XR\u001a\u0010h\u001a\u00020c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001a\u0010k\u001a\u00020c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010e\u001a\u0004\bj\u0010gR\u001a\u0010n\u001a\u00020T8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bl\u0010V\u001a\u0004\bm\u0010XR$\u0010v\u001a\u0004\u0018\u00010o8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR(\u0010z\u001a\u0004\u0018\u00010\u00052\b\u0010w\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bx\u00105\u001a\u0004\by\u00107R(\u0010}\u001a\u0004\u0018\u00010\u00052\b\u0010w\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b{\u00105\u001a\u0004\b|\u00107R1\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00052\b\u0010~\u001a\u0004\u0018\u00010\u00058\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0004\b\u007f\u00105\u001a\u0005\b\u0080\u0001\u00107\"\u0005\b\u0081\u0001\u0010\u0016¨\u0006\u0083\u0001"}, d2 = {"Lcom/vungle/ads/BaseAd;", "Lcom/vungle/ads/Ad;", "Lcom/vungle/ads/VungleAdType;", "Landroid/content/Context;", "context", "", "placementId", "Lcom/vungle/ads/AdConfig;", "adConfig", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "Lcom/vungle/ads/internal/r;", "constructAdInternal$vungle_ads_release", "(Landroid/content/Context;)Lcom/vungle/ads/internal/r;", "constructAdInternal", "", "canPlayAd", "()Ljava/lang/Boolean;", "Laz2;", "load", "()V", "adMarkup", "(Ljava/lang/String;)V", "Lcom/vungle/ads/internal/model/i0;", "advertisement", "onAdLoaded$vungle_ads_release", "(Lcom/vungle/ads/internal/model/i0;)V", Yf.j, "baseAd", "onLoadSuccess$vungle_ads_release", "(Lcom/vungle/ads/BaseAd;Ljava/lang/String;)V", Hd.f, "Lcom/vungle/ads/VungleError;", "vungleError", "onLoadFailure$vungle_ads_release", "(Lcom/vungle/ads/BaseAd;Lcom/vungle/ads/VungleError;)V", "onLoadFailure", "Lcom/vungle/ads/VungleCSBData;", "csbData", "(Lcom/vungle/ads/VungleCSBData;)V", "", "getWinningPrice", "()D", "minBidToWin", "sendWinURL", "(D)V", "settlementPrice", "sendLossURL", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "getPlacementId", "()Ljava/lang/String;", "c", "Lcom/vungle/ads/AdConfig;", "getAdConfig", "()Lcom/vungle/ads/AdConfig;", "Lcom/vungle/ads/BaseAdListener;", "d", "Lcom/vungle/ads/BaseAdListener;", "getAdListener", "()Lcom/vungle/ads/BaseAdListener;", "setAdListener", "(Lcom/vungle/ads/BaseAdListener;)V", "adListener", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Lgd1;", "getAdInternal$vungle_ads_release", "()Lcom/vungle/ads/internal/r;", "adInternal", "Lcom/vungle/ads/internal/signals/j;", InneractiveMediationDefs.GENDER_FEMALE, "getSignalManager$vungle_ads_release", "()Lcom/vungle/ads/internal/signals/j;", "signalManager", "Lcom/vungle/ads/internal/util/s;", "g", "Lcom/vungle/ads/internal/util/s;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/s;", "logEntry", "Lcom/vungle/ads/internal/o1;", CmcdData.STREAMING_FORMAT_HLS, "Lcom/vungle/ads/internal/o1;", "getResponseToShowMetric$vungle_ads_release", "()Lcom/vungle/ads/internal/o1;", "responseToShowMetric", "i", "getPresentToDisplayMetric$vungle_ads_release", "presentToDisplayMetric", "j", "getShowToFailMetric$vungle_ads_release", "showToFailMetric", "k", "getDisplayToClickMetric$vungle_ads_release", "displayToClickMetric", "Lcom/vungle/ads/internal/i2;", CmcdData.STREAM_TYPE_LIVE, "Lcom/vungle/ads/internal/i2;", "getLeaveApplicationMetric$vungle_ads_release", "()Lcom/vungle/ads/internal/i2;", "leaveApplicationMetric", "m", "getRewardedMetric$vungle_ads_release", "rewardedMetric", "n", "getShowToCloseMetric$vungle_ads_release", "showToCloseMetric", "Lcom/vungle/ads/internal/signals/m;", "o", "Lcom/vungle/ads/internal/signals/m;", "getSignaledAd$vungle_ads_release", "()Lcom/vungle/ads/internal/signals/m;", "setSignaledAd$vungle_ads_release", "(Lcom/vungle/ads/internal/signals/m;)V", "signaledAd", "<set-?>", "p", "getCreativeId", "creativeId", CampaignEx.JSON_KEY_AD_Q, "getEventId", "eventId", "value", "r", "getAdapterAdFormat", "setAdapterAdFormat", "adapterAdFormat", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public abstract class BaseAd implements Ad, VungleAdType {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String placementId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final AdConfig adConfig;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public BaseAdListener adListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final gd1 adInternal;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final gd1 signalManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final s logEntry;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final o1 responseToShowMetric;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final o1 presentToDisplayMetric;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final o1 showToFailMetric;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final o1 displayToClickMetric;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final i2 leaveApplicationMetric;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final i2 rewardedMetric;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final o1 showToCloseMetric;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public m signaledAd;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public String creativeId;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public String eventId;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public String adapterAdFormat;

    @NotNull
    public abstract r constructAdInternal$vungle_ads_release(@NotNull Context context);

    public static /* synthetic */ void sendLossURL$default(BaseAd baseAd, double d, int i, Object obj) {
        if (obj != null) {
            d.u("Super calls with default arguments not supported in this target, function: sendLossURL");
            return;
        }
        if ((i & 1) != 0) {
            d = 0.0d;
        }
        baseAd.sendLossURL(d);
    }

    public static /* synthetic */ void sendWinURL$default(BaseAd baseAd, double d, int i, Object obj) {
        if (obj != null) {
            d.u("Super calls with default arguments not supported in this target, function: sendWinURL");
            return;
        }
        if ((i & 1) != 0) {
            d = 0.0d;
        }
        baseAd.sendWinURL(d);
    }

    @NotNull
    public final AdConfig getAdConfig() {
        return this.adConfig;
    }

    @NotNull
    public final r getAdInternal$vungle_ads_release() {
        return (r) this.adInternal.getValue();
    }

    @Nullable
    public final BaseAdListener getAdListener() {
        return this.adListener;
    }

    @Override // com.vungle.ads.VungleAdType
    @Nullable
    public String getAdapterAdFormat() {
        return this.adapterAdFormat;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final String getCreativeId() {
        return this.creativeId;
    }

    @NotNull
    /* JADX INFO: renamed from: getDisplayToClickMetric$vungle_ads_release, reason: from getter */
    public final o1 getDisplayToClickMetric() {
        return this.displayToClickMetric;
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    /* JADX INFO: renamed from: getLeaveApplicationMetric$vungle_ads_release, reason: from getter */
    public final i2 getLeaveApplicationMetric() {
        return this.leaveApplicationMetric;
    }

    @NotNull
    /* JADX INFO: renamed from: getLogEntry$vungle_ads_release, reason: from getter */
    public final s getLogEntry() {
        return this.logEntry;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    @NotNull
    /* JADX INFO: renamed from: getPresentToDisplayMetric$vungle_ads_release, reason: from getter */
    public final o1 getPresentToDisplayMetric() {
        return this.presentToDisplayMetric;
    }

    @NotNull
    /* JADX INFO: renamed from: getResponseToShowMetric$vungle_ads_release, reason: from getter */
    public final o1 getResponseToShowMetric() {
        return this.responseToShowMetric;
    }

    @NotNull
    /* JADX INFO: renamed from: getRewardedMetric$vungle_ads_release, reason: from getter */
    public final i2 getRewardedMetric() {
        return this.rewardedMetric;
    }

    @NotNull
    /* JADX INFO: renamed from: getShowToCloseMetric$vungle_ads_release, reason: from getter */
    public final o1 getShowToCloseMetric() {
        return this.showToCloseMetric;
    }

    @NotNull
    /* JADX INFO: renamed from: getShowToFailMetric$vungle_ads_release, reason: from getter */
    public final o1 getShowToFailMetric() {
        return this.showToFailMetric;
    }

    @NotNull
    public final j getSignalManager$vungle_ads_release() {
        return (j) this.signalManager.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: getSignaledAd$vungle_ads_release, reason: from getter */
    public final m getSignaledAd() {
        return this.signaledAd;
    }

    public final void setAdListener(@Nullable BaseAdListener baseAdListener) {
        this.adListener = baseAdListener;
    }

    @Override // com.vungle.ads.VungleAdType
    public void setAdapterAdFormat(@Nullable String str) {
        this.adapterAdFormat = str;
        this.logEntry.l = str;
    }

    public final void setSignaledAd$vungle_ads_release(@Nullable m mVar) {
        this.signaledAd = mVar;
    }

    public BaseAd(@NotNull Context context, @NotNull String str, @NotNull AdConfig adConfig) {
        context.getClass();
        str.getClass();
        adConfig.getClass();
        this.context = context;
        this.placementId = str;
        this.adConfig = adConfig;
        this.adInternal = new cm2(new BaseAd$adInternal$2(this));
        this.signalManager = eu.v(pd1.a, new BaseAd$special$$inlined$inject$1(context));
        s sVar = new s();
        sVar.g(str);
        this.logEntry = sVar;
        this.responseToShowMetric = new o1(Sdk.SDKMetric.SDKMetricType.AD_RESPONSE_TO_SHOW_DURATION_MS);
        this.presentToDisplayMetric = new o1(Sdk.SDKMetric.SDKMetricType.AD_PRESENT_TO_DISPLAY_DURATION_MS);
        this.showToFailMetric = new o1(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_FAIL_DURATION_MS);
        this.displayToClickMetric = new o1(Sdk.SDKMetric.SDKMetricType.AD_DISPLAY_TO_CLICK_DURATION_MS);
        this.leaveApplicationMetric = new i2(Sdk.SDKMetric.SDKMetricType.AD_LEAVE_APPLICATION);
        this.rewardedMetric = new i2(Sdk.SDKMetric.SDKMetricType.AD_REWARD_USER);
        this.showToCloseMetric = new o1(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_CLOSE_DURATION_MS);
    }

    @Override // com.vungle.ads.Ad
    @NotNull
    public Boolean canPlayAd() {
        r adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        r91 r91Var = r.o;
        boolean z = false;
        if (adInternal$vungle_ads_release.a(false) == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final double getWinningPrice() {
        Double d;
        l lVar;
        i0 i0Var = getAdInternal$vungle_ads_release().c;
        if (i0Var != null) {
            com.vungle.ads.internal.model.s sVarI = i0Var.i();
            if (sVarI != null && (lVar = sVarI.c) != null) {
                d = lVar.a;
            } else {
                d = null;
            }
            if (d != null) {
                return d.doubleValue();
            }
            return 0.0d;
        }
        return 0.0d;
    }

    @Override // com.vungle.ads.Ad
    public void load(@NotNull VungleCSBData csbData) {
        csbData.getClass();
        getAdInternal$vungle_ads_release().a(this.placementId, (String) null, csbData, new a() { // from class: com.vungle.ads.BaseAd.load.2
            @Override // com.vungle.ads.internal.load.a
            public void onFailure(@NotNull VungleError error) {
                error.getClass();
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadFailure$vungle_ads_release(baseAd, error);
            }

            @Override // com.vungle.ads.internal.load.a
            public void onSuccess(@NotNull i0 advertisement) {
                advertisement.getClass();
                BaseAd.this.onAdLoaded$vungle_ads_release(advertisement);
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadSuccess$vungle_ads_release(baseAd, null);
            }
        });
    }

    public void onAdLoaded$vungle_ads_release(@NotNull i0 advertisement) {
        advertisement.getClass();
        advertisement.a(this.adConfig);
        this.creativeId = advertisement.n();
        String strH = advertisement.h();
        this.eventId = strH;
        m mVar = this.signaledAd;
        if (mVar == null) {
            return;
        }
        mVar.a(strH);
    }

    public void onLoadFailure$vungle_ads_release(@NotNull BaseAd baseAd, @NotNull VungleError vungleError) {
        baseAd.getClass();
        vungleError.getClass();
        this.responseToShowMetric.e();
        Handler handler = y.a;
        y.a(new BaseAd$onLoadFailure$1(this, vungleError));
    }

    public void onLoadSuccess$vungle_ads_release(@NotNull BaseAd baseAd, @Nullable String adMarkup) {
        baseAd.getClass();
        this.responseToShowMetric.e();
        Handler handler = y.a;
        y.a(new BaseAd$onLoadSuccess$1(this));
    }

    public final void sendLossURL(double settlementPrice) {
        List list;
        l lVar;
        r adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        i0 i0Var = adInternal$vungle_ads_release.c;
        if (i0Var != null) {
            com.vungle.ads.internal.model.s sVarI = i0Var.i();
            if (sVarI != null && (lVar = sVarI.c) != null) {
                list = lVar.c;
            } else {
                list = null;
            }
            List list2 = list;
            if (list2 != null) {
                adInternal$vungle_ads_release.a(list2, com.ironsource.mediationsdk.d.n, settlementPrice, C5074y2.z);
            }
        }
    }

    public final void sendWinURL(double minBidToWin) {
        List list;
        l lVar;
        r adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        i0 i0Var = adInternal$vungle_ads_release.c;
        if (i0Var != null) {
            com.vungle.ads.internal.model.s sVarI = i0Var.i();
            if (sVarI != null && (lVar = sVarI.c) != null) {
                list = lVar.b;
            } else {
                list = null;
            }
            List list2 = list;
            if (list2 != null) {
                adInternal$vungle_ads_release.a(list2, "${AUCTION_MIN_TO_WIN}", minBidToWin, C5074y2.A);
            }
        }
    }

    @Override // com.vungle.ads.Ad
    public void load(@Nullable final String adMarkup) {
        getAdInternal$vungle_ads_release().a(this.placementId, adMarkup, (VungleCSBData) null, new a() { // from class: com.vungle.ads.BaseAd.load.1
            @Override // com.vungle.ads.internal.load.a
            public void onFailure(@NotNull VungleError error) {
                error.getClass();
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadFailure$vungle_ads_release(baseAd, error);
            }

            @Override // com.vungle.ads.internal.load.a
            public void onSuccess(@NotNull i0 advertisement) {
                advertisement.getClass();
                BaseAd.this.onAdLoaded$vungle_ads_release(advertisement);
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadSuccess$vungle_ads_release(baseAd, adMarkup);
            }
        });
    }

    @Override // com.vungle.ads.Ad
    public void load() {
        load((String) null);
    }

    public final void sendLossURL() {
        sendLossURL$default(this, 0.0d, 1, null);
    }

    public final void sendWinURL() {
        sendWinURL$default(this, 0.0d, 1, null);
    }
}
