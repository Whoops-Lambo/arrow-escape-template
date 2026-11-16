package com.facebook.ads.redexgen.X;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Su, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2335Su {
    public static byte[] A06;
    public static String[] A07 = {"pSdLAabVJhqo7QB", "504ZY1AuKgNOiNBWtmEDc4VNIn9M1Am", "5Zl8ARr", "3vpm0W2HV", "koFPP", "dusBklPSZ06TUnBE7Ond9ns", "pdB1RHpxrB8GMHOKLZJpUDiRkcqMNya4", "7Flzf08JBPT5P838Pw8mNc"};
    public static final C2335Su A08;

    @Nullable
    public AbstractC2442Xg A01;

    @Nullable
    public Boolean A02;
    public volatile Map<String, Set<InterfaceC2328Sn>> A04 = new HashMap();
    public final C2334St A03 = new C2334St(this);
    public int A00 = 0;
    public volatile long A05 = -1;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        byte[] bArr = {50, 42, 57, 38, -13, 41, 38, 59, -10, 41, -13, 38, 59, -10, -13, 41, 42, 40, 52, 41, 42, 55};
        String[] strArr = A07;
        if (strArr[7].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A07[5] = "AysKoXJUbI28ptcFU7Ec0EF";
        A06 = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0082 A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #3 {all -> 0x009f, blocks: (B:41:0x0078, B:44:0x007e, B:46:0x0082), top: B:56:0x0078 }] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0C(boolean z, C2438Xc c2438Xc, EnumC2443Xh enumC2443Xh, String str, InterfaceC2328Sn interfaceC2328Sn) {
        if (A0I(z, c2438Xc) && A0G(str, c2438Xc)) {
            boolean z2 = true;
            synchronized (this) {
                if (this.A00 < c2438Xc.A07) {
                    Set<InterfaceC2328Sn> setA06 = this.A04.get(str);
                    if (setA06 == null) {
                        setA06 = A06();
                        this.A04.put(str, setA06);
                    }
                    if (setA06.contains(interfaceC2328Sn)) {
                        z2 = false;
                    } else if (((z && c2438Xc.A0T) || (!z && c2438Xc.A0R)) && setA06.size() < c2438Xc.A06) {
                        setA06.add(interfaceC2328Sn);
                        this.A00++;
                        z2 = false;
                    }
                }
                if (!z2) {
                    try {
                        try {
                            this.A05 = SystemClock.elapsedRealtime();
                            interfaceC2328Sn.reset();
                            A03().A09(enumC2443Xh, interfaceC2328Sn.hashCode());
                            this.A05 = -1L;
                            return;
                        } catch (Throwable th) {
                            this.A05 = -1L;
                            throw th;
                        }
                    } catch (IllegalStateException unused) {
                        A0B(str, interfaceC2328Sn);
                        this.A05 = -1L;
                        if (c2438Xc.A0Y) {
                            interfaceC2328Sn.stop();
                        } else {
                            interfaceC2328Sn.stop();
                        }
                    }
                }
            }
        }
        try {
            if (c2438Xc.A0Y || (!z && !c2438Xc.A0X)) {
                interfaceC2328Sn.stop();
            }
        } finally {
            A03().A08(enumC2443Xh, interfaceC2328Sn.hashCode());
            interfaceC2328Sn.AIp();
            A03().A07(enumC2443Xh, interfaceC2328Sn.hashCode());
        }
    }

    static {
        A08();
        A08 = new C2335Su();
    }

    private InterfaceC2328Sn A01(boolean z, C2438Xc c2438Xc, EnumC2443Xh enumC2443Xh, String str) throws Exception {
        if (A0I(z, c2438Xc) && A0G(str, c2438Xc)) {
            synchronized (this) {
                Set<InterfaceC2328Sn> set = this.A04.get(str);
                if (set != null && !set.isEmpty()) {
                    this.A00--;
                    Iterator<InterfaceC2328Sn> it = set.iterator();
                    InterfaceC2328Sn ret = it.next();
                    it.remove();
                    A03().A0A(z, str, enumC2443Xh, ret.hashCode());
                    return ret;
                }
            }
        }
        try {
            C2444Xi c2444XiA05 = A03().A05(z, str, enumC2443Xh);
            InterfaceC2328Sn interfaceC2328SnA03 = this.A03.A03(z, str);
            A03().A06(c2444XiA05, interfaceC2328SnA03.hashCode());
            return interfaceC2328SnA03;
        } catch (Exception e) {
            throw new C2445Xj(str, e);
        }
    }

    public static C2335Su A02() {
        return A08;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC2442Xg A03() {
        if (this.A01 != null) {
            return this.A01;
        }
        return A8.A02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<InterfaceC2328Sn> A06() {
        if (this.A02 != null && this.A02.booleanValue()) {
            return new CopyOnWriteArraySet();
        }
        return new HashSet();
    }

    private void A09(AbstractC2442Xg abstractC2442Xg) {
        if (this.A01 == null) {
            this.A01 = abstractC2442Xg;
        }
    }

    private void A0A(C2438Xc c2438Xc) {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A02 = Boolean.valueOf(c2438Xc.A0Z);
                    if (this.A02.booleanValue()) {
                        this.A04 = new ConcurrentHashMap();
                    }
                }
            }
        }
    }

    private void A0B(String str, InterfaceC2328Sn interfaceC2328Sn) {
        Set<InterfaceC2328Sn> set = this.A04.get(str);
        if (set != null && set.remove(interfaceC2328Sn)) {
            this.A00--;
        }
    }

    public static boolean A0E(String str) {
        return str.equals(A05(0, 22, 127));
    }

    public static boolean A0G(String str, C2438Xc c2438Xc) {
        if (!A0E(str)) {
            return true;
        }
        boolean z = c2438Xc.A0D;
        if (A07[5].length() != 23) {
            throw new RuntimeException();
        }
        A07[5] = "nwAzwGEiO0ZIWdxLaYMsKGp";
        if (z) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0I(boolean z, C2438Xc c2438Xc) {
        if (c2438Xc.A0F && this.A05 != -1) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.A05;
            String[] strArr = A07;
            if (strArr[3].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "0y00mGdSc";
            strArr2[1] = "YbKfGYgoQHCL7FNckkRcEOTrXyIiST7";
            if (jElapsedRealtime - j > 5000) {
                return false;
            }
        }
        return A0J(z, c2438Xc);
    }

    public static boolean A0J(boolean z, C2438Xc c2438Xc) {
        return (z && c2438Xc.A0T) || (!z && c2438Xc.A0R);
    }

    public final InterfaceC2328Sn A0K(boolean z, C2438Xc c2438Xc, AbstractC2442Xg abstractC2442Xg, EnumC2443Xh enumC2443Xh, String str) throws C2445Xj {
        A09(abstractC2442Xg);
        A0A(c2438Xc);
        if (c2438Xc.A0O) {
            return this.A03.A02(z, c2438Xc, enumC2443Xh, str);
        }
        return A01(z, c2438Xc, enumC2443Xh, str);
    }

    public final void A0L(boolean z, C2438Xc c2438Xc, AbstractC2442Xg abstractC2442Xg, EnumC2443Xh enumC2443Xh, String str, InterfaceC2328Sn interfaceC2328Sn) throws Throwable {
        A09(abstractC2442Xg);
        if (c2438Xc.A0O) {
            this.A03.A0A(z, c2438Xc, enumC2443Xh, str, interfaceC2328Sn);
        } else {
            A0C(z, c2438Xc, enumC2443Xh, str, interfaceC2328Sn);
        }
    }
}
