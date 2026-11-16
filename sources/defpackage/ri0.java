package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public enum ri0 implements pr1 {
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    public final int a;

    @Override // defpackage.pr1
    public final int getNumber() {
        return this.a;
    }

    ri0(int i) {
        this.a = i;
    }
}
