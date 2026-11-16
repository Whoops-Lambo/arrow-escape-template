package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class y70 {
    public Exception a;
    public long b;

    public final void a(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.a == null) {
            this.a = exc;
            this.b = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.b) {
            Exception exc2 = this.a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.a;
            this.a = null;
            throw exc3;
        }
    }
}
