package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b92 {
    public static final tx b;
    public static final tx c;
    public static final tx d;
    public static final tx e;
    public static final int a = wz2.Z(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");
    public static final int f = wz2.Z(16, 12, "kotlinx.coroutines.semaphore.segmentSize");

    static {
        int i = 8;
        b = new tx("PERMIT", i);
        c = new tx("TAKEN", i);
        d = new tx("BROKEN", i);
        e = new tx("CANCELLED", i);
    }
}
