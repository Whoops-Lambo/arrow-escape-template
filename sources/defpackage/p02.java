package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class p02 implements w43 {
    public boolean a = false;
    public boolean b = false;
    public wl0 c;
    public final o02 d;

    @Override // defpackage.w43
    public final w43 a(boolean z) {
        if (this.a) {
            throw new tg0("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.g(this.c, z ? 1 : 0, this.b);
        return this;
    }

    @Override // defpackage.w43
    public final w43 add(String str) {
        if (this.a) {
            throw new tg0("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.i(this.c, str, this.b);
        return this;
    }

    public p02(o02 o02Var) {
        this.d = o02Var;
    }
}
