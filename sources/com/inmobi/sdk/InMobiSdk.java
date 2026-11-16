package com.inmobi.sdk;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Size;
import androidx.annotation.UiThread;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.inmobi.media.AbstractC3889am;
import com.inmobi.media.AbstractC3960d9;
import com.inmobi.media.AbstractC4107ii;
import com.inmobi.media.AbstractC4211ma;
import com.inmobi.media.AbstractC4221mk;
import com.inmobi.media.AbstractC4247ni;
import com.inmobi.media.AbstractC4305pk;
import com.inmobi.media.AbstractC4333qk;
import com.inmobi.media.AbstractC4360rk;
import com.inmobi.media.AbstractC4566z7;
import com.inmobi.media.Ba;
import com.inmobi.media.C3969di;
import com.inmobi.media.C4080hi;
import com.inmobi.media.C4111im;
import com.inmobi.media.C4120j3;
import com.inmobi.media.C4155ka;
import com.inmobi.media.C4168kn;
import com.inmobi.media.C4193lk;
import com.inmobi.media.Cb;
import com.inmobi.media.Db;
import com.inmobi.media.EnumC4223mm;
import com.inmobi.media.Fm;
import com.inmobi.media.Kc;
import com.inmobi.media.Lm;
import com.inmobi.media.Og;
import com.inmobi.media.Pa;
import com.inmobi.media.RunnableC4183la;
import com.inmobi.media.Ta;
import com.inmobi.media.Y1;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.ironsource.C4962rg;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.az2;
import defpackage.dt1;
import defpackage.ek2;
import defpackage.eu;
import defpackage.gd1;
import defpackage.gg0;
import defpackage.hg0;
import defpackage.i51;
import defpackage.j51;
import defpackage.jh0;
import defpackage.kk2;
import defpackage.m32;
import defpackage.n30;
import defpackage.qh1;
import defpackage.r70;
import defpackage.s71;
import defpackage.tb5;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005OPQRSJ9\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\rH\u0007¢\u0006\u0004\b!\u0010\u0015J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b*\u0010(J-\u0010.\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u00042\b\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020\u001cH\u0007¢\u0006\u0004\b1\u0010\u001fJ\u0017\u00104\u001a\u00020\n2\u0006\u00103\u001a\u000202H\u0007¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\n2\u0006\u00107\u001a\u000206H\u0007¢\u0006\u0004\b8\u00109J\u0019\u0010;\u001a\u00020\n2\b\u0010:\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b;\u0010(J\u0019\u0010=\u001a\u00020\n2\b\u0010<\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b=\u0010(J\u0019\u0010@\u001a\u00020\n2\b\u0010?\u001a\u0004\u0018\u00010>H\u0007¢\u0006\u0004\b@\u0010AJ\u0011\u0010B\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bB\u0010\u0017J1\u0010B\u001a\u0004\u0018\u00010\u00042\u0014\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010C2\b\u0010E\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bB\u0010FJ\u0019\u0010H\u001a\u00020\n2\b\u0010G\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bH\u0010\u0011J\u000f\u0010I\u001a\u00020\rH\u0007¢\u0006\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010N\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\bN\u0010L¨\u0006T"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk;", "", "Landroid/content/Context;", "context", "", "accountId", "Lorg/json/JSONObject;", "consentObject", "Lcom/inmobi/sdk/SdkInitializationListener;", "sdkInitializationListener", "Laz2;", "init", "(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;Lcom/inmobi/sdk/SdkInitializationListener;)V", "", "initFromContentProvider", "(Landroid/content/Context;)Z", "updateGDPRConsent", "(Lorg/json/JSONObject;)V", "setPartnerGDPRConsent", "muted", "setApplicationMuted", "(Z)V", C4962rg.b, "()Ljava/lang/String;", "Lcom/inmobi/sdk/InMobiSdk$LogLevel;", "logLevel", "setLogLevel", "(Lcom/inmobi/sdk/InMobiSdk$LogLevel;)V", "", "age", "setAge", "(I)V", "isAgeRestricted", "setIsAgeRestricted", "Lcom/inmobi/sdk/InMobiSdk$AgeGroup;", "group", "setAgeGroup", "(Lcom/inmobi/sdk/InMobiSdk$AgeGroup;)V", "areaCode", "setAreaCode", "(Ljava/lang/String;)V", "postalCode", "setPostalCode", "city", "state", "country", "setLocationWithCityStateCountry", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "yearOfBirth", "setYearOfBirth", "Lcom/inmobi/sdk/InMobiSdk$Gender;", InneractiveMediationDefs.KEY_GENDER, "setGender", "(Lcom/inmobi/sdk/InMobiSdk$Gender;)V", "Lcom/inmobi/sdk/InMobiSdk$Education;", "education", "setEducation", "(Lcom/inmobi/sdk/InMobiSdk$Education;)V", "language", "setLanguage", "interests", "setInterests", "Landroid/location/Location;", "location", "setLocation", "(Landroid/location/Location;)V", "getToken", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "keywords", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "jsonObject", "setPublisherProvidedUnifiedId", "isSDKInitialized", "()Z", "IM_GDPR_CONSENT_AVAILABLE", "Ljava/lang/String;", "IM_GDPR_CONSENT_IAB", "IM_GDPR_CONSENT_GDPR_APPLIES", "LogLevel", "Education", "PublisherSignals", "Gender", "AgeGroup", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiSdk {

    @NotNull
    public static final String IM_GDPR_CONSENT_AVAILABLE = "gdpr_consent_available";

    @NotNull
    public static final String IM_GDPR_CONSENT_GDPR_APPLIES = "gdpr";

    @NotNull
    public static final String IM_GDPR_CONSENT_IAB = "gdpr_consent";

    @NotNull
    public static final InMobiSdk INSTANCE = new InMobiSdk();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$AgeGroup;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "BELOW_18", "BETWEEN_18_AND_24", "BETWEEN_25_AND_29", "BETWEEN_30_AND_34", "BETWEEN_35_AND_44", "BETWEEN_45_AND_54", "BETWEEN_55_AND_65", "ABOVE_65", "toString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum AgeGroup {
        BELOW_18("below18"),
        BETWEEN_18_AND_24("between18and24"),
        BETWEEN_25_AND_29("between25and29"),
        BETWEEN_30_AND_34("between30and34"),
        BETWEEN_35_AND_44("between35and44"),
        BETWEEN_45_AND_54("between45and54"),
        BETWEEN_55_AND_65("between55and65"),
        ABOVE_65("above65");

        private static final /* synthetic */ jh0 $ENTRIES = ek2.m(values());

        @NotNull
        private final String value;

        @NotNull
        public static jh0 getEntries() {
            return $ENTRIES;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }

        AgeGroup(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$Education;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "HIGH_SCHOOL_OR_LESS", "COLLEGE_OR_GRADUATE", "POST_GRADUATE_OR_ABOVE", "toString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Education {
        HIGH_SCHOOL_OR_LESS("highschoolorless"),
        COLLEGE_OR_GRADUATE("collegeorgraduate"),
        POST_GRADUATE_OR_ABOVE("postgraduateorabove");

        private static final /* synthetic */ jh0 $ENTRIES = ek2.m(values());

        @NotNull
        private final String value;

        @NotNull
        public static jh0 getEntries() {
            return $ENTRIES;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }

        Education(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$Gender;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "FEMALE", "MALE", "toString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Gender {
        FEMALE(InneractiveMediationDefs.GENDER_FEMALE),
        MALE("m");

        private static final /* synthetic */ jh0 $ENTRIES = ek2.m(values());

        @NotNull
        private final String value;

        @NotNull
        public static jh0 getEntries() {
            return $ENTRIES;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }

        Gender(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$LogLevel;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "ERROR", "DEBUG", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum LogLevel {
        NONE,
        ERROR,
        DEBUG;

        private static final /* synthetic */ jh0 $ENTRIES = ek2.m(values());

        @NotNull
        public static jh0 getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$PublisherSignals;", "", "", "", "signals", "Laz2;", "putPublisherSignals", "(Ljava/util/Map;)V", "getPublisherSignals", "()Ljava/util/Map;", "resetPublisherSignals", "()V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PublisherSignals {

        @NotNull
        public static final PublisherSignals INSTANCE = new PublisherSignals();

        @Nullable
        public final Map<String, Object> getPublisherSignals() {
            Map mapB0;
            hg0 hg0Var = hg0.a;
            if (!InMobiSdk.isSDKInitialized()) {
                String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
                strAccess$getTAG$p.getClass();
                Kc.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot get publisher signals.");
                return null;
            }
            C4080hi c4080hi = C4080hi.a;
            c4080hi.getClass();
            try {
                SignalsConfig.PublisherConfig publisherConfigD = C4080hi.d();
                Map map = AbstractC4107ii.a;
                publisherConfigD.getClass();
                if (!publisherConfigD.getEnableMCO() && !publisherConfigD.getEnableAB()) {
                    return hg0Var;
                }
                try {
                    SignalsConfig.PublisherConfig publisherConfigD2 = C4080hi.d();
                    publisherConfigD2.getClass();
                    mapB0 = (publisherConfigD2.getEnableMCO() || publisherConfigD2.getEnableAB()) ? qh1.b0(AbstractC4107ii.a(c4080hi.c(), C4080hi.d()), c4080hi.e()) : hg0Var;
                } catch (Exception e) {
                    gd1 gd1Var = Ba.a;
                    Ba.a(new C4120j3(e));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapB0);
                for (dt1 dt1Var : eu.z(new dt1(C4080hi.d().getObj(), "o_i_dep"), new dt1(C4080hi.d().getDirect(), "d_i_dep"))) {
                    SignalsConfig.PublisherConfig.BaseInputData baseInputData = (SignalsConfig.PublisherConfig.BaseInputData) dt1Var.a;
                    String str = (String) dt1Var.b;
                    if (baseInputData.getDepth().getEnabled()) {
                        C4080hi c4080hi2 = C4080hi.a;
                        c4080hi2.getClass();
                        JSONArray jSONArrayOptJSONArray = ((JSONObject) C4080hi.f.getValue(c4080hi2, C4080hi.b[1])).optJSONArray(str);
                        linkedHashMap.put(str, jSONArrayOptJSONArray != null ? AbstractC4107ii.a(jSONArrayOptJSONArray) : AbstractC4107ii.a(AbstractC4107ii.a()));
                    }
                }
                for (dt1 dt1Var2 : eu.z(new dt1(C4080hi.d().getObj(), "o_s_dep"), new dt1(C4080hi.d().getDirect(), "d_s_dep"))) {
                    SignalsConfig.PublisherConfig.BaseInputData baseInputData2 = (SignalsConfig.PublisherConfig.BaseInputData) dt1Var2.a;
                    String str2 = (String) dt1Var2.b;
                    if (baseInputData2.getDepth().getSessionEnabled()) {
                        JSONArray jSONArrayOptJSONArray2 = C4080hi.g.optJSONArray(str2);
                        linkedHashMap.put(str2, jSONArrayOptJSONArray2 != null ? AbstractC4107ii.a(jSONArrayOptJSONArray2) : AbstractC4107ii.a(AbstractC4107ii.a()));
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (!kk2.L((String) entry.getKey(), "auto_", false)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                return linkedHashMap2;
            } catch (Exception e2) {
                gd1 gd1Var2 = Ba.a;
                Ba.a(new C4120j3(e2));
                Kc.a((byte) 1, "PubSignals", "Publisher signals could not be retrieved.");
                return hg0Var;
            }
        }

        public final void putPublisherSignals(@Nullable Map<String, ? extends Object> signals) {
            if (InMobiSdk.isSDKInitialized()) {
                if (signals != null) {
                    C4080hi.a.getClass();
                    C4080hi.a(signals);
                    return;
                }
                return;
            }
            String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
            strAccess$getTAG$p.getClass();
            Kc.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot set publisher signals.");
        }

        public final void resetPublisherSignals() {
            if (InMobiSdk.isSDKInitialized()) {
                C4080hi.a.getClass();
                Context context = AbstractC4221mk.a;
                if (context != null) {
                    tb5.t(AbstractC4211ma.f, null, null, new C3969di(context, null), 3);
                    return;
                }
                return;
            }
            String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
            strAccess$getTAG$p.getClass();
            Kc.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot reset publisher signals.");
        }
    }

    @Nullable
    public static final String getToken() {
        return getToken(null, null);
    }

    @UiThread
    public static final void init(@Nullable Context context, @Size @Nullable String accountId, @Nullable JSONObject consentObject, @Nullable SdkInitializationListener sdkInitializationListener) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Context context2 = AbstractC4221mk.a;
        if (context2 == null) {
            context2 = applicationContext;
        }
        Ta.a(context2, "SdkInitStarted", AbstractC4305pk.a(), null);
        if (!s71.b(Looper.myLooper(), Looper.getMainLooper())) {
            AbstractC3889am.a(new r70(applicationContext, accountId, consentObject, sdkInitializationListener, 6));
        } else {
            INSTANCE.getClass();
            a(applicationContext, accountId, consentObject, sdkInitializationListener, (byte) 2);
        }
    }

    public static final /* synthetic */ String access$getTAG$p() {
        return "InMobiSdk";
    }

    @NotNull
    public static final String getVersion() {
        return "11.4.1";
    }

    public static final boolean initFromContentProvider(@Nullable Context context) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext == null || !AbstractC4305pk.a.compareAndSet(false, true)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (s71.b(Looper.myLooper(), Looper.getMainLooper())) {
            return AbstractC4305pk.a(applicationContext, jCurrentTimeMillis, jElapsedRealtime, new i51(applicationContext, 1));
        }
        AbstractC3889am.a(new j51(applicationContext, jCurrentTimeMillis, jElapsedRealtime, 0));
        return true;
    }

    public static final void setAge(int age) {
        Context context = AbstractC4221mk.a;
        if (age != Integer.MIN_VALUE) {
            AbstractC4247ni.a = age;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Cb.a(context, "user_info_store").a("user_age", age, false);
            }
        }
    }

    public static final void setApplicationMuted(boolean muted) {
        AbstractC4221mk.g = muted;
    }

    public static final void setAreaCode(@Nullable String areaCode) {
        Context context = AbstractC4221mk.a;
        AbstractC4247ni.d = areaCode;
        if (context == null || areaCode == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = Db.b;
        Cb.a(context, "user_info_store").a("user_area_code", areaCode, false);
    }

    public static final void setInterests(@Nullable String interests) {
        Context context = AbstractC4221mk.a;
        if (interests != null) {
            AbstractC4247ni.m = interests;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Cb.a(context, "user_info_store").a("user_interest", interests, false);
            }
        }
    }

    public static final void setLanguage(@Nullable String language) {
        Context context = AbstractC4221mk.a;
        if (language != null) {
            AbstractC4247ni.l = language;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Cb.a(context, "user_info_store").a("user_language", language, false);
            }
        }
    }

    public static final void setLocation(@Nullable Location location) {
        Context context = AbstractC4221mk.a;
        if (location != null) {
            AbstractC4247ni.n = location;
            if (context != null) {
                String strA = AbstractC4247ni.a(location);
                ConcurrentHashMap concurrentHashMap = Db.b;
                Cb.a(context, "user_info_store").a("user_location", strA, false);
            }
        }
    }

    public static final void setLocationWithCityStateCountry(@Nullable String city, @Nullable String state, @Nullable String country) {
        Context context = AbstractC4221mk.a;
        if (city != null) {
            AbstractC4247ni.f = city;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Cb.a(context, "user_info_store").a("user_city_code", city, false);
            }
        }
        Context context2 = AbstractC4221mk.a;
        if (state != null) {
            AbstractC4247ni.g = state;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = Db.b;
                Cb.a(context2, "user_info_store").a("user_state_code", state, false);
            }
        }
        Context context3 = AbstractC4221mk.a;
        if (country != null) {
            AbstractC4247ni.h = country;
            if (context3 != null) {
                ConcurrentHashMap concurrentHashMap3 = Db.b;
                Cb.a(context3, "user_info_store").a("user_country_code", country, false);
            }
        }
    }

    public static final void setLogLevel(@Nullable LogLevel logLevel) {
        int i = logLevel == null ? -1 : a.a[logLevel.ordinal()];
        if (i == 1) {
            Kc.a = (byte) 0;
            return;
        }
        if (i == 2) {
            Kc.a = (byte) 1;
        } else if (i != 3) {
            Kc.a = (byte) 2;
        } else {
            Kc.a = (byte) 2;
        }
    }

    public static final void setPartnerGDPRConsent(@Nullable JSONObject consentObject) {
        if (consentObject != null) {
            AbstractC4566z7.b = consentObject;
        }
    }

    public static final void setPostalCode(@Nullable String postalCode) {
        Context context = AbstractC4221mk.a;
        if (postalCode != null) {
            AbstractC4247ni.e = postalCode;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Cb.a(context, "user_info_store").a("user_post_code", postalCode, false);
            }
        }
    }

    public static final void setYearOfBirth(int yearOfBirth) {
        Context context = AbstractC4221mk.a;
        if (yearOfBirth != Integer.MIN_VALUE) {
            AbstractC4247ni.i = yearOfBirth;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Cb.a(context, "user_info_store").a("user_yob", yearOfBirth, false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051 A[Catch: Exception -> 0x0024, TRY_LEAVE, TryCatch #1 {Exception -> 0x0024, blocks: (B:3:0x0017, B:5:0x001d, B:7:0x0021, B:25:0x0046, B:28:0x0051, B:32:0x005a, B:34:0x005e, B:38:0x0065, B:40:0x0069, B:42:0x006d, B:46:0x0076, B:48:0x007a, B:50:0x0080, B:52:0x008d, B:53:0x0090, B:61:0x00a9, B:63:0x00b7, B:65:0x00bf, B:66:0x00c4, B:69:0x00cd, B:71:0x00e4, B:73:0x00f4, B:57:0x00a2, B:15:0x0031, B:18:0x0039, B:21:0x003f), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[Catch: Exception -> 0x0024, TRY_LEAVE, TryCatch #1 {Exception -> 0x0024, blocks: (B:3:0x0017, B:5:0x001d, B:7:0x0021, B:25:0x0046, B:28:0x0051, B:32:0x005a, B:34:0x005e, B:38:0x0065, B:40:0x0069, B:42:0x006d, B:46:0x0076, B:48:0x007a, B:50:0x0080, B:52:0x008d, B:53:0x0090, B:61:0x00a9, B:63:0x00b7, B:65:0x00bf, B:66:0x00c4, B:69:0x00cd, B:71:0x00e4, B:73:0x00f4, B:57:0x00a2, B:15:0x0031, B:18:0x0039, B:21:0x003f), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0065 A[Catch: Exception -> 0x0024, TRY_ENTER, TryCatch #1 {Exception -> 0x0024, blocks: (B:3:0x0017, B:5:0x001d, B:7:0x0021, B:25:0x0046, B:28:0x0051, B:32:0x005a, B:34:0x005e, B:38:0x0065, B:40:0x0069, B:42:0x006d, B:46:0x0076, B:48:0x007a, B:50:0x0080, B:52:0x008d, B:53:0x0090, B:61:0x00a9, B:63:0x00b7, B:65:0x00bf, B:66:0x00c4, B:69:0x00cd, B:71:0x00e4, B:73:0x00f4, B:57:0x00a2, B:15:0x0031, B:18:0x0039, B:21:0x003f), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0069 A[Catch: Exception -> 0x0024, TryCatch #1 {Exception -> 0x0024, blocks: (B:3:0x0017, B:5:0x001d, B:7:0x0021, B:25:0x0046, B:28:0x0051, B:32:0x005a, B:34:0x005e, B:38:0x0065, B:40:0x0069, B:42:0x006d, B:46:0x0076, B:48:0x007a, B:50:0x0080, B:52:0x008d, B:53:0x0090, B:61:0x00a9, B:63:0x00b7, B:65:0x00bf, B:66:0x00c4, B:69:0x00cd, B:71:0x00e4, B:73:0x00f4, B:57:0x00a2, B:15:0x0031, B:18:0x0039, B:21:0x003f), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x006d A[Catch: Exception -> 0x0024, TryCatch #1 {Exception -> 0x0024, blocks: (B:3:0x0017, B:5:0x001d, B:7:0x0021, B:25:0x0046, B:28:0x0051, B:32:0x005a, B:34:0x005e, B:38:0x0065, B:40:0x0069, B:42:0x006d, B:46:0x0076, B:48:0x007a, B:50:0x0080, B:52:0x008d, B:53:0x0090, B:61:0x00a9, B:63:0x00b7, B:65:0x00bf, B:66:0x00c4, B:69:0x00cd, B:71:0x00e4, B:73:0x00f4, B:57:0x00a2, B:15:0x0031, B:18:0x0039, B:21:0x003f), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x0076 A[Catch: Exception -> 0x0024, TryCatch #1 {Exception -> 0x0024, blocks: (B:3:0x0017, B:5:0x001d, B:7:0x0021, B:25:0x0046, B:28:0x0051, B:32:0x005a, B:34:0x005e, B:38:0x0065, B:40:0x0069, B:42:0x006d, B:46:0x0076, B:48:0x007a, B:50:0x0080, B:52:0x008d, B:53:0x0090, B:61:0x00a9, B:63:0x00b7, B:65:0x00bf, B:66:0x00c4, B:69:0x00cd, B:71:0x00e4, B:73:0x00f4, B:57:0x00a2, B:15:0x0031, B:18:0x0039, B:21:0x003f), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x007a A[Catch: Exception -> 0x0024, TryCatch #1 {Exception -> 0x0024, blocks: (B:3:0x0017, B:5:0x001d, B:7:0x0021, B:25:0x0046, B:28:0x0051, B:32:0x005a, B:34:0x005e, B:38:0x0065, B:40:0x0069, B:42:0x006d, B:46:0x0076, B:48:0x007a, B:50:0x0080, B:52:0x008d, B:53:0x0090, B:61:0x00a9, B:63:0x00b7, B:65:0x00bf, B:66:0x00c4, B:69:0x00cd, B:71:0x00e4, B:73:0x00f4, B:57:0x00a2, B:15:0x0031, B:18:0x0039, B:21:0x003f), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x008d A[Catch: Exception -> 0x0024, TryCatch #1 {Exception -> 0x0024, blocks: (B:3:0x0017, B:5:0x001d, B:7:0x0021, B:25:0x0046, B:28:0x0051, B:32:0x005a, B:34:0x005e, B:38:0x0065, B:40:0x0069, B:42:0x006d, B:46:0x0076, B:48:0x007a, B:50:0x0080, B:52:0x008d, B:53:0x0090, B:61:0x00a9, B:63:0x00b7, B:65:0x00bf, B:66:0x00c4, B:69:0x00cd, B:71:0x00e4, B:73:0x00f4, B:57:0x00a2, B:15:0x0031, B:18:0x0039, B:21:0x003f), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[Catch: Exception -> 0x0024, TryCatch #1 {Exception -> 0x0024, blocks: (B:3:0x0017, B:5:0x001d, B:7:0x0021, B:25:0x0046, B:28:0x0051, B:32:0x005a, B:34:0x005e, B:38:0x0065, B:40:0x0069, B:42:0x006d, B:46:0x0076, B:48:0x007a, B:50:0x0080, B:52:0x008d, B:53:0x0090, B:61:0x00a9, B:63:0x00b7, B:65:0x00bf, B:66:0x00c4, B:69:0x00cd, B:71:0x00e4, B:73:0x00f4, B:57:0x00a2, B:15:0x0031, B:18:0x0039, B:21:0x003f), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e4 A[Catch: Exception -> 0x0024, TryCatch #1 {Exception -> 0x0024, blocks: (B:3:0x0017, B:5:0x001d, B:7:0x0021, B:25:0x0046, B:28:0x0051, B:32:0x005a, B:34:0x005e, B:38:0x0065, B:40:0x0069, B:42:0x006d, B:46:0x0076, B:48:0x007a, B:50:0x0080, B:52:0x008d, B:53:0x0090, B:61:0x00a9, B:63:0x00b7, B:65:0x00bf, B:66:0x00c4, B:69:0x00cd, B:71:0x00e4, B:73:0x00f4, B:57:0x00a2, B:15:0x0031, B:18:0x0039, B:21:0x003f), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f4 A[Catch: Exception -> 0x0024, TRY_LEAVE, TryCatch #1 {Exception -> 0x0024, blocks: (B:3:0x0017, B:5:0x001d, B:7:0x0021, B:25:0x0046, B:28:0x0051, B:32:0x005a, B:34:0x005e, B:38:0x0065, B:40:0x0069, B:42:0x006d, B:46:0x0076, B:48:0x007a, B:50:0x0080, B:52:0x008d, B:53:0x0090, B:61:0x00a9, B:63:0x00b7, B:65:0x00bf, B:66:0x00c4, B:69:0x00cd, B:71:0x00e4, B:73:0x00f4, B:57:0x00a2, B:15:0x0031, B:18:0x0039, B:21:0x003f), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x010e A[Catch: Exception -> 0x0136, TryCatch #0 {Exception -> 0x0136, blocks: (B:77:0x010e, B:79:0x011e, B:80:0x0126, B:75:0x0100, B:81:0x0127, B:82:0x012d, B:83:0x012e, B:84:0x0135), top: B:88:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x011e A[Catch: Exception -> 0x0136, TryCatch #0 {Exception -> 0x0136, blocks: (B:77:0x010e, B:79:0x011e, B:80:0x0126, B:75:0x0100, B:81:0x0127, B:82:0x012d, B:83:0x012e, B:84:0x0135), top: B:88:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0127 A[Catch: Exception -> 0x0136, TryCatch #0 {Exception -> 0x0136, blocks: (B:77:0x010e, B:79:0x011e, B:80:0x0126, B:75:0x0100, B:81:0x0127, B:82:0x012d, B:83:0x012e, B:84:0x0135), top: B:88:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x012e A[Catch: Exception -> 0x0136, TryCatch #0 {Exception -> 0x0136, blocks: (B:77:0x010e, B:79:0x011e, B:80:0x0126, B:75:0x0100, B:81:0x0127, B:82:0x012d, B:83:0x012e, B:84:0x0135), top: B:88:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.inmobi.media.Pa, java.lang.Object] */
    public static void a(Context context, String str, JSONObject jSONObject, SdkInitializationListener sdkInitializationListener, byte b) {
        m32 m32VarA;
        boolean z;
        byte b2;
        Context context2;
        String str2;
        byte b3;
        JSONObject jSONObject2;
        byte bA;
        Pa pa;
        String str3;
        String str4;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        m32 m32Var = new m32();
        m32Var.a = new Pa(context, str, b, jSONObject, sdkInitializationListener, jElapsedRealtime);
        try {
            AtomicBoolean atomicBoolean = AbstractC4305pk.a;
            boolean z2 = false;
            if (b == 2 && AbstractC4305pk.d) {
                AbstractC4305pk.d = false;
            }
            if (b == 2) {
                z = true;
            } else {
                z = false;
            }
            if (b == 2) {
                if (AbstractC4221mk.c()) {
                    b2 = 1;
                } else if (AbstractC4305pk.c == 1) {
                    b2 = 2;
                } else if (AbstractC4221mk.j == 1) {
                    b2 = 3;
                }
                m32VarA = a((Pa) m32Var.a, context, b2);
                if (m32VarA == 0) {
                    m32Var.a = m32VarA;
                    context2 = m32VarA.a;
                    try {
                        if (context2 != null) {
                            str2 = m32VarA.b;
                            if (str2 != null) {
                                if (m32VarA.c == 2) {
                                    str3 = AbstractC4221mk.c;
                                    if (str3 == null) {
                                        if (AbstractC4305pk.c == 1) {
                                            str3 = AbstractC4305pk.g.a;
                                        } else {
                                            str3 = null;
                                        }
                                    }
                                    if (str3 != null) {
                                        str4 = m32VarA.b;
                                        if (str4 != null) {
                                            if (!str3.equals(str4)) {
                                                Kc.a((byte) 1, "InMobiSdk", "The InMobi SDK is already initialized or is initializing with a different account ID. Initialization with a different account ID is not allowed in the current app session. The SDK will continue using the existing account ID. To use a different account ID, please contact InMobi Customer Support.");
                                                a((Pa) m32Var.a, SdkInitializationListener.ACCOUNT_ID_DIFFERENT);
                                                return;
                                            }
                                        } else {
                                            throw new IllegalArgumentException("Account ID must be resolved before account policy evaluation.");
                                        }
                                    }
                                }
                                Object obj = m32Var.a;
                                b3 = ((Pa) obj).c;
                                jSONObject2 = ((Pa) obj).d;
                                if (b3 == 2) {
                                    AbstractC4566z7.a(jSONObject2);
                                }
                                bA = AbstractC4360rk.a((Pa) m32Var.a, b2);
                                Object obj2 = m32Var.a;
                                pa = (Pa) obj2;
                                if (bA != 0) {
                                    if (bA == 1) {
                                        b(pa, (String) null);
                                        return;
                                    } else if (bA == 2) {
                                        return;
                                    }
                                }
                                AbstractC4305pk.c = ((Pa) obj2).c;
                                if (!Og.a(context2, "android.permission.ACCESS_COARSE_LOCATION") && !Og.a(context2, "android.permission.ACCESS_FINE_LOCATION")) {
                                    Kc.a((byte) 1, "InMobiSdk", "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
                                }
                                if (((Pa) m32Var.a).c == 2) {
                                    z2 = true;
                                }
                                Context context3 = AbstractC4221mk.a;
                                AbstractC4221mk.a = context2.getApplicationContext();
                                AbstractC4221mk.d.set(z2);
                                AbstractC4221mk.c = str2;
                                AbstractC4221mk.j = 1;
                                if (!AbstractC4221mk.c(context2)) {
                                    AbstractC4221mk.c = null;
                                    AbstractC4221mk.a = null;
                                    AbstractC4221mk.j = 3;
                                    b((Pa) m32Var.a, SdkInitializationListener.MISSING_WEBVIEW_DEPENDENCY);
                                    return;
                                }
                                Y1.a(context2, C4168kn.d, z2);
                                AbstractC4333qk.a();
                                tb5.t(AbstractC4221mk.i, null, null, new C4193lk(new C4155ka(m32Var, context2, z, str2, null), null), 3);
                                return;
                            }
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    } catch (Exception unused) {
                        AbstractC4221mk.c = null;
                        AbstractC4221mk.a = null;
                        AbstractC4221mk.j = 3;
                        b((Pa) m32VarA.a, "SDK could not be initialized; an unexpected error was encountered.");
                        return;
                    }
                }
            }
            b2 = 0;
            m32VarA = a((Pa) m32Var.a, context, b2);
            if (m32VarA == 0) {
                m32Var.a = m32VarA;
                context2 = m32VarA.a;
                if (context2 != null) {
                    str2 = m32VarA.b;
                    if (str2 != null) {
                        if (m32VarA.c == 2) {
                            str3 = AbstractC4221mk.c;
                            if (str3 == null) {
                                if (AbstractC4305pk.c == 1) {
                                    str3 = AbstractC4305pk.g.a;
                                } else {
                                    str3 = null;
                                }
                            }
                            if (str3 != null) {
                                str4 = m32VarA.b;
                                if (str4 != null) {
                                    if (!str3.equals(str4)) {
                                        Kc.a((byte) 1, "InMobiSdk", "The InMobi SDK is already initialized or is initializing with a different account ID. Initialization with a different account ID is not allowed in the current app session. The SDK will continue using the existing account ID. To use a different account ID, please contact InMobi Customer Support.");
                                        a((Pa) m32Var.a, SdkInitializationListener.ACCOUNT_ID_DIFFERENT);
                                        return;
                                    }
                                } else {
                                    throw new IllegalArgumentException("Account ID must be resolved before account policy evaluation.");
                                }
                            }
                        }
                        Object obj3 = m32Var.a;
                        b3 = ((Pa) obj3).c;
                        jSONObject2 = ((Pa) obj3).d;
                        if (b3 == 2) {
                            AbstractC4566z7.a(jSONObject2);
                        }
                        bA = AbstractC4360rk.a((Pa) m32Var.a, b2);
                        Object obj4 = m32Var.a;
                        pa = (Pa) obj4;
                        if (bA != 0) {
                            if (bA == 1) {
                                b(pa, (String) null);
                                return;
                            } else if (bA == 2) {
                                return;
                            }
                        }
                        AbstractC4305pk.c = ((Pa) obj4).c;
                        if (!Og.a(context2, "android.permission.ACCESS_COARSE_LOCATION")) {
                            Kc.a((byte) 1, "InMobiSdk", "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
                        }
                        if (((Pa) m32Var.a).c == 2) {
                            z2 = true;
                        }
                        Context context4 = AbstractC4221mk.a;
                        AbstractC4221mk.a = context2.getApplicationContext();
                        AbstractC4221mk.d.set(z2);
                        AbstractC4221mk.c = str2;
                        AbstractC4221mk.j = 1;
                        if (!AbstractC4221mk.c(context2)) {
                            AbstractC4221mk.c = null;
                            AbstractC4221mk.a = null;
                            AbstractC4221mk.j = 3;
                            b((Pa) m32Var.a, SdkInitializationListener.MISSING_WEBVIEW_DEPENDENCY);
                            return;
                        }
                        Y1.a(context2, C4168kn.d, z2);
                        AbstractC4333qk.a();
                        tb5.t(AbstractC4221mk.i, null, null, new C4193lk(new C4155ka(m32Var, context2, z, str2, null), null), 3);
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        } catch (Exception unused2) {
            m32VarA = m32Var;
        }
    }

    public static final /* synthetic */ void access$finishInvalidInitRequest(InMobiSdk inMobiSdk, Pa pa, String str) {
        inMobiSdk.getClass();
        a(pa, str);
    }

    public static final /* synthetic */ void access$onInitCompleted(InMobiSdk inMobiSdk, Pa pa, String str) {
        inMobiSdk.getClass();
        b(pa, str);
    }

    public static void b(Pa pa, String str) {
        String str2;
        Short shValueOf;
        Error error;
        SdkInitializationListener sdkInitializationListener;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - pa.f;
        byte b = pa.c;
        if (b == 1) {
            str2 = "PROVIDER";
        } else if (b == 2) {
            str2 = "PUBLISHER";
        } else {
            str2 = "NONE";
        }
        AbstractC4333qk.a(str2, AbstractC4221mk.c, str, Long.valueOf(jElapsedRealtime));
        Ta ta = Ta.a;
        if (str != null) {
            shValueOf = Short.valueOf(Ta.a(str));
        } else {
            shValueOf = null;
        }
        if (pa.c == 1) {
            if (shValueOf == null) {
                LinkedHashMap linkedHashMapZ = qh1.Z(new dt1("latency", Long.valueOf(jElapsedRealtime)));
                C4111im c4111im = C4111im.a;
                C4111im.b("PreInitCompleted", linkedHashMapZ, EnumC4223mm.SDK);
            } else {
                Ta.a(pa.a, "SdkInitFailed", Long.valueOf(jElapsedRealtime), shValueOf);
            }
        } else if (shValueOf != null) {
            Ta.a(pa.a, "SdkInitFailed", Long.valueOf(jElapsedRealtime), shValueOf);
        }
        AtomicBoolean atomicBoolean = AbstractC4305pk.a;
        ArrayList arrayList = new ArrayList();
        if (pa.c == 2 && (sdkInitializationListener = pa.e) != null) {
            arrayList.add(sdkInitializationListener);
        }
        int i = 0;
        if (AbstractC4305pk.c == pa.c) {
            ArrayList arrayList2 = AbstractC4305pk.e;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            AbstractC4305pk.f = (byte) 0;
            AbstractC4305pk.c = (byte) 0;
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                SdkInitializationListener sdkInitializationListener2 = (SdkInitializationListener) obj;
                INSTANCE.getClass();
                if (str == null) {
                    error = null;
                } else {
                    error = new Error(str);
                }
                sdkInitializationListener2.onInitializationComplete(error);
            }
        }
    }

    public static final boolean isSDKInitialized() {
        return AbstractC4221mk.c();
    }

    public static final void setAgeGroup(@NotNull AgeGroup group) {
        group.getClass();
        String string = group.toString();
        Locale locale = Locale.ENGLISH;
        String strP = n30.p(locale, string, locale);
        Context context = AbstractC4221mk.a;
        AbstractC4247ni.c = strP;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Db.b;
            Cb.a(context, "user_info_store").a("user_age_group", strP, false);
        }
    }

    public static final void setEducation(@NotNull Education education) {
        education.getClass();
        String string = education.toString();
        Locale locale = Locale.ENGLISH;
        String strP = n30.p(locale, string, locale);
        Context context = AbstractC4221mk.a;
        AbstractC4247ni.k = strP;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Db.b;
            Cb.a(context, "user_info_store").a("user_education", strP, false);
        }
    }

    public static final void setGender(@NotNull Gender gender) {
        gender.getClass();
        String string = gender.toString();
        Locale locale = Locale.ENGLISH;
        String strP = n30.p(locale, string, locale);
        Context context = AbstractC4221mk.a;
        AbstractC4247ni.j = strP;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Db.b;
            Cb.a(context, "user_info_store").a("user_gender", strP, false);
        }
    }

    public static final void setIsAgeRestricted(boolean isAgeRestricted) {
        AbstractC4247ni.a(isAgeRestricted);
        Lm.a(isAgeRestricted);
        if (isAgeRestricted) {
            InMobiUnifiedIdService.reset();
            AbstractC3960d9.a(null);
        }
    }

    public static final void setPublisherProvidedUnifiedId(@Nullable JSONObject jsonObject) {
        Objects.toString(jsonObject);
        AbstractC4221mk.h.submit(new RunnableC4183la(jsonObject));
    }

    public static final void updateGDPRConsent(@Nullable JSONObject consentObject) {
        AbstractC4566z7.a(consentObject);
    }

    @UiThread
    @Nullable
    public static final String getToken(@Nullable Map<String, String> extras, @Nullable String keywords) {
        return Fm.a(extras, keywords);
    }

    public static final az2 b(Context context, String str) {
        str.getClass();
        INSTANCE.getClass();
        a(context, str, null, null, (byte) 1);
        return az2.a;
    }

    public static Pa a(Pa pa, Context context, byte b) {
        if (b == 1) {
            Context context2 = AbstractC4221mk.a;
            if (context2 == null) {
                context = context != null ? context.getApplicationContext() : null;
            } else {
                context = context2;
            }
        }
        if (context == null) {
            a(pa, SdkInitializationListener.MISSING_CONTEXT);
            return null;
        }
        String str = pa.b;
        if (str == null) {
            a(Pa.a(pa, context, null, 62), "Account id cannot be empty. Please provide a valid account id.");
            return null;
        }
        if (C4168kn.a()) {
            a(Pa.a(pa, context, null, 62), "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.");
            return null;
        }
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
        String string = str.subSequence(i, length + 1).toString();
        if (string.length() == 0) {
            a(Pa.a(pa, context, null, 62), "Account id cannot be empty. Please provide a valid account id.");
            return null;
        }
        return Pa.a(pa, context, string, 60);
    }

    public static final void a(Context context, String str, JSONObject jSONObject, SdkInitializationListener sdkInitializationListener) {
        INSTANCE.getClass();
        a(context, str, jSONObject, sdkInitializationListener, (byte) 2);
    }

    public static final az2 a(Context context, String str) {
        str.getClass();
        INSTANCE.getClass();
        a(context, str, null, null, (byte) 1);
        return az2.a;
    }

    public static final void a(Context context, long j, long j2) {
        AbstractC4305pk.a(context, j, j2, new i51(context, 0));
    }

    public static void a(Pa pa, String str) {
        String str2;
        byte b = pa.c;
        if (b == 1) {
            b(pa, str);
            return;
        }
        if (b == 2) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - pa.f;
            byte b2 = pa.c;
            if (b2 == 1) {
                str2 = "PROVIDER";
            } else if (b2 == 2) {
                str2 = "PUBLISHER";
            } else {
                str2 = "NONE";
            }
            AbstractC4333qk.a(str2, AbstractC4221mk.c, str, Long.valueOf(jElapsedRealtime));
            Ta.a(pa.a, "SdkInitFailed", Long.valueOf(jElapsedRealtime), Short.valueOf(Ta.a(str)));
            AtomicBoolean atomicBoolean = AbstractC4305pk.a;
            byte b3 = pa.c;
            List<SdkInitializationListener> list = gg0.a;
            if (b3 == 2) {
                SdkInitializationListener sdkInitializationListener = pa.e;
                List listY = sdkInitializationListener != null ? eu.y(sdkInitializationListener) : null;
                if (listY != null) {
                    list = listY;
                }
            }
            if (list.isEmpty()) {
                return;
            }
            for (SdkInitializationListener sdkInitializationListener2 : list) {
                INSTANCE.getClass();
                sdkInitializationListener2.onInitializationComplete(new Error(str));
            }
        }
    }
}
