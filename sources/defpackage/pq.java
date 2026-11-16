package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class pq {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public pq() {
        this.a = 0;
        this.c = new g8();
    }

    public char[] b(int i) {
        char[] cArr;
        synchronized (this) {
            g8 g8Var = (g8) this.c;
            cArr = null;
            char[] cArr2 = (char[]) (g8Var.isEmpty() ? null : g8Var.removeLast());
            if (cArr2 != null) {
                this.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        return cArr == null ? new char[i] : cArr;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return String.format("%s(0x%04x)", (String) this.c, Integer.valueOf(this.b));
            default:
                return super.toString();
        }
    }

    public void a(char[] cArr) {
        cArr.getClass();
        synchronized (this) {
            int i = this.b;
            if (cArr.length + i < k8.a) {
                this.b = i + cArr.length;
                ((g8) this.c).addLast(cArr);
            }
        }
    }

    public pq(String str, int i) {
        this.a = 1;
        this.c = str;
        this.b = i;
    }
}
