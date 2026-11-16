package defpackage;

import com.google.android.gms.internal.play_billing.zzo;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class mb4 {
    public static final mb4 b;
    public static final mb4 c;
    public final Throwable a;

    static {
        if (zzo.d) {
            c = null;
            b = null;
        } else {
            c = new mb4(null);
            b = new mb4(null);
        }
    }

    public mb4(CancellationException cancellationException) {
        this.a = cancellationException;
    }
}
