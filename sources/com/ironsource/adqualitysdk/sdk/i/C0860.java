package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᓭ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0860 extends AbstractC1098 implements InterfaceC0867, InterfaceC0648 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final InterfaceC0867 f2281;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Object f2282;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Map f2283;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Collection f2284;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Field f2285;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static final String f2280 = StringFog.decrypt("ObDbp+ZgKJcTvtWL6GQC\n", "dtKxwoUUbv4=\n");

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static final String f2279 = StringFog.decrypt("rKHJ54SX4HY=\n", "y8S9seX7lRM=\n");

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static final String f2278 = StringFog.decrypt("TgHay5Am1Oc=\n", "PWSunfFKoYI=\n");

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static final String f2277 = StringFog.decrypt("A3Aan1IMtQ==\n", "agNc9jdg0Vs=\n");

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static final String f2276 = StringFog.decrypt("yDe4PGh1828=\n", "r1LMegEQnws=\n");

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static final String f2275 = StringFog.decrypt("4aFkMXix9Gb8u0gw\n", "iNInXhTdkQU=\n");

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static final String f2274 = StringFog.decrypt("cb0q0rICdvF1rDf+sw==\n", "Fthekd1uGpQ=\n");

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static final String f2273 = StringFog.decrypt("zNm9DmQ=\n", "parwbxSwX40=\n");

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static final String f2272 = StringFog.decrypt("xhXINDVy\n", "oXC8eVQCF0g=\n");

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static final String f2271 = StringFog.decrypt("weEwA7LjjTfS\n", "poREU9OR6Fk=\n");

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public static final String f2270 = StringFog.decrypt("aqp1T0KTM+pjrGQ=\n", "Dc8BBizgR4s=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0648
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo343(C1199 c1199, String str, ArrayList arrayList, C0752 c0752, C0890 c0890) {
        try {
            boolean z = true;
            switch (str.hashCode()) {
                case -2039060844:
                    if (str.equals(f2274)) {
                        return this.f2284;
                    }
                    break;
                case -1661939189:
                    if (str.equals(f2270)) {
                        return this.f2282;
                    }
                    break;
                case -1249356250:
                    if (str.equals(f2272)) {
                        return this.f2283;
                    }
                    break;
                case 100472786:
                    if (str.equals(f2273)) {
                        if (this.f2283 == null) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                    break;
                case 429960040:
                    if (str.equals(f2275)) {
                        if (this.f2284 == null) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                    break;
                case 700591008:
                    if (str.equals(f2271)) {
                        return this.f2281;
                    }
                    break;
                case 1406685743:
                    if (str.equals(f2278)) {
                        Object objM806 = AbstractC1098.m806(arrayList, 0, Object.class);
                        Field field = this.f2285;
                        if (field != null) {
                            try {
                                field.set(this.f2282, objM806);
                                break;
                            } catch (Exception unused) {
                            }
                        }
                        return null;
                    }
                    break;
                case 1953253188:
                    if (str.equals(f2276)) {
                        return this.f2285;
                    }
                    break;
                case 1967798203:
                    if (str.equals(f2279)) {
                        return m633();
                    }
                    break;
                case 2058833392:
                    if (str.equals(f2277)) {
                        if (this.f2285 == null) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                    break;
            }
            new C4607c0(c1199, c0890, f2280, str).m614(c1199.m877());
        } catch (Exception e) {
            AbstractC0914.m680(c1199.m877(), AbstractC1156.m868("gA==\n", "p1jOiEOglGo=\n", AbstractC0688.m577("tkumoNzhXSaaVbHvy7lPLYZNvaHJ4WUsmVy3u+ioTyKXcLm/wuFEL4dQoqqOrE86m1aw74k=\n", "8znUz67BKk4=\n", new StringBuilder(), str)), e, null);
        }
        return null;
    }

    public C0860(Field field, Object obj, InterfaceC0867 interfaceC0867) {
        this.f2285 = field;
        this.f2282 = obj;
        this.f2281 = interfaceC0867;
    }

    public C0860(Collection collection, Object obj, InterfaceC0867 interfaceC0867) {
        this.f2284 = collection;
        this.f2282 = obj;
        this.f2281 = interfaceC0867;
    }

    public C0860(Map map, Object obj, InterfaceC0867 interfaceC0867) {
        this.f2283 = map;
        this.f2282 = obj;
        this.f2281 = interfaceC0867;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object m633() {
        Field field = this.f2285;
        if (field != null) {
            try {
                return field.get(this.f2282);
            } catch (Exception unused) {
                return null;
            }
        }
        if (this.f2284 == null && this.f2283 == null) {
            return null;
        }
        return this.f2282;
    }
}
