package defpackage;

import com.google.android.gms.measurement.internal.zzic;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class i05 extends wt0 {
    public boolean b;

    public abstract boolean u();

    public final void v() {
        if (this.b) {
            return;
        }
        e32.i("Not initialized");
    }

    public final void w() {
        if (this.b) {
            e32.i("Can't initialize twice");
        } else {
            if (u()) {
                return;
            }
            ((zzic) this.a).C.incrementAndGet();
            this.b = true;
        }
    }

    public i05(zzic zzicVar) {
        super(zzicVar);
        ((zzic) this.a).A++;
    }
}
