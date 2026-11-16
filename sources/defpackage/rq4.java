package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class rq4 extends xu {
    public final /* synthetic */ int f;
    public final /* synthetic */ uq4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq4(uq4 uq4Var, int i) {
        super(uq4Var);
        this.f = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(uq4Var);
                this.g = uq4Var;
                super(uq4Var);
                break;
            case 2:
                Objects.requireNonNull(uq4Var);
                this.g = uq4Var;
                super(uq4Var);
                break;
            default:
                Objects.requireNonNull(uq4Var);
                this.g = uq4Var;
                break;
        }
    }

    @Override // defpackage.xu
    public final Object b(int i) {
        int i2 = this.f;
        uq4 uq4Var = this.g;
        switch (i2) {
            case 0:
                return uq4Var.f()[i];
            case 1:
                return new tq4(uq4Var, i);
            default:
                return uq4Var.g()[i];
        }
    }
}
