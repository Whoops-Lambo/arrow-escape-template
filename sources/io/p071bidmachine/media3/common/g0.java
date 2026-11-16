package io.p071bidmachine.media3.common;

import androidx.annotation.Nullable;
import defpackage.nj;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class g0 extends IOException {
    public final boolean a;
    public final int b;

    public static g0 a(@Nullable String str, @Nullable Throwable th) {
        return new g0(str, th, true, 1);
    }

    public static g0 b(@Nullable String str, @Nullable Throwable th) {
        return new g0(str, th, true, 0);
    }

    public static g0 c(@Nullable String str, @Nullable Throwable th) {
        return new g0(str, th, true, 4);
    }

    public static g0 d(@Nullable String str) {
        return new g0(str, null, false, 1);
    }

    public g0(@Nullable String str, @Nullable Throwable th, boolean z, int i) {
        super(str, th);
        this.a = z;
        this.b = i;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String strConcat;
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        if (message != null) {
            strConcat = message.concat(" ");
        } else {
            strConcat = "";
        }
        sb.append(strConcat);
        sb.append("{contentIsMalformed=");
        sb.append(this.a);
        sb.append(", dataType=");
        return nj.l(this.b, "}", sb);
    }
}
