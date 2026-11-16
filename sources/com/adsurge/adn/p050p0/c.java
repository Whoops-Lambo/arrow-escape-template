package com.adsurge.adn.p050p0;

import android.view.View;
import android.view.ViewGroup;
import com.adsurge.adn.p038l0.i;
import com.adsurge.adn.p060u0.d;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c extends d {
    public abstract ViewGroup.LayoutParams a(d dVar);

    public abstract ViewGroup.LayoutParams i();

    public void a(i iVar, View view) {
        ViewGroup viewGroup = (ViewGroup) this.a.C();
        if (iVar.z().b() != 1) {
            viewGroup.addView(view, a(iVar.y()));
        } else {
            viewGroup.addView(view, a(viewGroup, iVar.w()), a(iVar.y()));
        }
    }

    public void c(boolean z) {
        View view = this.b;
        if (view != null) {
            ((ViewGroup) view).setClipChildren(z);
        }
    }

    public c(i iVar, ViewGroup viewGroup) {
        super(iVar, viewGroup);
    }

    public void a(i iVar) {
        View viewC;
        if (iVar == null || !iVar.M() || !this.a.M() || (viewC = iVar.C()) == null) {
            return;
        }
        a(iVar, viewC);
    }

    public int a(ViewGroup viewGroup, int i) {
        i iVar;
        List listR = ((a) this.a).R();
        do {
            i++;
            if (i >= listR.size()) {
                return -1;
            }
            iVar = (i) listR.get(i);
        } while (!iVar.M());
        return viewGroup.indexOfChild(iVar.C());
    }
}
