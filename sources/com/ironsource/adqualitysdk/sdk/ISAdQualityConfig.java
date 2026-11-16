package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.AbstractC0509;
import com.ironsource.adqualitysdk.sdk.i.AbstractC0533;
import com.ironsource.adqualitysdk.sdk.i.AbstractC0793;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ISAdQualityConfig {

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public final HashMap f15;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final ISAdQualityDeviceIdType f16;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean f17;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final boolean f18;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final String f19;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final ISAdQualityLogLevel f20;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final HashSet f21;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean f22;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean f23;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean f24;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String f25;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Deprecated
    public static class Builder {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public String f36 = null;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public boolean f35 = false;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public boolean f34 = false;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public boolean f33 = false;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public ISAdQualityLogLevel f32 = ISAdQualityLogLevel.INFO;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        public final HashSet f31 = new HashSet();

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        public String f30 = null;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public boolean f29 = false;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        public boolean f28 = false;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        public ISAdQualityDeviceIdType f27 = ISAdQualityDeviceIdType.NONE;

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        public final HashMap f26 = new HashMap();

        @Deprecated
        public Builder addAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f31.add(iSAdQualityInitListener);
            return this;
        }

        @Deprecated
        public ISAdQualityConfig build() {
            return new ISAdQualityConfig(this.f36, this.f35, this.f34, this.f33, this.f32, this.f31, this.f30, this.f29, this.f28, this.f27, this.f26);
        }

        @Deprecated
        public Builder removeAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f31.remove(iSAdQualityInitListener);
            return this;
        }

        @Deprecated
        public Builder setCoppa(boolean z) {
            this.f29 = z;
            this.f28 = true;
            return this;
        }

        @Deprecated
        public Builder setDeviceIdType(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
            this.f27 = iSAdQualityDeviceIdType;
            return this;
        }

        @Deprecated
        public Builder setInitializationSource(String str) {
            if (AbstractC0793.m612(str, 20)) {
                this.f30 = str;
                return this;
            }
            AbstractC0509.m490("ISAdQualityConfig", "setInitializationSource( " + str + " ) init source must have length of 1-20");
            return this;
        }

        @Deprecated
        public Builder setLogLevel(ISAdQualityLogLevel iSAdQualityLogLevel) {
            this.f32 = iSAdQualityLogLevel;
            return this;
        }

        @Deprecated
        public Builder setMetaData(String str, String str2) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    if (!AbstractC0533.f1282.contains(str)) {
                        if (AbstractC0533.m516(this.f26, str)) {
                            AbstractC0509.m490("ISAdQualityConfig", "setMetaData( " + str + " , " + str2 + " ) limited to 5 meta data values. Ignoring meta data value.");
                            return this;
                        }
                        if (!AbstractC0793.m612(str, 64) || !AbstractC0793.m612(str2, 64)) {
                            AbstractC0509.m490("ISAdQualityConfig", "setMetaData( " + str + " , " + str2 + " ) the length of both the key and the value should be between 1 and 64 characters.");
                            return this;
                        }
                    }
                    this.f26.put(str, str2);
                }
            } catch (Exception unused) {
            }
            return this;
        }

        @Deprecated
        public Builder setTestMode(boolean z) {
            this.f34 = z;
            this.f33 = true;
            return this;
        }

        @Deprecated
        public Builder setUserId(String str) {
            this.f36 = str;
            this.f35 = true;
            return this;
        }

        @Deprecated
        public Builder() {
        }

        @Deprecated
        public Builder setAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            return addAdQualityInitListener(iSAdQualityInitListener);
        }

        @Deprecated
        public Builder setMetaData(JSONObject jSONObject) {
            if (jSONObject != null) {
                for (int i = 0; i < jSONObject.names().length(); i++) {
                    try {
                        String string = jSONObject.names().getString(i);
                        Object objOpt = jSONObject.opt(string);
                        if (objOpt instanceof String) {
                            setMetaData(string, (String) objOpt);
                        } else {
                            AbstractC0509.m490("ISAdQualityConfig", "setMetaData( " + string + " , " + objOpt + " ) value must be a string");
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return this;
        }
    }

    @Deprecated
    public static ISAdQualityConfig merge(ISAdQualityConfig iSAdQualityConfig, ISAdQualityConfig iSAdQualityConfig2) {
        Builder builder = new Builder();
        if (iSAdQualityConfig.f24) {
            builder.setUserId(iSAdQualityConfig.f25);
        } else if (iSAdQualityConfig2.f24) {
            builder.setUserId(iSAdQualityConfig2.f25);
        }
        if (iSAdQualityConfig.f22) {
            builder.setTestMode(iSAdQualityConfig.f23);
        } else if (iSAdQualityConfig2.f22) {
            builder.setTestMode(iSAdQualityConfig2.f23);
        }
        if (iSAdQualityConfig.f17) {
            builder.setCoppa(iSAdQualityConfig.f18);
        } else if (iSAdQualityConfig2.f17) {
            builder.setCoppa(iSAdQualityConfig2.f18);
        }
        ISAdQualityLogLevel iSAdQualityLogLevel = iSAdQualityConfig.f20;
        if (iSAdQualityLogLevel == null) {
            iSAdQualityLogLevel = iSAdQualityConfig2.f20;
        }
        builder.setLogLevel(iSAdQualityLogLevel);
        Iterator it = iSAdQualityConfig.f21.iterator();
        while (it.hasNext()) {
            builder.addAdQualityInitListener((ISAdQualityInitListener) it.next());
        }
        Iterator it2 = iSAdQualityConfig2.f21.iterator();
        while (it2.hasNext()) {
            builder.addAdQualityInitListener((ISAdQualityInitListener) it2.next());
        }
        String str = iSAdQualityConfig.f19;
        if (str != null) {
            builder.setInitializationSource(str);
        } else {
            String str2 = iSAdQualityConfig2.f19;
            if (str2 != null) {
                builder.setInitializationSource(str2);
            }
        }
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = iSAdQualityConfig.f16;
        if (iSAdQualityDeviceIdType == null) {
            iSAdQualityDeviceIdType = iSAdQualityConfig2.f16;
        }
        builder.setDeviceIdType(iSAdQualityDeviceIdType);
        HashMap map = new HashMap(iSAdQualityConfig2.f15);
        map.putAll(iSAdQualityConfig.f15);
        for (Map.Entry entry : map.entrySet()) {
            builder.setMetaData((String) entry.getKey(), (String) entry.getValue());
        }
        return builder.build();
    }

    @Deprecated
    public Set<ISAdQualityInitListener> getAdQualityInitListeners() {
        return this.f21;
    }

    @Deprecated
    public boolean getCoppa() {
        return this.f18;
    }

    @Deprecated
    public ISAdQualityDeviceIdType getDeviceIdType() {
        return this.f16;
    }

    @Deprecated
    public String getInitializationSource() {
        return this.f19;
    }

    @Deprecated
    public ISAdQualityLogLevel getLogLevel() {
        return this.f20;
    }

    @Deprecated
    public Map<String, String> getMetaData() {
        return this.f15;
    }

    @Deprecated
    public String getUserId() {
        return this.f25;
    }

    @Deprecated
    public boolean isTestMode() {
        return this.f23;
    }

    @Deprecated
    public boolean isUserIdSet() {
        return this.f24;
    }

    public ISAdQualityConfig(String str, boolean z, boolean z2, boolean z3, ISAdQualityLogLevel iSAdQualityLogLevel, HashSet hashSet, String str2, boolean z4, boolean z5, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, HashMap map) {
        this.f25 = str;
        this.f24 = z;
        this.f23 = z2;
        this.f22 = z3;
        this.f20 = iSAdQualityLogLevel;
        this.f21 = hashSet;
        this.f19 = str2;
        this.f18 = z4;
        this.f17 = z5;
        this.f16 = iSAdQualityDeviceIdType;
        this.f15 = map;
    }
}
