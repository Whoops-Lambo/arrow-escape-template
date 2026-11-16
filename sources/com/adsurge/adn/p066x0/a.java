package com.adsurge.adn.p066x0;

import com.adsurge.adn.p064w0.b;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class a {
    public static final String f;
    public final int a;
    public final ArrayList b = new ArrayList();
    public final String c;
    public final int d;
    public volatile boolean e;

    static {
        f = com.adsurge.adn.J0.a.a ? "ViewRootCache" : "a";
    }

    public boolean a(b bVar) {
        if (this.b.size() >= this.a) {
            return false;
        }
        bVar.a(1);
        this.b.add(bVar);
        if (this.b.size() == this.a) {
            this.e = false;
        } else {
            this.e = true;
        }
        if (com.adsurge.adn.J0.a.a) {
            com.adsurge.adn.J0.a.a(f, "模板%s_%s新增ViewRoot「%s」，填充率：%s/%s", this.c, Integer.valueOf(this.d), Integer.valueOf(bVar.hashCode()), Integer.valueOf(this.b.size()), Integer.valueOf(this.a));
        }
        return true;
    }

    public int b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public b e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b bVar = (b) obj;
            if (bVar != null && bVar.b() == 1) {
                bVar.a(2);
                if (com.adsurge.adn.J0.a.a) {
                    com.adsurge.adn.J0.a.a(f, "模板%s_%s的viewRoot「%s」被消费，填充率：%s/%s，", this.c, Integer.valueOf(this.d), Integer.valueOf(bVar.hashCode()), Integer.valueOf(this.b.size()), Integer.valueOf(this.a));
                }
                return bVar;
            }
        }
        return null;
    }

    public boolean f() {
        return this.e;
    }

    public a(String str, int i, b bVar, int i2) {
        this.c = str;
        this.d = i;
        this.a = i2;
        a(bVar);
    }

    public void a() {
        this.b.clear();
    }
}
