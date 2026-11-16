package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3183kz {
    public static InterfaceC2709dD A0A;
    public static List<String> A0B;
    public static byte[] A0C;
    public static String[] A0D = {"8gkZjHnxCvZyg7TzwjjGeSdvls9L7Gam", "fcbSC3ja3K2jNylkxCBC51G6bXitMdQ0", "2foOCT", "ocB0m3", "KfMQJM794wt5IuG", "feDb68pnVWWOEqV45c", "KnEa0S3Tnigt4irEXno07XBXpnYxFsFq", "aK1UKkDbG3zR1xh0x3umKxUvmkPLseuR"};
    public static final String A0E;
    public static final Map<String, C2715dJ> A0F;
    public static final Map<String, C3185l1> A0G;
    public long A00;
    public C3329nO A01;
    public final C3184l0 A03;
    public final C3192lA A04;
    public final boolean A08;
    public final boolean A09;
    public final Map<String, Bitmap> A07 = Collections.synchronizedMap(new HashMap());
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final List<Callable<Boolean>> A05 = new ArrayList();
    public final List<Callable<Boolean>> A06 = new ArrayList();

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 10);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static AtomicBoolean A0D(ArrayList<Callable<Boolean>> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<Callable<Boolean>> it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A0D;
            if (strArr[3].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0D[5] = "";
            if (!zHasNext) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                try {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Boolean bool = (Boolean) ((Future) it2.next()).get();
                        atomicBoolean.set(atomicBoolean.get() && bool != null && bool.booleanValue());
                    }
                } catch (InterruptedException | ExecutionException e) {
                    Log.e(A0E, A08(86, 42, 61), e);
                    atomicBoolean.set(false);
                }
                return atomicBoolean;
            }
            arrayList2.add(ExecutorC3528qh.A02().submit(it.next()));
        }
    }

    public static void A0F() {
        A0C = new byte[]{124, 125, 125, 125, -81, -82, -128, 127, 109, 107, -104, -105, 110, -104, 103, 103, 84, -126, 80, 126, 77, 86, 126, 81, -119, -89, -87, -82, -85, 102, -71, -70, -89, -72, -70, -85, -86, 116, -113, -83, -81, -76, -75, -70, -77, 108, -81, -69, -71, -68, -72, -79, -64, -79, 127, -99, -97, -92, -91, -86, -93, 92, -94, -99, -91, -88, -95, -96, 100, -126, -124, -119, -118, -113, -120, 65, -108, -107, -126, -109, -107, -122, -123, 79, 79, 79, -116, -65, -86, -84, -73, -69, -80, -74, -75, 103, -66, -81, -80, -77, -84, 103, -84, -65, -84, -86, -68, -69, -80, -75, -82, 103, -86, -88, -86, -81, -84, 103, -85, -74, -66, -75, -77, -74, -88, -85, -70, 117, -79, -81, -79, -74, -77, -111, -67, -69, -66, -70, -77, -62, -73, -67, -68, -106, -67, -67, -71, 120, 118, 120, 125, 122, 91, 118, 126, -127, -118, -121, 122, 93, -124, -124, -128, -120, -101, -120, -122, -104, -105, -120, -24, -21, -35, -32, -27, -24, -38, -35, -40, -19, -30, -26, -34, -40, -26, -20, -96, -107, -100, -92};
    }

    static {
        A0F();
        A0E = C3183kz.class.getSimpleName();
        A0F = Collections.synchronizedMap(new HashMap());
        A0G = Collections.synchronizedMap(new HashMap());
    }

    public C3183kz(C3192lA c3192lA) {
        this.A04 = c3192lA;
        this.A03 = C3184l0.A06(c3192lA.A02());
        this.A08 = C3300mv.A2t(c3192lA);
        this.A09 = C3300mv.A32(c3192lA, C2673cd.A03());
    }

    public static synchronized InterfaceC2709dD A03(C2054Hh c2054Hh) {
        if (A0A == null) {
            A0A = AbstractC2710dE.A00(c2054Hh, new C2716dK().A00(C3300mv.A04(c2054Hh)).A02(c2054Hh.A05().AB6()).A01(-1).A03(C3300mv.A0o(c2054Hh)).A04(C3300mv.A31(c2054Hh)).A05(), A05(c2054Hh));
        }
        return A0A;
    }

    public static C2715dJ A04(C3192lA c3192lA, String str) {
        C2715dJ c2715dJ = A0F.get(str);
        if (C3186l2.A06(c3192lA) && c2715dJ != null) {
            C2715dJ storedCacheData = new C2715dJ(c2715dJ);
            return storedCacheData;
        }
        C2715dJ storedCacheData2 = new C2715dJ(str);
        return storedCacheData2;
    }

    public static C2059Hm A05(C2054Hh c2054Hh) {
        return new C2059Hm(c2054Hh);
    }

    public static synchronized List<String> A09(C3192lA c3192lA) {
        if (A0B == null) {
            A0B = new ArrayList();
            A0J(A0B, c3192lA);
        }
        return A0B;
    }

    public static void A0H(C3192lA c3192lA, String str) {
        C3185l1 c3185l1;
        if (C3186l2.A06(c3192lA) && !TextUtils.isEmpty(str) && (c3185l1 = A0G.get(str)) != null) {
            c3185l1.A00 = A08(186, 4, 35);
            C2054Hh c2054HhA02 = c3192lA.A02();
            C2659cP c2659cPA06 = C2659cP.A06(c2054HhA02);
            String strA09 = C2659cP.A09(c2054HhA02, AbstractC3448pP.A00(str));
            if (strA09 == null) {
                strA09 = str;
            }
            C3186l2.A04(c3192lA, c3185l1, c2659cPA06.A0J(strA09));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(EnumC3328nN enumC3328nN) {
        if (this.A01 == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(A08(174, 12, 111), C3513qS.A05(this.A00));
        this.A01.A04(enumC3328nN, map);
    }

    public static void A0J(List<String> cacheDirs, C3192lA c3192lA) {
        A0K(cacheDirs, NI.A01(c3192lA));
        A0K(cacheDirs, C3184l0.A07(c3192lA));
    }

    public static void A0K(List<String> list, File file) {
        String path;
        if (file == null || (path = file.getPath()) == null) {
            return;
        }
        String[] strArr = A0D;
        String str = strArr[3];
        String path2 = strArr[2];
        if (str.length() != path2.length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[3] = "Vghlgc";
        strArr2[2] = "qwUey9";
        String path3 = A08(0, 0, 127);
        if (path != path3) {
            String path4 = path.toLowerCase(Locale.getDefault());
            list.add(path4);
        }
    }

    public final float A0M(String str) {
        return this.A03.A0E(str);
    }

    public final Bitmap A0N(String str) {
        return this.A07.get(str);
    }

    public final Bitmap A0O(String str, int i, int i2) {
        if (this.A08) {
            C2715dJ c2715dJA04 = A04(this.A04, str);
            c2715dJA04.A03 = A08(186, 4, 35);
            c2715dJA04.A01 = i2;
            c2715dJA04.A00 = i;
            return A03(this.A04.A02()).AJw(c2715dJA04, true).A00();
        }
        return this.A03.A0G(this.A04, str, i, i2, A08(170, 4, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE));
    }

    public final File A0P(String str) {
        C2715dJ c2715dJA04 = A04(this.A04, str);
        c2715dJA04.A03 = A08(186, 4, 35);
        return A03(this.A04.A02()).AJx(c2715dJA04);
    }

    public final File A0Q(String str) {
        if (this.A08) {
            return A0P(str);
        }
        return this.A03.A0H(str);
    }

    public final String A0R(String str) {
        if (this.A08) {
            return A0S(str);
        }
        return this.A03.A0I(str);
    }

    public final String A0S(String str) {
        C2715dJ c2715dJA04 = A04(this.A04, str);
        c2715dJA04.A03 = A08(186, 4, 35);
        String strAJz = A03(this.A04.A02()).AJz(c2715dJA04);
        return strAJz != null ? strAJz : str;
    }

    public final String A0T(String str) {
        if (this.A09) {
            A0H(this.A04, str);
            return str;
        }
        return A0S(str);
    }

    public final void A0U() {
        AbstractC3370o5.A05(A08(128, 19, 68), A08(38, 16, 66), A08(0, 8, 64));
    }

    public final void A0V() {
        AbstractC3370o5.A05(A08(147, 16, 11), A08(54, 14, 50), A08(16, 8, 19));
    }

    public final void A0W() {
        this.A07.clear();
    }

    public final void A0X(InterfaceC3175kr interfaceC3175kr, C3176ks c3176ks) {
        AbstractC3370o5.A05(A08(163, 7, 25), A08(68, 18, 23), A08(8, 8, 44));
        this.A00 = System.currentTimeMillis();
        C3186l2.A02(this.A04, c3176ks, C3186l2.A07, A08(24, 14, 60), -1L);
        ExecutorC3528qh.A03().execute(new C2060Hn(this, new ArrayList(this.A05), c3176ks, interfaceC3175kr, new ArrayList(this.A06)));
        this.A05.clear();
        this.A06.clear();
    }

    public final void A0Y(C3179kv c3179kv) {
        this.A05.add(new CallableC3180kw(this, c3179kv));
    }

    public final void A0Z(C3179kv c3179kv) {
        c3179kv.A05 = true;
        this.A06.add(new CallableC3180kw(this, c3179kv));
    }

    public final void A0a(C3179kv c3179kv) {
        c3179kv.A05 = true;
        if (this.A09) {
            this.A06.add(new CallableC3178ku(this, c3179kv));
        } else {
            this.A06.add(new CallableC3180kw(this, c3179kv));
        }
    }

    public final void A0b(C3179kv c3179kv) {
        if (this.A09) {
            this.A05.add(new CallableC3178ku(this, c3179kv));
        } else {
            this.A05.add(new CallableC3180kw(this, c3179kv));
        }
    }

    public final void A0c(C3181kx c3181kx) {
        CallableC3182ky callableC3182ky = new CallableC3182ky(this, c3181kx);
        if (!c3181kx.A03) {
            this.A05.add(callableC3182ky);
        } else {
            this.A06.add(callableC3182ky);
        }
    }

    public final void A0d(C3181kx c3181kx) {
        c3181kx.A03 = true;
        A0c(c3181kx);
    }

    public final void A0e(C3329nO c3329nO) {
        this.A01 = c3329nO;
    }
}
