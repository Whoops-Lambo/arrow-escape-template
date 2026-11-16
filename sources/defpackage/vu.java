package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vu extends xu {
    public final /* synthetic */ int f;
    public final /* synthetic */ av g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vu(av avVar, int i) {
        super(avVar);
        this.f = i;
        this.g = avVar;
    }

    @Override // defpackage.xu
    public final Object a(int i) {
        int i2 = this.f;
        av avVar = this.g;
        switch (i2) {
            case 0:
                return avVar.t()[i];
            case 1:
                return new yu(avVar, i);
            default:
                return avVar.x()[i];
        }
    }
}
