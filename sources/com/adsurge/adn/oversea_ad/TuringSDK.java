package com.adsurge.adn.oversea_ad;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class TuringSDK extends o {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
        public final Context a;
        public final ITuringPrivacyPolicy s;
        public ITuringDeviceInfoProvider t;
        public ITuringPkgProvider u;
        public ITuringIoTFeatureMap v;
        public String b = "";
        public int c = 5000;
        public long d = 60000;
        public int e = 3;
        public String f = "";
        public String g = "";
        public int h = 0;
        public String i = "";
        public int j = 0;
        public Map k = new HashMap();
        public boolean l = true;
        public String m = "";
        public String n = "";
        public boolean o = true;
        public boolean p = true;
        public boolean q = false;
        public boolean r = true;
        public boolean w = false;
        public boolean x = false;
        public boolean y = false;
        public boolean z = false;
        public boolean A = false;
        public boolean B = false;
        public boolean C = false;
        public boolean D = false;
        public boolean E = false;
        public boolean F = false;
        public String[] G = null;

        public final Builder disableAudioMode() {
            this.B = true;
            return this;
        }

        public final Builder disableDisplay() {
            this.F = true;
            return this;
        }

        public final Builder disableScreenCapture() {
            this.E = true;
            return this;
        }

        public final Builder enableClickRisk() {
            this.x = true;
            return this;
        }

        public final Builder enableDRM() {
            this.z = true;
            return this;
        }

        public final Builder enableLastLocation() {
            this.D = true;
            return this;
        }

        public final Builder enableWiFiRisk() {
            this.y = true;
            return this;
        }

        public final Builder honorOAIDPreferred() {
            this.A = true;
            return this;
        }

        public final Builder retryTime(int i) {
            if (i < 1) {
                i = 1;
            }
            if (i > 10) {
                i = 10;
            }
            this.e = i;
            return this;
        }

        public final Builder skipReflectionBypass() {
            this.C = true;
            return this;
        }

        public final Builder appid(String str) {
            this.m = str;
            return this;
        }

        public final Builder autoRequestBg(boolean z) {
            this.p = z;
            return this;
        }

        public final TuringSDK build() {
            return new TuringSDK(this);
        }

        public final Builder channel(int i) {
            this.j = i;
            return this;
        }

        public final Builder clientBuildNo(int i) {
            this.h = i;
            return this;
        }

        public final Builder clientChannel(String str) {
            this.f = str;
            return this;
        }

        public final Builder clientLc(String str) {
            this.i = str;
            return this;
        }

        public final Builder clientMetaDataMap(Map<Integer, String> map) {
            this.k = map;
            return this;
        }

        public final Builder clientVersion(String str) {
            this.g = str;
            return this;
        }

        public final Builder forceReqServiceEveryTime(boolean z) {
            this.q = z;
            return this;
        }

        public final Builder hostUrl(String... strArr) {
            this.G = strArr;
            return this;
        }

        public final Builder initNetwork(boolean z) {
            this.r = z;
            return this;
        }

        public final Builder loadLibrary(boolean z) {
            this.l = z;
            return this;
        }

        public final Builder phyFeature(boolean z) {
            this.o = z;
            return this;
        }

        public final Builder riskDetectTimeout(int i) {
            if (i < 100) {
                i = 100;
            }
            if (i > 60000) {
                i = 60000;
            }
            this.d = i;
            return this;
        }

        public final Builder soFilePath(String str) {
            this.n = str;
            return this;
        }

        @Deprecated
        public final Builder timeout(int i) {
            if (i < 100) {
                i = 100;
            }
            if (i > 60000) {
                i = 60000;
            }
            this.c = i;
            return this;
        }

        public final Builder turingDeviceInfoProvider(ITuringDeviceInfoProvider iTuringDeviceInfoProvider) {
            this.t = iTuringDeviceInfoProvider;
            return this;
        }

        public final Builder turingIoTFeatureMap(ITuringIoTFeatureMap iTuringIoTFeatureMap) {
            this.v = iTuringIoTFeatureMap;
            return this;
        }

        public final Builder turingPkgProvider(ITuringPkgProvider iTuringPkgProvider) {
            this.u = iTuringPkgProvider;
            return this;
        }

        public final Builder tvOS(boolean z) {
            this.w = z;
            return this;
        }

        public final Builder uniqueId(String str) {
            this.b = str;
            return this;
        }

        public Builder(Context context, ITuringPrivacyPolicy iTuringPrivacyPolicy) {
            this.a = context.getApplicationContext();
            this.s = iTuringPrivacyPolicy;
        }
    }

    public static Builder createConf(Context context, ITuringPrivacyPolicy iTuringPrivacyPolicy) {
        return new Builder(context, iTuringPrivacyPolicy);
    }

    public TuringSDK(Builder builder) {
        Context applicationContext;
        Context context = builder.a;
        synchronized (Cconst.class) {
            if (Cconst.a == null && context != null && (applicationContext = context.getApplicationContext()) != null) {
                Cconst.a = applicationContext;
            }
        }
        this.g = builder.b;
        this.v = builder.c;
        this.w = builder.d;
        this.x = builder.e;
        this.l = builder.g;
        this.k = builder.f;
        this.m = builder.h;
        this.n = builder.i;
        this.o = builder.k;
        this.f = builder.j;
        this.h = builder.l;
        this.p = builder.m;
        this.j = builder.n;
        this.s = builder.o;
        this.q = builder.p;
        this.r = builder.q;
        this.t = builder.r;
        this.b = builder.s;
        this.c = builder.t;
        this.d = builder.u;
        this.e = builder.v;
        this.u = builder.w;
        this.z = builder.x;
        this.A = builder.y;
        this.C = builder.z;
        this.D = builder.A;
        this.E = builder.B;
        this.F = builder.C;
        this.G = builder.D;
        this.H = builder.E;
        this.I = builder.F;
        this.i = builder.G;
        a();
    }

    public static String getVersionInfo() {
        return n0.b();
    }

    public int init() {
        return n0.a(this);
    }
}
