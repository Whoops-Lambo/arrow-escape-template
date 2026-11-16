package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.vs;
import com.bytedance.sdk.openadsdk.fpz.rz;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.db3;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class AdSlot {
    public static final int ANCHORED_BANNER = 2;
    public static final int FIX_BANNER = 1;
    public static final int INLINE_BANNER = 3;
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private int ahm;
    private int at;
    private int ay;
    private float ct;
    private String dg;
    private String fi;
    private String fpp;
    private boolean fpz;
    private long ft;
    private int gf;
    private int gm;
    private int ioy;
    private int jpc;
    private String kgy;
    private boolean kus;
    private int lqi;
    private int noq;
    private String nu;
    private String ra;
    private int rz;
    private int sx;
    private boolean twf;
    private String um;
    private float uq;
    private String vs;
    private Map<String, Object> wy;
    private String xh;
    private boolean yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {
        private float at;
        private String dg;
        private String fi;
        private int gm;
        private String kgy;
        private String kus;
        private float nu;
        private int ra;
        private boolean twf;
        private String um;
        private String vs;
        private String xh;
        private int ahm = 640;
        private int rz = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        private final boolean uq = true;
        private int ct = 1;
        private final String noq = "";
        private final int yo = 0;
        private String gf = "defaultUser";
        private boolean fpp = true;
        private Map<String, Object> sx = null;
        private int ay = 1;

        public Builder setRewardAmount(int i) {
            return this;
        }

        public Builder setRewardName(String str) {
            return this;
        }

        public Builder setSupportDeepLink(boolean z) {
            return this;
        }

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.kgy = this.kgy;
            adSlot.noq = this.ct;
            adSlot.yo = true;
            adSlot.ahm = this.ahm;
            adSlot.rz = this.rz;
            float f = this.nu;
            if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                adSlot.uq = this.ahm;
                adSlot.ct = this.rz;
            } else {
                adSlot.uq = f;
                adSlot.ct = this.at;
            }
            adSlot.fi = "";
            adSlot.gf = 0;
            adSlot.ra = this.fi;
            adSlot.nu = this.gf;
            adSlot.at = this.ra;
            adSlot.twf = this.fpp;
            adSlot.kus = this.twf;
            adSlot.vs = this.kus;
            adSlot.dg = this.vs;
            adSlot.xh = this.dg;
            adSlot.um = this.xh;
            adSlot.fpp = this.um;
            adSlot.wy = this.sx;
            adSlot.ioy = this.gm;
            adSlot.lqi = this.ay;
            return adSlot;
        }

        public Builder isExpressAd(boolean z) {
            this.twf = z;
            return this;
        }

        public Builder setAdCount(int i) {
            if (i <= 0) {
                i = 1;
            }
            if (i > 20) {
                i = 20;
            }
            this.ct = i;
            return this;
        }

        public Builder setAdId(String str) {
            this.vs = str;
            return this;
        }

        public Builder setBannerType(int i) {
            this.ay = i;
            return this;
        }

        public Builder setCodeId(String str) {
            this.kgy = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.dg = str;
            return this;
        }

        public Builder setDurationSlotType(int i) {
            this.gm = i;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f, float f2) {
            this.nu = f;
            this.at = f2;
            return this;
        }

        public Builder setExt(String str) {
            this.xh = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i, int i2) {
            this.ahm = i;
            this.rz = i2;
            return this;
        }

        public Builder setIsAutoPlay(boolean z) {
            this.fpp = z;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.fi = str;
            return this;
        }

        public Builder setNativeAdType(int i) {
            this.ra = i;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.sx = map;
            return this;
        }

        public Builder setUserData(String str) {
            this.um = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.gf = str;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (vs.rz()) {
                db3.a(str);
            }
            this.kus = str;
            return this;
        }
    }

    public static int getPosition(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return (i == 3 || i == 4 || i == 7 || i == 8) ? 5 : 3;
        }
        return 4;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE);
            double dOptDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double dOptDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(iOptInt, iOptInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(dOptDouble).floatValue(), Double.valueOf(dOptDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
            builder.setBannerType(jSONObject.optInt("mBannerType"));
        } catch (Exception e) {
            rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07c", "euoemQyo", "XOs5pg+zfQ==", 377);
        }
        AdSlot adSlotBuild = builder.build();
        adSlotBuild.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return adSlotBuild;
    }

    public int getAdCount() {
        return this.noq;
    }

    public String getAdId() {
        return this.dg;
    }

    public int getBannerType() {
        return this.lqi;
    }

    public String getBidAdm() {
        return this.vs;
    }

    public int getCacheScene() {
        return this.jpc;
    }

    public long getCacheTime() {
        return this.ft;
    }

    public String getCodeId() {
        return this.kgy;
    }

    public String getCreativeId() {
        return this.xh;
    }

    public int getDurationSlotType() {
        return this.ioy;
    }

    public float getExpressViewAcceptedHeight() {
        return this.ct;
    }

    public float getExpressViewAcceptedWidth() {
        return this.uq;
    }

    public String getExt() {
        return this.um;
    }

    public int getImgAcceptedHeight() {
        return this.rz;
    }

    public int getImgAcceptedWidth() {
        return this.ahm;
    }

    public int getIsRotateBanner() {
        return this.sx;
    }

    public String getMediaExtra() {
        return this.ra;
    }

    @Nullable
    public Map<String, Object> getRequestExtraMap() {
        return this.wy;
    }

    public int getRewardAmount() {
        return this.gf;
    }

    public String getRewardName() {
        return this.fi;
    }

    public int getRotateOrder() {
        return this.ay;
    }

    public int getRotateTime() {
        return this.gm;
    }

    public String getUserData() {
        return this.fpp;
    }

    public String getUserID() {
        return this.nu;
    }

    public boolean isAutoPlay() {
        return this.twf;
    }

    public boolean isExpressAd() {
        return this.kus;
    }

    public boolean isPreload() {
        return this.fpz;
    }

    public boolean isSupportDeepLink() {
        return this.yo;
    }

    public void setAdCount(int i) {
        this.noq = i;
    }

    public void setCacheScene(int i) {
        this.jpc = i;
    }

    public void setCacheTime(long j) {
        this.ft = j;
    }

    public void setDurationSlotType(int i) {
        this.ioy = i;
    }

    public void setExpressViewAccepted(float f, float f2) {
        this.uq = f;
        this.ct = f2;
    }

    public void setIsRotateBanner(int i) {
        this.sx = i;
    }

    public void setPreload(boolean z) {
        this.fpz = z;
    }

    public void setRotateOrder(int i) {
        this.ay = i;
    }

    public void setRotateTime(int i) {
        this.gm = i;
    }

    public void setUserData(String str) {
        this.fpp = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.kgy);
            jSONObject.put("mAdCount", this.noq);
            jSONObject.put("mIsAutoPlay", this.twf);
            jSONObject.put("mImgAcceptedWidth", this.ahm);
            jSONObject.put("mImgAcceptedHeight", this.rz);
            jSONObject.put("mExpressViewAcceptedWidth", this.uq);
            jSONObject.put("mExpressViewAcceptedHeight", this.ct);
            jSONObject.put("mSupportDeepLink", this.yo);
            jSONObject.put("mRewardName", this.fi);
            jSONObject.put("mRewardAmount", this.gf);
            jSONObject.put("mMediaExtra", this.ra);
            jSONObject.put("mUserID", this.nu);
            jSONObject.put("mNativeAdType", this.at);
            jSONObject.put("mIsExpressAd", this.kus);
            jSONObject.put("mAdId", this.dg);
            jSONObject.put("mCreativeId", this.xh);
            jSONObject.put("mExt", this.um);
            jSONObject.put("mBidAdm", this.vs);
            jSONObject.put("mUserData", this.fpp);
            jSONObject.put("mDurationSlotType", this.ioy);
            jSONObject.put("mBannerType", this.lqi);
            return jSONObject;
        } catch (Exception e) {
            rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07c", "euoemQyo", "T+EHhgyyRsWK", 339);
            return jSONObject;
        }
    }

    private AdSlot() {
        this.twf = true;
        this.kus = false;
        this.sx = 0;
        this.gm = 0;
        this.ay = 0;
        this.lqi = 1;
    }

    public String toString() {
        return super.toString();
    }
}
