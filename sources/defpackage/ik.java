package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ik {
    public static final kq a = new kq(-1, null, null, 0);
    public static final int b = wz2.Z(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = wz2.Z(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final tx d;
    public static final tx e;
    public static final tx f;
    public static final tx g;
    public static final tx h;
    public static final tx i;
    public static final tx j;
    public static final tx k;
    public static final tx l;
    public static final tx m;
    public static final tx n;
    public static final tx o;
    public static final tx p;
    public static final tx q;
    public static final tx r;
    public static final tx s;

    static {
        int i2 = 8;
        d = new tx("BUFFERED", i2);
        e = new tx("SHOULD_BUFFER", i2);
        f = new tx("S_RESUMING_BY_RCV", i2);
        g = new tx("RESUMING_BY_EB", i2);
        h = new tx("POISONED", i2);
        i = new tx("DONE_RCV", i2);
        j = new tx("INTERRUPTED_SEND", i2);
        k = new tx("INTERRUPTED_RCV", i2);
        l = new tx("CHANNEL_CLOSED", i2);
        m = new tx("SUSPEND", i2);
        n = new tx("SUSPEND_NO_WAITER", i2);
        o = new tx("FAILED", i2);
        p = new tx("NO_RECEIVE_RESULT", i2);
        q = new tx("CLOSE_HANDLER_CLOSED", i2);
        r = new tx("CLOSE_HANDLER_INVOKED", i2);
        s = new tx("NO_CLOSE_CAUSE", i2);
    }

    public static final boolean a(oo ooVar, Object obj, as0 as0Var) {
        tx txVarJ = ooVar.j(obj, as0Var);
        if (txVarJ != null) {
            ooVar.n(txVarJ);
            return true;
        }
        return false;
    }
}
