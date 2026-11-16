package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class v32 implements Serializable {
    public final String a;
    public final int b;

    private final Object readResolve() {
        Pattern patternCompile = Pattern.compile(this.a, this.b);
        patternCompile.getClass();
        return new w32(patternCompile);
    }

    public v32(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
