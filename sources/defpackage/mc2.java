package defpackage;

import io.p071bidmachine.media3.exoplayer.audio.f;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class mc2 {
    public boolean a;
    public boolean b;
    public boolean c;

    public /* synthetic */ mc2(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public f a() {
        if (this.a || !(this.b || this.c)) {
            return new f(this);
        }
        e32.i("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }
}
