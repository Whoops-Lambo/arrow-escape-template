package com.applovin.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.unity.MaxUnityAdManager;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.Pf;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.special.SpecialsBridge;
import com.singular.sdk.internal.UserDetailsUtils;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.unity3d.services.UnityAdsConstants;
import defpackage.aj1;
import defpackage.cj1;
import defpackage.dj1;
import defpackage.h50;
import defpackage.jc1;
import defpackage.l;
import defpackage.lu0;
import defpackage.n30;
import defpackage.ni0;
import defpackage.nj;
import defpackage.ue0;
import defpackage.x3;
import defpackage.zi1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class MaxUnityAdManager implements MaxAdListener, MaxAdViewAdListener, MaxRewardedAdListener, MaxAdRevenueListener, MaxAdReviewListener, MaxAdExpirationListener, AppLovinCmpService.OnCompletedListener, MaxUnityApplicationStateChangeTracker.MaxUnityApplicationStateCallback {
    private static final String DEFAULT_AD_VIEW_POSITION = "top_left";
    private static final String KEY_RENDER_OUTSIDE_SAFE_AREA = "render_outside_safe_area";
    private static final String SDK_TAG = "AppLovinSdk";
    private static final String TAG = "MaxUnityAdManager";
    private static BackgroundCallback backgroundCallback;
    private static WeakReference<Activity> currentActivity;
    private View safeAreaBackground;
    private AppLovinSdk sdk;
    private static final Point DEFAULT_AD_VIEW_OFFSET = new Point(0, 0);
    private static final ScheduledThreadPoolExecutor threadPoolExecutor = new ScheduledThreadPoolExecutor(3, new SdkThreadFactory());
    private Integer publisherBannerBackgroundColor = null;
    private final Map<String, MaxInterstitialAd> interstitials = new HashMap(2);
    private final Map<String, MaxAppOpenAd> appOpenAds = new HashMap(2);
    private final Map<String, MaxRewardedAd> rewardedAds = new HashMap(2);
    private final Map<String, MaxAdView> adViews = new HashMap(2);
    private final Map<String, MaxAdFormat> adViewFormats = new HashMap(2);
    private final Map<String, String> adViewPositions = new HashMap(2);
    private final Map<String, Point> adViewOffsets = new HashMap(2);
    private final Map<String, Integer> adViewWidths = new HashMap(2);
    private final Map<String, MaxAd> adInfoMap = new HashMap();
    private final Object adInfoMapLock = new Object();
    private final Map<String, Map<String, String>> adViewExtraParametersToSetAfterCreate = new HashMap(1);
    private final Map<String, Map<String, Object>> adViewLocalExtraParametersToSetAfterCreate = new HashMap(1);
    private final Map<String, String> AdViewCustomDataToSetAfterCreate = new HashMap(1);
    private final List<String> AdUnitsToShowAfterCreate = new ArrayList(2);
    private final Set<String> disabledAdaptiveBannerAdUnitIds = new HashSet(2);
    private final Set<String> disabledAutoRefreshAdViewAdUnitIds = new HashSet(2);
    private final MaxUnityApplicationStateChangeTracker applicationStateChangeTracker = new MaxUnityApplicationStateChangeTracker(this);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface BackgroundCallback {
        void onEvent(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Insets {
        int bottom;
        int left;
        int right;
        int top;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Listener {
        void onSdkInitializationComplete(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class SdkThreadFactory implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:Max-Unity-Plugin:shared");
            thread.setDaemon(true);
            thread.setPriority(5);
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }

        private SdkThreadFactory() {
        }
    }

    public static void setCurrentActivity(Activity activity) {
    }

    private JSONObject createAdWaterfallInfo(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        JSONObject jSONObject = new JSONObject();
        if (maxAdWaterfallInfo == null) {
            return jSONObject;
        }
        JsonUtils.putString(jSONObject, "name", maxAdWaterfallInfo.getName());
        JsonUtils.putString(jSONObject, "testName", maxAdWaterfallInfo.getTestName());
        JSONArray jSONArray = new JSONArray();
        Iterator<MaxNetworkResponseInfo> it = maxAdWaterfallInfo.getNetworkResponses().iterator();
        while (it.hasNext()) {
            jSONArray.put(createNetworkResponseInfo(it.next()));
        }
        JsonUtils.putJsonArray(jSONObject, "networkResponses", jSONArray);
        JsonUtils.putString(jSONObject, "latencyMillis", String.valueOf(maxAdWaterfallInfo.getLatencyMillis()));
        return jSONObject;
    }

    private JSONObject createNetworkResponseInfo(MaxNetworkResponseInfo maxNetworkResponseInfo) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "adLoadState", Integer.toString(maxNetworkResponseInfo.getAdLoadState().ordinal()));
        if (maxNetworkResponseInfo.getMediatedNetwork() != null) {
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putString(jSONObject2, "name", maxNetworkResponseInfo.getMediatedNetwork().getName());
            JsonUtils.putString(jSONObject2, "adapterClassName", maxNetworkResponseInfo.getMediatedNetwork().getAdapterClassName());
            JsonUtils.putString(jSONObject2, Pf.b, maxNetworkResponseInfo.getMediatedNetwork().getAdapterVersion());
            JsonUtils.putString(jSONObject2, "sdkVersion", maxNetworkResponseInfo.getMediatedNetwork().getSdkVersion());
            JsonUtils.putInt(jSONObject2, "initializationStatus", maxNetworkResponseInfo.getMediatedNetwork().getInitializationStatus().getCode());
            JsonUtils.putJSONObject(jSONObject, "mediatedNetwork", jSONObject2);
        }
        JsonUtils.putJSONObject(jSONObject, "credentials", BundleUtils.toJSONObject(maxNetworkResponseInfo.getCredentials()));
        JsonUtils.putBoolean(jSONObject, "isBidding", maxNetworkResponseInfo.isBidding());
        MaxError error = maxNetworkResponseInfo.getError();
        if (error != null) {
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putString(jSONObject3, "errorMessage", error.getMessage());
            JsonUtils.putString(jSONObject3, "adLoadFailureInfo", error.getAdLoadFailureInfo());
            JsonUtils.putString(jSONObject3, IronSourceConstants.EVENTS_ERROR_CODE, Integer.toString(error.getCode()));
            JsonUtils.putString(jSONObject3, "latencyMillis", String.valueOf(error.getRequestLatencyMillis()));
            JsonUtils.putJSONObject(jSONObject, "error", jSONObject3);
        }
        JsonUtils.putString(jSONObject, "latencyMillis", String.valueOf(maxNetworkResponseInfo.getLatencyMillis()));
        return jSONObject;
    }

    private static void forwardUnityEvent(JSONObject jSONObject) {
        ue0 ue0Var = new ue0(jSONObject, 14);
        if (Utils.isMainThread()) {
            threadPoolExecutor.execute(ue0Var);
        } else {
            ue0Var.run();
        }
    }

    private MaxAd getAd(String str) {
        MaxAd maxAd;
        synchronized (this.adInfoMapLock) {
            maxAd = this.adInfoMap.get(str);
        }
        return maxAd;
    }

    private JSONObject getAdInfo(MaxAd maxAd) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "adUnitId", maxAd.getAdUnitId());
        JsonUtils.putString(jSONObject, "adFormat", maxAd.getFormat().getLabel());
        JsonUtils.putString(jSONObject, "networkName", maxAd.getNetworkName());
        JsonUtils.putString(jSONObject, "networkPlacement", maxAd.getNetworkPlacement());
        JsonUtils.putString(jSONObject, "creativeId", !TextUtils.isEmpty(maxAd.getCreativeId()) ? maxAd.getCreativeId() : "");
        JsonUtils.putString(jSONObject, "placement", !TextUtils.isEmpty(maxAd.getPlacement()) ? maxAd.getPlacement() : "");
        JsonUtils.putString(jSONObject, "revenue", String.valueOf(maxAd.getRevenue()));
        JsonUtils.putString(jSONObject, "revenuePrecision", maxAd.getRevenuePrecision());
        JsonUtils.putJSONObject(jSONObject, "waterfallInfo", createAdWaterfallInfo(maxAd.getWaterfall()));
        JsonUtils.putString(jSONObject, "latencyMillis", String.valueOf(maxAd.getRequestLatencyMillis()));
        JsonUtils.putString(jSONObject, "dspName", TextUtils.isEmpty(maxAd.getDspName()) ? "" : maxAd.getDspName());
        return jSONObject;
    }

    private MaxAdFormat getAdViewAdFormat(String str) {
        return this.adViewFormats.containsKey(str) ? this.adViewFormats.get(str) : getDeviceSpecificAdViewAdFormat();
    }

    private String getAdViewLayout(String str, MaxAdFormat maxAdFormat) {
        d("Getting " + maxAdFormat.getLabel() + " absolute position with ad unit id \"" + str + "\"");
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return "";
        }
        int[] iArr = new int[2];
        maxAdViewRetrieveAdView.getLocationOnScreen(iArr);
        int iPxToDp = AppLovinSdkUtils.pxToDp(getCurrentActivity(), iArr[0]);
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(getCurrentActivity(), iArr[1]);
        int iPxToDp3 = AppLovinSdkUtils.pxToDp(getCurrentActivity(), maxAdViewRetrieveAdView.getWidth());
        int iPxToDp4 = AppLovinSdkUtils.pxToDp(getCurrentActivity(), maxAdViewRetrieveAdView.getHeight());
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "origin_x", String.valueOf(iPxToDp));
        JsonUtils.putString(jSONObject, "origin_y", String.valueOf(iPxToDp2));
        JsonUtils.putString(jSONObject, "width", String.valueOf(iPxToDp3));
        JsonUtils.putString(jSONObject, "height", String.valueOf(iPxToDp4));
        return jSONObject.toString();
    }

    private static Point getOffsetPixels(float f, float f2, Context context) {
        return new Point(AppLovinSdkUtils.dpToPx(context, (int) f), AppLovinSdkUtils.dpToPx(context, (int) f2));
    }

    private boolean getRenderOutsideSafeArea() {
        return Boolean.parseBoolean(this.sdk.getSettings().getExtraParameters().get(KEY_RENDER_OUTSIDE_SAFE_AREA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createAdView$19(MaxAdFormat maxAdFormat, String str, String str2, Point point, boolean z) {
        Map<String, Object> map;
        StringBuilder sb = new StringBuilder("Creating ");
        sb.append(maxAdFormat.getLabel());
        sb.append(" with ad unit id \"");
        sb.append(str);
        sb.append("\" and position: \"");
        d(nj.q(sb, str2, "\""));
        if (this.adViews.get(str) != null) {
            w("Trying to create a " + maxAdFormat.getLabel() + " that was already created. This will cause the current ad to be hidden.");
        }
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat, str2, point, z);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        this.safeAreaBackground.setVisibility(8);
        maxAdViewRetrieveAdView.setVisibility(8);
        if (maxAdViewRetrieveAdView.getParent() == null) {
            Activity currentActivity2 = getCurrentActivity();
            RelativeLayout relativeLayout = new RelativeLayout(currentActivity2);
            currentActivity2.addContentView(relativeLayout, new LinearLayout.LayoutParams(-1, -1));
            relativeLayout.addView(maxAdViewRetrieveAdView);
            this.adViewFormats.put(str, maxAdFormat);
            positionAdView(str, maxAdFormat);
        }
        Map<String, String> map2 = this.adViewExtraParametersToSetAfterCreate.get(str);
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                maxAdViewRetrieveAdView.setExtraParameter(entry.getKey(), entry.getValue());
                maybeHandleExtraParameterChanges(str, maxAdFormat, entry.getKey(), entry.getValue());
            }
            this.adViewExtraParametersToSetAfterCreate.remove(str);
        }
        if (this.adViewLocalExtraParametersToSetAfterCreate.containsKey(str) && (map = this.adViewLocalExtraParametersToSetAfterCreate.get(str)) != null) {
            for (Map.Entry<String, Object> entry2 : map.entrySet()) {
                maxAdViewRetrieveAdView.setLocalExtraParameter(entry2.getKey(), entry2.getValue());
            }
            this.adViewLocalExtraParametersToSetAfterCreate.remove(str);
        }
        if (this.AdViewCustomDataToSetAfterCreate.containsKey(str)) {
            maxAdViewRetrieveAdView.setCustomData(this.AdViewCustomDataToSetAfterCreate.get(str));
            this.AdViewCustomDataToSetAfterCreate.remove(str);
        }
        maxAdViewRetrieveAdView.loadAd();
        if (this.disabledAutoRefreshAdViewAdUnitIds.contains(str)) {
            maxAdViewRetrieveAdView.stopAutoRefresh();
        }
        if (this.AdUnitsToShowAfterCreate.contains(str)) {
            showAdView(str, maxAdFormat);
            this.AdUnitsToShowAfterCreate.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$destroyAdView$28(MaxAdFormat maxAdFormat, String str) {
        d("Destroying " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        ViewParent parent = maxAdViewRetrieveAdView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(maxAdViewRetrieveAdView);
        }
        maxAdViewRetrieveAdView.setListener(null);
        maxAdViewRetrieveAdView.setRevenueListener(null);
        maxAdViewRetrieveAdView.setAdReviewListener(null);
        SpecialsBridge.maxAdViewDestroy(maxAdViewRetrieveAdView);
        this.adViews.remove(str);
        this.adViewFormats.remove(str);
        this.adViewPositions.remove(str);
        this.adViewOffsets.remove(str);
        this.adViewWidths.remove(str);
        this.disabledAdaptiveBannerAdUnitIds.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideAdView$27(MaxAdFormat maxAdFormat, String str) {
        d("Hiding " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        this.AdUnitsToShowAfterCreate.remove(str);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            this.safeAreaBackground.setVisibility(8);
            maxAdViewRetrieveAdView.setVisibility(8);
            maxAdViewRetrieveAdView.stopAutoRefresh();
        } else {
            e(maxAdFormat.getLabel() + " does not exist");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeSdkWithCompletionHandler$4(Listener listener, AppLovinSdkConfiguration appLovinSdkConfiguration) {
        threadPoolExecutor.execute(new x3(20, this, listener, appLovinSdkConfiguration));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Iterator<MaxAdView> it = this.adViews.values().iterator();
        while (it.hasNext()) {
            Object parent = it.next().getParent();
            if (parent instanceof View) {
                ((View) parent).bringToFront();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i3 == i7 && i4 == i8 && i2 == i6) {
            return;
        }
        for (Map.Entry<String, MaxAdFormat> entry : this.adViewFormats.entrySet()) {
            positionAdView(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2() {
        View view = new View(getCurrentActivity());
        this.safeAreaBackground = view;
        view.setVisibility(8);
        this.safeAreaBackground.setBackgroundColor(0);
        this.safeAreaBackground.setClickable(false);
        FrameLayout frameLayout = new FrameLayout(getCurrentActivity());
        frameLayout.addView(this.safeAreaBackground, new FrameLayout.LayoutParams(0, 0));
        getCurrentActivity().addContentView(frameLayout, new LinearLayout.LayoutParams(-1, -1));
        Object parent = frameLayout.getParent();
        if (parent instanceof View) {
            final int i = 0;
            ((View) parent).addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: bj1
                public final /* synthetic */ MaxUnityAdManager b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    switch (i) {
                        case 0:
                            this.b.lambda$new$0(view2, i2, i3, i4, i5, i6, i7, i8, i9);
                            break;
                        default:
                            this.b.lambda$new$1(view2, i2, i3, i4, i5, i6, i7, i8, i9);
                            break;
                    }
                }
            });
        }
        final int i2 = 1;
        getCurrentActivity().getWindow().getDecorView().getRootView().addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: bj1
            public final /* synthetic */ MaxUnityAdManager b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                switch (i2) {
                    case 0:
                        this.b.lambda$new$0(view2, i3, i4, i5, i6, i7, i8, i9, i10);
                        break;
                    default:
                        this.b.lambda$new$1(view2, i3, i4, i5, i6, i7, i8, i9, i10);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onApplicationStateChanged$6(boolean z) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", "OnApplicationStateChanged");
        JsonUtils.putBoolean(jSONObject, "isPaused", z);
        forwardUnityEvent(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCompleted$5(AppLovinCmpError appLovinCmpError) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", "OnCmpCompletedEvent");
        JsonUtils.putBoolean(jSONObject, "keepInBackground", true);
        if (appLovinCmpError != null) {
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putInt(jSONObject2, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, appLovinCmpError.getCode().getValue());
            JsonUtils.putString(jSONObject2, "message", appLovinCmpError.getMessage());
            JsonUtils.putInt(jSONObject2, "cmpCode", appLovinCmpError.getCmpCode());
            JsonUtils.putString(jSONObject2, "cmpMessage", appLovinCmpError.getCmpMessage());
            JsonUtils.putJSONObject(jSONObject, "error", jSONObject2);
        }
        forwardUnityEvent(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:46:0x0145  */
    /* JADX WARN: Code duplicated, block: B:49:0x014f  */
    /* JADX WARN: Code duplicated, block: B:57:0x016c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0170  */
    /* JADX WARN: Code duplicated, block: B:61:0x0176  */
    /* JADX WARN: Code duplicated, block: B:62:0x0178  */
    /* JADX WARN: Code duplicated, block: B:65:0x017e  */
    /* JADX WARN: Code duplicated, block: B:67:0x019c  */
    /* JADX WARN: Code duplicated, block: B:68:0x019e  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x01df  */
    public /* synthetic */ void lambda$positionAdView$33(String str, MaxAdFormat maxAdFormat) {
        int iPxToDp;
        int i;
        int i2;
        int i3;
        int i4;
        MaxAdFormat maxAdFormat2;
        boolean zContains;
        int i5;
        int iWidth;
        int iHeight;
        int i6;
        int i7;
        int i8;
        int i9;
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) maxAdViewRetrieveAdView.getParent();
        if (relativeLayout == null) {
            e(maxAdFormat.getLabel() + "'s parent does not exist");
            return;
        }
        Rect rect = new Rect();
        relativeLayout.getWindowVisibleDisplayFrame(rect);
        String str2 = this.adViewPositions.get(str);
        Point point = this.adViewOffsets.get(str);
        Insets safeInsets = getSafeInsets();
        boolean zContains2 = this.disabledAdaptiveBannerAdUnitIds.contains(str);
        boolean zContainsKey = this.adViewWidths.containsKey(str);
        if (zContainsKey) {
            iPxToDp = this.adViewWidths.get(str).intValue();
        } else if ("top_center".equalsIgnoreCase(str2) || "bottom_center".equalsIgnoreCase(str2)) {
            iPxToDp = AppLovinSdkUtils.pxToDp(getCurrentActivity(), rect.width());
        } else {
            iPxToDp = maxAdFormat.getSize().getWidth();
        }
        MaxAdFormat maxAdFormat3 = MaxAdFormat.BANNER;
        int height = ((maxAdFormat == maxAdFormat3 || maxAdFormat == MaxAdFormat.LEADER) && !zContains2) ? maxAdFormat.getAdaptiveSize(iPxToDp, getCurrentActivity()).getHeight() : maxAdFormat.getSize().getHeight();
        int iDpToPx = AppLovinSdkUtils.dpToPx(getCurrentActivity(), iPxToDp);
        int iDpToPx2 = AppLovinSdkUtils.dpToPx(getCurrentActivity(), height);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) maxAdViewRetrieveAdView.getLayoutParams();
        layoutParams.height = iDpToPx2;
        maxAdViewRetrieveAdView.setLayoutParams(layoutParams);
        maxAdViewRetrieveAdView.setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        maxAdViewRetrieveAdView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        layoutParams.setMargins(0, 0, 0, 0);
        int i10 = safeInsets.left + point.x;
        int i11 = safeInsets.top + point.y;
        int i12 = safeInsets.right;
        int i13 = safeInsets.bottom;
        int i14 = 1;
        if ("centered".equalsIgnoreCase(str2)) {
            if (MaxAdFormat.MREC == maxAdFormat || zContainsKey) {
                layoutParams.width = iDpToPx;
            } else {
                layoutParams.width = -1;
            }
            i4 = 17;
            i11 = i11;
        } else {
            if (str2.contains("top")) {
                i2 = 48;
            } else {
                if (str2.contains("bottom")) {
                    i2 = 80;
                } else {
                    i = 0;
                }
                if (str2.contains("center")) {
                    int i15 = i | 1;
                    i3 = i10;
                    maxAdFormat2 = MaxAdFormat.MREC;
                    if (maxAdFormat2 != maxAdFormat || zContainsKey) {
                        layoutParams.width = iDpToPx;
                    } else {
                        layoutParams.width = -1;
                    }
                    zContains = str2.contains("left");
                    boolean zContains3 = str2.contains("right");
                    if (!zContains || zContains3) {
                        i5 = i | 17;
                        if (maxAdFormat2 == maxAdFormat) {
                            if (str2.contains("left")) {
                                i9 = 3;
                            } else {
                                i9 = 5;
                            }
                            i5 |= i9;
                            i7 = i12;
                        } else {
                            iWidth = (rect.width() - safeInsets.left) - safeInsets.right;
                            iHeight = (rect.height() - safeInsets.top) - safeInsets.bottom;
                            int iMax = Math.max(iWidth, iHeight);
                            int iMin = Math.min(iWidth, iHeight);
                            if (iHeight > iWidth) {
                                i6 = -1;
                            } else {
                                i6 = 1;
                            }
                            int i16 = ((iMax - iMin) * i6) / 2;
                            int i17 = i3 + i16;
                            i7 = i12 + i16;
                            i8 = (iWidth / 2) - (iDpToPx2 / 2);
                            if (zContains) {
                                i8 = -i8;
                            }
                            maxAdViewRetrieveAdView.setTranslationX(i8);
                            maxAdViewRetrieveAdView.setRotation(90.0f);
                            i3 = i17;
                        }
                        relativeLayout.setBackgroundColor(0);
                        i4 = i5;
                    } else {
                        i7 = i12;
                        i4 = i15;
                    }
                    i12 = i7;
                } else {
                    i11 = i11;
                    i3 = i10;
                    layoutParams.width = iDpToPx;
                    if (str2.contains("left")) {
                        i4 = i | 3;
                    } else if (str2.contains("right")) {
                        i4 = i | 5;
                    } else {
                        i4 = i;
                    }
                }
                i10 = i3;
            }
            i = i2;
            if (str2.contains("center")) {
                int i18 = i | 1;
                i3 = i10;
                maxAdFormat2 = MaxAdFormat.MREC;
                if (maxAdFormat2 != maxAdFormat) {
                    layoutParams.width = iDpToPx;
                } else {
                    layoutParams.width = iDpToPx;
                }
                zContains = str2.contains("left");
                boolean zContains4 = str2.contains("right");
                if (zContains) {
                    i5 = i | 17;
                    if (maxAdFormat2 == maxAdFormat) {
                        if (str2.contains("left")) {
                            i9 = 3;
                        } else {
                            i9 = 5;
                        }
                        i5 |= i9;
                        i7 = i12;
                    } else {
                        iWidth = (rect.width() - safeInsets.left) - safeInsets.right;
                        iHeight = (rect.height() - safeInsets.top) - safeInsets.bottom;
                        int iMax2 = Math.max(iWidth, iHeight);
                        int iMin2 = Math.min(iWidth, iHeight);
                        if (iHeight > iWidth) {
                            i6 = -1;
                        } else {
                            i6 = 1;
                        }
                        int i19 = ((iMax2 - iMin2) * i6) / 2;
                        int i110 = i3 + i19;
                        i7 = i12 + i19;
                        i8 = (iWidth / 2) - (iDpToPx2 / 2);
                        if (zContains) {
                            i8 = -i8;
                        }
                        maxAdViewRetrieveAdView.setTranslationX(i8);
                        maxAdViewRetrieveAdView.setRotation(90.0f);
                        i3 = i110;
                    }
                    relativeLayout.setBackgroundColor(0);
                    i4 = i5;
                } else {
                    i5 = i | 17;
                    if (maxAdFormat2 == maxAdFormat) {
                        if (str2.contains("left")) {
                            i9 = 3;
                        } else {
                            i9 = 5;
                        }
                        i5 |= i9;
                        i7 = i12;
                    } else {
                        iWidth = (rect.width() - safeInsets.left) - safeInsets.right;
                        iHeight = (rect.height() - safeInsets.top) - safeInsets.bottom;
                        int iMax3 = Math.max(iWidth, iHeight);
                        int iMin3 = Math.min(iWidth, iHeight);
                        if (iHeight > iWidth) {
                            i6 = -1;
                        } else {
                            i6 = 1;
                        }
                        int i111 = ((iMax3 - iMin3) * i6) / 2;
                        int i112 = i3 + i111;
                        i7 = i12 + i111;
                        i8 = (iWidth / 2) - (iDpToPx2 / 2);
                        if (zContains) {
                            i8 = -i8;
                        }
                        maxAdViewRetrieveAdView.setTranslationX(i8);
                        maxAdViewRetrieveAdView.setRotation(90.0f);
                        i3 = i112;
                    }
                    relativeLayout.setBackgroundColor(0);
                    i4 = i5;
                }
                i12 = i7;
            } else {
                i11 = i11;
                i3 = i10;
                layoutParams.width = iDpToPx;
                if (str2.contains("left")) {
                    i4 = i | 3;
                } else if (str2.contains("right")) {
                    i4 = i | 5;
                } else {
                    i4 = i;
                }
            }
            i10 = i3;
        }
        if (maxAdFormat3 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            Integer num = this.publisherBannerBackgroundColor;
            View view = this.safeAreaBackground;
            if (num != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
                if ("top_center".equals(str2)) {
                    layoutParams2.height = safeInsets.top;
                    layoutParams2.width = -1;
                    this.safeAreaBackground.setVisibility(maxAdViewRetrieveAdView.getVisibility());
                    i10 -= safeInsets.left;
                    i12 -= safeInsets.right;
                    i14 = 49;
                } else if ("bottom_center".equals(str2)) {
                    layoutParams2.height = safeInsets.bottom;
                    layoutParams2.width = -1;
                    this.safeAreaBackground.setVisibility(maxAdViewRetrieveAdView.getVisibility());
                    i10 -= safeInsets.left;
                    i12 -= safeInsets.right;
                    i14 = 81;
                } else {
                    this.safeAreaBackground.setVisibility(8);
                }
                layoutParams2.gravity = i14;
                this.safeAreaBackground.requestLayout();
            } else {
                view.setVisibility(8);
            }
        }
        layoutParams.setMargins(i10, i11, i12, i13);
        relativeLayout.setGravity(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAdViewBackgroundColor$29(MaxAdFormat maxAdFormat, String str, String str2) {
        d("Setting " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\" to color: " + str2);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        int color = Color.parseColor(str2);
        this.publisherBannerBackgroundColor = Integer.valueOf(color);
        this.safeAreaBackground.setBackgroundColor(color);
        maxAdViewRetrieveAdView.setBackgroundColor(color);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAdViewExtraParameter$30(MaxAdFormat maxAdFormat, String str, String str2, String str3) {
        d("Setting " + maxAdFormat.getLabel() + " extra with key: \"" + str + "\" value: " + str2);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str3, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.setExtraParameter(str, str2);
        } else {
            d(maxAdFormat.getLabel() + " does not exist for ad unit ID \"" + str3 + "\". Saving extra parameter to be set when it is created.");
            Map<String, String> map = this.adViewExtraParametersToSetAfterCreate.get(str3);
            if (map == null) {
                map = new HashMap<>(1);
                this.adViewExtraParametersToSetAfterCreate.put(str3, map);
            }
            map.put(str, str2);
        }
        maybeHandleExtraParameterChanges(str3, maxAdFormat, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAdViewLocalExtraParameter$31(MaxAdFormat maxAdFormat, String str, Object obj, String str2) {
        d("Setting " + maxAdFormat.getLabel() + " local extra with key: \"" + str + "\" value: " + obj);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str2, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.setLocalExtraParameter(str, obj);
            return;
        }
        d(maxAdFormat.getLabel() + " does not exist for ad unit ID \"" + str2 + "\". Saving local extra parameter to be set when it is created.");
        Map<String, Object> map = this.adViewLocalExtraParametersToSetAfterCreate.get(str2);
        if (map == null) {
            map = new HashMap<>(1);
            this.adViewLocalExtraParametersToSetAfterCreate.put(str2, map);
        }
        map.put(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAdViewPlacement$21(String str, MaxAdFormat maxAdFormat, String str2) {
        StringBuilder sbR = h50.r("Setting placement \"", str, "\" for ");
        sbR.append(maxAdFormat.getLabel());
        sbR.append(" with ad unit id \"");
        sbR.append(str2);
        sbR.append("\"");
        d(sbR.toString());
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str2, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.setPlacement(str);
            return;
        }
        e(maxAdFormat.getLabel() + " does not exist");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAdViewWidth$24(int i, MaxAdFormat maxAdFormat, String str) {
        StringBuilder sb = new StringBuilder("Setting width ");
        sb.append(i);
        sb.append(" for \"");
        sb.append(maxAdFormat);
        sb.append("\" with ad unit identifier \"");
        d(nj.q(sb, str, "\""));
        int width = (maxAdFormat.isBannerOrLeaderAd() ? MaxAdFormat.BANNER.getSize() : maxAdFormat.getSize()).getWidth();
        if (i < width) {
            StringBuilder sbT = jc1.t("The provided width: ", i, "dp is smaller than the minimum required width: ", width, "dp for ad format: ");
            sbT.append(maxAdFormat);
            sbT.append(". Automatically setting width to ");
            sbT.append(width);
            sbT.append(UserDetailsUtils.UserDetailsLiterals.DOT);
            e(sbT.toString());
        }
        this.adViewWidths.put(str, Integer.valueOf(Math.max(width, i)));
        positionAdView(str, maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAdView$26(MaxAdFormat maxAdFormat, String str) {
        d("Showing " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        positionAdView(str, maxAdFormat);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            this.safeAreaBackground.setVisibility(0);
            maxAdViewRetrieveAdView.setVisibility(0);
            if (this.disabledAutoRefreshAdViewAdUnitIds.contains(str)) {
                return;
            }
            maxAdViewRetrieveAdView.startAutoRefresh();
            return;
        }
        e(maxAdFormat.getLabel() + " does not exist for ad unit id \"" + str + "\"");
        this.AdUnitsToShowAfterCreate.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startAdViewAutoRefresh$22(MaxAdFormat maxAdFormat, String str) {
        d("Starting " + maxAdFormat.getLabel() + " auto refresh for ad unit identifier \"" + str + "\"");
        this.disabledAutoRefreshAdViewAdUnitIds.remove(str);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.startAutoRefresh();
            return;
        }
        e(maxAdFormat.getLabel() + " does not exist for ad unit identifier \"" + str + "\"");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopAdViewAutoRefresh$23(MaxAdFormat maxAdFormat, String str) {
        d("Stopping " + maxAdFormat.getLabel() + " auto refresh for ad unit identifier \"" + str + "\"");
        this.disabledAutoRefreshAdViewAdUnitIds.add(str);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.stopAutoRefresh();
            return;
        }
        e(maxAdFormat.getLabel() + " does not exist for ad unit identifier \"" + str + "\"");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateAdViewPosition$25(MaxAdFormat maxAdFormat, String str, String str2, Point point) {
        StringBuilder sb = new StringBuilder("Updating ");
        sb.append(maxAdFormat.getLabel());
        sb.append(" position to \"");
        sb.append(str);
        sb.append("\" for ad unit id \"");
        d(nj.q(sb, str2, "\""));
        if (retrieveAdView(str2, maxAdFormat) != null) {
            this.adViewPositions.put(str2, str);
            this.adViewOffsets.put(str2, point);
            positionAdView(str2, maxAdFormat);
        } else {
            e(maxAdFormat.getLabel() + " does not exist");
        }
    }

    private void logInvalidAdFormat(MaxAdFormat maxAdFormat) {
        logStackTrace(new IllegalStateException("invalid ad format: " + maxAdFormat));
    }

    private void maybeHandleExtraParameterChanges(String str, MaxAdFormat maxAdFormat, String str2, String str3) {
        if (MaxAdFormat.MREC != maxAdFormat) {
            if ("force_banner".equalsIgnoreCase(str2)) {
                MaxAdFormat deviceSpecificAdViewAdFormat = Boolean.parseBoolean(str3) ? MaxAdFormat.BANNER : getDeviceSpecificAdViewAdFormat();
                this.adViewFormats.put(str, deviceSpecificAdViewAdFormat);
                positionAdView(str, deviceSpecificAdViewAdFormat);
            } else if ("adaptive_banner".equalsIgnoreCase(str2)) {
                Log.e(TAG, "Setting adaptive banners via extra parameters is deprecated and will be removed in a future plugin version. Use the CreateBanner(adUnitIdentifier, AdViewConfiguration) API to properly configure adaptive banners.");
                boolean z = Boolean.parseBoolean(str3);
                Set<String> set = this.disabledAdaptiveBannerAdUnitIds;
                if (z) {
                    set.remove(str);
                } else {
                    set.add(str);
                }
                positionAdView(str, maxAdFormat);
            }
        }
    }

    private MaxAdView retrieveAdView(String str, MaxAdFormat maxAdFormat, String str2, Point point, boolean z) {
        MaxAdView maxAdView = this.adViews.get(str);
        if (maxAdView != null || str2 == null || point == null) {
            return maxAdView;
        }
        MaxAdViewConfiguration.Builder builder = MaxAdViewConfiguration.builder();
        if (maxAdFormat.isBannerOrLeaderAd()) {
            if (z) {
                builder.setAdaptiveType(MaxAdViewConfiguration.AdaptiveType.ANCHORED);
            } else {
                builder.setAdaptiveType(MaxAdViewConfiguration.AdaptiveType.NONE);
                this.disabledAdaptiveBannerAdUnitIds.add(str);
            }
        }
        MaxAdView maxAdView2 = new MaxAdView(str, maxAdFormat, builder.build());
        maxAdView2.setListener(this);
        maxAdView2.setRevenueListener(this);
        maxAdView2.setAdReviewListener(this);
        this.adViews.put(str, maxAdView2);
        this.adViewPositions.put(str, str2);
        this.adViewOffsets.put(str, point);
        maxAdView2.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
        return maxAdView2;
    }

    private MaxAppOpenAd retrieveAppOpenAd(String str) {
        MaxAppOpenAd maxAppOpenAd = this.appOpenAds.get(str);
        if (maxAppOpenAd != null) {
            return maxAppOpenAd;
        }
        MaxAppOpenAd maxAppOpenAd2 = new MaxAppOpenAd(str);
        maxAppOpenAd2.setListener(this);
        maxAppOpenAd2.setRevenueListener(this);
        maxAppOpenAd2.setExpirationListener(this);
        this.appOpenAds.put(str, maxAppOpenAd2);
        return maxAppOpenAd2;
    }

    private MaxInterstitialAd retrieveInterstitial(String str) {
        MaxInterstitialAd maxInterstitialAd = this.interstitials.get(str);
        if (maxInterstitialAd != null) {
            return maxInterstitialAd;
        }
        MaxInterstitialAd maxInterstitialAd2 = new MaxInterstitialAd(str);
        maxInterstitialAd2.setListener(this);
        maxInterstitialAd2.setRevenueListener(this);
        maxInterstitialAd2.setAdReviewListener(this);
        maxInterstitialAd2.setExpirationListener(this);
        this.interstitials.put(str, maxInterstitialAd2);
        return maxInterstitialAd2;
    }

    private MaxRewardedAd retrieveRewardedAd(String str) {
        MaxRewardedAd maxRewardedAd = this.rewardedAds.get(str);
        if (maxRewardedAd != null) {
            return maxRewardedAd;
        }
        MaxRewardedAd maxRewardedAd2 = MaxRewardedAd.getInstance(str);
        maxRewardedAd2.setListener(this);
        maxRewardedAd2.setRevenueListener(this);
        maxRewardedAd2.setAdReviewListener(this);
        maxRewardedAd2.setExpirationListener(this);
        this.rewardedAds.put(str, maxRewardedAd2);
        return maxRewardedAd2;
    }

    public static void setBackgroundCallback(BackgroundCallback backgroundCallback2) {
        backgroundCallback = backgroundCallback2;
    }

    public void createMRec(String str, float f, float f2) {
        createAdView(str, MaxAdFormat.MREC, DEFAULT_AD_VIEW_POSITION, getOffsetPixels(f, f2, getCurrentActivity()), false);
    }

    public void destroyMRec(String str) {
        destroyAdView(str, MaxAdFormat.MREC);
    }

    public String getMRecLayout(String str) {
        return getAdViewLayout(str, MaxAdFormat.MREC);
    }

    public Insets getSafeInsets() {
        Window window;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        DisplayCutout displayCutout2;
        Insets insets = new Insets();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 && (window = getCurrentActivity().getWindow()) != null && (rootWindowInsets = window.getDecorView().getRootWindowInsets()) != null) {
            if (i >= 35) {
                if (i >= 30) {
                    android.graphics.Insets insets2 = rootWindowInsets.getInsets(WindowInsets.Type.navigationBars());
                    insets.left = insets2.left;
                    insets.top = insets2.top;
                    insets.right = insets2.right;
                    insets.bottom = insets2.bottom;
                }
                if ((getRenderOutsideSafeArea() || i >= 30) && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
                    insets.left = Math.max(insets.left, displayCutout.getSafeInsetLeft());
                    insets.top = Math.max(insets.top, displayCutout.getSafeInsetTop());
                    insets.right = Math.max(insets.right, displayCutout.getSafeInsetRight());
                    insets.bottom = Math.max(insets.bottom, displayCutout.getSafeInsetBottom());
                    return insets;
                }
            } else if (getRenderOutsideSafeArea() && (displayCutout2 = rootWindowInsets.getDisplayCutout()) != null) {
                insets.left = displayCutout2.getSafeInsetLeft();
                insets.top = displayCutout2.getSafeInsetTop();
                insets.right = displayCutout2.getSafeInsetRight();
                insets.bottom = displayCutout2.getSafeInsetBottom();
                return insets;
            }
        }
        return insets;
    }

    public void hideMRec(String str) {
        hideAdView(str, MaxAdFormat.MREC);
    }

    public void loadMRec(String str) {
        loadAdView(str, MaxAdFormat.MREC);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(@NonNull MaxAd maxAd) {
        threadPoolExecutor.execute(new zi1(this, maxAd, 1));
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(@NonNull MaxAd maxAd) {
        threadPoolExecutor.execute(new zi1(this, maxAd, 2));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(@NonNull MaxAd maxAd, @NonNull MaxError maxError) {
        threadPoolExecutor.execute(new x3(25, this, maxAd, maxError));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(@NonNull MaxAd maxAd) {
        threadPoolExecutor.execute(new zi1(this, maxAd, 3));
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(@NonNull MaxAd maxAd) {
        threadPoolExecutor.execute(new zi1(this, maxAd, 5));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(@NonNull MaxAd maxAd) {
        threadPoolExecutor.execute(new zi1(this, maxAd, 6));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        threadPoolExecutor.execute(new x3(22, this, str, maxError));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        threadPoolExecutor.execute(new zi1(this, maxAd, 0));
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        threadPoolExecutor.execute(new zi1(this, maxAd, 4));
    }

    @Override // com.applovin.mediation.unity.MaxUnityApplicationStateChangeTracker.MaxUnityApplicationStateCallback
    public void onApplicationStateChanged(final boolean z) {
        threadPoolExecutor.execute(new Runnable() { // from class: yi1
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.lambda$onApplicationStateChanged$6(z);
            }
        });
    }

    @Override // com.applovin.sdk.AppLovinCmpService.OnCompletedListener
    public void onCompleted(AppLovinCmpError appLovinCmpError) {
        threadPoolExecutor.execute(new ue0(appLovinCmpError, 15));
    }

    @Override // com.applovin.mediation.MaxAdReviewListener
    public void onCreativeIdGenerated(@NonNull String str, @NonNull MaxAd maxAd) {
        threadPoolExecutor.execute(new x3(23, this, maxAd, str));
    }

    @Override // com.applovin.mediation.MaxAdExpirationListener
    public void onExpiredAdReloaded(@NonNull MaxAd maxAd, @NonNull MaxAd maxAd2) {
        threadPoolExecutor.execute(new x3(24, this, maxAd2, maxAd));
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(@NonNull MaxAd maxAd, @NonNull MaxReward maxReward) {
        threadPoolExecutor.execute(new x3(21, this, maxAd, maxReward));
    }

    public void setAppOpenAdLocalExtraParameter(String str, String str2, Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            retrieveAppOpenAd(str).setLocalExtraParameter(str2, obj);
        }
    }

    public void setBannerLocalExtraParameter(String str, String str2, Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            setAdViewLocalExtraParameter(str, getAdViewAdFormat(str), str2, obj);
        }
    }

    public void setInterstitialLocalExtraParameter(String str, String str2, Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            retrieveInterstitial(str).setLocalExtraParameter(str2, obj);
        }
    }

    public void setMRecCustomData(String str, String str2) {
        setAdViewCustomData(str, MaxAdFormat.MREC, str2);
    }

    public void setMRecExtraParameter(String str, String str2, String str3) {
        setAdViewExtraParameter(str, MaxAdFormat.MREC, str2, str3);
    }

    public void setMRecLocalExtraParameter(String str, String str2, Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            setAdViewLocalExtraParameter(str, MaxAdFormat.MREC, str2, obj);
        }
    }

    public void setMRecPlacement(String str, String str2) {
        setAdViewPlacement(str, MaxAdFormat.MREC, str2);
    }

    public void setRewardedAdLocalExtraParameter(String str, String str2, Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            retrieveRewardedAd(str).setLocalExtraParameter(str2, obj);
        }
    }

    public void showCmpForExistingUser() {
        this.sdk.getCmpService().showCmpForExistingUser(getCurrentActivity(), this);
    }

    public void showMRec(String str) {
        showAdView(str, MaxAdFormat.MREC);
    }

    public void startMRecAutoRefresh(String str) {
        startAdViewAutoRefresh(str, MaxAdFormat.MREC);
    }

    public void stopMRecAutoRefresh(String str) {
        stopAdViewAutoRefresh(str, MaxAdFormat.MREC);
    }

    public void trackEvent(String str, String str2) {
        if (this.sdk == null) {
            return;
        }
        this.sdk.getEventService().trackEvent(str, deserializeParameters(str2));
    }

    public MaxUnityAdManager() {
        AppLovinSdkUtils.runOnUiThread(true, new ue0(this, 16));
    }

    public static /* synthetic */ void access$100(String str, Throwable th) {
        e(str, th);
    }

    private void createAdView(String str, MaxAdFormat maxAdFormat, String str2, Point point, boolean z) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new dj1(0, this, maxAdFormat, str, str2, point, z));
    }

    private static void d(String str) {
        if (MaxUnityPlugin.isDisableAllLogs()) {
            return;
        }
        Log.d(SDK_TAG, "[MaxUnityAdManager] " + str);
    }

    public static Map<String, String> deserializeParameters(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return JsonUtils.toStringMap(JsonUtils.jsonObjectFromJsonString(str, new JSONObject()));
            } catch (Throwable th) {
                e("Failed to deserialize: (" + str + ") with exception: " + th);
                return Collections.EMPTY_MAP;
            }
        }
        return Collections.EMPTY_MAP;
    }

    private void destroyAdView(String str, MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new aj1(this, maxAdFormat, str, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str, Throwable th) {
        if (MaxUnityPlugin.isDisableAllLogs()) {
            return;
        }
        Log.e(SDK_TAG, "[MaxUnityAdManager] " + str, th);
    }

    public static float getAdaptiveBannerHeight(float f) {
        return getDeviceSpecificAdViewAdFormat().getAdaptiveSize((int) f, getCurrentActivity()).getHeight();
    }

    private static Activity getCurrentActivity() {
        return Utils.getCurrentActivity();
    }

    private JSONObject getDefaultAdEventParameters(String str, MaxAd maxAd) {
        JSONObject adInfo = getAdInfo(maxAd);
        JsonUtils.putString(adInfo, "name", str);
        return adInfo;
    }

    private static MaxAdFormat getDeviceSpecificAdViewAdFormat() {
        if (AppLovinSdkUtils.isTablet(getCurrentActivity())) {
            return MaxAdFormat.LEADER;
        }
        return MaxAdFormat.BANNER;
    }

    private void hideAdView(String str, MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new aj1(this, maxAdFormat, str, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$forwardUnityEvent$34(JSONObject jSONObject) {
        backgroundCallback.onEvent(jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeSdkWithCompletionHandler$3(Listener listener, AppLovinSdkConfiguration appLovinSdkConfiguration) {
        listener.onSdkInitializationComplete(appLovinSdkConfiguration);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", "OnSdkInitializedEvent");
        JsonUtils.putString(jSONObject, "consentFlowUserGeography", Integer.toString(appLovinSdkConfiguration.getConsentFlowUserGeography().ordinal()));
        JsonUtils.putString(jSONObject, "consentDialogState", Integer.toString(appLovinSdkConfiguration.getConsentDialogState().ordinal()));
        JsonUtils.putString(jSONObject, "countryCode", appLovinSdkConfiguration.getCountryCode());
        JsonUtils.putString(jSONObject, "isSuccessfullyInitialized", String.valueOf(this.sdk.isInitialized()));
        JsonUtils.putBoolean(jSONObject, "isTestModeEnabled", appLovinSdkConfiguration.isTestModeEnabled());
        forwardUnityEvent(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAdView$20(String str, MaxAdFormat maxAdFormat) {
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        if (!this.disabledAutoRefreshAdViewAdUnitIds.contains(str)) {
            if (maxAdViewRetrieveAdView.getVisibility() != 0) {
                e("Auto-refresh will resume when the " + maxAdFormat.getLabel() + " ad is shown. You should only call LoadBanner() or LoadMRec() if you explicitly pause auto-refresh and want to manually load an ad.");
                return;
            }
            e("You must stop auto-refresh if you want to manually load " + maxAdFormat.getLabel() + " ads.");
            return;
        }
        maxAdViewRetrieveAdView.loadAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdClicked$9(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.BANNER != format && MaxAdFormat.LEADER != format) {
            if (MaxAdFormat.MREC == format) {
                str = "OnMRecAdClickedEvent";
            } else if (MaxAdFormat.INTERSTITIAL == format) {
                str = "OnInterstitialClickedEvent";
            } else if (MaxAdFormat.APP_OPEN == format) {
                str = "OnAppOpenAdClickedEvent";
            } else if (MaxAdFormat.REWARDED == format) {
                str = "OnRewardedAdClickedEvent";
            } else {
                logInvalidAdFormat(format);
                return;
            }
        } else {
            str = "OnBannerAdClickedEvent";
        }
        forwardUnityEvent(getDefaultAdEventParameters(str, maxAd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdCollapsed$13(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (!format.isAdViewAd()) {
            logInvalidAdFormat(format);
            return;
        }
        if (MaxAdFormat.MREC == format) {
            str = "OnMRecAdCollapsedEvent";
        } else {
            str = "OnBannerAdCollapsedEvent";
        }
        forwardUnityEvent(getDefaultAdEventParameters(str, maxAd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdDisplayFailed$11(MaxAd maxAd, MaxError maxError) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (!format.isFullscreenAd()) {
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialAdFailedToDisplayEvent";
        } else if (MaxAdFormat.APP_OPEN == format) {
            str = "OnAppOpenAdFailedToDisplayEvent";
        } else {
            str = "OnRewardedAdFailedToDisplayEvent";
        }
        JSONObject defaultAdEventParameters = getDefaultAdEventParameters(str, maxAd);
        JsonUtils.putString(defaultAdEventParameters, IronSourceConstants.EVENTS_ERROR_CODE, Integer.toString(maxError.getCode()));
        JsonUtils.putString(defaultAdEventParameters, "errorMessage", maxError.getMessage());
        JsonUtils.putString(defaultAdEventParameters, "mediatedNetworkErrorCode", Integer.toString(maxError.getMediatedNetworkErrorCode()));
        JsonUtils.putString(defaultAdEventParameters, "mediatedNetworkErrorMessage", maxError.getMediatedNetworkErrorMessage());
        JsonUtils.putJSONObject(defaultAdEventParameters, "waterfallInfo", createAdWaterfallInfo(maxError.getWaterfall()));
        JsonUtils.putString(defaultAdEventParameters, "latencyMillis", String.valueOf(maxError.getRequestLatencyMillis()));
        forwardUnityEvent(defaultAdEventParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdDisplayed$10(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (!format.isFullscreenAd()) {
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialDisplayedEvent";
        } else if (MaxAdFormat.APP_OPEN == format) {
            str = "OnAppOpenAdDisplayedEvent";
        } else {
            str = "OnRewardedAdDisplayedEvent";
        }
        forwardUnityEvent(getDefaultAdEventParameters(str, maxAd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdExpanded$14(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (!format.isAdViewAd()) {
            logInvalidAdFormat(format);
            return;
        }
        if (MaxAdFormat.MREC == format) {
            str = "OnMRecAdExpandedEvent";
        } else {
            str = "OnBannerAdExpandedEvent";
        }
        forwardUnityEvent(getDefaultAdEventParameters(str, maxAd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdHidden$12(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (!format.isFullscreenAd()) {
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialHiddenEvent";
        } else if (MaxAdFormat.APP_OPEN == format) {
            str = "OnAppOpenAdHiddenEvent";
        } else {
            str = "OnRewardedAdHiddenEvent";
        }
        forwardUnityEvent(getDefaultAdEventParameters(str, maxAd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdLoadFailed$8(String str, MaxError maxError) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            logStackTrace(new IllegalArgumentException("adUnitId cannot be null"));
            return;
        }
        if (this.adViews.containsKey(str)) {
            if (MaxAdFormat.MREC == this.adViewFormats.get(str)) {
                str2 = "OnMRecAdLoadFailedEvent";
            } else {
                str2 = "OnBannerAdLoadFailedEvent";
            }
        } else if (this.interstitials.containsKey(str)) {
            str2 = "OnInterstitialLoadFailedEvent";
        } else if (this.appOpenAds.containsKey(str)) {
            str2 = "OnAppOpenAdLoadFailedEvent";
        } else if (this.rewardedAds.containsKey(str)) {
            str2 = "OnRewardedAdLoadFailedEvent";
        } else {
            logStackTrace(new IllegalStateException(n30.y("invalid adUnitId: ", str)));
            return;
        }
        synchronized (this.adInfoMapLock) {
            this.adInfoMap.remove(str);
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", str2);
        JsonUtils.putString(jSONObject, "adUnitId", str);
        JsonUtils.putString(jSONObject, IronSourceConstants.EVENTS_ERROR_CODE, Integer.toString(maxError.getCode()));
        JsonUtils.putString(jSONObject, "errorMessage", maxError.getMessage());
        JsonUtils.putJSONObject(jSONObject, "waterfallInfo", createAdWaterfallInfo(maxError.getWaterfall()));
        String adLoadFailureInfo = maxError.getAdLoadFailureInfo();
        if (TextUtils.isEmpty(adLoadFailureInfo)) {
            adLoadFailureInfo = "";
        }
        JsonUtils.putString(jSONObject, "adLoadFailureInfo", adLoadFailureInfo);
        JsonUtils.putString(jSONObject, "latencyMillis", String.valueOf(maxError.getRequestLatencyMillis()));
        forwardUnityEvent(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdLoaded$7(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (format.isAdViewAd()) {
            if (MaxAdFormat.MREC == format) {
                str = "OnMRecAdLoadedEvent";
            } else {
                str = "OnBannerAdLoadedEvent";
            }
            positionAdView(maxAd);
            MaxAdView maxAdViewRetrieveAdView = retrieveAdView(maxAd.getAdUnitId(), format);
            if (maxAdViewRetrieveAdView != null && maxAdViewRetrieveAdView.getVisibility() != 0) {
                maxAdViewRetrieveAdView.stopAutoRefresh();
            }
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialLoadedEvent";
        } else if (MaxAdFormat.APP_OPEN == format) {
            str = "OnAppOpenAdLoadedEvent";
        } else if (MaxAdFormat.REWARDED == format) {
            str = "OnRewardedAdLoadedEvent";
        } else {
            logInvalidAdFormat(format);
            return;
        }
        synchronized (this.adInfoMapLock) {
            this.adInfoMap.put(maxAd.getAdUnitId(), maxAd);
        }
        forwardUnityEvent(getDefaultAdEventParameters(str, maxAd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdRevenuePaid$16(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.BANNER != format && MaxAdFormat.LEADER != format) {
            if (MaxAdFormat.MREC == format) {
                str = "OnMRecAdRevenuePaidEvent";
            } else if (MaxAdFormat.INTERSTITIAL == format) {
                str = "OnInterstitialAdRevenuePaidEvent";
            } else if (MaxAdFormat.APP_OPEN == format) {
                str = "OnAppOpenAdRevenuePaidEvent";
            } else if (MaxAdFormat.REWARDED == format) {
                str = "OnRewardedAdRevenuePaidEvent";
            } else {
                logInvalidAdFormat(format);
                return;
            }
        } else {
            str = "OnBannerAdRevenuePaidEvent";
        }
        JSONObject defaultAdEventParameters = getDefaultAdEventParameters(str, maxAd);
        JsonUtils.putBoolean(defaultAdEventParameters, "keepInBackground", format.isFullscreenAd());
        forwardUnityEvent(defaultAdEventParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreativeIdGenerated$18(MaxAd maxAd, String str) {
        String str2;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.BANNER != format && MaxAdFormat.LEADER != format) {
            if (MaxAdFormat.MREC == format) {
                str2 = "OnMRecAdReviewCreativeIdGeneratedEvent";
            } else if (MaxAdFormat.INTERSTITIAL == format) {
                str2 = "OnInterstitialAdReviewCreativeIdGeneratedEvent";
            } else if (MaxAdFormat.REWARDED == format) {
                str2 = "OnRewardedAdReviewCreativeIdGeneratedEvent";
            } else {
                logInvalidAdFormat(format);
                return;
            }
        } else {
            str2 = "OnBannerAdReviewCreativeIdGeneratedEvent";
        }
        JSONObject defaultAdEventParameters = getDefaultAdEventParameters(str2, maxAd);
        JsonUtils.putString(defaultAdEventParameters, "adReviewCreativeId", str);
        JsonUtils.putBoolean(defaultAdEventParameters, "keepInBackground", format.isFullscreenAd());
        forwardUnityEvent(defaultAdEventParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onExpiredAdReloaded$17(MaxAd maxAd, MaxAd maxAd2) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnExpiredInterstitialAdReloadedEvent";
        } else if (MaxAdFormat.APP_OPEN == format) {
            str = "OnExpiredAppOpenAdReloadedEvent";
        } else if (MaxAdFormat.REWARDED == format) {
            str = "OnExpiredRewardedAdReloadedEvent";
        } else {
            logInvalidAdFormat(format);
            return;
        }
        synchronized (this.adInfoMapLock) {
            this.adInfoMap.put(maxAd.getAdUnitId(), maxAd);
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJSONObject(jSONObject, "expiredAdInfo", getAdInfo(maxAd2));
        JsonUtils.putJSONObject(jSONObject, "newAdInfo", getAdInfo(maxAd));
        JsonUtils.putString(jSONObject, "name", str);
        forwardUnityEvent(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUserRewarded$15(MaxAd maxAd, MaxReward maxReward) {
        MaxAdFormat format = maxAd.getFormat();
        if (format != MaxAdFormat.REWARDED) {
            logInvalidAdFormat(format);
            return;
        }
        String label = maxReward.getLabel();
        String string = Integer.toString(maxReward.getAmount());
        JSONObject defaultAdEventParameters = getDefaultAdEventParameters("OnRewardedAdReceivedRewardEvent", maxAd);
        JsonUtils.putString(defaultAdEventParameters, "rewardLabel", label);
        JsonUtils.putString(defaultAdEventParameters, IronSourceConstants.EVENTS_REWARD_AMOUNT, string);
        forwardUnityEvent(defaultAdEventParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAdViewCustomData$32(String str, MaxAdFormat maxAdFormat, String str2) {
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.setCustomData(str2);
            return;
        }
        d(maxAdFormat.getLabel() + " does not exist for ad unit ID \"" + str + "\". Saving custom data to be set when it is created.");
        this.AdViewCustomDataToSetAfterCreate.put(str, str2);
    }

    private void loadAdView(String str, MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new aj1(this, str, maxAdFormat, 6));
    }

    private void logStackTrace(Exception exc) {
        e(Log.getStackTraceString(exc));
    }

    private void positionAdView(String str, MaxAdFormat maxAdFormat) {
        getCurrentActivity().runOnUiThread(new aj1(this, str, maxAdFormat, 1));
    }

    private void setAdViewBackgroundColor(String str, MaxAdFormat maxAdFormat, String str2) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new cj1(maxAdFormat, this, str, str2));
    }

    private void setAdViewCustomData(String str, MaxAdFormat maxAdFormat, String str2) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new cj1(this, str, maxAdFormat, str2, 2));
    }

    private void setAdViewExtraParameter(String str, MaxAdFormat maxAdFormat, String str2, String str3) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new ni0((Object) this, (Object) maxAdFormat, str2, (Object) str3, (Object) str, 4));
    }

    private void setAdViewLocalExtraParameter(String str, MaxAdFormat maxAdFormat, String str2, Object obj) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new ni0((Object) this, (Object) maxAdFormat, str2, obj, (Object) str, 2));
    }

    private void setAdViewPlacement(String str, MaxAdFormat maxAdFormat, String str2) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new cj1(this, str2, maxAdFormat, str, 0));
    }

    private void setAdViewWidth(String str, int i, MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new l(this, maxAdFormat, str, i));
    }

    private void showAdView(String str, MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new aj1(this, maxAdFormat, str, 3));
    }

    private void startAdViewAutoRefresh(String str, MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new aj1(this, maxAdFormat, str, 5));
    }

    private void stopAdViewAutoRefresh(String str, MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new aj1(this, maxAdFormat, str, 4));
    }

    private void updateAdViewPosition(String str, String str2, Point point, MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new ni0((Object) this, (Object) maxAdFormat, str2, (Object) str, (Object) point, 3));
    }

    private static void w(String str) {
        if (MaxUnityPlugin.isDisableAllLogs()) {
            return;
        }
        Log.w(SDK_TAG, "[MaxUnityAdManager] " + str);
    }

    public void createBanner(String str, float f, float f2, boolean z) {
        createAdView(str, getAdViewAdFormat(str), DEFAULT_AD_VIEW_POSITION, getOffsetPixels(f, f2, getCurrentActivity()), z);
    }

    public void destroyBanner(String str) {
        destroyAdView(str, getAdViewAdFormat(str));
    }

    public String getAdValue(String str, String str2) {
        MaxAd ad;
        if (TextUtils.isEmpty(str) || (ad = getAd(str)) == null) {
            return "";
        }
        return ad.getAdValue(str2);
    }

    public String getBannerLayout(String str) {
        return getAdViewLayout(str, getAdViewAdFormat(str));
    }

    public void hideBanner(String str) {
        hideAdView(str, getAdViewAdFormat(str));
    }

    public void initializeSdkWithCompletionHandler(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, Listener listener) {
        AppLovinSdk appLovinSdk = AppLovinSdk.getInstance(getCurrentActivity());
        this.sdk = appLovinSdk;
        appLovinSdk.initialize(appLovinSdkInitializationConfiguration, new lu0(3, this, listener));
    }

    public boolean isAppOpenAdReady(String str) {
        return retrieveAppOpenAd(str).isReady();
    }

    public boolean isInterstitialReady(String str) {
        return retrieveInterstitial(str).isReady();
    }

    public boolean isRewardedAdReady(String str) {
        return retrieveRewardedAd(str).isReady();
    }

    public void loadAppOpenAd(String str) {
        retrieveAppOpenAd(str).loadAd();
    }

    public void loadBanner(String str) {
        loadAdView(str, getAdViewAdFormat(str));
    }

    public void loadInterstitial(String str) {
        retrieveInterstitial(str).loadAd();
    }

    public void loadRewardedAd(String str) {
        retrieveRewardedAd(str).loadAd();
    }

    public void setAppOpenAdExtraParameter(String str, String str2, String str3) {
        retrieveAppOpenAd(str).setExtraParameter(str2, str3);
    }

    public void setBannerBackgroundColor(String str, String str2) {
        setAdViewBackgroundColor(str, getAdViewAdFormat(str), str2);
    }

    public void setBannerCustomData(String str, String str2) {
        setAdViewCustomData(str, getAdViewAdFormat(str), str2);
    }

    public void setBannerExtraParameter(String str, String str2, String str3) {
        setAdViewExtraParameter(str, getAdViewAdFormat(str), str2, str3);
    }

    public void setBannerPlacement(String str, String str2) {
        setAdViewPlacement(str, getAdViewAdFormat(str), str2);
    }

    public void setBannerWidth(String str, int i) {
        setAdViewWidth(str, i, getAdViewAdFormat(str));
    }

    public void setInterstitialExtraParameter(String str, String str2, String str3) {
        retrieveInterstitial(str).setExtraParameter(str2, str3);
    }

    public void setRewardedAdExtraParameter(String str, String str2, String str3) {
        retrieveRewardedAd(str).setExtraParameter(str2, str3);
    }

    public void showAppOpenAd(String str, String str2, String str3) {
        retrieveAppOpenAd(str).showAd(str2, str3);
    }

    public void showBanner(String str) {
        showAdView(str, getAdViewAdFormat(str));
    }

    public void showInterstitial(String str, String str2, String str3) {
        retrieveInterstitial(str).showAd(str2, str3, getCurrentActivity());
    }

    public void showRewardedAd(String str, String str2, String str3) {
        retrieveRewardedAd(str).showAd(str2, str3, getCurrentActivity());
    }

    public void startBannerAutoRefresh(String str) {
        startAdViewAutoRefresh(str, getAdViewAdFormat(str));
    }

    public void stopBannerAutoRefresh(String str) {
        stopAdViewAutoRefresh(str, getAdViewAdFormat(str));
    }

    public void updateBannerPosition(String str, float f, float f2) {
        updateAdViewPosition(str, DEFAULT_AD_VIEW_POSITION, getOffsetPixels(f, f2, getCurrentActivity()), getAdViewAdFormat(str));
    }

    public void updateMRecPosition(String str, float f, float f2) {
        updateAdViewPosition(str, DEFAULT_AD_VIEW_POSITION, getOffsetPixels(f, f2, getCurrentActivity()), MaxAdFormat.MREC);
    }

    private void positionAdView(MaxAd maxAd) {
        positionAdView(maxAd.getAdUnitId(), maxAd.getFormat());
    }

    public void updateMRecPosition(String str, String str2) {
        updateAdViewPosition(str, str2, DEFAULT_AD_VIEW_OFFSET, MaxAdFormat.MREC);
    }

    public void updateBannerPosition(String str, String str2) {
        updateAdViewPosition(str, str2, DEFAULT_AD_VIEW_OFFSET, getAdViewAdFormat(str));
    }

    public void createMRec(String str, String str2) {
        createAdView(str, MaxAdFormat.MREC, str2, DEFAULT_AD_VIEW_OFFSET, false);
    }

    public void createBanner(String str, String str2, boolean z) {
        createAdView(str, getAdViewAdFormat(str), str2, DEFAULT_AD_VIEW_OFFSET, z);
    }

    private static void e(String str) {
        if (MaxUnityPlugin.isDisableAllLogs()) {
            return;
        }
        jc1.x("[MaxUnityAdManager] ", str, SDK_TAG);
    }

    private MaxAdView retrieveAdView(String str, MaxAdFormat maxAdFormat) {
        return retrieveAdView(str, maxAdFormat, null, null, true);
    }
}
