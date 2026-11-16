package defpackage;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzaum;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ew3 {
    public static final boolean c = zzaum.a;
    public final ArrayList a = new ArrayList();
    public boolean b = false;

    public final synchronized void a(long j, String str) {
        if (this.b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.a.add(new dw3(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        long j;
        this.b = true;
        ArrayList arrayList = this.a;
        int i = 0;
        if (arrayList.size() == 0) {
            j = 0;
        } else {
            j = ((dw3) arrayList.get(arrayList.size() - 1)).c - ((dw3) arrayList.get(0)).c;
        }
        if (j > 0) {
            long j2 = ((dw3) arrayList.get(0)).c;
            zzaum.b("(%-4d ms) %s", Long.valueOf(j), str);
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                dw3 dw3Var = (dw3) obj;
                long j3 = dw3Var.c;
                zzaum.b("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(dw3Var.b), dw3Var.a);
                j2 = j3;
            }
        }
    }

    public final void finalize() {
        if (this.b) {
            return;
        }
        b("Request on the loose");
        zzaum.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
