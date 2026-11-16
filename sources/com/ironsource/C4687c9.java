package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import defpackage.e80;
import defpackage.nj;
import defpackage.pv1;
import defpackage.q63;
import java.text.DecimalFormat;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4687c9 {

    @NotNull
    public static final a c = new a(null);

    @NotNull
    public static final String d = "auctionId";

    @NotNull
    public static final String e = "adUnit";

    @NotNull
    public static final String f = "adFormat";

    @NotNull
    public static final String g = "mediationAdUnitName";

    @NotNull
    public static final String h = "mediationAdUnitId";

    @NotNull
    public static final String i = "country";

    @NotNull
    public static final String j = "ab";

    @NotNull
    public static final String k = "segmentName";

    @NotNull
    public static final String l = "placement";

    @NotNull
    public static final String m = "adNetwork";

    @NotNull
    public static final String n = "instanceName";

    @NotNull
    public static final String o = "instanceId";

    @NotNull
    public static final String p = "revenue";

    @NotNull
    public static final String q = "precision";

    @NotNull
    public static final String r = "encryptedCPM";

    @NotNull
    public static final String s = "creativeId";

    @NotNull
    private final LevelPlayAdInfo a;

    @NotNull
    private final DecimalFormat b;

    /* JADX INFO: renamed from: com.ironsource.c9$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        private a() {
        }
    }

    @NotNull
    public final String a() {
        return this.a.getAb();
    }

    @NotNull
    public final String b() {
        return this.a.getAdFormat();
    }

    @NotNull
    public final String c() {
        return this.a.getAdNetwork();
    }

    @NotNull
    public final JSONObject d() {
        return this.a.impressionData$mediationsdk_release();
    }

    @NotNull
    public final String e() {
        return this.a.getAuctionId();
    }

    @NotNull
    public final String f() {
        return this.a.getCountry();
    }

    @NotNull
    public final String g() {
        return this.a.getCreativeId();
    }

    @NotNull
    public final String h() {
        return this.a.getEncryptedCPM();
    }

    @NotNull
    public final String i() {
        return this.a.getInstanceId();
    }

    @NotNull
    public final String j() {
        return this.a.getInstanceName();
    }

    @NotNull
    public final String k() {
        return this.a.getAdUnitId();
    }

    @NotNull
    public final String l() {
        return this.a.getAdUnitName();
    }

    @NotNull
    public final String m() {
        return this.a.getPlacementName();
    }

    @NotNull
    public final String n() {
        return this.a.getImpressionPrecision$mediationsdk_release();
    }

    public final double o() {
        return this.a.getImpressionRevenue$mediationsdk_release();
    }

    @NotNull
    public final String p() {
        return this.a.getSegmentName();
    }

    public C4687c9(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a = levelPlayAdInfo;
        this.b = new DecimalFormat("#.#####");
    }

    @NotNull
    public String toString() {
        String strE = e();
        String strL = l();
        String strK = k();
        String strB = b();
        String strF = f();
        String strA = a();
        String strP = p();
        String strM = m();
        String strC = c();
        String strJ = j();
        String strI = i();
        o();
        String str = this.b.format(o());
        String strN = n();
        String strH = h();
        String strG = g();
        StringBuilder sbR = pv1.r("auctionId: '", strE, "', mediationAdUnitName: '", strL, "', mediationAdUnitId: '");
        q63.y(sbR, strK, "', adFormat: '", strB, "', country: '");
        q63.y(sbR, strF, "', ab: '", strA, "', segmentName: '");
        q63.y(sbR, strP, "', placement: '", strM, "', adNetwork: '");
        q63.y(sbR, strC, "', instanceName: '", strJ, "', instanceId: '");
        q63.y(sbR, strI, "', revenue: ", str, ", precision: '");
        q63.y(sbR, strN, "', encryptedCPM: '", strH, "', creativeId: '");
        return nj.q(sbR, strG, "'");
    }
}
