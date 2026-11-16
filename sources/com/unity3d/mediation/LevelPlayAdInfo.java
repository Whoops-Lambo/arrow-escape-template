package com.unity3d.mediation;

import com.ironsource.C4950r4;
import com.ironsource.C5074y2;
import com.ironsource.Db;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.e80;
import defpackage.hg0;
import defpackage.kk2;
import defpackage.n30;
import defpackage.nj;
import defpackage.p92;
import defpackage.pv1;
import defpackage.q63;
import defpackage.s71;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class LevelPlayAdInfo {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @NotNull
    private final String c;

    @Nullable
    private final C5074y2 d;

    @Nullable
    private final LevelPlayAdSize e;

    @Nullable
    private final String f;

    @NotNull
    private final Map<String, Object> g;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayAdInfo)) {
            return false;
        }
        LevelPlayAdInfo levelPlayAdInfo = (LevelPlayAdInfo) obj;
        return s71.b(this.a, levelPlayAdInfo.a) && s71.b(this.b, levelPlayAdInfo.b) && s71.b(this.c, levelPlayAdInfo.c) && s71.b(this.d, levelPlayAdInfo.d) && s71.b(this.e, levelPlayAdInfo.e) && s71.b(this.f, levelPlayAdInfo.f) && s71.b(this.g, levelPlayAdInfo.g);
    }

    private final <T> T a(String str) {
        JSONObject jSONObjectM;
        C5074y2 c5074y2 = this.d;
        if (c5074y2 != null && (jSONObjectM = c5074y2.m()) != null) {
            jSONObjectM.opt(str);
        }
        s71.C();
        throw null;
    }

    private final String b() {
        return this.b;
    }

    private final String c() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LevelPlayAdInfo copy$default(LevelPlayAdInfo levelPlayAdInfo, String str, String str2, String str3, C5074y2 c5074y2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = levelPlayAdInfo.a;
        }
        if ((i & 2) != 0) {
            str2 = levelPlayAdInfo.b;
        }
        if ((i & 4) != 0) {
            str3 = levelPlayAdInfo.c;
        }
        if ((i & 8) != 0) {
            c5074y2 = levelPlayAdInfo.d;
        }
        if ((i & 16) != 0) {
            levelPlayAdSize = levelPlayAdInfo.e;
        }
        if ((i & 32) != 0) {
            str4 = levelPlayAdInfo.f;
        }
        if ((i & 64) != 0) {
            map = levelPlayAdInfo.g;
        }
        String str5 = str4;
        Map map2 = map;
        LevelPlayAdSize levelPlayAdSize2 = levelPlayAdSize;
        String str6 = str3;
        return levelPlayAdInfo.copy(str, str2, str6, c5074y2, levelPlayAdSize2, str5, map2);
    }

    private final C5074y2 d() {
        return this.d;
    }

    private final LevelPlayAdSize e() {
        return this.e;
    }

    private final String f() {
        return this.f;
    }

    private final Map<String, Object> g() {
        return this.g;
    }

    @NotNull
    public final String getAb() {
        JSONObject jSONObjectM;
        C5074y2 c5074y2 = this.d;
        Object objOpt = (c5074y2 == null || (jSONObjectM = c5074y2.m()) == null) ? null : jSONObjectM.opt("ab");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getAdFormat() {
        JSONObject jSONObjectM;
        C5074y2 c5074y2 = this.d;
        Object objOpt = (c5074y2 == null || (jSONObjectM = c5074y2.m()) == null) ? null : jSONObjectM.opt("adFormat");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? this.c : str;
    }

    @NotNull
    public final String getAdId() {
        return this.a;
    }

    @NotNull
    public final String getAdNetwork() {
        JSONObject jSONObjectM;
        C5074y2 c5074y2 = this.d;
        Object objOpt = (c5074y2 == null || (jSONObjectM = c5074y2.m()) == null) ? null : jSONObjectM.opt("adNetwork");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @Nullable
    public final LevelPlayAdSize getAdSize() {
        return this.e;
    }

    @NotNull
    public final String getAdUnitId() {
        JSONObject jSONObjectM;
        C5074y2 c5074y2 = this.d;
        Object objOpt = (c5074y2 == null || (jSONObjectM = c5074y2.m()) == null) ? null : jSONObjectM.opt("mediationAdUnitId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? this.b : str;
    }

    @NotNull
    public final String getAdUnitName() {
        JSONObject jSONObjectM;
        C5074y2 c5074y2 = this.d;
        Object objOpt = (c5074y2 == null || (jSONObjectM = c5074y2.m()) == null) ? null : jSONObjectM.opt("mediationAdUnitName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getAuctionId() {
        JSONObject jSONObjectM;
        C5074y2 c5074y2 = this.d;
        Object objOpt = (c5074y2 == null || (jSONObjectM = c5074y2.m()) == null) ? null : jSONObjectM.opt("auctionId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getCountry() {
        JSONObject jSONObjectM;
        C5074y2 c5074y2 = this.d;
        Object objOpt = (c5074y2 == null || (jSONObjectM = c5074y2.m()) == null) ? null : jSONObjectM.opt("country");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getCreativeId() {
        JSONObject jSONObjectM;
        C5074y2 c5074y2 = this.d;
        Object objOpt = (c5074y2 == null || (jSONObjectM = c5074y2.m()) == null) ? null : jSONObjectM.opt("creativeId");
        if (!(objOpt instanceof String)) {
            objOpt = null;
        }
        String str = (String) objOpt;
        if (str != null) {
            return str;
        }
        Object obj = this.g.get("creativeId");
        String str2 = obj instanceof String ? (String) obj : null;
        return str2 == null ? "" : str2;
    }

    @NotNull
    public final String getEncryptedCPM() {
        JSONObject jSONObjectM;
        C5074y2 c5074y2 = this.d;
        Object objOpt = (c5074y2 == null || (jSONObjectM = c5074y2.m()) == null) ? null : jSONObjectM.opt("encryptedCPM");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getImpressionPrecision$mediationsdk_release() {
        JSONObject jSONObjectM;
        C5074y2 c5074y2 = this.d;
        Object objOpt = (c5074y2 == null || (jSONObjectM = c5074y2.m()) == null) ? null : jSONObjectM.opt("precision");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final double getImpressionRevenue$mediationsdk_release() {
        JSONObject jSONObjectM;
        C5074y2 c5074y2 = this.d;
        Double dValueOf = (c5074y2 == null || (jSONObjectM = c5074y2.m()) == null) ? null : Double.valueOf(jSONObjectM.optDouble("revenue"));
        if ((dValueOf == null || dValueOf.doubleValue() != Double.NaN) && dValueOf != null) {
            return dValueOf.doubleValue();
        }
        return 0.0d;
    }

    @NotNull
    public final String getInstanceId() {
        JSONObject jSONObjectM;
        C5074y2 c5074y2 = this.d;
        Object objOpt = (c5074y2 == null || (jSONObjectM = c5074y2.m()) == null) ? null : jSONObjectM.opt("instanceId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getInstanceName() {
        JSONObject jSONObjectM;
        C5074y2 c5074y2 = this.d;
        Object objOpt = (c5074y2 == null || (jSONObjectM = c5074y2.m()) == null) ? null : jSONObjectM.opt("instanceName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getPlacementName() {
        String str = this.f;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getPrecision() {
        Db dbD;
        String strC;
        C5074y2 c5074y2 = this.d;
        return (c5074y2 == null || (dbD = c5074y2.d()) == null || (strC = dbD.c()) == null) ? getImpressionPrecision$mediationsdk_release() : strC;
    }

    public final double getRevenue() {
        Db dbD;
        C5074y2 c5074y2 = this.d;
        return (c5074y2 == null || (dbD = c5074y2.d()) == null) ? getImpressionRevenue$mediationsdk_release() : dbD.d();
    }

    @NotNull
    public final String getSegmentName() {
        JSONObject jSONObjectM;
        C5074y2 c5074y2 = this.d;
        Object objOpt = (c5074y2 == null || (jSONObjectM = c5074y2.m()) == null) ? null : jSONObjectM.opt("segmentName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public int hashCode() {
        int iC = n30.c(n30.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        C5074y2 c5074y2 = this.d;
        int iHashCode = (iC + (c5074y2 == null ? 0 : c5074y2.hashCode())) * 31;
        LevelPlayAdSize levelPlayAdSize = this.e;
        int iHashCode2 = (iHashCode + (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode())) * 31;
        String str = this.f;
        return this.g.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:26:0x0045). Please report as a decompilation issue!!! */
    @NotNull
    public final JSONObject impressionData$mediationsdk_release() {
        JSONObject jSONObject;
        String str;
        JSONObject jSONObjectM;
        try {
            C5074y2 c5074y2 = this.d;
            if (c5074y2 == null || (jSONObjectM = c5074y2.m()) == null) {
                jSONObject = new JSONObject();
            } else {
                Iterator<String> itKeys = jSONObjectM.keys();
                itKeys.getClass();
                jSONObject = new JSONObject(jSONObjectM, (String[]) p92.N(p92.F(itKeys)).toArray(new String[0]));
            }
        } catch (Exception e) {
            IronLog.INTERNAL.error("failed to copy impression JSON", e);
            C4950r4.d().a(e);
            jSONObject = new JSONObject();
        }
        try {
            String strOptString = jSONObject.optString("placement");
            strOptString.getClass();
            if (strOptString.length() > 0 && (str = this.f) != null) {
                jSONObject.put("placement", kk2.I(strOptString, d.r, str, false));
            }
            if (getCreativeId().length() > 0) {
                jSONObject.put("creativeId", getCreativeId());
            }
        } catch (Exception e2) {
            IronLog.INTERNAL.error("failed to put impression values", e2);
            C4950r4.d().a(e2);
        }
        return jSONObject;
    }

    public LevelPlayAdInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable C5074y2 c5074y2, @Nullable LevelPlayAdSize levelPlayAdSize, @Nullable String str4, @NotNull Map<String, ? extends Object> map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = c5074y2;
        this.e = levelPlayAdSize;
        this.f = str4;
        this.g = map;
    }

    @NotNull
    public final LevelPlayAdInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable C5074y2 c5074y2, @Nullable LevelPlayAdSize levelPlayAdSize, @Nullable String str4, @NotNull Map<String, ? extends Object> map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        map.getClass();
        return new LevelPlayAdInfo(str, str2, str3, c5074y2, levelPlayAdSize, str4, map);
    }

    @NotNull
    public String toString() {
        String adId = getAdId();
        String adUnitId = getAdUnitId();
        String adUnitName = getAdUnitName();
        LevelPlayAdSize levelPlayAdSize = this.e;
        String adFormat = getAdFormat();
        String placementName = getPlacementName();
        String auctionId = getAuctionId();
        String country = getCountry();
        String ab = getAb();
        String segmentName = getSegmentName();
        String adNetwork = getAdNetwork();
        String instanceName = getInstanceName();
        String instanceId = getInstanceId();
        double revenue = getRevenue();
        String precision = getPrecision();
        String encryptedCPM = getEncryptedCPM();
        String creativeId = getCreativeId();
        StringBuilder sbR = pv1.r("adId: ", adId, ", adUnitId: ", adUnitId, ", adUnitName: ");
        sbR.append(adUnitName);
        sbR.append(", adSize: ");
        sbR.append(levelPlayAdSize);
        sbR.append(", adFormat: ");
        q63.y(sbR, adFormat, ", placementName: ", placementName, ", auctionId: ");
        q63.y(sbR, auctionId, ", country: ", country, ", ab: ");
        q63.y(sbR, ab, ", segmentName: ", segmentName, ", adNetwork: ");
        q63.y(sbR, adNetwork, ", instanceName: ", instanceName, ", instanceId: ");
        sbR.append(instanceId);
        sbR.append(", revenue: ");
        sbR.append(revenue);
        q63.y(sbR, ", precision: ", precision, ", encryptedCPM: ", encryptedCPM);
        return nj.q(sbR, ", creativeId: ", creativeId);
    }

    private final String a() {
        return this.a;
    }

    public /* synthetic */ LevelPlayAdInfo(String str, String str2, String str3, C5074y2 c5074y2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i, e80 e80Var) {
        this(str, str2, str3, (i & 8) != 0 ? null : c5074y2, (i & 16) != 0 ? null : levelPlayAdSize, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? hg0.a : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdInfo(@NotNull LevelPlayAdInfo levelPlayAdInfo, @Nullable String str) {
        this(levelPlayAdInfo.a, levelPlayAdInfo.b, levelPlayAdInfo.c, levelPlayAdInfo.d, levelPlayAdInfo.e, str, levelPlayAdInfo.g);
        levelPlayAdInfo.getClass();
    }
}
