package com.adsurge.adn.p050p0;

import android.view.ViewGroup;
import com.adsurge.adn.p035k0.h;
import com.adsurge.adn.p038l0.i;
import com.adsurge.adn.p060u0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends i {
    public final List E = new ArrayList();

    public boolean P() {
        return false;
    }

    public final int Q() {
        return this.E.size();
    }

    public List R() {
        return this.E;
    }

    @Override // com.adsurge.adn.p038l0.i
    public boolean a(String str, h hVar) {
        if (!"60".equals(str)) {
            return super.a(str, hVar);
        }
        ((c) x()).c(hVar.e(new JSONObject[0]) == 1);
        return true;
    }

    public void b(i iVar) {
        d dVar;
        if (iVar == null || (dVar = this.f) == null) {
            return;
        }
        ((c) dVar).a(iVar);
    }

    @Override // com.adsurge.adn.p038l0.i
    public void c(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0 || z().a(jSONObject) || !M()) {
            return;
        }
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((i) it.next()).c(jSONObject);
        }
        super.c(jSONObject);
    }

    public i m(int i) {
        if (i < 0 || i >= this.E.size()) {
            return null;
        }
        return (i) this.E.get(i);
    }

    @Override // com.adsurge.adn.p038l0.i
    public void J() {
        super.J();
        for (i iVar : this.E) {
            if (iVar != null) {
                iVar.J();
            }
        }
    }

    @Override // com.adsurge.adn.p038l0.i
    public void O() {
        super.O();
        if (this.r.a() && C() != null) {
            ((ViewGroup) C()).setWillNotDraw(false);
        }
    }

    @Override // com.adsurge.adn.p038l0.i, com.adsurge.adn.p064w0.a
    public void a(String str, JSONObject jSONObject) {
        for (i iVar : this.E) {
            if (iVar.M()) {
                iVar.a(str, jSONObject);
            }
        }
        super.a(str, jSONObject);
    }

    public ViewGroup.LayoutParams a(d dVar) {
        return ((c) this.f).a(dVar);
    }

    @Override // com.adsurge.adn.p038l0.i
    public void a(i.d dVar) {
        super.a(dVar);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((i) it.next()).a(dVar);
        }
    }

    public void c(i iVar) {
        if (iVar != null) {
            this.E.add(iVar);
            iVar.a(this);
        }
    }

    @Override // com.adsurge.adn.p038l0.i
    public void c() {
        super.c();
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((i) it.next()).c();
        }
    }
}
