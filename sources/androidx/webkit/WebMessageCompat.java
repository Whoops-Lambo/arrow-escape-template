package androidx.webkit;

import androidx.annotation.RestrictTo;
import defpackage.jc1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class WebMessageCompat {
    public final String a;
    public final int b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Type {
    }

    public final String a() {
        String str;
        int i = this.b;
        if (i == 0) {
            return this.a;
        }
        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        if (i != 0) {
            str = i != 1 ? "Unknown" : "ArrayBuffer";
        } else {
            str = "String";
        }
        throw new IllegalStateException(jc1.o(str, " expected, but got ", sb, "String"));
    }

    public WebMessageCompat(byte[] bArr, WebMessagePortCompat[] webMessagePortCompatArr) {
        Objects.requireNonNull(bArr);
        this.a = null;
        this.b = 1;
    }

    public WebMessageCompat(String str, WebMessagePortCompat[] webMessagePortCompatArr) {
        this.a = str;
        this.b = 0;
    }
}
