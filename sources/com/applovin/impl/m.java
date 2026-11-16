package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class m extends w2 {
    private final n e;
    private final o f;
    private final o8 g;
    private final String h;
    private final List i;
    private final List j;
    private final List k;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b extends e4 {
        private final o8 p;

        public b(o8 o8Var, String str, boolean z) {
            super(o8Var.b().d(), m.this.a);
            this.p = o8Var;
            this.c = StringUtils.createSpannedString(o8Var.b().a(), -16777216, 18, 1);
            this.d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.b = z;
        }

        @Override // com.applovin.impl.e4, com.applovin.impl.v2
        public boolean o() {
            return this.b;
        }

        public o8 v() {
            return this.p;
        }

        @Override // com.applovin.impl.v2
        public int g() {
            return -12303292;
        }
    }

    private List e() {
        o8 o8Var = this.g;
        if (o8Var != null && !o8Var.d()) {
            return new ArrayList();
        }
        List<o8> listA = this.f.a();
        ArrayList arrayList = new ArrayList(listA.size());
        for (o8 o8Var2 : listA) {
            o8 o8Var3 = this.g;
            if (o8Var3 == null || o8Var3.b().c().equals(o8Var2.b().c())) {
                arrayList.add(new b(o8Var2, o8Var2.a() != null ? o8Var2.a().a() : "", this.g == null));
            }
        }
        return arrayList;
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f.b() != null) {
            arrayList.add(f());
        }
        if (this.g != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private List l() {
        o8 o8Var = this.g;
        if (o8Var != null && o8Var.d()) {
            return new ArrayList();
        }
        List<o8> listE = this.f.e();
        ArrayList arrayList = new ArrayList(listE.size());
        for (o8 o8Var2 : listE) {
            o8 o8Var3 = this.g;
            if (o8Var3 == null || o8Var3.b().c().equals(o8Var2.b().c())) {
                arrayList.add(new b(o8Var2, null, this.g == null));
                for (f4 f4Var : o8Var2.c()) {
                    arrayList.add(v2.a().d(f4Var.a()).c(f4Var.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.w2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.w2
    public List c(int i) {
        if (i == a.INFO.ordinal()) {
            return this.i;
        }
        return i == a.BIDDERS.ordinal() ? this.j : this.k;
    }

    @Override // com.applovin.impl.w2
    public int d(int i) {
        if (i == a.INFO.ordinal()) {
            return this.i.size();
        }
        return i == a.BIDDERS.ordinal() ? this.j.size() : this.k.size();
    }

    public o j() {
        return this.f;
    }

    public String k() {
        return this.h;
    }

    public m(n nVar, o oVar, o8 o8Var, Context context) {
        o oVarF;
        String strD;
        super(context);
        this.e = nVar;
        this.g = o8Var;
        if (oVar != null) {
            oVarF = oVar;
        } else {
            oVarF = nVar.f();
        }
        this.f = oVarF;
        if (oVar != null) {
            strD = oVar.c();
        } else {
            strD = nVar.d();
        }
        this.h = strD;
        this.i = h();
        this.j = e();
        this.k = l();
        notifyDataSetChanged();
    }

    private v2 f() {
        return v2.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private v2 g() {
        return v2.a().d("ID").c(this.e.c()).a();
    }

    private v2 i() {
        return v2.a().d("Selected Network").c(this.g.b().a()).a();
    }

    private v2 d() {
        return v2.a().d("Ad Format").c(this.e.b()).a();
    }

    @Override // com.applovin.impl.w2
    public v2 e(int i) {
        if (i == a.INFO.ordinal()) {
            return new a5("INFO");
        }
        if (i == a.BIDDERS.ordinal()) {
            return new a5("BIDDERS");
        }
        return new a5("WATERFALL");
    }
}
