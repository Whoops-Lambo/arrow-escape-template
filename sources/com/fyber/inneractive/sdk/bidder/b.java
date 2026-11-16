package com.fyber.inneractive.sdk.bidder;

import android.app.NotificationManager;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a1;
import com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.protobuf.y0;
import com.fyber.inneractive.sdk.protobuf.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t1;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements e, a1, com.fyber.inneractive.sdk.config.cellular.h {
    public static final b h = new b();
    public final k a;
    public final com.fyber.inneractive.sdk.serverapi.c b;
    public final d c;
    public f d;
    public final AtomicReference e = new AtomicReference(null);
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final Object g = new Object();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final byte[] a() {
        JSONArray jSONArrayA;
        o0 o0Var;
        byte b;
        byte b2;
        u0 u0Var;
        o0 o0Var2;
        String str;
        k kVar = this.a;
        kVar.b = (z0) kVar.b.dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
        k kVar2 = this.a;
        this.c.getClass();
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA = h.a("1.2");
        kVar2.c();
        ((TokenParametersOuterClass$TokenParameters) kVar2.b).setVersion(nullableStringA);
        if (this.e.get() != null) {
            this.c.a();
        }
        k kVar3 = this.a;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA2 = h.a(this.c.b);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setUserAgent(nullableStringA2);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA3 = h.a(this.c.c);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setSdkVersion(nullableStringA3);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA4 = h.a(this.c.d);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setBundleID(nullableStringA4);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA5 = h.a(this.c.e);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceModel(nullableStringA5);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA6 = h.a(this.c.f);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setAppVersion(nullableStringA6);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA7 = h.a("Android");
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceOS(nullableStringA7);
        int i = Build.VERSION.SDK_INT;
        a0 a0VarNewBuilder = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        a0VarNewBuilder.c();
        ((TokenParametersOuterClass$TokenParameters.NullableUInt32) a0VarNewBuilder.b).setData(i);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) a0VarNewBuilder.a();
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceApi(nullableUInt32);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA8 = h.a(Build.VERSION.RELEASE);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setOsVersion(nullableStringA8);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA9 = h.a(this.c.g);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceLanguage(nullableStringA9);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA10 = h.a(this.c.h);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setCountryCode(nullableStringA10);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA11 = h.a(this.c.i);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setCarrierName(nullableStringA11);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA12 = h.a(this.c.j);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setMobileCountryCode(nullableStringA12);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA13 = h.a(this.c.k);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setMobileNetworkCode(nullableStringA13);
        Long l = this.c.l;
        y yVarNewBuilder = TokenParametersOuterClass$TokenParameters.NullableSInt32.newBuilder();
        if (l != null) {
            int iIntValue = l.intValue();
            yVarNewBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableSInt32) yVarNewBuilder.b).setData(iIntValue);
        }
        TokenParametersOuterClass$TokenParameters.NullableSInt32 nullableSInt32 = (TokenParametersOuterClass$TokenParameters.NullableSInt32) yVarNewBuilder.a();
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setOffsetFromGMT(nullableSInt32);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA14 = h.a(this.c.L);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setTimezone(nullableStringA14);
        IAConfigManager iAConfigManager = IAConfigManager.Q;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA15 = h.a(iAConfigManager.E.g);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setUserID(nullableStringA15);
        int i2 = this.c.m;
        a0 a0VarNewBuilder2 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (i2 > 0) {
            a0VarNewBuilder2.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) a0VarNewBuilder2.b).setData(i2);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt33 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) a0VarNewBuilder2.a();
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceWidth(nullableUInt33);
        int i3 = this.c.n;
        a0 a0VarNewBuilder3 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (i3 > 0) {
            a0VarNewBuilder3.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) a0VarNewBuilder3.b).setData(i3);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt34 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) a0VarNewBuilder3.a();
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceHeight(nullableUInt34);
        q qVar = this.c.o;
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setFrameworkName(qVar);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA16 = h.a(this.c.p);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setInputLanguages(nullableStringA16);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA17 = h.a(this.c.G);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setMediationType(nullableStringA17);
        this.c.getClass();
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.F.o;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA18 = h.a(lVar != null ? lVar.getOdt() : "");
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setOdt(nullableStringA18);
        Integer numA = com.fyber.inneractive.sdk.serverapi.b.a();
        a0 a0VarNewBuilder4 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (numA != null) {
            int iIntValue2 = numA.intValue();
            a0VarNewBuilder4.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) a0VarNewBuilder4.b).setData(iIntValue2);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt35 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) a0VarNewBuilder4.a();
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setAdServicesVersion(nullableUInt35);
        com.fyber.inneractive.sdk.config.h hVar = iAConfigManager.E;
        if (hVar != null) {
            k kVar4 = this.a;
            if (hVar.n() == IabTcfGdprAppliesStatus.DOES_NOT_APPLY || com.fyber.inneractive.sdk.util.o.a == null) {
                str = null;
            } else {
                hVar.p();
                if (hVar.e == null) {
                    hVar.e = hVar.l();
                }
                str = hVar.d;
                if (str == null) {
                    str = hVar.e;
                }
            }
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringA19 = h.a(str);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.b).setGdprString(nullableStringA19);
            TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA = h.a(hVar.e());
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.b).setGdprConsent(nullableBoolA);
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringA20 = h.a(com.fyber.inneractive.sdk.util.o.a == null ? null : hVar.h);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.b).setCcpaString(nullableStringA20);
            TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA2 = h.a(com.fyber.inneractive.sdk.util.o.a == null ? null : hVar.i);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.b).setLgpdConsent(nullableBoolA2);
            Boolean bool = hVar.j;
            if (bool != null && bool.booleanValue()) {
                k kVar5 = this.a;
                TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA3 = h.a(bool);
                kVar5.c();
                ((TokenParametersOuterClass$TokenParameters) kVar5.b).setCoppaApplies(nullableBoolA3);
            }
            com.fyber.inneractive.sdk.gpp.a aVar = hVar.n;
            String str2 = aVar.d;
            String str3 = aVar.a.get() == null ? null : aVar.b;
            if (com.fyber.inneractive.sdk.util.v.a(str2) || com.fyber.inneractive.sdk.util.v.a(str3)) {
                r rVarNewBuilder = TokenParametersOuterClass$TokenParameters.Gpp.newBuilder();
                if (com.fyber.inneractive.sdk.util.v.a(str2)) {
                    rVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.Gpp) rVarNewBuilder.b).setGppEncodedString(str2);
                } else {
                    IAlog.a("%ssetGppDataToToken No GPP String found, not adding to token", IAlog.a(this));
                }
                if (com.fyber.inneractive.sdk.util.v.a(str3)) {
                    rVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.Gpp) rVarNewBuilder.b).setGppSid(str3);
                } else {
                    IAlog.a("%ssetGppDataToToken No GPP SID found, not adding to token", IAlog.a(this));
                }
                k kVar6 = this.a;
                TokenParametersOuterClass$TokenParameters.Gpp gpp = (TokenParametersOuterClass$TokenParameters.Gpp) rVarNewBuilder.a();
                kVar6.c();
                ((TokenParametersOuterClass$TokenParameters) kVar6.b).setGpp(gpp);
            } else {
                IAlog.a("%ssetGppDataToToken No GPP data found", IAlog.a(this));
            }
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            k kVar7 = this.a;
            com.fyber.inneractive.sdk.config.y yVar = com.fyber.inneractive.sdk.config.x.a.b;
            boolean z = yVar != null ? yVar.b : false;
            kVar7.c();
            ((TokenParametersOuterClass$TokenParameters) kVar7.b).setDnt(z);
        }
        k kVar8 = this.a;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA21 = h.a(this.c.q);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setNetwork(nullableStringA21);
        g0 g0Var = this.c.r;
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setSecureContent(g0Var);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA4 = h.a(this.c.B);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setBatteryCharging(nullableBoolA4);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA5 = h.a(this.c.s);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setHeadsetPlugged(nullableBoolA5);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA6 = h.a(this.c.t);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setBluetoothPlugged(nullableBoolA6);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA7 = h.a(this.c.u);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setLowPowerMode(nullableBoolA7);
        boolean z2 = this.c.v;
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setDarkMode(z2);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA8 = h.a(this.c.w);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setAirplaneMode(nullableBoolA8);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA9 = h.a(this.c.x);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setDndMode(nullableBoolA9);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA10 = h.a(this.c.y);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setIsRingMuted(nullableBoolA10);
        int i4 = this.c.z;
        a0 a0VarNewBuilder5 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (i4 > 0) {
            a0VarNewBuilder5.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) a0VarNewBuilder5.b).setData(i4);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt36 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) a0VarNewBuilder5.a();
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setSessionDuration(nullableUInt36);
        String str4 = this.c.C;
        a0 a0VarNewBuilder6 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (!TextUtils.isEmpty(str4)) {
            int i5 = Integer.parseInt(str4);
            a0VarNewBuilder6.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) a0VarNewBuilder6.b).setData(i5);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt37 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) a0VarNewBuilder6.a();
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setBatteryLevel(nullableUInt37);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA11 = h.a(Boolean.valueOf(TextUtils.equals(iAConfigManager.x.a(UnitDisplayType.INTERSTITIAL, "LAST_VAST_SKIPED"), "1")));
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setPriorSkip(nullableBoolA11);
        InneractiveUserConfig.Gender gender = this.c.D;
        q0 q0Var = gender == InneractiveUserConfig.Gender.FEMALE ? q0.FEMALE : gender == InneractiveUserConfig.Gender.MALE ? q0.MALE : q0.UNKNOWN;
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setUserGender(q0Var);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA22 = h.a(this.c.F);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setZipCode(nullableStringA22);
        boolean z3 = this.c.E;
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setMuteAudio(z3);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA12 = h.a(this.c.K);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setMediaMuted(nullableBoolA12);
        com.fyber.inneractive.sdk.config.y yVar2 = com.fyber.inneractive.sdk.config.x.a.b;
        boolean z4 = yVar2 != null ? yVar2.c : false;
        k kVar9 = this.a;
        if (z4) {
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringA23 = h.a(this.c.A);
            kVar9.c();
            ((TokenParametersOuterClass$TokenParameters) kVar9.b).setAmazonId(nullableStringA23);
        } else {
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringA24 = h.a(this.c.A);
            kVar9.c();
            ((TokenParametersOuterClass$TokenParameters) kVar9.b).setAaid(nullableStringA24);
        }
        UnitDisplayType[] unitDisplayTypeArrValues = UnitDisplayType.values();
        int length = unitDisplayTypeArrValues.length;
        int i6 = 0;
        while (true) {
            byte b3 = 1;
            if (i6 >= length) {
                com.fyber.inneractive.sdk.serverapi.c cVar = this.b;
                cVar.getClass();
                com.fyber.inneractive.sdk.config.global.r rVarA = com.fyber.inneractive.sdk.config.global.r.a();
                cVar.a = rVarA;
                rVarA.a(false, "");
                com.fyber.inneractive.sdk.config.global.r rVar = this.b.a;
                if (rVar != null) {
                    jSONArrayA = com.fyber.inneractive.sdk.config.global.g.a(rVar.b, true);
                    IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArrayA);
                } else {
                    jSONArrayA = null;
                }
                if (jSONArrayA != null) {
                    for (int i7 = 0; i7 < jSONArrayA.length(); i7++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayA.optJSONObject(i7);
                        if (jSONObjectOptJSONObject != null) {
                            n nVarNewBuilder = TokenParametersOuterClass$TokenParameters.Experiment.newBuilder();
                            String strOptString = jSONObjectOptJSONObject.optString("id");
                            nVarNewBuilder.c();
                            ((TokenParametersOuterClass$TokenParameters.Experiment) nVarNewBuilder.b).setIdentifier(strOptString);
                            String strOptString2 = jSONObjectOptJSONObject.optString("v");
                            nVarNewBuilder.c();
                            ((TokenParametersOuterClass$TokenParameters.Experiment) nVarNewBuilder.b).setVariant(strOptString2);
                            k kVar10 = this.a;
                            TokenParametersOuterClass$TokenParameters.Experiment experiment = (TokenParametersOuterClass$TokenParameters.Experiment) nVarNewBuilder.a();
                            kVar10.c();
                            ((TokenParametersOuterClass$TokenParameters) kVar10.b).addAbExperiments(experiment);
                        }
                    }
                }
                k kVar11 = this.a;
                int i8 = com.fyber.inneractive.sdk.config.n.a;
                String property = System.getProperty("ia.testEnvironmentConfiguration.number");
                a0 a0VarNewBuilder7 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
                if (!TextUtils.isEmpty(property)) {
                    int i9 = Integer.parseInt(property);
                    a0VarNewBuilder7.c();
                    ((TokenParametersOuterClass$TokenParameters.NullableUInt32) a0VarNewBuilder7.b).setData(i9);
                }
                TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt38 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) a0VarNewBuilder7.a();
                kVar11.c();
                ((TokenParametersOuterClass$TokenParameters) kVar11.b).setPortal(nullableUInt38);
                k kVar12 = this.a;
                TokenParametersOuterClass$TokenParameters.NullableString nullableStringA25 = h.a(System.getProperty("ia.testEnvironmentConfiguration.response"));
                kVar12.c();
                ((TokenParametersOuterClass$TokenParameters) kVar12.b).setMockResponseId(nullableStringA25);
                k kVar13 = this.a;
                TokenParametersOuterClass$TokenParameters.NullableString nullableStringA26 = h.a(this.c.H);
                kVar13.c();
                ((TokenParametersOuterClass$TokenParameters) kVar13.b).setIgniteVersion(nullableStringA26);
                k kVar14 = this.a;
                TokenParametersOuterClass$TokenParameters.NullableString nullableStringA27 = h.a(this.c.I);
                kVar14.c();
                ((TokenParametersOuterClass$TokenParameters) kVar14.b).setIgnitePackageName(nullableStringA27);
                if (this.c.J) {
                    k kVar15 = this.a;
                    TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA13 = h.a(Boolean.TRUE);
                    kVar15.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar15.b).setChildMode(nullableBoolA13);
                }
                return ((TokenParametersOuterClass$TokenParameters) this.a.a()).toByteArray();
            }
            UnitDisplayType unitDisplayType = unitDisplayTypeArrValues[i6];
            if (!unitDisplayType.isDeprecated()) {
                int[] iArr = g.a;
                int i10 = iArr[unitDisplayType.ordinal()];
                if (i10 == 1) {
                    o0Var = o0.BANNER;
                } else if (i10 == 2) {
                    o0Var = o0.INTERSTITIAL;
                } else if (i10 == 3) {
                    o0Var = o0.REWARDED;
                } else if (i10 != 4) {
                    o0Var = i10 != 5 ? o0.UNITDISPLAYTYPEUNKNOWN : o0.TYPENATIVE;
                } else {
                    o0Var = o0.MRECT;
                }
                com.fyber.inneractive.sdk.serverapi.a aVar2 = com.fyber.inneractive.sdk.serverapi.b.a;
                IAConfigManager iAConfigManager2 = IAConfigManager.Q;
                String strA = iAConfigManager2.x.a(unitDisplayType, "LAST_DOMAIN_SHOWED");
                if (!TextUtils.isEmpty(strA) && strA.contains(",")) {
                    strA = strA.split(",")[0];
                }
                if (!TextUtils.isEmpty(strA)) {
                    k kVar16 = this.a;
                    s sVarNewBuilder = TokenParametersOuterClass$TokenParameters.LastAdomain.newBuilder();
                    sVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdomain) sVarNewBuilder.b).setAdomain(strA);
                    sVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdomain) sVarNewBuilder.b).setType(o0Var);
                    TokenParametersOuterClass$TokenParameters.LastAdomain lastAdomain = (TokenParametersOuterClass$TokenParameters.LastAdomain) sVarNewBuilder.a();
                    kVar16.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar16.b).addLastAdomains(lastAdomain);
                }
                String strA2 = iAConfigManager2.x.a(unitDisplayType, "LAST_APP_BUNDLE_ID");
                if (!TextUtils.isEmpty(strA2)) {
                    k kVar17 = this.a;
                    u uVarNewBuilder = TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle.newBuilder();
                    uVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) uVarNewBuilder.b).setLastBundle(strA2);
                    uVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) uVarNewBuilder.b).setType(o0Var);
                    TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle lastAdvertisedBundle = (TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) uVarNewBuilder.a();
                    kVar17.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar17.b).addLastAdvertisedBundles(lastAdvertisedBundle);
                }
                if (TextUtils.equals(iAConfigManager2.x.a(unitDisplayType, "LAST_CLICKED"), "1")) {
                    k kVar18 = this.a;
                    int i11 = iArr[unitDisplayType.ordinal()];
                    if (i11 == 1) {
                        b = 3;
                        b2 = 4;
                        o0Var2 = o0.BANNER;
                    } else if (i11 != 2) {
                        b = 3;
                        if (i11 != 3) {
                            b2 = 4;
                            o0Var2 = i11 != 4 ? i11 != 5 ? o0.UNITDISPLAYTYPEUNKNOWN : o0.TYPENATIVE : o0.MRECT;
                        } else {
                            b2 = 4;
                            o0Var2 = o0.REWARDED;
                        }
                    } else {
                        b = 3;
                        b2 = 4;
                        o0Var2 = o0.INTERSTITIAL;
                    }
                    kVar18.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar18.b).addPriorClicks(o0Var2);
                } else {
                    b = 3;
                    b2 = 4;
                }
                a("display", unitDisplayType, o0Var);
                if (unitDisplayType.isFullscreenUnit()) {
                    a("video", unitDisplayType, o0Var);
                    String strA3 = iAConfigManager2.x.a(unitDisplayType, "LAST_VAST_CLICKED_TYPE");
                    if (!TextUtils.isEmpty(strA3)) {
                        k kVar19 = this.a;
                        b0 b0VarNewBuilder = TokenParametersOuterClass$TokenParameters.PriorVideoClickType.newBuilder();
                        strA3.getClass();
                        switch (strA3.hashCode()) {
                            case 49:
                                b3 = strA3.equals("1") ? (byte) 0 : (byte) -1;
                                break;
                            case 50:
                                if (!strA3.equals("2")) {
                                    b3 = -1;
                                }
                                break;
                            case 51:
                                b3 = strA3.equals(Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET) ? (byte) 2 : (byte) -1;
                                break;
                            case 52:
                                b3 = strA3.equals("4") ? b : (byte) -1;
                                break;
                            case 53:
                                b3 = strA3.equals("5") ? b2 : (byte) -1;
                                break;
                            default:
                                b3 = -1;
                                break;
                        }
                        switch (b3) {
                            case 0:
                                u0Var = u0.CTABUTTON;
                                break;
                            case 1:
                                u0Var = u0.COMPANION;
                                break;
                            case 2:
                                u0Var = u0.VIDEOVIEW;
                                break;
                            case 3:
                                u0Var = u0.APPINFO;
                                break;
                            case 4:
                                u0Var = u0.STOREPROMO;
                                break;
                            default:
                                u0Var = u0.NOCLICK;
                                break;
                        }
                        b0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) b0VarNewBuilder.b).setClickType(u0Var);
                        b0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) b0VarNewBuilder.b).setType(o0Var);
                        TokenParametersOuterClass$TokenParameters.PriorVideoClickType priorVideoClickType = (TokenParametersOuterClass$TokenParameters.PriorVideoClickType) b0VarNewBuilder.a();
                        kVar19.c();
                        ((TokenParametersOuterClass$TokenParameters) kVar19.b).addPriorClickTypes(priorVideoClickType);
                    }
                }
            }
            i6++;
        }
    }

    public final void b() {
        byte[] byteArray;
        if (this.f.compareAndSet(false, true)) {
            try {
                String strEncodeToString = Base64.encodeToString(a(), 2);
                IAConfigManager iAConfigManager = IAConfigManager.Q;
                String str = iAConfigManager.m;
                com.fyber.inneractive.sdk.config.r rVar = iAConfigManager.u.b;
                String str2 = "token_size_limit";
                int iA = rVar.a("token_size_limit", 4000, 1);
                if (!TextUtils.isEmpty(str)) {
                    str2 = "token_size_limit_" + str.toLowerCase(Locale.US);
                }
                TokenParametersOuterClass$TokenParameters tokenParametersOuterClass$TokenParametersA = iAConfigManager.J.a(rVar.a(str2, iA, 1) - strEncodeToString.getBytes().length);
                if (tokenParametersOuterClass$TokenParametersA == null) {
                    byteArray = null;
                } else {
                    k kVar = this.a;
                    kVar.c();
                    com.fyber.inneractive.sdk.protobuf.t0.a(kVar.b, tokenParametersOuterClass$TokenParametersA);
                    byteArray = ((TokenParametersOuterClass$TokenParameters) kVar.a()).toByteArray();
                }
                AtomicReference atomicReference = this.e;
                if (byteArray != null) {
                    strEncodeToString = Base64.encodeToString(byteArray, 2);
                }
                atomicReference.set(strEncodeToString);
            } catch (Throwable th) {
                IAlog.b("Failed to generate token with error: %s", th.getMessage());
            }
            this.f.set(false);
        }
    }

    public final void c() {
        int currentInterruptionFilter = ((NotificationManager) com.fyber.inneractive.sdk.util.o.a.getSystemService("notification")).getCurrentInterruptionFilter();
        boolean z = currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4;
        Boolean bool = this.c.x;
        if (bool == null || bool.booleanValue() != z) {
            this.c.x = Boolean.valueOf(z);
            d();
        }
    }

    public final void d() {
        com.fyber.inneractive.sdk.util.r.a.execute(new a(this));
    }

    public b() {
        com.fyber.inneractive.sdk.config.cellular.a aVar;
        com.fyber.inneractive.sdk.serverapi.c cVar = new com.fyber.inneractive.sdk.serverapi.c(com.fyber.inneractive.sdk.config.global.r.a());
        this.b = cVar;
        d dVar = new d(cVar);
        this.c = dVar;
        this.a = TokenParametersOuterClass$TokenParameters.newBuilder();
        IAConfigManager iAConfigManager = IAConfigManager.Q;
        iAConfigManager.x.e = this;
        if (iAConfigManager.u.b.a(true, "bidding_token_wait_for_ua")) {
            t1 t1Var = iAConfigManager.y;
            t1Var.b();
            if (!t1Var.d.get()) {
                t1Var.c();
            }
            dVar.b = iAConfigManager.y.a();
        }
        if (!InneractiveAdManager.isCurrentUserAChild() && (aVar = iAConfigManager.O) != null) {
            try {
                aVar.c.add(this);
            } catch (Throwable th) {
                IAlog.a("failed to add network observer", th, new Object[0]);
            }
        }
        f fVar = new f(this);
        this.d = fVar;
        com.fyber.inneractive.sdk.util.o.a.registerReceiver(fVar, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        com.fyber.inneractive.sdk.util.o.a.registerReceiver(fVar, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        com.fyber.inneractive.sdk.util.o.a.registerReceiver(fVar, new IntentFilter("android.app.action.INTERRUPTION_FILTER_CHANGED"));
        com.fyber.inneractive.sdk.util.o.a.registerReceiver(fVar, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
        com.fyber.inneractive.sdk.util.o.a.registerReceiver(fVar, new IntentFilter("android.intent.action.AIRPLANE_MODE"));
        if (com.fyber.inneractive.sdk.util.o.a("android.permission.BLUETOOTH")) {
            com.fyber.inneractive.sdk.util.o.a.registerReceiver(fVar, new IntentFilter("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"));
            com.fyber.inneractive.sdk.util.o.a.registerReceiver(fVar, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(com.fyber.inneractive.sdk.util.a1 a1Var) {
        if (TextUtils.equals(this.c.q, a1Var.b())) {
            return;
        }
        this.c.q = a1Var.b();
        d();
    }

    public final void a(String str, UnitDisplayType unitDisplayType, o0 o0Var) {
        ArrayList arrayList;
        int i;
        m0 m0Var;
        IAConfigManager iAConfigManager = IAConfigManager.Q;
        com.fyber.inneractive.sdk.cache.session.e eVar = iAConfigManager.x.a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.cache.session.k kVar = (com.fyber.inneractive.sdk.cache.session.k) eVar.b.get(com.fyber.inneractive.sdk.cache.session.enums.c.a(unitDisplayType.value(), str));
            TokenParametersOuterClass$TokenParameters.UserSession userSession = null;
            if (kVar != null) {
                ArrayList arrayList2 = new ArrayList(kVar);
                Collections.sort(arrayList2, new com.fyber.inneractive.sdk.cache.session.j());
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = null;
            }
            try {
                i = Integer.parseInt(iAConfigManager.u.b.a("number_of_sessions", Integer.toString(5)));
            } catch (Throwable unused) {
                i = 5;
            }
            int i2 = i >= 0 ? i : 5;
            if (i2 > 0 && arrayList != null && arrayList.size() >= i2) {
                if (str.equals("video")) {
                    m0Var = m0.VIDEO;
                } else if (!str.equals("display")) {
                    m0Var = m0.UNITCONTENTTYPEUNKNOWN;
                } else {
                    m0Var = m0.DISPLAY;
                }
                r0 r0VarNewBuilder = TokenParametersOuterClass$TokenParameters.UserSession.newBuilder();
                r0VarNewBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) r0VarNewBuilder.b).setSubType(m0Var);
                int size = arrayList.size();
                int i3 = 0;
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    com.fyber.inneractive.sdk.cache.session.g gVar = (com.fyber.inneractive.sdk.cache.session.g) obj;
                    h0 h0VarNewBuilder = TokenParametersOuterClass$TokenParameters.SessionData.newBuilder();
                    int i5 = gVar.b;
                    h0VarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) h0VarNewBuilder.b).setClicks(i5);
                    int i6 = gVar.a;
                    h0VarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) h0VarNewBuilder.b).setImpressions(i6);
                    if (str.equals("video") || o0Var.equals(o0.REWARDED)) {
                        int i7 = gVar.c;
                        h0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.SessionData) h0VarNewBuilder.b).setCompletions(i7);
                    }
                    TokenParametersOuterClass$TokenParameters.SessionData sessionData = (TokenParametersOuterClass$TokenParameters.SessionData) h0VarNewBuilder.a();
                    r0VarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.UserSession) r0VarNewBuilder.b).addSessionDataItems(sessionData);
                    i3++;
                    if (i3 >= i2) {
                        break;
                    }
                }
                r0VarNewBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) r0VarNewBuilder.b).setType(o0Var);
                userSession = (TokenParametersOuterClass$TokenParameters.UserSession) r0VarNewBuilder.a();
            }
            if (userSession == null || userSession.getSessionDataItemsList().size() <= 0) {
                return;
            }
            k kVar2 = this.a;
            kVar2.c();
            ((TokenParametersOuterClass$TokenParameters) kVar2.b).addUserSessions(userSession);
        }
    }
}
