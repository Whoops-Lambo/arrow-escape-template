package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3257mE {
    public static String A00;
    public static EnumC3478pt A01;
    public static byte[] A02;
    public static String[] A03 = {"pgH9SdtSFWTXX0l", "vxegEtvJMZ23RgjyHpc", "ulS7n8X7nNx1Irtm69lPCCFagtwQ2KXJ", "SMp4Mt4DU3EtKobKtaKcK4J1Rc2yK13N", "2t39yg7rltV6biRCRlaAvBIZnsjhSKww", "tY1PV27PV17ox8mww3so5aazg5RDJQQX", "2fotvTqtzlir49zwNSe", "KHZMFPmOyKnxl7a"};
    public static final Map<String, Integer> A04;
    public static final AtomicInteger A05;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A02 = new byte[]{-87, -56, -51, -41};
    }

    static {
        A05();
        A00 = null;
        A05 = new AtomicInteger(0);
        A04 = new HashMap();
    }

    public static synchronized EnumC3478pt A00(C3192lA c3192lA) {
        if (A01 == null) {
            A01 = AbstractC3479pu.A00(c3192lA);
        }
        return A01;
    }

    public static Integer A01(String str) {
        synchronized (A04) {
            Integer num = A04.get(str);
            if (num == null) {
                return 0;
            }
            return num;
        }
    }

    public static void A06(C3192lA c3192lA, String str, Map<String, String> params) {
        String strA03;
        if (A0A(c3192lA)) {
            strA03 = C3427p1.A03(str);
        } else {
            strA03 = A00;
        }
        if (strA03 != null) {
            String fingerprint = A02(1, 3, 55);
            params.put(fingerprint, strA03);
        }
    }

    public static void A07(C3192lA c3192lA, boolean z) throws Exception {
        if (!A05.compareAndSet(0, 1)) {
            return;
        }
        A00(c3192lA);
        try {
            SharedPreferences sharedPreferencesA00 = AbstractC3394oU.A00(c3192lA);
            C3234lq c3234lq = new C3234lq(c3192lA);
            String str = Build.FINGERPRINT + A02(0, 1, 30) + c3234lq.A06();
            A00 = sharedPreferencesA00.getString(str, null);
            FutureTask futureTask = new FutureTask(new CallableC3256mD(c3192lA, c3234lq, sharedPreferencesA00, str));
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (Exception unused) {
            AtomicInteger atomicInteger = A05;
            String[] strArr = A03;
            if (strArr[1].length() != strArr[6].length()) {
                Exception e = new RuntimeException();
                throw e;
            }
            String[] strArr2 = A03;
            strArr2[7] = "qnCKfAZ4ZrzI6TW";
            strArr2[0] = "3RwSqq6UclGHbC0";
            atomicInteger.set(0);
        }
    }

    public static void A08(C3192lA c3192lA, boolean z, String str) throws Exception {
        if (A0A(c3192lA)) {
            A09(c3192lA, z, str);
        } else {
            A07(c3192lA, z);
        }
    }

    public static void A09(C3192lA c3192lA, boolean z, String str) {
        if (str == null) {
            str = c3192lA.getPackageName();
        }
        if (A0B(str)) {
            return;
        }
        A00(c3192lA);
        C3427p1 c3427p1 = new C3427p1(c3192lA, str);
        try {
            c3427p1.A06();
            FutureTask futureTask = new FutureTask(new CallableC3255mC(c3427p1, str));
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (Exception unused) {
            synchronized (A04) {
                A04.put(str, 0);
            }
        }
    }

    public static boolean A0A(C3192lA c3192lA) {
        return ProcessUtils.isRemoteRenderingProcess() || C3300mv.A2w(c3192lA);
    }

    public static boolean A0B(String str) {
        synchronized (A04) {
            int status = A01(str).intValue();
            if (status != 0) {
                return true;
            }
            A04.put(str, 1);
            return false;
        }
    }
}
