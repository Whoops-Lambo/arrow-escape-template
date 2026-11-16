package com.unity3d.mediation.impression;

import defpackage.e80;
import defpackage.nj;
import defpackage.pv1;
import defpackage.q63;
import java.text.DecimalFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class LevelPlayImpressionData {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_AD_FORMAT = "adFormat";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_CREATIVE_ID = "creativeId";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID = "mediationAdUnitId";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME = "mediationAdUnitName";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    @NotNull
    private final JSONObject a;

    @NotNull
    private final DecimalFormat b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        private a() {
        }
    }

    @Nullable
    public final String getAb() {
        String strOptString = this.a.optString("ab", "");
        strOptString.getClass();
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getAdFormat() {
        String strOptString = this.a.optString("adFormat", "");
        strOptString.getClass();
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getAdNetwork() {
        String strOptString = this.a.optString("adNetwork", "");
        strOptString.getClass();
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @NotNull
    public final JSONObject getAllData() {
        return this.a;
    }

    @Nullable
    public final String getAuctionId() {
        String strOptString = this.a.optString("auctionId", "");
        strOptString.getClass();
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getCountry() {
        String strOptString = this.a.optString("country", "");
        strOptString.getClass();
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getCreativeId() {
        String strOptString = this.a.optString("creativeId", "");
        strOptString.getClass();
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getEncryptedCPM() {
        String strOptString = this.a.optString("encryptedCPM", "");
        strOptString.getClass();
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getInstanceId() {
        String strOptString = this.a.optString("instanceId", "");
        strOptString.getClass();
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getInstanceName() {
        String strOptString = this.a.optString("instanceName", "");
        strOptString.getClass();
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getMediationAdUnitId() {
        String strOptString = this.a.optString("mediationAdUnitId", "");
        strOptString.getClass();
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getMediationAdUnitName() {
        String strOptString = this.a.optString("mediationAdUnitName", "");
        strOptString.getClass();
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getPlacement() {
        String strOptString = this.a.optString("placement", "");
        strOptString.getClass();
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getPrecision() {
        String strOptString = this.a.optString("precision", "");
        strOptString.getClass();
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final Double getRevenue() {
        double dOptDouble = this.a.optDouble("revenue");
        Double dValueOf = Double.valueOf(dOptDouble);
        if (Double.isNaN(dOptDouble)) {
            return null;
        }
        return dValueOf;
    }

    @Nullable
    public final String getSegmentName() {
        String strOptString = this.a.optString("segmentName", "");
        strOptString.getClass();
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    public LevelPlayImpressionData(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject;
        this.b = new DecimalFormat("#.#####");
    }

    @NotNull
    public String toString() {
        LevelPlayImpressionData levelPlayImpressionData;
        String str;
        String auctionId = getAuctionId();
        String mediationAdUnitName = getMediationAdUnitName();
        String mediationAdUnitId = getMediationAdUnitId();
        String adFormat = getAdFormat();
        String country = getCountry();
        String ab = getAb();
        String segmentName = getSegmentName();
        String placement = getPlacement();
        String adNetwork = getAdNetwork();
        String instanceName = getInstanceName();
        String instanceId = getInstanceId();
        if (getRevenue() == null) {
            str = null;
            levelPlayImpressionData = this;
        } else {
            levelPlayImpressionData = this;
            str = levelPlayImpressionData.b.format(levelPlayImpressionData.getRevenue());
        }
        String precision = levelPlayImpressionData.getPrecision();
        String encryptedCPM = levelPlayImpressionData.getEncryptedCPM();
        String creativeId = levelPlayImpressionData.getCreativeId();
        StringBuilder sbR = pv1.r("auctionId: '", auctionId, "', mediationAdUnitName: '", mediationAdUnitName, "', mediationAdUnitId: '");
        q63.y(sbR, mediationAdUnitId, "', adFormat: '", adFormat, "', country: '");
        q63.y(sbR, country, "', ab: '", ab, "', segmentName: '");
        q63.y(sbR, segmentName, "', placement: '", placement, "', adNetwork: '");
        q63.y(sbR, adNetwork, "', instanceName: '", instanceName, "', instanceId: '");
        q63.y(sbR, instanceId, "', revenue: ", str, ", precision: '");
        q63.y(sbR, precision, "', encryptedCPM: '", encryptedCPM, "', creativeId: '");
        return nj.q(sbR, creativeId, "'");
    }
}
