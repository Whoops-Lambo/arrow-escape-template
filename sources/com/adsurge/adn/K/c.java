package com.adsurge.adn.K;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class c {
    public SharedPreferences a;
    public volatile String b;
    public volatile int c;
    public volatile String d;
    public String e;
    public boolean f;
    public boolean g;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public static final c a = new c();
    }

    public static c c() {
        return a.a;
    }

    public Integer a() {
        if (b.a("iabtcf_gdpr_applies")) {
            return null;
        }
        return Integer.valueOf(this.c);
    }

    public String b() {
        if (b.a("gpp_str")) {
            return null;
        }
        return this.e;
    }

    public String d() {
        if (b.a("iabtcf_tcstr")) {
            return null;
        }
        return this.b;
    }

    public void e() {
        if (this.a == null) {
            this.a = PreferenceManager.getDefaultSharedPreferences(com.adsurge.adn.J.a.d().a());
        }
        i();
    }

    public boolean f() {
        return this.g;
    }

    public boolean g() {
        return this.c == 1;
    }

    public boolean h() {
        return this.f;
    }

    public void i() {
        this.b = this.a.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, "");
        this.c = this.a.getInt("IABTCF_gdprApplies", -1);
        this.d = this.a.getString("IABTCF_VendorConsents", "");
        try {
            if (!TextUtils.isEmpty(this.d)) {
                this.g = Character.getNumericValue(this.d.charAt(1439)) == 1;
            }
        } catch (Exception unused) {
        }
        String string = this.a.getString("IABTCF_PurposeConsents", "");
        try {
            if (!TextUtils.isEmpty(string)) {
                this.f = Character.getNumericValue(string.charAt(0)) == 1;
            }
        } catch (Exception unused2) {
        }
        this.e = this.a.getString("IABGPP_HDR_GppString", "");
    }
}
