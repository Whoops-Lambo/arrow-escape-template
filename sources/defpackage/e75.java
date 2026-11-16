package defpackage;

import android.os.StrictMode;
import com.google.android.gms.internal.measurement.zzrh;
import com.google.android.gms.internal.measurement.zzrl;
import java.util.Iterator;
import java.util.ServiceLoader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class e75 {
    public static final zzrl a;

    static {
        zzrl zzrhVar;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Iterator it = ServiceLoader.load(zzrl.class, zzrl.class.getClassLoader()).iterator();
            if (it.hasNext()) {
                zzrhVar = (zzrl) it.next();
                fs1.n("Expected at most one FlagsService", !it.hasNext());
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            } else {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                zzrhVar = new zzrh();
            }
            a = zzrhVar;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }
}
