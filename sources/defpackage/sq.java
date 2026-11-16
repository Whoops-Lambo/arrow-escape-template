package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class sq {
    public static final ur1 a;

    static {
        String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        a = property != null ? Boolean.parseBoolean(property) : false ? new rq() : new tk(4096, 1);
    }
}
