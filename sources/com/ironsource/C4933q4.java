package com.ironsource;

import defpackage.dk2;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.q4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4933q4 {

    @NotNull
    private final Throwable a;

    @NotNull
    private final String b;
    private final boolean c;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4933q4) && s71.b(this.a, ((C4933q4) obj).a);
    }

    public static /* synthetic */ C4933q4 a(C4933q4 c4933q4, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = c4933q4.a;
        }
        return c4933q4.a(th);
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final Throwable c() {
        return this.a;
    }

    public final boolean d() {
        return this.c;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return "CrashReportWrapper(throwable=" + this.a + ")";
    }

    public C4933q4(@NotNull Throwable th) {
        th.getClass();
        this.a = th;
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        sb.append(th.toString());
        sb.append(System.lineSeparator());
        boolean z = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append(";" + System.lineSeparator());
            String string = stackTraceElement.toString();
            string.getClass();
            String strE = C4950r4.d().e();
            strE.getClass();
            if (dk2.O(string, strE, false)) {
                z = true;
            }
        }
        Throwable cause = this.a.getCause();
        if (cause != null) {
            sb.append("--CAUSE");
            sb.append(System.lineSeparator());
            sb.append(cause.toString());
            sb.append(System.lineSeparator());
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            stackTrace2.getClass();
            for (StackTraceElement stackTraceElement2 : stackTrace2) {
                sb.append(stackTraceElement2.toString());
                sb.append(";" + System.lineSeparator());
                String string2 = stackTraceElement2.toString();
                string2.getClass();
                String strE2 = C4950r4.d().e();
                strE2.getClass();
                if (dk2.O(string2, strE2, false)) {
                    z = true;
                }
            }
        }
        this.b = sb.toString();
        this.c = z;
    }

    @NotNull
    public final C4933q4 a(@NotNull Throwable th) {
        th.getClass();
        return new C4933q4(th);
    }

    @NotNull
    public final Throwable a() {
        return this.a;
    }
}
