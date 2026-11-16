package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.e32;
import defpackage.q63;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C4652y {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public volatile C0733 f525;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public C0773 f526;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public Context f527;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final C0726 f528;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final C1305 f529;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final C1048 f530;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final C1099 f531;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C0884 f532;

    public C4652y(C0884 c0884) {
        C1099 c1099 = new C1099();
        this.f525 = new C0733(new C0754());
        this.f532 = c0884;
        this.f531 = c1099;
        C1048 c1048 = new C1048();
        this.f530 = c1048;
        this.f529 = new C1305(c1099, c1048, c0884);
        this.f528 = new C0726();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C0733 m448() {
        C0999 c0999;
        C0824 c0824;
        HashMap map;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        int i;
        int i2;
        C0773 c0773 = this.f526;
        if (c0773 == null) {
            e32.i(StringFog.decrypt("SWUGk2erwKo8Si22BK3cpmhNI65NvterMgQBo0iokqZyTTarRajbtXkMIa1KsNe3aA1ipE22wbsy\n", "HCRCwiTEss8=\n"));
            return null;
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i3 = 1;
        try {
            try {
                C0939 c0939 = c0773.f2040;
                Context context = c0773.f2041;
                c0939.getClass();
                c0999 = C0939.m704(context);
                while (true) {
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    InterfaceC0759 interfaceC0759 = (InterfaceC0759) it.next();
                    try {
                        C1071 c1071Mo569 = interfaceC0759.mo569();
                        i2 = i3;
                        try {
                            arrayList3.add(new C0775(interfaceC0759.getName(), c1071Mo569));
                            arrayList5.addAll(c1071Mo569.f3095);
                            if (!c1071Mo569.f3096 && c1071Mo569.f3093 != null) {
                                arrayList4.add(interfaceC0759.getName() + StringFog.decrypt("Bc8=\n", "P++q3jxt1eQ=\n") + c1071Mo569.f3093);
                            }
                            if (c1071Mo569.f3094 != null) {
                                map.put(interfaceC0759.getName(), c1071Mo569.f3094);
                            }
                            interfaceC0759.getName();
                            for (Integer num : c1071Mo569.f3095) {
                                int iIntValue = num.intValue();
                                if (iIntValue != 30 && iIntValue != 31 && iIntValue != 33 && iIntValue != 32 && iIntValue != 40 && iIntValue != 42 && iIntValue != 44 && iIntValue != 41) {
                                    if (iIntValue == 63 || iIntValue == 64 || iIntValue == 61 || iIntValue == 62 || iIntValue == 60) {
                                        arrayList.add(num);
                                    } else if (iIntValue >= 50 && iIntValue <= 56) {
                                        arrayList2.add(num);
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            arrayList4.add(interfaceC0759.getName() + StringFog.decrypt("u/M=\n", "gdNqhTAzkOo=\n") + e.getMessage());
                            arrayList3.add(new C0775(interfaceC0759.getName(), new C1071(false, Collections.EMPTY_LIST, null, null)));
                        }
                    } catch (Exception e2) {
                        e = e2;
                        i2 = i3;
                    }
                    i3 = i2;
                }
            } catch (Exception e3) {
                arrayList4.add(StringFog.decrypt("J+MEyD4xP2Mc/x/VFSdwMQ==\n", "dYxrvHZUShE=\n") + e3.getMessage());
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(7);
                c0999 = new C0999(true, true, arrayList6);
            }
            C0822 c0822 = c0773.f2039;
            Context context2 = c0773.f2041;
            c0822.getClass();
            c0824 = C0822.m623(context2);
        } catch (Exception e4) {
            arrayList4.add(StringFog.decrypt("Uq/kxltafIx1tfbGQEB/oX605dtaW3iKaPu3\n", "G8GXsikvEek=\n") + e4.getMessage());
            ArrayList arrayList7 = new ArrayList();
            arrayList7.add(21);
            c0824 = new C0824(true, true, true, true, arrayList7);
        }
        arrayList5.addAll(c0999.f2841);
        arrayList5.addAll(c0824.f2190);
        map = new HashMap();
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
        arrayList3 = new ArrayList();
        it = c0773.f2038.iterator();
        int i4 = i3;
        boolean z = c0999.f2843;
        boolean z2 = c0999.f2842;
        boolean z3 = c0824.f2194;
        boolean z4 = c0824.f2193;
        boolean z5 = c0824.f2192;
        boolean z6 = c0824.f2191;
        int iIntValue2 = !z ? 1 : 0;
        if (!z2) {
            iIntValue2++;
        }
        if (!z3 && !z4 && !z5 && !z6) {
            iIntValue2 += 2;
        }
        int size = arrayList3.size();
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            C0775 c0775 = (C0775) obj;
            if (c0775.f2050.f3096) {
                Integer num2 = (Integer) C0773.f2036.get(c0775.f2051);
                iIntValue2 += num2 != null ? num2.intValue() : i4;
            }
        }
        C0754 c0754 = new C0754();
        c0754.f2000 = iIntValue2;
        c0754.f1999 = arrayList;
        c0754.f1998 = arrayList2;
        c0754.f1997 = map;
        c0754.f1996 = arrayList5;
        c0754.f1995 = arrayList4;
        C0733 c0733 = new C0733(c0754);
        this.f525 = c0733;
        return c0733;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m449(Context context) {
        this.f527 = context.getApplicationContext();
        Context context2 = this.f527;
        C1095 c1095 = new C1095(this.f527);
        C0876 c0876 = new C0876(this.f527);
        Context context3 = this.f527;
        this.f526 = new C0773(context2, Arrays.asList(c1095, c0876, new C1304(context3), new C0676(context3)));
        m448();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] m450(byte[] bArr, String str) {
        C0726 c0726 = this.f528;
        C1195 c1195 = (C1195) c0726.f1917.remove(str);
        if (c1195 == null || System.currentTimeMillis() - c1195.f3599 > c0726.f1918) {
            c1195 = null;
        }
        if (c1195 != null) {
            return AbstractC1183.m870(bArr, c1195, this.f531);
        }
        e32.i(q63.i("atodCpk+BPxL2x0fkzgZ8QTTUgvcPxLkUdBODbUpTbU=\n", "JLU9efxNd5U=\n", str));
        return null;
    }
}
