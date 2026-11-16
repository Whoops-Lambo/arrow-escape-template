package defpackage;

import com.usercentrics.tcf.core.model.gvl.Declarations;
import com.usercentrics.tcf.core.model.gvl.Vendor;
import com.usercentrics.tcf.core.model.gvl.VendorList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class it0 {

    @NotNull
    public static final ft0 Companion = new ft0();
    public final x41 a;
    public List c;
    public boolean k;
    public Map b = null;
    public Integer d = null;
    public Map e = null;
    public Map f = null;
    public Map g = null;
    public Map h = null;
    public Map i = null;
    public Map j = null;
    public Map l = hg0.a;
    public String m = "EN";

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, fy fyVar) throws Throwable {
        gt0 gt0Var;
        Object objF;
        if (fyVar instanceof gt0) {
            gt0Var = (gt0) fyVar;
            int i = gt0Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                gt0Var.v = i - Integer.MIN_VALUE;
            } else {
                gt0Var = new gt0(this, fyVar);
            }
        } else {
            gt0Var = new gt0(this, fyVar);
        }
        Object obj = gt0Var.t;
        int i2 = gt0Var.v;
        Object obj2 = null;
        az2 az2Var = az2.a;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                if (upperCase.equals(this.m)) {
                    return az2Var;
                }
                x41 x41Var = this.a;
                gt0Var.r = this;
                gt0Var.s = str;
                gt0Var.v = 1;
                objF = x41Var.f(str, gt0Var);
                dz dzVar = dz.a;
                if (objF == dzVar) {
                    return dzVar;
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = gt0Var.s;
                this = gt0Var.r;
                wz2.a0(obj);
                objF = ((k52) obj).a;
            }
            Throwable thB = k52.b(objF);
            if (thB != null) {
                throw thB;
            }
            this.m = str;
            if (!(objF instanceof j52)) {
                obj2 = objF;
            }
            obj2.getClass();
            Declarations declarations = (Declarations) obj2;
            this.f = declarations.a;
            this.i = declarations.b;
            this.e = declarations.c;
            this.h = declarations.d;
            this.j = declarations.e;
            this.g = declarations.f;
            return az2Var;
        } catch (Exception e) {
            return new j52(new jt0(pv1.o("Unable to fetch language (", str, ") declarations: ", e.getMessage()), e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(fy fyVar) {
        ht0 ht0Var;
        Object objG;
        if (fyVar instanceof ht0) {
            ht0Var = (ht0) fyVar;
            int i = ht0Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                ht0Var.u = i - Integer.MIN_VALUE;
            } else {
                ht0Var = new ht0(this, fyVar);
            }
        } else {
            ht0Var = new ht0(this, fyVar);
        }
        Object obj = ht0Var.s;
        int i2 = ht0Var.u;
        if (i2 == 0) {
            wz2.a0(obj);
            ht0Var.r = this;
            ht0Var.u = 1;
            objG = this.a.g(ht0Var);
            dz dzVar = dz.a;
            if (objG == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = ht0Var.r;
            wz2.a0(obj);
            objG = ((k52) obj).a;
        }
        VendorList vendorList = (VendorList) (objG instanceof j52 ? null : objG);
        if (vendorList == null) {
            Throwable thB = k52.b(objG);
            if (thB == null) {
                thB = new r23("Error when initializing TCF #111", null, 2, null);
            }
            return new j52(thB);
        }
        this.getClass();
        this.f = vendorList.f;
        this.i = vendorList.i;
        this.e = vendorList.g;
        this.h = vendorList.h;
        this.j = vendorList.j;
        this.g = vendorList.k;
        this.d = vendorList.c;
        Map map = vendorList.e;
        this.b = map;
        map.getClass();
        this.l = map;
        this.c(null);
        this.k = true;
        return az2.a;
    }

    public final void c(List list) {
        if (list == null) {
            Set setKeySet = this.l.keySet();
            ArrayList arrayList = new ArrayList(eu.f(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            list = arrayList;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map = this.b;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            Vendor vendor = map != null ? (Vendor) map.get(String.valueOf(iIntValue)) : null;
            if (vendor != null && vendor.h == null) {
                linkedHashMap.put(String.valueOf(iIntValue), vendor);
            }
        }
        this.b = linkedHashMap;
        this.c = du.r0(list);
    }

    public it0(x41 x41Var) {
        this.a = x41Var;
    }
}
