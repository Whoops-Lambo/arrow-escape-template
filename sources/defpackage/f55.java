package defpackage;

import com.google.android.gms.measurement.internal.zzpg;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f55 extends z45 {
    public boolean c;

    public abstract void w();

    public final void u() {
        if (this.c) {
            return;
        }
        e32.i("Not initialized");
    }

    public final void v() {
        if (this.c) {
            e32.i("Can't initialize twice");
            return;
        }
        w();
        this.b.s++;
        this.c = true;
    }

    public f55(zzpg zzpgVar) {
        super(zzpgVar);
        this.b.r++;
    }
}
