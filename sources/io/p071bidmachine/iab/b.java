package io.p071bidmachine.iab;

import android.text.TextUtils;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static final b c = new b(1, "No internet connection");
    public final int a;
    public final String b;

    public static b a(String str) {
        return new b(0, str);
    }

    public static b b(String str, Throwable th) {
        try {
            StringBuilder sb = new StringBuilder(str);
            sb.append(" - ");
            sb.append(th.getClass().getName());
            String message = th.getMessage();
            if (!TextUtils.isEmpty(message)) {
                sb.append(": ");
                sb.append(message);
            }
            return a(sb.toString());
        } catch (Throwable unused) {
            return a(str);
        }
    }

    public final String toString() {
        return q63.f(this.a, "(", ") ", this.b);
    }

    public b(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
