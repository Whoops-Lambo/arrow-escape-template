package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.AbstractC0509;
import com.ironsource.adqualitysdk.sdk.i.AbstractC0793;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class ISAdQualitySegment {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final HashMap f55;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final double f56;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final long f57;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final AtomicBoolean f58;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final int f59;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String f60;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int f61;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String f62;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Deprecated
    public static class Builder {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public String f68;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public String f70;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public int f69 = -1;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public int f67 = -1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public AtomicBoolean f66 = null;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        public long f65 = 0;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        public double f64 = -1.0d;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public final HashMap f63 = new HashMap();

        @Deprecated
        public ISAdQualitySegment build() {
            return new ISAdQualitySegment(this.f70, this.f69, this.f68, this.f67, this.f66, this.f64, this.f65, new HashMap(this.f63));
        }

        @Deprecated
        public Builder setAge(int i) {
            if (i == 0) {
                return this;
            }
            if (i >= 1 && i <= 199) {
                this.f69 = i;
                return this;
            }
            AbstractC0509.m490("ISAdQualitySegment Builder", "setAge( " + i + " ) age must be between 1-199");
            return this;
        }

        @Deprecated
        public Builder setCustomData(String str, String str2) {
            if (TextUtils.isEmpty(str2)) {
                return this;
            }
            try {
                if (this.f63.size() >= 5) {
                    AbstractC0509.m490("ISAdQualitySegment Builder", "setCustomData( " + str + " , " + str2 + " ) limited to 5 custom values. Ignoring custom value.");
                    return this;
                }
                boolean zMatches = false;
                if (TextUtils.isEmpty(str) ? false : str.matches(StringFog.decrypt("+QPPDDNRHheXdZd8YzQ=\n", "p1iuIUkQM00=\n"))) {
                    if (!TextUtils.isEmpty(str2)) {
                        zMatches = str2.matches(StringFog.decrypt("+QPPDDNRHheXdZd8YzQ=\n", "p1iuIUkQM00=\n"));
                    }
                    if (zMatches && AbstractC0793.m612(str, 32) && AbstractC0793.m612(str2, 32)) {
                        this.f63.put("sgct_" + str, str2);
                        return this;
                    }
                }
                AbstractC0509.m490("ISAdQualitySegment Builder", "setCustomData( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length");
                return this;
            } catch (Exception e) {
                e.printStackTrace();
                return this;
            }
        }

        @Deprecated
        public Builder setInAppPurchasesTotal(double d) {
            if (d >= 0.0d && d < 999999.99d) {
                this.f64 = Math.floor(d * 100.0d) / 100.0d;
                return this;
            }
            AbstractC0509.m490("ISAdQualitySegment Builder", "setIAPTotal( " + d + " ) iapt must be between 0-999999.99");
            return this;
        }

        @Deprecated
        public Builder setIsPaying(boolean z) {
            if (this.f66 == null) {
                this.f66 = new AtomicBoolean();
            }
            this.f66.set(z);
            return this;
        }

        @Deprecated
        public Builder setLevel(int i) {
            if (i == 0) {
                return this;
            }
            if (i > 0 && i < 999999) {
                this.f67 = i;
                return this;
            }
            AbstractC0509.m490("ISAdQualitySegment Builder", "setLevel( " + i + " ) level must be between 1-999999");
            return this;
        }

        @Deprecated
        public Builder setUserCreationDate(long j) {
            if (j == 0) {
                return this;
            }
            if (j > 0) {
                this.f65 = j;
                return this;
            }
            AbstractC0509.m490("ISAdQualitySegment Builder", "setUserCreationDate( " + j + " ) is an invalid timestamp");
            return this;
        }

        @Deprecated
        public Builder() {
        }

        @Deprecated
        public Builder setGender(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            Locale locale = Locale.ENGLISH;
            if (!str.toLowerCase(locale).equals(IronSourceConstants.a.b) && !str.toLowerCase(locale).equals(IronSourceConstants.a.c)) {
                AbstractC0509.m490("ISAdQualitySegment Builder", "setGender( " + str + " ) is invalid");
                return this;
            }
            this.f68 = str.toLowerCase(locale);
            return this;
        }

        @Deprecated
        public Builder setSegmentName(String str) {
            boolean zMatches;
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = str.matches(StringFog.decrypt("+QPPDDNRHheXdZd8YzQ=\n", "p1iuIUkQM00=\n"));
            }
            if (zMatches && AbstractC0793.m612(str, 32)) {
                this.f70 = str;
                return this;
            }
            AbstractC0509.m490("ISAdQualitySegment Builder", "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length");
            return this;
        }
    }

    @Deprecated
    public int getAge() {
        return this.f61;
    }

    @Deprecated
    public Map<String, String> getCustomData() {
        return this.f55;
    }

    @Deprecated
    public String getGender() {
        return this.f60;
    }

    @Deprecated
    public double getInAppPurchasesTotal() {
        return this.f56;
    }

    @Deprecated
    public AtomicBoolean getIsPaying() {
        return this.f58;
    }

    @Deprecated
    public int getLevel() {
        return this.f59;
    }

    @Deprecated
    public String getName() {
        return this.f62;
    }

    @Deprecated
    public long getUserCreationDate() {
        return this.f57;
    }

    public ISAdQualitySegment(String str, int i, String str2, int i2, AtomicBoolean atomicBoolean, double d, long j, HashMap map) {
        this.f62 = str;
        this.f61 = i;
        this.f60 = str2;
        this.f59 = i2;
        this.f58 = atomicBoolean;
        this.f56 = d;
        this.f57 = j;
        this.f55 = map;
    }
}
