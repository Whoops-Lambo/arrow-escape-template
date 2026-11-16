package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C5047wb;
import com.ironsource.C5081y9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import defpackage.ek2;
import defpackage.jh0;
import defpackage.kk2;
import defpackage.n30;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class LevelPlay {

    @NotNull
    public static final LevelPlay INSTANCE = new LevelPlay();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum AdFormat {
        BANNER("banner"),
        INTERSTITIAL("interstitial"),
        REWARDED("rewarded"),
        NATIVE_AD("nativeAd");

        private static final /* synthetic */ jh0 c = ek2.m(a());

        @NotNull
        private final String a;

        @NotNull
        public static jh0 getEntries() {
            return c;
        }

        @NotNull
        public final String getValue() {
            return this.a;
        }

        AdFormat(String str) {
            this.a = str;
        }
    }

    private final void a(String str) {
        if (kk2.E(str, com.ironsource.mediationsdk.metadata.a.a, true)) {
            a(str, "LevelPlayPrivacySettings.setCCPA()");
            return;
        }
        List<String> list = com.ironsource.mediationsdk.metadata.a.g;
        list.getClass();
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (kk2.E((String) it.next(), str, true)) {
                a(str, "LevelPlayPrivacySettings.setCOPPA()");
                return;
            }
        }
    }

    @NotNull
    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.6.1";
    }

    public static final void setAdaptersDebug(boolean z) {
        IronLog.API.info("enabled: " + z);
        p.g().a(z);
    }

    public static final void setConsent(boolean z) {
        IronLog.API.info("consent: " + z);
        p.g().b(z);
    }

    private LevelPlay() {
    }

    public static final void addImpressionDataListener(@NotNull LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        levelPlayImpressionDataListener.getClass();
        IronLog.API.info("adding listener: ".concat(levelPlayImpressionDataListener.getClass().getSimpleName()));
        C5047wb.a.a(levelPlayImpressionDataListener);
    }

    public static final void addImpressionLevelRevenueListener(@NotNull LevelPlayImpressionDataListener levelPlayImpressionDataListener, @NotNull String str) {
        levelPlayImpressionDataListener.getClass();
        str.getClass();
        IronLog.API.info("adding listener: ".concat(levelPlayImpressionDataListener.getClass().getSimpleName()));
        C5047wb.a.a(levelPlayImpressionDataListener, str);
    }

    public static final void init(@NotNull Context context, @NotNull LevelPlayInitRequest levelPlayInitRequest, @NotNull LevelPlayInitListener levelPlayInitListener) {
        context.getClass();
        levelPlayInitRequest.getClass();
        levelPlayInitListener.getClass();
        C5047wb.a.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    public static final void launchTestSuite(@NotNull Context context) {
        context.getClass();
        IronLog.API.info("");
        p.g().c(context);
    }

    public static final void removeImpressionDataListener(@NotNull LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        levelPlayImpressionDataListener.getClass();
        IronLog.API.info("removing listener: ".concat(levelPlayImpressionDataListener.getClass().getSimpleName()));
        C5047wb.a.b(levelPlayImpressionDataListener);
    }

    public static final void removeImpressionLevelRevenueListener(@NotNull LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        levelPlayImpressionDataListener.getClass();
        IronLog.API.info("removing subscriber listener: ".concat(levelPlayImpressionDataListener.getClass().getSimpleName()));
        C5047wb.a.c(levelPlayImpressionDataListener);
    }

    public static final boolean setDynamicUserId(@NotNull String str) {
        str.getClass();
        IronLog.API.info("dynamicUserId: ".concat(str));
        return p.g().b(str);
    }

    public static final void setMetaData(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        IronLog.API.info("key = " + str + ", value = " + str2);
        INSTANCE.a(str);
        C5047wb.a.a(str, str2);
    }

    public static final void setNetworkData(@NotNull String str, @NotNull JSONObject jSONObject) {
        str.getClass();
        jSONObject.getClass();
        IronLog.API.info("networkKey = " + str + ", networkData = " + jSONObject);
        p.g().b(str, jSONObject);
    }

    public static final void setSegment(@NotNull LevelPlaySegment levelPlaySegment) {
        levelPlaySegment.getClass();
        IronLog.API.info("");
        C5047wb.a.b(levelPlaySegment);
    }

    public static final void validateIntegration(@NotNull Context context) {
        context.getClass();
        IronLog.API.info("");
        C5081y9.a.a(context);
    }

    public static final void setMetaData(@NotNull String str, @NotNull List<String> list) {
        str.getClass();
        list.getClass();
        IronLog.API.info("key = " + str + ", values = " + list);
        INSTANCE.a(str);
        C5047wb.a.a(str, list);
    }

    private final void a(String str, String str2) {
        IronLog.API.warning(n30.n("Setting '", str, "' via setMetaData is deprecated. Use ", str2, " instead."));
    }
}
