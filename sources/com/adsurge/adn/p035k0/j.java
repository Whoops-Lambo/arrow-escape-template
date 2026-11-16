package com.adsurge.adn.p035k0;

import com.adsurge.adn.p032j0.g;
import com.adsurge.adn.p038l0.b;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class j {
    public final char a;
    public final float b;
    public Integer c;
    public Integer d;

    public int a(b bVar) {
        if (this.b == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        char c = this.a;
        if (c == 'g') {
            return a(bVar.d());
        }
        return c == 'h' ? a(bVar.c()) : a(bVar.b(), bVar.a());
    }

    public float b() {
        return this.b;
    }

    public boolean c() {
        char c = this.a;
        return c == 'f' || c == 'e';
    }

    public boolean d() {
        char c = this.a;
        return c == 'g' || c == 'h';
    }

    public int e() {
        float f = this.b;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        switch (this.a) {
            case 'b':
                if (g.d()) {
                    Integer numValueOf = this.c;
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(a(g.c()));
                        this.c = numValueOf;
                    }
                    return numValueOf.intValue();
                }
                Integer numValueOf2 = this.d;
                if (numValueOf2 == null) {
                    numValueOf2 = Integer.valueOf(a(g.c()));
                    this.d = numValueOf2;
                }
                return numValueOf2.intValue();
            case 'c':
                if (g.d()) {
                    Integer numValueOf3 = this.c;
                    if (numValueOf3 == null) {
                        numValueOf3 = Integer.valueOf(a(g.b()));
                        this.c = numValueOf3;
                    }
                    return numValueOf3.intValue();
                }
                Integer numValueOf4 = this.d;
                if (numValueOf4 == null) {
                    numValueOf4 = Integer.valueOf(a(g.b()));
                    this.d = numValueOf4;
                }
                return numValueOf4.intValue();
            case 'd':
                return (int) f;
            case 'e':
            case 'f':
                return 0;
            default:
                Integer numValueOf5 = this.c;
                if (numValueOf5 == null) {
                    numValueOf5 = Integer.valueOf(g.a(f));
                    this.c = numValueOf5;
                }
                return numValueOf5.intValue();
        }
    }

    public j(Object obj) {
        if (obj instanceof Number) {
            this.b = ((Number) obj).floatValue();
            this.a = (char) 0;
            return;
        }
        boolean z = obj instanceof String;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (!z) {
            this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.a = (char) 0;
            return;
        }
        String str = (String) obj;
        int length = str.length();
        if (length < 2) {
            this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.a = (char) 0;
            return;
        }
        int i = length - 1;
        char cCharAt = str.charAt(i);
        if (cCharAt >= 'a' && cCharAt <= 'h') {
            this.a = cCharAt;
            try {
                f = Float.parseFloat(str.substring(0, i));
            } catch (Exception unused) {
            }
            this.b = f;
        } else {
            try {
                f = Float.parseFloat(str);
            } catch (Exception unused2) {
            }
            this.b = f;
            this.a = (char) 0;
        }
    }

    public int a(int i, int i2) {
        if (this.b == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        char c = this.a;
        if (c == 'e') {
            return a(i);
        }
        if (c == 'f') {
            return a(i2);
        }
        return e();
    }

    public boolean a() {
        char c = this.a;
        return c == 'e' || c == 'b' || c == 'g';
    }

    public final int a(int i) {
        if (i == 0) {
            return 0;
        }
        return (int) (((double) ((this.b * i) / 100.0f)) + 0.5d);
    }
}
