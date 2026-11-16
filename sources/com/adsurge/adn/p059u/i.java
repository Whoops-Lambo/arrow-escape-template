package com.adsurge.adn.p059u;

import android.text.TextUtils;
import defpackage.n30;
import defpackage.nj;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class i {
    public static final b a = new b(4, "Unknown Error");
    public static final b b = new b(4, "Need a Valid Configuration");
    public static final b c = new b(4, "Not Initialized");
    public static final b d = new b(4, "Initializing or Already Initialized");
    public static final b e = new b(4, "No APPID");
    public static final b f = new b(4, "No Ad Unit ID");
    public static final b g = new b(1, "Ad No Fill");
    public static final b h = new b(5, "Load Ad First");
    public static final b i = new b(5, "Ad Has Been Shown");
    public static final b j = new b(5, "Ad Has Expired");
    public static final b k = new b(6, "Age Restricted");
    public static final b l = new b(6, "User Not Consent Device Info");
    public static final b m = new b(6, "User Rejected AdSurge SDK");
    public static final b n = new b(4, "Failed to obtain token");

    public static b a(int i2, String str) {
        if (i2 == 1) {
            return !TextUtils.isEmpty(str) ? new b(1, n30.y("Ad No Fill - ", str)) : g;
        }
        if (i2 == 3000) {
            return new b(3, n30.y("Server Error - Http Code ", str));
        }
        if (i2 == 3001) {
            return new b(3, n30.y("Server Error - Invalid Data ", str));
        }
        switch (i2) {
            case 4000:
                return c;
            case 4001:
                return d;
            case 4002:
                return new b(4, str);
            case 4003:
                return e;
            case 4004:
                return f;
            case 4005:
                return b;
            default:
                switch (i2) {
                    case 5000:
                        return h;
                    case 5001:
                        return i;
                    case 5002:
                        return j;
                    case 5003:
                        return new b(4, n30.y("Error Parameters - ", str));
                    default:
                        switch (i2) {
                            case 6000:
                                return k;
                            case 6001:
                                return l;
                            case 6002:
                                return m;
                            case 6003:
                                return new b(6, str);
                            default:
                                return a;
                        }
                }
        }
    }

    public static b a(int i2) {
        return a(i2, null);
    }

    public static b a(Exception exc) {
        String strO;
        if (exc instanceof SocketTimeoutException) {
            strO = "Network Error - Timeout";
        } else if (exc instanceof UnknownHostException) {
            strO = "Network Error - Unknown Host";
        } else if (exc instanceof ConnectException) {
            strO = "Network Error - No Connect";
        } else if (exc instanceof SSLHandshakeException) {
            strO = "Network Error - SSL Connect";
        } else {
            strO = nj.o(exc, new StringBuilder("Network Error - Unknown : "));
        }
        return new b(2, strO);
    }
}
