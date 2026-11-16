package io.p071bidmachine.rendering.measurer;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import io.p071bidmachine.ads.networks.adaptiverendering.measurer.b;
import io.p071bidmachine.media3.ui.c0;
import io.p071bidmachine.util.e;
import io.p071bidmachine.util.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements f {
    public final CopyOnWriteArrayList a;

    @Override // io.p071bidmachine.rendering.measurer.f
    public final void onClicked() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((f) it.next()).onClicked();
        }
    }

    @Override // io.p071bidmachine.rendering.measurer.f
    public final void onShown() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((f) it.next()).onShown();
        }
    }

    @Override // io.p071bidmachine.rendering.measurer.f
    public final void u(Runnable runnable) {
        b bVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        if (runnable != null) {
            int i = o.a;
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            bVar = new b(copyOnWriteArrayList.size(), new c0(6, this, new Handler(looperMyLooper), runnable));
        } else {
            bVar = null;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((f) it.next()).u(bVar);
        }
    }

    public a(ArrayList arrayList) {
        this.a = new CopyOnWriteArrayList(arrayList);
    }

    @Override // io.p071bidmachine.rendering.measurer.f
    public final void e(e eVar) {
        eVar.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((f) it.next()).e(eVar);
        }
    }

    @Override // io.p071bidmachine.rendering.measurer.f
    public final void s(View view, ViewGroup viewGroup) {
        view.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((f) it.next()).s(view, viewGroup);
        }
    }

    @Override // io.p071bidmachine.rendering.measurer.f
    public final void v(View view) {
        view.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((f) it.next()).v(view);
        }
    }

    @Override // io.p071bidmachine.rendering.measurer.f
    public final void w(View view) {
        view.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((f) it.next()).w(view);
        }
    }
}
