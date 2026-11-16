package defpackage;

import com.singular.sdk.internal.UserDetailsUtils;
import com.usercentrics.sdk.v2.location.data.UsercentricsLocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class dd1 {

    @NotNull
    public static final bd1 Companion = new bd1();
    public final ad1 a;
    public final zb0 b;
    public final a33 c;
    public String d;
    public UsercentricsLocation e;
    public boolean f;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, boolean z, fy fyVar) {
        cd1 cd1Var;
        Object obj;
        Object obj2;
        if (fyVar instanceof cd1) {
            cd1Var = (cd1) fyVar;
            int i = cd1Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                cd1Var.v = i - Integer.MIN_VALUE;
            } else {
                cd1Var = new cd1(this, fyVar);
            }
        } else {
            cd1Var = new cd1(this, fyVar);
        }
        Object objJ = cd1Var.t;
        int i2 = cd1Var.v;
        if (i2 == 0) {
            wz2.a0(objJ);
            cd1Var.r = this;
            cd1Var.s = str3;
            cd1Var.v = 1;
            objJ = this.a.j(str, str2, z, cd1Var);
            dz dzVar = dz.a;
            if (objJ == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = cd1Var.s;
            this = cd1Var.r;
            wz2.a0(objJ);
        }
        hf1 hf1Var = (hf1) objJ;
        this.e = hf1Var.b;
        this.f = hf1Var.c;
        Iterable iterable = (Iterable) hf1Var.a;
        ArrayList arrayList = new ArrayList(eu.f(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            arrayList.add(lowerCase);
        }
        a33 a33Var = this.c;
        String str4 = ((j23) this.b).f.c;
        if (!dk2.Z(str4) && arrayList.contains(str4)) {
            str3 = str4;
        } else if (dk2.Z(str3) || !arrayList.contains(str3)) {
            Locale locale = Locale.getDefault();
            locale.getClass();
            int size = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i4);
                i4++;
                Locale localeN = t40.n((String) obj);
                if (s71.b(locale.getLanguage(), localeN.getLanguage()) && s71.b(locale.getCountry(), localeN.getCountry())) {
                    break;
                }
            }
            String str5 = (String) obj;
            if (str5 != null) {
                str3 = str5;
            } else {
                int size2 = arrayList.size();
                do {
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList.get(i3);
                    i3++;
                } while (!s71.b(locale.getLanguage(), t40.n((String) obj2).getLanguage()));
                str3 = (String) obj2;
            }
            if (str3 == null || !(!dk2.Z(str3))) {
                str3 = (String) du.c0(arrayList);
                if (str3 == null || dk2.Z(str3)) {
                    a33Var.b("The language has been set to the default one, English.", null);
                    str3 = "en";
                } else {
                    Companion.getClass();
                    a33Var.b("The language has been set to the first of those available, " + str3 + UserDetailsUtils.UserDetailsLiterals.DOT, null);
                }
            } else {
                a33Var.b("The language has been set to the device language.", null);
            }
        }
        this.d = str3;
        return az2.a;
    }

    public dd1(ad1 ad1Var, zb0 zb0Var, a33 a33Var) {
        zb0Var.getClass();
        a33Var.getClass();
        this.a = ad1Var;
        this.b = zb0Var;
        this.c = a33Var;
    }
}
