package com.ironsource.adqualitysdk.sdk;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.i.C1328;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class IronSourceAdQuality {

    @Deprecated
    public static final String TAG = "ISAdQuality Agent SDK";

    @Deprecated
    public static final String VERSION = "9.12.0";

    @Deprecated
    public abstract void changeUserId(String str);

    @Deprecated
    public abstract void initialize(Context context, String str);

    @Deprecated
    public abstract void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig);

    public abstract void initializeWithGameId(Context context, String str);

    public abstract void initializeWithGameId(Context context, String str, ISAdQualityConfig iSAdQualityConfig);

    @Deprecated
    public abstract void sendCustomMediationRevenue(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue);

    @Deprecated
    public abstract void setAdListener(ISAdQualityAdListener iSAdQualityAdListener);

    @Deprecated
    public abstract void setConfig(ISAdQualityConfig iSAdQualityConfig);

    @Deprecated
    public abstract void setMetaData(String str, String str2);

    @Deprecated
    public abstract void setSegment(ISAdQualitySegment iSAdQualitySegment);

    @Deprecated
    public abstract void setUserConsent(boolean z);

    @Deprecated
    public abstract void shutdown();

    @Deprecated
    public static String getSDKVersion() {
        return "9.12.0";
    }

    @Deprecated
    public static IronSourceAdQuality getInstance() {
        return C1328.m948();
    }
}
