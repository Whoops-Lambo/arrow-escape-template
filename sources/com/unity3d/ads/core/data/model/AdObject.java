package com.unity3d.ads.core.data.model;

import android.app.Activity;
import com.google.protobuf.ByteString;
import com.unity3d.ads.LoadConfiguration;
import com.unity3d.ads.ShowConfiguration;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.cz;
import defpackage.e80;
import defpackage.jc1;
import defpackage.n30;
import defpackage.np1;
import defpackage.qb5;
import defpackage.s71;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001:\u0001wBÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0010\u0010+\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b-\u0010)J\u0012\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b0\u0010)J\u0010\u00101\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b3\u0010,J\u0010\u00104\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b4\u00105J\u0018\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014HÆ\u0003¢\u0006\u0004\b6\u00107J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014HÆ\u0003¢\u0006\u0004\b8\u00107J\u0012\u00109\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b?\u0010@JÜ\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00142\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 HÆ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bC\u0010)J\u0010\u0010E\u001a\u00020DHÖ\u0001¢\u0006\u0004\bE\u0010FJ\u001a\u0010H\u001a\u00020\t2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bH\u0010IR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010L\u001a\u0004\bM\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bO\u0010)R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010L\u001a\u0004\bP\u0010'\"\u0004\bQ\u0010RR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010S\u001a\u0004\b\n\u0010,\"\u0004\bT\u0010UR$\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010N\u001a\u0004\bV\u0010)\"\u0004\bW\u0010XR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010Y\u001a\u0004\bZ\u0010/R$\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010N\u001a\u0004\b[\u0010)\"\u0004\b\\\u0010XR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010]\u001a\u0004\b^\u00102R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\b\u0011\u0010,R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010_\u001a\u0004\b`\u00105R*\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010a\u001a\u0004\bb\u00107\"\u0004\bc\u0010dR(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010a\u001a\u0004\be\u00107\"\u0004\bf\u0010dR$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010g\u001a\u0004\bh\u0010:\"\u0004\bi\u0010jR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010k\u001a\u0004\bl\u0010<\"\u0004\bm\u0010nR*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010o\u001a\u0004\bp\u0010>\"\u0004\bq\u0010rR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010s\u001a\u0004\bt\u0010@\"\u0004\bu\u0010v¨\u0006x"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdObject;", "", "Lcz;", "adScope", "Lcom/google/protobuf/ByteString;", "opportunityId", "", "placementId", HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, "", "isOfferwallAd", "offerwallPlacementName", "Lcom/unity3d/ads/adplayer/AdPlayer;", "adPlayer", "playerServerId", "Lcom/unity3d/ads/UnityAdsLoadOptions;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "adType", "Lnp1;", "Lxe0;", "ttl", "Lcom/unity3d/ads/core/data/model/AdObjectState;", "state", "Lcom/unity3d/ads/LoadConfiguration;", "loadConfiguration", "Lcom/unity3d/ads/ShowConfiguration;", "showConfiguration", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "activity", "Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;", "webViewLessLoadingRequiredData", "<init>", "(Lcz;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lcom/google/protobuf/ByteString;ZLjava/lang/String;Lcom/unity3d/ads/adplayer/AdPlayer;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;ZLgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;Lnp1;Lnp1;Lcom/unity3d/ads/LoadConfiguration;Lcom/unity3d/ads/ShowConfiguration;Ljava/lang/ref/WeakReference;Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;)V", "component1", "()Lcz;", "component2", "()Lcom/google/protobuf/ByteString;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Z", "component6", "component7", "()Lcom/unity3d/ads/adplayer/AdPlayer;", "component8", "component9", "()Lcom/unity3d/ads/UnityAdsLoadOptions;", "component10", "component11", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "component12", "()Lnp1;", "component13", "component14", "()Lcom/unity3d/ads/LoadConfiguration;", "component15", "()Lcom/unity3d/ads/ShowConfiguration;", "component16", "()Ljava/lang/ref/WeakReference;", "component17", "()Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;", "copy", "(Lcz;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lcom/google/protobuf/ByteString;ZLjava/lang/String;Lcom/unity3d/ads/adplayer/AdPlayer;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;ZLgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;Lnp1;Lnp1;Lcom/unity3d/ads/LoadConfiguration;Lcom/unity3d/ads/ShowConfiguration;Ljava/lang/ref/WeakReference;Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;)Lcom/unity3d/ads/core/data/model/AdObject;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcz;", "getAdScope", "Lcom/google/protobuf/ByteString;", "getOpportunityId", "Ljava/lang/String;", "getPlacementId", "getTrackingToken", "setTrackingToken", "(Lcom/google/protobuf/ByteString;)V", "Z", "setOfferwallAd", "(Z)V", "getOfferwallPlacementName", "setOfferwallPlacementName", "(Ljava/lang/String;)V", "Lcom/unity3d/ads/adplayer/AdPlayer;", "getAdPlayer", "getPlayerServerId", "setPlayerServerId", "Lcom/unity3d/ads/UnityAdsLoadOptions;", "getLoadOptions", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "getAdType", "Lnp1;", "getTtl", "setTtl", "(Lnp1;)V", "getState", "setState", "Lcom/unity3d/ads/LoadConfiguration;", "getLoadConfiguration", "setLoadConfiguration", "(Lcom/unity3d/ads/LoadConfiguration;)V", "Lcom/unity3d/ads/ShowConfiguration;", "getShowConfiguration", "setShowConfiguration", "(Lcom/unity3d/ads/ShowConfiguration;)V", "Ljava/lang/ref/WeakReference;", "getActivity", "setActivity", "(Ljava/lang/ref/WeakReference;)V", "Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;", "getWebViewLessLoadingRequiredData", "setWebViewLessLoadingRequiredData", "(Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;)V", "WebViewLessLoadingRequiredData", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AdObject {

    @Nullable
    private WeakReference<Activity> activity;

    @Nullable
    private final AdPlayer adPlayer;

    @NotNull
    private final cz adScope;

    @NotNull
    private final DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isOfferwallAd;

    @Nullable
    private LoadConfiguration loadConfiguration;

    @NotNull
    private final UnityAdsLoadOptions loadOptions;

    @Nullable
    private String offerwallPlacementName;

    @NotNull
    private final ByteString opportunityId;

    @NotNull
    private final String placementId;

    @Nullable
    private String playerServerId;

    @Nullable
    private ShowConfiguration showConfiguration;

    @NotNull
    private np1 state;

    @NotNull
    private ByteString trackingToken;

    @NotNull
    private np1 ttl;

    @Nullable
    private WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;", "", "webviewUrl", "", "adResponse", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "adRefreshState", "Lcom/unity3d/ads/core/data/model/AdRefreshState;", "<init>", "(Ljava/lang/String;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Lcom/unity3d/ads/core/data/model/AdRefreshState;)V", "getWebviewUrl", "()Ljava/lang/String;", "getAdResponse", "()Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "setAdResponse", "(Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;)V", "getAdRefreshState", "()Lcom/unity3d/ads/core/data/model/AdRefreshState;", "setAdRefreshState", "(Lcom/unity3d/ads/core/data/model/AdRefreshState;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WebViewLessLoadingRequiredData {

        @Nullable
        private AdRefreshState adRefreshState;

        @NotNull
        private AdResponseOuterClass.AdResponse adResponse;

        @NotNull
        private final String webviewUrl;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebViewLessLoadingRequiredData)) {
                return false;
            }
            WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = (WebViewLessLoadingRequiredData) other;
            return s71.b(this.webviewUrl, webViewLessLoadingRequiredData.webviewUrl) && s71.b(this.adResponse, webViewLessLoadingRequiredData.adResponse) && this.adRefreshState == webViewLessLoadingRequiredData.adRefreshState;
        }

        public static /* synthetic */ WebViewLessLoadingRequiredData copy$default(WebViewLessLoadingRequiredData webViewLessLoadingRequiredData, String str, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = webViewLessLoadingRequiredData.webviewUrl;
            }
            if ((i & 2) != 0) {
                adResponse = webViewLessLoadingRequiredData.adResponse;
            }
            if ((i & 4) != 0) {
                adRefreshState = webViewLessLoadingRequiredData.adRefreshState;
            }
            return webViewLessLoadingRequiredData.copy(str, adResponse, adRefreshState);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getWebviewUrl() {
            return this.webviewUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AdResponseOuterClass.AdResponse getAdResponse() {
            return this.adResponse;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final AdRefreshState getAdRefreshState() {
            return this.adRefreshState;
        }

        @Nullable
        public final AdRefreshState getAdRefreshState() {
            return this.adRefreshState;
        }

        @NotNull
        public final AdResponseOuterClass.AdResponse getAdResponse() {
            return this.adResponse;
        }

        @NotNull
        public final String getWebviewUrl() {
            return this.webviewUrl;
        }

        public int hashCode() {
            int iHashCode = (this.adResponse.hashCode() + (this.webviewUrl.hashCode() * 31)) * 31;
            AdRefreshState adRefreshState = this.adRefreshState;
            return iHashCode + (adRefreshState == null ? 0 : adRefreshState.hashCode());
        }

        public final void setAdRefreshState(@Nullable AdRefreshState adRefreshState) {
            this.adRefreshState = adRefreshState;
        }

        @NotNull
        public String toString() {
            return "WebViewLessLoadingRequiredData(webviewUrl=" + this.webviewUrl + ", adResponse=" + this.adResponse + ", adRefreshState=" + this.adRefreshState + ')';
        }

        public WebViewLessLoadingRequiredData(@NotNull String str, @NotNull AdResponseOuterClass.AdResponse adResponse, @Nullable AdRefreshState adRefreshState) {
            str.getClass();
            adResponse.getClass();
            this.webviewUrl = str;
            this.adResponse = adResponse;
            this.adRefreshState = adRefreshState;
        }

        @NotNull
        public final WebViewLessLoadingRequiredData copy(@NotNull String webviewUrl, @NotNull AdResponseOuterClass.AdResponse adResponse, @Nullable AdRefreshState adRefreshState) {
            webviewUrl.getClass();
            adResponse.getClass();
            return new WebViewLessLoadingRequiredData(webviewUrl, adResponse, adRefreshState);
        }

        public final void setAdResponse(@NotNull AdResponseOuterClass.AdResponse adResponse) {
            adResponse.getClass();
            this.adResponse = adResponse;
        }

        public /* synthetic */ WebViewLessLoadingRequiredData(String str, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState, int i, e80 e80Var) {
            this(str, adResponse, (i & 4) != 0 ? null : adRefreshState);
        }
    }

    public /* synthetic */ AdObject(cz czVar, ByteString byteString, String str, ByteString byteString2, boolean z, String str2, AdPlayer adPlayer, String str3, UnityAdsLoadOptions unityAdsLoadOptions, boolean z2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, np1 np1Var, np1 np1Var2, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference weakReference, WebViewLessLoadingRequiredData webViewLessLoadingRequiredData, int i, e80 e80Var) {
        this(czVar, byteString, str, byteString2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : adPlayer, (i & 128) != 0 ? null : str3, unityAdsLoadOptions, z2, diagnosticAdType, (i & 2048) != 0 ? qb5.a(null) : np1Var, (i & 4096) != 0 ? qb5.a(AdObjectState.INIT) : np1Var2, (i & 8192) != 0 ? null : loadConfiguration, (i & 16384) != 0 ? null : showConfiguration, (32768 & i) != 0 ? null : weakReference, (i & 65536) != 0 ? null : webViewLessLoadingRequiredData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdObject copy$default(AdObject adObject, cz czVar, ByteString byteString, String str, ByteString byteString2, boolean z, String str2, AdPlayer adPlayer, String str3, UnityAdsLoadOptions unityAdsLoadOptions, boolean z2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, np1 np1Var, np1 np1Var2, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference weakReference, WebViewLessLoadingRequiredData webViewLessLoadingRequiredData, int i, Object obj) {
        WebViewLessLoadingRequiredData webViewLessLoadingRequiredData2;
        WeakReference weakReference2;
        cz czVar2 = (i & 1) != 0 ? adObject.adScope : czVar;
        ByteString byteString3 = (i & 2) != 0 ? adObject.opportunityId : byteString;
        String str4 = (i & 4) != 0 ? adObject.placementId : str;
        ByteString byteString4 = (i & 8) != 0 ? adObject.trackingToken : byteString2;
        boolean z3 = (i & 16) != 0 ? adObject.isOfferwallAd : z;
        String str5 = (i & 32) != 0 ? adObject.offerwallPlacementName : str2;
        AdPlayer adPlayer2 = (i & 64) != 0 ? adObject.adPlayer : adPlayer;
        String str6 = (i & 128) != 0 ? adObject.playerServerId : str3;
        UnityAdsLoadOptions unityAdsLoadOptions2 = (i & 256) != 0 ? adObject.loadOptions : unityAdsLoadOptions;
        boolean z4 = (i & 512) != 0 ? adObject.isHeaderBidding : z2;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2 = (i & 1024) != 0 ? adObject.adType : diagnosticAdType;
        np1 np1Var3 = (i & 2048) != 0 ? adObject.ttl : np1Var;
        np1 np1Var4 = (i & 4096) != 0 ? adObject.state : np1Var2;
        LoadConfiguration loadConfiguration2 = (i & 8192) != 0 ? adObject.loadConfiguration : loadConfiguration;
        cz czVar3 = czVar2;
        ShowConfiguration showConfiguration2 = (i & 16384) != 0 ? adObject.showConfiguration : showConfiguration;
        WeakReference weakReference3 = (i & 32768) != 0 ? adObject.activity : weakReference;
        if ((i & 65536) != 0) {
            weakReference2 = weakReference3;
            webViewLessLoadingRequiredData2 = adObject.webViewLessLoadingRequiredData;
        } else {
            webViewLessLoadingRequiredData2 = webViewLessLoadingRequiredData;
            weakReference2 = weakReference3;
        }
        return adObject.copy(czVar3, byteString3, str4, byteString4, z3, str5, adPlayer2, str6, unityAdsLoadOptions2, z4, diagnosticAdType2, np1Var3, np1Var4, loadConfiguration2, showConfiguration2, weakReference2, webViewLessLoadingRequiredData2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) other;
        return s71.b(this.adScope, adObject.adScope) && s71.b(this.opportunityId, adObject.opportunityId) && s71.b(this.placementId, adObject.placementId) && s71.b(this.trackingToken, adObject.trackingToken) && this.isOfferwallAd == adObject.isOfferwallAd && s71.b(this.offerwallPlacementName, adObject.offerwallPlacementName) && s71.b(this.adPlayer, adObject.adPlayer) && s71.b(this.playerServerId, adObject.playerServerId) && s71.b(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType && s71.b(this.ttl, adObject.ttl) && s71.b(this.state, adObject.state) && s71.b(this.loadConfiguration, adObject.loadConfiguration) && s71.b(this.showConfiguration, adObject.showConfiguration) && s71.b(this.activity, adObject.activity) && s71.b(this.webViewLessLoadingRequiredData, adObject.webViewLessLoadingRequiredData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final cz getAdScope() {
        return this.adScope;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsHeaderBidding() {
        return this.isHeaderBidding;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final np1 getTtl() {
        return this.ttl;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final np1 getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final LoadConfiguration getLoadConfiguration() {
        return this.loadConfiguration;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final ShowConfiguration getShowConfiguration() {
        return this.showConfiguration;
    }

    @Nullable
    public final WeakReference<Activity> component16() {
        return this.activity;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final WebViewLessLoadingRequiredData getWebViewLessLoadingRequiredData() {
        return this.webViewLessLoadingRequiredData;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsOfferwallAd() {
        return this.isOfferwallAd;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    @Nullable
    public final WeakReference<Activity> getActivity() {
        return this.activity;
    }

    @Nullable
    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    @NotNull
    public final cz getAdScope() {
        return this.adScope;
    }

    @NotNull
    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    @Nullable
    public final LoadConfiguration getLoadConfiguration() {
        return this.loadConfiguration;
    }

    @NotNull
    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    @Nullable
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    @NotNull
    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    @Nullable
    public final ShowConfiguration getShowConfiguration() {
        return this.showConfiguration;
    }

    @NotNull
    public final np1 getState() {
        return this.state;
    }

    @NotNull
    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    @NotNull
    public final np1 getTtl() {
        return this.ttl;
    }

    @Nullable
    public final WebViewLessLoadingRequiredData getWebViewLessLoadingRequiredData() {
        return this.webViewLessLoadingRequiredData;
    }

    public int hashCode() {
        int iF = jc1.f((this.trackingToken.hashCode() + n30.c((this.opportunityId.hashCode() + (this.adScope.hashCode() * 31)) * 31, 31, this.placementId)) * 31, 31, this.isOfferwallAd);
        String str = this.offerwallPlacementName;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        AdPlayer adPlayer = this.adPlayer;
        int iHashCode2 = (iHashCode + (adPlayer == null ? 0 : adPlayer.hashCode())) * 31;
        String str2 = this.playerServerId;
        int iHashCode3 = (this.state.hashCode() + ((this.ttl.hashCode() + ((this.adType.hashCode() + jc1.f((this.loadOptions.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.isHeaderBidding)) * 31)) * 31)) * 31;
        LoadConfiguration loadConfiguration = this.loadConfiguration;
        int iHashCode4 = (iHashCode3 + (loadConfiguration == null ? 0 : loadConfiguration.hashCode())) * 31;
        ShowConfiguration showConfiguration = this.showConfiguration;
        int iHashCode5 = (iHashCode4 + (showConfiguration == null ? 0 : showConfiguration.hashCode())) * 31;
        WeakReference<Activity> weakReference = this.activity;
        int iHashCode6 = (iHashCode5 + (weakReference == null ? 0 : weakReference.hashCode())) * 31;
        WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = this.webViewLessLoadingRequiredData;
        return iHashCode6 + (webViewLessLoadingRequiredData != null ? webViewLessLoadingRequiredData.hashCode() : 0);
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final void setActivity(@Nullable WeakReference<Activity> weakReference) {
        this.activity = weakReference;
    }

    public final void setLoadConfiguration(@Nullable LoadConfiguration loadConfiguration) {
        this.loadConfiguration = loadConfiguration;
    }

    public final void setOfferwallAd(boolean z) {
        this.isOfferwallAd = z;
    }

    public final void setOfferwallPlacementName(@Nullable String str) {
        this.offerwallPlacementName = str;
    }

    public final void setPlayerServerId(@Nullable String str) {
        this.playerServerId = str;
    }

    public final void setShowConfiguration(@Nullable ShowConfiguration showConfiguration) {
        this.showConfiguration = showConfiguration;
    }

    public final void setWebViewLessLoadingRequiredData(@Nullable WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        this.webViewLessLoadingRequiredData = webViewLessLoadingRequiredData;
    }

    @NotNull
    public String toString() {
        return "AdObject(adScope=" + this.adScope + ", opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ", ttl=" + this.ttl + ", state=" + this.state + ", loadConfiguration=" + this.loadConfiguration + ", showConfiguration=" + this.showConfiguration + ", activity=" + this.activity + ", webViewLessLoadingRequiredData=" + this.webViewLessLoadingRequiredData + ')';
    }

    @NotNull
    public final AdObject copy(@NotNull cz adScope, @NotNull ByteString opportunityId, @NotNull String placementId, @NotNull ByteString trackingToken, boolean isOfferwallAd, @Nullable String offerwallPlacementName, @Nullable AdPlayer adPlayer, @Nullable String playerServerId, @NotNull UnityAdsLoadOptions loadOptions, boolean isHeaderBidding, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType adType, @NotNull np1 ttl, @NotNull np1 state, @Nullable LoadConfiguration loadConfiguration, @Nullable ShowConfiguration showConfiguration, @Nullable WeakReference<Activity> activity, @Nullable WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        adScope.getClass();
        opportunityId.getClass();
        placementId.getClass();
        trackingToken.getClass();
        loadOptions.getClass();
        adType.getClass();
        ttl.getClass();
        state.getClass();
        return new AdObject(adScope, opportunityId, placementId, trackingToken, isOfferwallAd, offerwallPlacementName, adPlayer, playerServerId, loadOptions, isHeaderBidding, adType, ttl, state, loadConfiguration, showConfiguration, activity, webViewLessLoadingRequiredData);
    }

    public final void setState(@NotNull np1 np1Var) {
        np1Var.getClass();
        this.state = np1Var;
    }

    public final void setTrackingToken(@NotNull ByteString byteString) {
        byteString.getClass();
        this.trackingToken = byteString;
    }

    public final void setTtl(@NotNull np1 np1Var) {
        np1Var.getClass();
        this.ttl = np1Var;
    }

    public AdObject(@NotNull cz czVar, @NotNull ByteString byteString, @NotNull String str, @NotNull ByteString byteString2, boolean z, @Nullable String str2, @Nullable AdPlayer adPlayer, @Nullable String str3, @NotNull UnityAdsLoadOptions unityAdsLoadOptions, boolean z2, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, @NotNull np1 np1Var, @NotNull np1 np1Var2, @Nullable LoadConfiguration loadConfiguration, @Nullable ShowConfiguration showConfiguration, @Nullable WeakReference<Activity> weakReference, @Nullable WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        czVar.getClass();
        byteString.getClass();
        str.getClass();
        byteString2.getClass();
        unityAdsLoadOptions.getClass();
        diagnosticAdType.getClass();
        np1Var.getClass();
        np1Var2.getClass();
        this.adScope = czVar;
        this.opportunityId = byteString;
        this.placementId = str;
        this.trackingToken = byteString2;
        this.isOfferwallAd = z;
        this.offerwallPlacementName = str2;
        this.adPlayer = adPlayer;
        this.playerServerId = str3;
        this.loadOptions = unityAdsLoadOptions;
        this.isHeaderBidding = z2;
        this.adType = diagnosticAdType;
        this.ttl = np1Var;
        this.state = np1Var2;
        this.loadConfiguration = loadConfiguration;
        this.showConfiguration = showConfiguration;
        this.activity = weakReference;
        this.webViewLessLoadingRequiredData = webViewLessLoadingRequiredData;
    }
}
