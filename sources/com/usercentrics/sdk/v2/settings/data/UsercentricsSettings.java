package com.usercentrics.sdk.v2.settings.data;

import defpackage.de0;
import defpackage.ep0;
import defpackage.eu;
import defpackage.gg0;
import defpackage.h50;
import defpackage.j8;
import defpackage.jc1;
import defpackage.mh0;
import defpackage.n30;
import defpackage.oy2;
import defpackage.pv1;
import defpackage.q63;
import defpackage.s71;
import defpackage.z92;
import defpackage.zj2;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;", "", "Companion", "$serializer", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@z92
public final /* data */ class UsercentricsSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final KSerializer[] L;
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final VariantsSettings D;
    public final de0 E;
    public final oy2 F;
    public final List G;
    public final Long H;
    public final boolean I;
    public final List J;
    public final List K;
    public final UsercentricsLabels a;
    public final SecondLayer b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final Integer o;
    public final List p;
    public final List q;
    public final List r;
    public final CCPASettings s;
    public final TCF2Settings t;
    public final GppSettings u;
    public final boolean v;
    public final boolean w;
    public final UsercentricsCustomization x;
    public final FirstLayer y;
    public final UsercentricsStyles z;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "defaultConsentAnalytics", "Z", "defaultXdevice", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return UsercentricsSettings$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UsercentricsSettings(int i, int i2, UsercentricsLabels usercentricsLabels, SecondLayer secondLayer, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, Integer num, List list, List list2, List list3, CCPASettings cCPASettings, TCF2Settings tCF2Settings, GppSettings gppSettings, boolean z5, boolean z6, UsercentricsCustomization usercentricsCustomization, FirstLayer firstLayer, UsercentricsStyles usercentricsStyles, boolean z7, boolean z8, boolean z9, VariantsSettings variantsSettings, de0 de0Var, oy2 oy2Var, List list4, Long l, boolean z10, List list5, List list6) {
        if (3 != (i & 3)) {
            ep0.I(new int[]{i, i2}, new int[]{3, 0}, UsercentricsSettings$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = usercentricsLabels;
        this.b = secondLayer;
        if ((i & 4) == 0) {
            this.c = "1.0.0";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = "en";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str7;
        }
        this.j = (i & 512) == 0 ? "" : str8;
        if ((i & 1024) == 0) {
            this.k = false;
        } else {
            this.k = z;
        }
        this.l = (i & 2048) == 0 ? true : z2;
        if ((i & 4096) == 0) {
            this.m = false;
        } else {
            this.m = z3;
        }
        if ((i & 8192) == 0) {
            this.n = false;
        } else {
            this.n = z4;
        }
        this.o = (i & 16384) == 0 ? 0 : num;
        this.p = (32768 & i) == 0 ? eu.y("en") : list;
        this.q = (65536 & i) == 0 ? eu.y("en") : list2;
        int i3 = 131072 & i;
        gg0 gg0Var = gg0.a;
        if (i3 == 0) {
            this.r = gg0Var;
        } else {
            this.r = list3;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = cCPASettings;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = tCF2Settings;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = gppSettings;
        }
        if ((2097152 & i) == 0) {
            this.v = false;
        } else {
            this.v = z5;
        }
        if ((4194304 & i) == 0) {
            this.w = false;
        } else {
            this.w = z6;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = usercentricsCustomization;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = firstLayer;
        }
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = usercentricsStyles;
        }
        if ((67108864 & i) == 0) {
            this.A = false;
        } else {
            this.A = z7;
        }
        if ((134217728 & i) == 0) {
            this.B = false;
        } else {
            this.B = z8;
        }
        if ((268435456 & i) == 0) {
            this.C = false;
        } else {
            this.C = z9;
        }
        if ((536870912 & i) == 0) {
            this.D = null;
        } else {
            this.D = variantsSettings;
        }
        if ((1073741824 & i) == 0) {
            this.E = null;
        } else {
            this.E = de0Var;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = oy2Var;
        }
        if ((i2 & 1) == 0) {
            this.G = null;
        } else {
            this.G = list4;
        }
        if ((i2 & 2) == 0) {
            this.H = null;
        } else {
            this.H = l;
        }
        if ((i2 & 4) == 0) {
            this.I = false;
        } else {
            this.I = z10;
        }
        if ((i2 & 8) == 0) {
            this.J = gg0Var;
        } else {
            this.J = list5;
        }
        if ((i2 & 16) == 0) {
            this.K = null;
        } else {
            this.K = list6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsercentricsSettings)) {
            return false;
        }
        UsercentricsSettings usercentricsSettings = (UsercentricsSettings) obj;
        return s71.b(this.a, usercentricsSettings.a) && s71.b(this.b, usercentricsSettings.b) && s71.b(this.c, usercentricsSettings.c) && s71.b(this.d, usercentricsSettings.d) && s71.b(this.e, usercentricsSettings.e) && s71.b(this.f, usercentricsSettings.f) && s71.b(this.g, usercentricsSettings.g) && s71.b(this.h, usercentricsSettings.h) && s71.b(this.i, usercentricsSettings.i) && s71.b(this.j, usercentricsSettings.j) && this.k == usercentricsSettings.k && this.l == usercentricsSettings.l && this.m == usercentricsSettings.m && this.n == usercentricsSettings.n && s71.b(this.o, usercentricsSettings.o) && s71.b(this.p, usercentricsSettings.p) && s71.b(this.q, usercentricsSettings.q) && s71.b(this.r, usercentricsSettings.r) && s71.b(this.s, usercentricsSettings.s) && s71.b(this.t, usercentricsSettings.t) && s71.b(this.u, usercentricsSettings.u) && this.v == usercentricsSettings.v && this.w == usercentricsSettings.w && s71.b(this.x, usercentricsSettings.x) && s71.b(this.y, usercentricsSettings.y) && s71.b(this.z, usercentricsSettings.z) && this.A == usercentricsSettings.A && this.B == usercentricsSettings.B && this.C == usercentricsSettings.C && s71.b(this.D, usercentricsSettings.D) && this.E == usercentricsSettings.E && this.F == usercentricsSettings.F && s71.b(this.G, usercentricsSettings.G) && s71.b(this.H, usercentricsSettings.H) && this.I == usercentricsSettings.I && s71.b(this.J, usercentricsSettings.J) && s71.b(this.K, usercentricsSettings.K);
    }

    static {
        zj2 zj2Var = zj2.a;
        L = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new j8(zj2Var, 0), new j8(zj2Var, 0), new j8(zj2Var, 0), null, null, null, null, null, null, null, null, null, null, null, null, new mh0("com.usercentrics.sdk.v2.settings.data.DpsDisplayFormat", de0.values()), new mh0("com.usercentrics.sdk.models.settings.USAFrameworks", oy2.values()), new j8(PublishedApp$$serializer.INSTANCE, 0), null, null, new j8(ServiceConsentTemplate$$serializer.INSTANCE, 0), new j8(UsercentricsCategory$$serializer.INSTANCE, 0)};
    }

    public final int hashCode() {
        int iC = n30.c(n30.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iF = jc1.f(jc1.f(jc1.f(jc1.f(n30.c((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
        Integer num = this.o;
        int iE = pv1.e(pv1.e(pv1.e((iF + (num == null ? 0 : num.hashCode())) * 31, 31, this.p), 31, this.q), 31, this.r);
        CCPASettings cCPASettings = this.s;
        int iHashCode5 = (iE + (cCPASettings == null ? 0 : cCPASettings.hashCode())) * 31;
        TCF2Settings tCF2Settings = this.t;
        int iHashCode6 = (iHashCode5 + (tCF2Settings == null ? 0 : tCF2Settings.hashCode())) * 31;
        GppSettings gppSettings = this.u;
        int iF2 = jc1.f(jc1.f((iHashCode6 + (gppSettings == null ? 0 : gppSettings.hashCode())) * 31, 31, this.v), 31, this.w);
        UsercentricsCustomization usercentricsCustomization = this.x;
        int iHashCode7 = (iF2 + (usercentricsCustomization == null ? 0 : usercentricsCustomization.hashCode())) * 31;
        FirstLayer firstLayer = this.y;
        int iHashCode8 = (iHashCode7 + (firstLayer == null ? 0 : firstLayer.hashCode())) * 31;
        UsercentricsStyles usercentricsStyles = this.z;
        int iF3 = jc1.f(jc1.f(jc1.f((iHashCode8 + (usercentricsStyles == null ? 0 : usercentricsStyles.hashCode())) * 31, 31, this.A), 31, this.B), 31, this.C);
        VariantsSettings variantsSettings = this.D;
        int iHashCode9 = (iF3 + (variantsSettings == null ? 0 : variantsSettings.hashCode())) * 31;
        de0 de0Var = this.E;
        int iHashCode10 = (iHashCode9 + (de0Var == null ? 0 : de0Var.hashCode())) * 31;
        oy2 oy2Var = this.F;
        int iHashCode11 = (iHashCode10 + (oy2Var == null ? 0 : oy2Var.hashCode())) * 31;
        List list = this.G;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.H;
        int iE2 = pv1.e(jc1.f((iHashCode12 + (l == null ? 0 : l.hashCode())) * 31, 31, this.I), 31, this.J);
        List list2 = this.K;
        return iE2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsercentricsSettings(labels=");
        sb.append(this.a);
        sb.append(", secondLayer=");
        sb.append(this.b);
        sb.append(", version=");
        q63.y(sb, this.c, ", language=", this.d, ", imprintUrl=");
        q63.y(sb, this.e, ", privacyPolicyUrl=", this.f, ", cookiePolicyUrl=");
        q63.y(sb, this.g, ", firstLayerDescriptionHtml=", this.h, ", firstLayerMobileDescriptionHtml=");
        q63.y(sb, this.i, ", settingsId=", this.j, ", bannerMobileDescriptionIsActive=");
        h50.z(sb, this.k, ", enablePoweredBy=", this.l, ", displayOnlyForEU=");
        h50.z(sb, this.m, ", tcf2Enabled=", this.n, ", reshowBanner=");
        sb.append(this.o);
        sb.append(", editableLanguages=");
        sb.append(this.p);
        sb.append(", languagesAvailable=");
        jc1.A(sb, this.q, ", showInitialViewForVersionChange=", this.r, ", ccpa=");
        sb.append(this.s);
        sb.append(", tcf2=");
        sb.append(this.t);
        sb.append(", gpp=");
        sb.append(this.u);
        sb.append(", gppSignalingEnabled=");
        sb.append(this.v);
        sb.append(", gpcSignalHonoured=");
        sb.append(this.w);
        sb.append(", customization=");
        sb.append(this.x);
        sb.append(", firstLayer=");
        sb.append(this.y);
        sb.append(", styles=");
        sb.append(this.z);
        sb.append(", interactionAnalytics=");
        h50.z(sb, this.A, ", consentAnalytics=", this.B, ", consentXDevice=");
        sb.append(this.C);
        sb.append(", variants=");
        sb.append(this.D);
        sb.append(", dpsDisplayFormat=");
        sb.append(this.E);
        sb.append(", framework=");
        sb.append(this.F);
        sb.append(", publishedApps=");
        sb.append(this.G);
        sb.append(", renewConsentsTimestamp=");
        sb.append(this.H);
        sb.append(", consentWebhook=");
        sb.append(this.I);
        sb.append(", consentTemplates=");
        sb.append(this.J);
        sb.append(", categories=");
        sb.append(this.K);
        sb.append(")");
        return sb.toString();
    }

    public UsercentricsSettings(UsercentricsLabels usercentricsLabels, SecondLayer secondLayer, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, Integer num, List list, List list2, List list3, CCPASettings cCPASettings, TCF2Settings tCF2Settings, GppSettings gppSettings, boolean z5, boolean z6, UsercentricsCustomization usercentricsCustomization, FirstLayer firstLayer, UsercentricsStyles usercentricsStyles, boolean z7, boolean z8, boolean z9, VariantsSettings variantsSettings, de0 de0Var, oy2 oy2Var, List list4, Long l, boolean z10, List list5, List list6) {
        usercentricsLabels.getClass();
        secondLayer.getClass();
        str.getClass();
        str2.getClass();
        str8.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = usercentricsLabels;
        this.b = secondLayer;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = z4;
        this.o = num;
        this.p = list;
        this.q = list2;
        this.r = list3;
        this.s = cCPASettings;
        this.t = tCF2Settings;
        this.u = gppSettings;
        this.v = z5;
        this.w = z6;
        this.x = usercentricsCustomization;
        this.y = firstLayer;
        this.z = usercentricsStyles;
        this.A = z7;
        this.B = z8;
        this.C = z9;
        this.D = variantsSettings;
        this.E = de0Var;
        this.F = oy2Var;
        this.G = list4;
        this.H = l;
        this.I = z10;
        this.J = list5;
        this.K = list6;
    }
}
