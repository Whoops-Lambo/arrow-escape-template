package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ov, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3421ov {
    public static String[] A01 = {"vWOWhJ9TqiA1ty478f", "MWb8A3Nd6tPLcAimCp0hVAmYX6QHiaZm", "Xd3YBUkiMhOleC4V056rVyOXhinwtSii", "tT8mJINbcEXXPPmKiWyTepfA0JHaFg93", "WoudJsrKOqRuVhNYSdRTZjqc00A0B3WY", "YTheXaZSxrm1KPF5Yd", "huHeChgRkwF7QVPgKoMeW6tLhEc13T9K", "ASVM8zHOtJrSOKsDwpZwweqDqvgS8KFW"};
    public static final ThreadLocal<C3421ov> A02 = new ThreadLocal<>();
    public final C3404oe A00 = new C3404oe();

    public static C3404oe A00() {
        return A02().A00;
    }

    public static C3404oe A01(C3420ou c3420ou) {
        C3404oe currentStackTraces = new C3404oe(A00());
        currentStackTraces.add(c3420ou);
        return currentStackTraces;
    }

    public static C3421ov A02() {
        C3421ov c3421ov = A02.get();
        String[] strArr = A01;
        if (strArr[6].charAt(1) == strArr[2].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "JnfSkSuIf6osqUQGv4Nkh0Vi2QZsQFPV";
        strArr2[4] = "e9u3CRl6fKpCeCDR9nRPR0cml03xK1Bs";
        if (c3421ov == null) {
            C3421ov c3421ov2 = new C3421ov();
            A02.set(c3421ov2);
            return c3421ov2;
        }
        return c3421ov;
    }

    public static void A03(AbstractRunnableC3416oq abstractRunnableC3416oq) {
        C3404oe c3404oeA06 = abstractRunnableC3416oq.A06();
        if (c3404oeA06 != null) {
            C3404oe createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(c3404oeA06);
        }
    }

    public static void A04(AbstractRunnableC3416oq abstractRunnableC3416oq) {
        C3404oe c3404oeA06 = abstractRunnableC3416oq.A06();
        if (c3404oeA06 != null) {
            C3404oe createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.removeAll(c3404oeA06);
        }
    }
}
