package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class h22 extends Exception {
    protected static final boolean a;
    protected static final StackTraceElement[] b;

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    static {
        a = System.getProperty("surefire.test.class.path") != null;
        b = new StackTraceElement[0];
    }
}
