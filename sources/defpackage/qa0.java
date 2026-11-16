package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class qa0 extends us1 {
    public final rx a;
    public final long b;
    public final /* synthetic */ Object c;

    @Override // defpackage.vs1
    public final Long a() {
        return Long.valueOf(this.b);
    }

    @Override // defpackage.vs1
    public final rx b() {
        return this.a;
    }

    @Override // defpackage.us1
    public final byte[] d() {
        return (byte[]) this.c;
    }

    public qa0(rx rxVar, Object obj) {
        this.c = obj;
        if (rxVar == null) {
            rx rxVar2 = ox.a;
            rxVar = ox.b;
        }
        this.a = rxVar;
        this.b = ((byte[]) obj).length;
    }
}
