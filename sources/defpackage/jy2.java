package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class jy2 {
    public static final a13 k = ns1.a("http://localhost");
    public String a;
    public boolean b;
    public int c;
    public ny2 d;
    public String e;
    public String f;
    public String g;
    public List h;
    public au1 i;
    public dw j;

    public jy2() {
        yt1.b.getClass();
        this.a = "";
        this.b = false;
        this.c = 0;
        this.d = null;
        this.e = null;
        this.f = null;
        Set set = ht.a;
        Charset charset = er.a;
        charset.getClass();
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        charsetEncoderNewEncoder.getClass();
        ht.f(nd4.d(charsetEncoderNewEncoder, "", 0, 0), new h0(sb, 7));
        this.g = sb.toString();
        ArrayList arrayList = new ArrayList(eu.f(gg0.a, 10));
        fg0 fg0Var = fg0.a;
        fg0Var.getClass();
        this.h = arrayList;
        bu1 bu1Var = new bu1(3);
        fg0Var.getClass();
        this.i = bu1Var;
        this.j = new dw((au1) bu1Var);
    }

    public final void a() {
        if (this.a.length() <= 0 && !c().a.equals("file")) {
            a13 a13Var = k;
            this.a = a13Var.a;
            if (this.d == null) {
                this.d = a13Var.g;
            }
            if (this.c == 0) {
                d(a13Var.b);
            }
        }
    }

    public final ny2 c() {
        ny2 ny2Var = this.d;
        if (ny2Var != null) {
            return ny2Var;
        }
        ny2 ny2Var2 = ny2.c;
        return ny2.c;
    }

    public final void d(int i) {
        if (i < 0 || i >= 65536) {
            ak1.n(pv1.k(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
        } else {
            this.c = i;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(256);
        fs1.b(this, sb);
        return sb.toString();
    }

    public final a13 b() {
        String strC;
        a();
        ny2 ny2Var = this.d;
        String str = this.a;
        int i = this.c;
        List list = this.h;
        ArrayList arrayList = new ArrayList(eu.f(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ht.c((String) it.next()));
        }
        yt1 yt1VarL = eu.l((au1) this.j.b);
        String strD = ht.d(0, 0, 15, this.g);
        String str2 = this.e;
        String strC2 = null;
        if (str2 != null) {
            strC = ht.c(str2);
        } else {
            strC = null;
        }
        String str3 = this.f;
        if (str3 != null) {
            strC2 = ht.c(str3);
        }
        boolean z = this.b;
        a();
        StringBuilder sb = new StringBuilder(256);
        fs1.b(this, sb);
        return new a13(ny2Var, str, i, arrayList, yt1VarL, strD, strC, strC2, z, sb.toString());
    }
}
