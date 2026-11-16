package com.adsurge.adn.oversea_ad;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class o {
    public static TuringSDK J;
    public static final n K = new n();
    public HashSet B;
    public Leo a;
    public ITuringPrivacyPolicy b;
    public ITuringDeviceInfoProvider c;
    public ITuringPkgProvider d;
    public ITuringIoTFeatureMap e;
    public int f = 0;
    public String g = "";
    public boolean h = true;
    public String[] i = null;
    public String j = "";
    public String k = "";
    public String l = "";
    public int m = 0;
    public String n = "";
    public Map o = new HashMap();
    public String p = "";
    public boolean q = false;
    public boolean r = false;
    public boolean s = true;
    public boolean t = true;
    public boolean u = false;
    public long v = 200000;
    public long w = 60000;
    public int x = 3;
    public boolean y = false;
    public boolean z = false;
    public boolean A = false;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;

    public static synchronized void b() {
    }

    public final void a() {
        String[] strArr = this.i;
        if (strArr != null) {
            if (strArr.length == 0) {
                this.i = null;
            } else {
                ArrayList arrayList = new ArrayList();
                for (String str : this.i) {
                    if (str != null && !str.isEmpty()) {
                        arrayList.add(str);
                    }
                }
                this.i = arrayList.isEmpty() ? null : (String[]) arrayList.toArray(new String[0]);
            }
        }
        if (this.i == null) {
            if (TextUtils.isEmpty("")) {
                this.i = new String[]{""};
            } else {
                this.i = new String[]{""};
            }
        }
        if (this.a == null) {
            String[] strArr2 = this.i;
            Leo leo = new Leo(strArr2);
            if (strArr2.length > 1) {
                Cepheus.a.submit(new LeoMinor(leo));
            }
            this.a = leo;
        } else {
            this.y = true;
        }
        if (this.B == null) {
            this.B = new HashSet();
        }
        if (this.E) {
            this.B.add(155);
        }
        if (this.H) {
            this.B.add(158);
        }
        if (this.I) {
            this.B.add(14);
        }
    }

    public static synchronized void a(TuringSDK turingSDK) {
        J = turingSDK;
    }
}
