package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class fr {
    public static final Charset a = StandardCharsets.US_ASCII;
    public static final Charset b = StandardCharsets.ISO_8859_1;
    public static final Charset c = StandardCharsets.UTF_8;
    public static final Charset d;
    public static final Charset e;

    static {
        Charset charset = StandardCharsets.UTF_16BE;
        d = StandardCharsets.UTF_16LE;
        e = StandardCharsets.UTF_16;
    }
}
