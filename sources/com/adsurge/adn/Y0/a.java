package com.adsurge.adn.Y0;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public Context a;
    public List b = new LinkedList();
    public long c = 0;
    public boolean d;

    public abstract void a(Set set);

    public abstract List b();

    public void b(List list) {
        com.adsurge.adn.J0.a.a("Send stat success", new Object[0]);
        this.c = SystemClock.elapsedRealtime() / 1000;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar != null) {
                if (oVar.a() >= 0) {
                    hashSet.add(Integer.valueOf(oVar.a()));
                }
                this.b.remove(oVar);
            }
        }
        a(hashSet);
    }

    public abstract void c(List list);

    public abstract void d(List list);

    public final void e(List list) {
        if (list == null || list.size() == 0) {
            com.adsurge.adn.J0.a.a("No stat items need send", new Object[0]);
            return;
        }
        if (!com.adsurge.adn.D0.a.c().d().a()) {
            com.adsurge.adn.J0.a.a("Send stat event failed for no available network");
            return;
        }
        int size = list.size();
        int iMin = Math.min(j.c(), size);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < size; i++) {
            arrayList.add((o) list.get(i));
            if (arrayList.size() == iMin) {
                d(arrayList);
                arrayList.clear();
            }
        }
        d(arrayList);
        arrayList.clear();
    }

    public abstract boolean e();

    public void a(o oVar) {
        if (oVar == null) {
            return;
        }
        if (this.b.size() >= 1000) {
            Iterator it = this.b.iterator();
            for (int size = this.b.size() - 999; size > 0 && it.hasNext(); size--) {
                it.next();
                it.remove();
            }
        }
        this.b.add(oVar);
        com.adsurge.adn.J0.a.a("Add stat data: " + oVar + ", total: " + this.b.size(), new Object[0]);
    }

    public long c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public void g() {
        ArrayList arrayList = new ArrayList(this.b);
        this.b.clear();
        c(arrayList);
    }

    public a(Context context) {
        this.a = context;
    }

    public void f() {
        if (e() && j.f().a().c()) {
            a();
        }
    }

    public void a() {
        com.adsurge.adn.J0.a.a("Start commit stat data", new Object[0]);
        ArrayList arrayList = new ArrayList(this.b);
        List listB = b();
        if (listB != null && listB.size() > 0) {
            arrayList.addAll(listB);
        }
        if (arrayList.size() > 0) {
            e(arrayList);
        }
    }

    public void a(List list) {
        com.adsurge.adn.J0.a.a("Send stat failed", new Object[0]);
    }

    public void a(boolean z) {
        this.d = z;
    }
}
