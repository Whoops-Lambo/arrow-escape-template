package com.ironsource.mediationsdk.adquality;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C4687c9;
import com.ironsource.C4768h0;
import com.ironsource.C4796ia;
import com.ironsource.C4803j0;
import com.ironsource.C4950r4;
import com.ironsource.C4992ta;
import com.ironsource.C5;
import com.ironsource.C5083yb;
import com.ironsource.D5;
import com.ironsource.O6;
import com.ironsource.P6;
import com.ironsource.Pb;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.dk2;
import defpackage.du;
import defpackage.e80;
import defpackage.kk2;
import defpackage.s3;
import defpackage.s71;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class AdQualityBridge {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private static Boolean isGetVersionMethodExist;

    @NotNull
    private final C5083yb tools;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isGetVersionMethodExist() throws JSONException {
            try {
                if (AdQualityBridge.isGetVersionMethodExist != null) {
                    return s71.b(AdQualityBridge.isGetVersionMethodExist, Boolean.TRUE);
                }
                boolean z = IronSourceAdQuality.class.getDeclaredMethods().length >= 10;
                AdQualityBridge.isGetVersionMethodExist = Boolean.valueOf(z);
                return z;
            } catch (Throwable th) {
                C4950r4.d().a(th);
                logEvent$default(this, D5.TROUBLESHOOTING_AD_QUALITY_SDK_NOT_EXIST, null, null, 6, null);
                return false;
            }
        }

        private static /* synthetic */ void isGetVersionMethodExist$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logEvent(D5 d5, Integer num, String str) throws JSONException {
            JSONObject jSONObjectB = IronSourceUtils.b(false);
            if (num != null) {
                jSONObjectB.put(IronSourceConstants.EVENTS_ERROR_CODE, num.intValue());
            }
            if (str != null) {
                jSONObjectB.put("reason", str);
            }
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, a.a.a().c());
            Pb.w.d().q().a(new C5(d5, jSONObjectB));
        }

        public static /* synthetic */ void logEvent$default(Companion companion, D5 d5, Integer num, String str, int i, Object obj) throws JSONException {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            companion.logEvent(d5, num, str);
        }

        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int versionCompare(String str, String str2) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Pattern patternCompile = Pattern.compile("[^0-9.]");
                patternCompile.getClass();
                str.getClass();
                String strReplaceAll = patternCompile.matcher(str).replaceAll("");
                strReplaceAll.getClass();
                int i = 0;
                String[] strArr = (String[]) dk2.n0(strReplaceAll, new String[]{UserDetailsUtils.UserDetailsLiterals.DOT}, 0, 6).toArray(new String[0]);
                Pattern patternCompile2 = Pattern.compile("[^0-9.]");
                patternCompile2.getClass();
                str2.getClass();
                String strReplaceAll2 = patternCompile2.matcher(str2).replaceAll("");
                strReplaceAll2.getClass();
                String[] strArr2 = (String[]) dk2.n0(strReplaceAll2, new String[]{UserDetailsUtils.UserDetailsLiterals.DOT}, 0, 6).toArray(new String[0]);
                while (i < strArr.length && i < strArr2.length && s71.b(strArr[i], strArr2[i])) {
                    i++;
                }
                if (i < strArr.length && i < strArr2.length) {
                    int iIntValue = Integer.valueOf(strArr[i]).intValue();
                    Integer numValueOf = Integer.valueOf(strArr2[i]);
                    numValueOf.getClass();
                    return Integer.signum(s71.h(iIntValue, numValueOf.intValue()));
                }
                return Integer.signum(strArr.length - strArr2.length);
            }
            return -1;
        }

        public final boolean adQualityAvailable() {
            if (versionCompare(getAdQualitySdkVersion(), "7.9.0") >= 0) {
                return true;
            }
            return false;
        }

        @NotNull
        public final String getAdQualitySdkVersion() {
            if (isGetVersionMethodExist()) {
                String sDKVersion = IronSourceAdQuality.getSDKVersion();
                sDKVersion.getClass();
                return sDKVersion;
            }
            return new String();
        }

        private Companion() {
        }
    }

    public static final boolean adQualityAvailable() {
        return Companion.adQualityAvailable();
    }

    private final ISAdQualityLogLevel convertToAdQualityLogLevel(int i) {
        if (i == 0) {
            return ISAdQualityLogLevel.VERBOSE;
        }
        if (i == 1) {
            return ISAdQualityLogLevel.INFO;
        }
        if (i != 2) {
            return i != 3 ? ISAdQualityLogLevel.INFO : ISAdQualityLogLevel.ERROR;
        }
        return ISAdQualityLogLevel.WARNING;
    }

    @NotNull
    public static final String getAdQualitySdkVersion() {
        return Companion.getAdQualitySdkVersion();
    }

    private final ISAdQualityDeviceIdType getDeviceIdType() {
        return !TextUtils.isEmpty(O6.a().a(P6.N)) ? ISAdQualityDeviceIdType.NONE : ISAdQualityDeviceIdType.GAID;
    }

    private static final boolean isGetVersionMethodExist() {
        return Companion.isGetVersionMethodExist();
    }

    private static final void logEvent(D5 d5, Integer num, String str) throws JSONException {
        Companion.logEvent(d5, num, str);
    }

    private final boolean revenueDataReportingAvailable() {
        Companion companion = Companion;
        return companion.versionCompare(companion.getAdQualitySdkVersion(), "9.8.0") >= 0;
    }

    private static final int versionCompare(String str, String str2) {
        return Companion.versionCompare(str, str2);
    }

    public AdQualityBridge(@NotNull Context context, @NotNull String str, @Nullable String str2, @NotNull C4803j0 c4803j0, int i, @NotNull C5083yb c5083yb) throws JSONException {
        context.getClass();
        str.getClass();
        c4803j0.getClass();
        c5083yb.getClass();
        this.tools = c5083yb;
        ISAdQualityConfig.Builder deviceIdType = new ISAdQualityConfig.Builder().setInitializationSource("LevelPlay").setLogLevel(convertToAdQualityLogLevel(i)).setAdQualityInitListener(new ISAdQualityInitListener() { // from class: com.ironsource.mediationsdk.adquality.AdQualityBridge$configBuilder$1
            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitSuccess() throws JSONException {
                AdQualityBridge.Companion.logEvent$default(AdQualityBridge.Companion, D5.TROUBLESHOOTING_AD_QUALITY_SDK_INITIALIZED_SUCCESSFULLY_EVENT, null, null, 6, null);
                this.this$0.enableRevenueDataReporting();
            }

            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str3) throws JSONException {
                iSAdQualityInitError.getClass();
                str3.getClass();
                D5 d5 = D5.TROUBLESHOOTING_AD_QUALITY_SDK_FAILED_TO_INITIALIZE_EVENT;
                if (iSAdQualityInitError == ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED) {
                    d5 = D5.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT;
                    this.this$0.enableRevenueDataReporting();
                }
                AdQualityBridge.Companion.logEvent(d5, Integer.valueOf(iSAdQualityInitError.getValue()), str3);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Ad Quality failed to initialize: ".concat(str3), 3);
            }
        }).setCoppa(getCoppaValue()).setDeviceIdType(getDeviceIdType());
        if (a.a.b()) {
            deviceIdType.setTestMode(true);
        }
        if (!TextUtils.isEmpty(str2)) {
            deviceIdType.setUserId(str2);
        }
        Companion companion = Companion;
        if (companion.versionCompare(companion.getAdQualitySdkVersion(), "7.14.1") >= 0) {
            JSONObject jSONObjectA = c4803j0.a();
            if (jSONObjectA.length() > 0) {
                deviceIdType.setMetaData(jSONObjectA);
            }
        }
        Companion.logEvent$default(companion, D5.TROUBLESHOOTING_INITIALIZING_AD_QUALITY_SDK_EVENT, null, null, 6, null);
        IronSourceAdQuality.getInstance().initialize(context, str, deviceIdType.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enableRevenueDataReporting() {
        if (!revenueDataReportingAvailable()) {
            return;
        }
        this.tools.a(new s3(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableRevenueDataReporting$lambda$1(AdQualityBridge adQualityBridge) throws JSONException {
        C4992ta.b().a(new C4768h0(adQualityBridge, adQualityBridge.tools));
        Companion.logEvent$default(Companion, D5.TROUBLESHOOTING_AD_QUALITY_REVENUE_DATA_REPORTING_ENABLED_EVENT, null, null, 6, null);
    }

    private final boolean getCoppaValue() {
        String str;
        List<String> list = C4992ta.b().c().get(com.ironsource.mediationsdk.metadata.a.b);
        if (list != null && (str = (String) du.c0(list)) != null) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public final void changeUserId(@NotNull String str) {
        str.getClass();
        IronSourceAdQuality.getInstance().changeUserId(str);
    }

    public final void sendCustomMediationRevenue$mediationsdk_release(@NotNull C4687c9 c4687c9) {
        c4687c9.getClass();
        IronSourceAdQuality.getInstance().sendCustomMediationRevenue(new ISAdQualityCustomMediationRevenue.Builder().setMediationNetwork(ISAdQualityMediationNetwork.LEVEL_PLAY).setCustomData(c4687c9.d()).build());
    }

    public final void setSegment(@NotNull C4796ia c4796ia) {
        c4796ia.getClass();
        ISAdQualitySegment.Builder builder = new ISAdQualitySegment.Builder();
        if (c4796ia.g() != null) {
            builder.setSegmentName(c4796ia.g());
        }
        if (c4796ia.a() > -1) {
            builder.setAge(c4796ia.a());
        }
        if (c4796ia.b() != null) {
            builder.setGender(c4796ia.b());
        }
        if (c4796ia.e() > -1) {
            builder.setLevel(c4796ia.e());
        }
        if (c4796ia.d() != null) {
            builder.setIsPaying(c4796ia.d().get());
        }
        if (c4796ia.c() > -1.0d) {
            builder.setInAppPurchasesTotal(c4796ia.c());
        }
        if (c4796ia.h() > 0) {
            builder.setUserCreationDate(c4796ia.h());
        }
        Iterator<Pair<String, String>> it = c4796ia.f().iterator();
        it.getClass();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            String str = (String) next.first;
            String str2 = (String) next.second;
            str.getClass();
            if (kk2.L(str, "custom_", false)) {
                builder.setCustomData(dk2.g0(str, "custom_"), str2);
            }
        }
        IronSourceAdQuality.getInstance().setSegment(builder.build());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdQualityBridge(@NotNull Context context, @NotNull String str, @Nullable String str2, @NotNull C4803j0 c4803j0, int i) {
        this(context, str, str2, c4803j0, i, null, 32, null);
        context.getClass();
        str.getClass();
        c4803j0.getClass();
    }

    public /* synthetic */ AdQualityBridge(Context context, String str, String str2, C4803j0 c4803j0, int i, C5083yb c5083yb, int i2, e80 e80Var) {
        this(context, str, str2, c4803j0, i, (i2 & 32) != 0 ? new C5083yb() : c5083yb);
    }
}
