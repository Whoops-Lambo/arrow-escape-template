package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class fz0 extends ou1 {
    public static final tx g;
    public static final tx h;
    public static final tx i;
    public static final tx j;
    public static final tx k;
    public static final tx l;
    public static final tx m;
    public static final tx n;
    public static final tx o;
    public static final tx p;
    public static final tx q;
    public static final tx r;
    public static final tx s;
    public static final tx t;
    public static final tx u;
    public static final tx v;
    public static final tx w;
    public static final tx x;
    public final /* synthetic */ int e;
    public final boolean f;

    static {
        int i2 = 4;
        g = new tx("Before", i2);
        h = new tx("State", i2);
        i = new tx("After", i2);
        j = new tx("Before", i2);
        k = new tx("State", i2);
        l = new tx("Transform", i2);
        m = new tx("Render", i2);
        n = new tx("Send", i2);
        o = new tx("Receive", i2);
        p = new tx("Parse", i2);
        q = new tx("Transform", i2);
        r = new tx("State", i2);
        s = new tx("After", i2);
        t = new tx("Before", i2);
        u = new tx("State", i2);
        v = new tx("Monitoring", i2);
        w = new tx("Engine", i2);
        x = new tx("Receive", i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz0(int i2) {
        super(g, h, i);
        this.e = i2;
        switch (i2) {
            case 1:
                super(j, k, l, m, n);
                this.f = true;
                break;
            case 2:
                super(o, p, q, r, s);
                this.f = true;
                break;
            case 3:
                super(t, u, v, w, x);
                this.f = true;
                break;
            default:
                this.f = true;
                break;
        }
    }

    @Override // defpackage.ou1
    public final boolean d() {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f;
    }
}
