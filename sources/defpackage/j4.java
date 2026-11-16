package defpackage;

import com.singular.sdk.internal.UserDetailsUtils;
import com.usercentrics.sdk.AdTechProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class j4 {

    @NotNull
    public static final h4 Companion = new h4();
    public final g4 a;
    public final zb0 b;
    public final a33 c;
    public List d;
    public String e;

    public final boolean b() {
        List list = this.d;
        if (list != null && (!list.isEmpty())) {
            return true;
        }
        this.c.a("Error when saving user consents for Google Additional Consent Mode. Cause: missing Ad Tech Provider list.", null);
        return false;
    }

    public final String c() {
        List<AdTechProvider> list = this.d;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (AdTechProvider adTechProvider : list) {
            StringBuilder sb3 = adTechProvider.d ? sb : sb2;
            if (sb3.length() > 0) {
                sb3.append(UserDetailsUtils.UserDetailsLiterals.DOT);
            }
            sb3.append(adTechProvider.a);
        }
        return "2~" + ((Object) sb) + "~dv." + ((Object) sb2);
    }

    public final List d() {
        String str = this.e;
        List listN0 = str != null ? dk2.n0(str, new String[]{"~"}, 0, 6) : null;
        if (listN0 == null || listN0.size() != 3) {
            return gg0.a;
        }
        List listZ0 = du.z0(dk2.n0((CharSequence) listN0.get(1), new String[]{UserDetailsUtils.UserDetailsLiterals.DOT}, 0, 6));
        ArrayList arrayList = new ArrayList();
        Iterator it = listZ0.iterator();
        while (it.hasNext()) {
            Integer numM = kk2.M((String) it.next());
            if (numM != null) {
                arrayList.add(numM);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(List list, fy fyVar) {
        i4 i4Var;
        if (fyVar instanceof i4) {
            i4Var = (i4) fyVar;
            int i = i4Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                i4Var.v = i - Integer.MIN_VALUE;
            } else {
                i4Var = new i4(this, fyVar);
            }
        } else {
            i4Var = new i4(this, fyVar);
        }
        Object objM = i4Var.t;
        int i2 = i4Var.v;
        az2 az2Var = az2.a;
        if (i2 == 0) {
            wz2.a0(objM);
            boolean zIsEmpty = list.isEmpty();
            a33 a33Var = this.c;
            if (zIsEmpty) {
                a33Var.error("Error: cannot load Google Additional Consent Mode without selecting any vendor on Admin Interface", null);
                return az2Var;
            }
            a33Var.b("Loading Google Additional Consent Mode Providers " + list, null);
            af2 af2Var = ((j23) this.b).d;
            af2Var.getClass();
            String string = af2Var.a.getString("IABTCF_AddtlConsent", null);
            if (string == null) {
                string = "";
            }
            this.e = string;
            List listD = d();
            i4Var.r = this;
            i4Var.s = list;
            i4Var.v = 1;
            objM = this.a.m(list, listD, i4Var);
            Object obj = dz.a;
            if (objM == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = i4Var.s;
            this = i4Var.r;
            wz2.a0(objM);
        }
        List list2 = (List) objM;
        if (list2.isEmpty()) {
            this.c.a("Selected ATP providers " + list + " not found in Google's ATP list. They may have been removed from the program.", null);
        }
        this.d = list2;
        return az2Var;
    }

    public final void h(List list) {
        ArrayList arrayList;
        List list2 = this.d;
        if (list2 != null) {
            List<AdTechProvider> list3 = list2;
            arrayList = new ArrayList(eu.f(list3, 10));
            for (AdTechProvider adTechProvider : list3) {
                arrayList.add(AdTechProvider.a(adTechProvider, list.contains(Integer.valueOf(adTechProvider.a))));
            }
        } else {
            arrayList = null;
        }
        this.d = arrayList;
    }

    public j4(g4 g4Var, zb0 zb0Var, a33 a33Var) {
        zb0Var.getClass();
        a33Var.getClass();
        this.a = g4Var;
        this.b = zb0Var;
        this.c = a33Var;
    }

    public final void a() {
        if (b()) {
            List list = this.d;
            list.getClass();
            List list2 = list;
            ArrayList arrayList = new ArrayList(eu.f(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((AdTechProvider) it.next()).a));
            }
            g(arrayList);
        }
    }

    public final void f(String str) {
        str.getClass();
        if (!dk2.Z(str)) {
            this.e = str;
            j23 j23Var = (j23) this.b;
            j23Var.getClass();
            j23Var.d.d("IABTCF_AddtlConsent", str);
            List list = this.d;
            if (list != null && !list.isEmpty()) {
                h(d());
            }
        }
    }

    public final void g(List list) {
        if (b()) {
            h(list);
            String strC = c();
            this.e = strC;
            j23 j23Var = (j23) this.b;
            j23Var.getClass();
            j23Var.d.d("IABTCF_AddtlConsent", strC);
        }
    }
}
