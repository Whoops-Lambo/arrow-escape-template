package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.internal.a;
import com.facebook.p;
import com.facebook.u;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class wt0 implements bk2, lx0, j05 {
    public final Object a;

    @Override // defpackage.bk2
    public boolean a() {
        return true;
    }

    @Override // defpackage.j05
    public zzae b() {
        throw null;
    }

    @Override // defpackage.j05
    public zzgu c() {
        throw null;
    }

    @Override // defpackage.j05
    public zzhz e() {
        throw null;
    }

    @Override // defpackage.j05
    public Context h() {
        throw null;
    }

    @Override // defpackage.j05
    public Clock i() {
        throw null;
    }

    public abstract void p(a aVar, Bundle bundle);

    @Override // defpackage.bk2
    public void clear() {
        ((Map) this.a).clear();
    }

    @Override // defpackage.bk2
    public Set d() {
        Set setEntrySet = ((Map) this.a).entrySet();
        setEntrySet.getClass();
        Set setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    @Override // defpackage.bk2
    public boolean isEmpty() {
        return ((Map) this.a).isEmpty();
    }

    public List l(String str) {
        Map map = (Map) this.a;
        List list = (List) map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        r(str);
        map.put(str, arrayList);
        return arrayList;
    }

    public void n(a aVar) {
        p pVar = (p) this.a;
        if (pVar != null) {
            pVar.onCancel();
        }
    }

    @Override // defpackage.bk2
    public Set names() {
        return ((Map) this.a).keySet();
    }

    public void o(a aVar, u uVar) {
        p pVar = (p) this.a;
        if (pVar != null) {
            pVar.onError(uVar);
        }
    }

    public void onDismissed(Bundle bundle) {
        ((lx0) this.a).onDismissed(bundle);
    }

    public void onError(Bundle bundle) {
        ((lx0) this.a).onError(bundle);
    }

    public void onShown(Bundle bundle) {
        ((lx0) this.a).onShown(bundle);
    }

    public px1 q(td1 td1Var) {
        String str;
        List<ud1> list = td1Var.a;
        ArrayList arrayList = new ArrayList(eu.f(list, 10));
        for (ud1 ud1Var : list) {
            boolean z = ud1Var.b;
            UsercentricsSettings usercentricsSettings = (UsercentricsSettings) this.a;
            h23 h23Var = ud1Var.c;
            h23 h23Var2 = h23.b;
            if (z && h23Var == h23Var2) {
                str = usercentricsSettings.a.K0;
            } else if (z || h23Var != h23Var2) {
                str = (z || h23Var != h23.a) ? usercentricsSettings.a.f0 : usercentricsSettings.a.U;
            } else {
                str = usercentricsSettings.a.J0;
            }
            q50 q50Var = new q50(ud1Var.e);
            q50.Companion.getClass();
            String str2 = ((SimpleDateFormat) q50.d.getValue()).format(q50Var.b.getTime());
            str2.getClass();
            arrayList.add(new yw1(z, str, str2));
        }
        return new px1(arrayList, td1Var.b);
    }

    public void t() {
        zzhz zzhzVar = ((zzic) this.a).g;
        zzic.l(zzhzVar);
        zzhzVar.t();
    }

    public wt0(int i) {
        switch (i) {
            case 3:
                this.a = new dp();
                break;
            default:
                this.a = new Bundle();
                break;
        }
    }

    @Override // defpackage.bk2
    public boolean contains(String str) {
        str.getClass();
        return ((Map) this.a).containsKey(str);
    }

    @Override // defpackage.bk2
    public void f(String str, Iterable iterable) {
        str.getClass();
        iterable.getClass();
        List listL = l(str);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            s((String) it.next());
        }
        iu.N(iterable, listL);
    }

    @Override // defpackage.bk2
    public List g(String str) {
        str.getClass();
        return (List) ((Map) this.a).get(str);
    }

    public void j(String str, String str2) {
        str.getClass();
        str2.getClass();
        s(str2);
        l(str).add(str2);
    }

    public void k(ak2 ak2Var) {
        ak2Var.getClass();
        ak2Var.b(new x62(this, 1));
    }

    public String m(String str) {
        List listG = g(str);
        if (listG != null) {
            return (String) du.c0(listG);
        }
        return null;
    }

    public void r(String str) {
        str.getClass();
    }

    public void s(String str) {
        str.getClass();
    }

    public wt0(View view) {
        this.a = new WeakReference(view);
    }

    public wt0(zzic zzicVar) {
        Preconditions.checkNotNull(zzicVar);
        this.a = zzicVar;
    }

    public wt0(UsercentricsSettings usercentricsSettings) {
        usercentricsSettings.getClass();
        this.a = usercentricsSettings;
    }

    public /* synthetic */ wt0(Object obj) {
        this.a = obj;
    }
}
