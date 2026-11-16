package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class gq2 extends t72 implements Runnable {
    public final long e;

    @Override // defpackage.o91
    public final String O() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.O());
        sb.append("(timeMillis=");
        return n30.o(sb, this.e, ')');
    }

    @Override // java.lang.Runnable
    public final void run() {
        ns1.r(this.c);
        p(new fq2("Timed out waiting for " + this.e + " ms", this));
    }

    public gq2(long j, fy fyVar) {
        super(fyVar, fyVar.getContext());
        this.e = j;
    }
}
