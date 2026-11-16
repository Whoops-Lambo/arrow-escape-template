package com.unity3d.ironsourceads;

import android.content.Context;
import com.ironsource.V9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p;
import defpackage.ek2;
import defpackage.jh0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class IronSourceAds {

    @NotNull
    public static final IronSourceAds INSTANCE = new IronSourceAds();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum AdFormat {
        BANNER("Banner"),
        INTERSTITIAL("Interstitial"),
        REWARDED("RewardedVideo");

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

    public static final void enableDebugMode(boolean z) {
        IronLog.API.info("enabled: " + z);
        p.g().a(z);
    }

    @NotNull
    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.6.1";
    }

    public static final void setConsent(boolean z) throws JSONException {
        IronLog.API.info("consent: " + z);
        V9.a.b(z);
    }

    private IronSourceAds() {
    }

    public static final void init(@NotNull Context context, @NotNull InitRequest initRequest, @NotNull InitListener initListener) {
        context.getClass();
        initRequest.getClass();
        initListener.getClass();
        V9.a.a(context, initRequest, initListener);
    }

    public static final void setMetaData(@NotNull String str, @NotNull List<String> list) {
        str.getClass();
        list.getClass();
        IronLog.API.info("key = " + str + ", values = " + list);
        p.g().a(str, list);
    }

    public static final void setMetaData(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        IronLog.API.info("key = " + str + ", value = " + str2);
        V9.a.a(str, str2);
    }
}
