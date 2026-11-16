package com.adsurge.adn.p031j;

import android.view.View;
import com.adsurge.adn.X.B;
import com.adsurge.adn.p037l.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class d implements B.a, View.OnAttachStateChangeListener {
    public boolean a = false;
    public View b;
    public e c;

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.b = null;
        this.a = true;
    }

    public void p() {
        this.c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.b = view;
        this.a = false;
    }

    public View q() {
        if (this.a) {
            return null;
        }
        View view = this.b;
        if (view != null) {
            return view;
        }
        e eVar = this.c;
        if (eVar != null) {
            return (View) eVar.get();
        }
        return null;
    }

    public d(e eVar) {
        this.c = eVar;
    }
}
