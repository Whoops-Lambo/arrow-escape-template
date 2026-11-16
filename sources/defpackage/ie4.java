package defpackage;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzez;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ie4 implements Runnable {
    public final long a;
    public final long b;
    public final boolean c;
    public final /* synthetic */ zzez d;

    public abstract void a();

    public void c() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzez zzezVar = this.d;
        if (zzezVar.f) {
            c();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            zzezVar.b(e, false, this.c);
            c();
        }
    }

    public ie4(zzez zzezVar, boolean z) {
        Objects.requireNonNull(zzezVar);
        this.d = zzezVar;
        Clock clock = zzezVar.a;
        this.a = clock.currentTimeMillis();
        this.b = clock.elapsedRealtime();
        this.c = z;
    }
}
