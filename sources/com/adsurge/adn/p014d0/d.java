package com.adsurge.adn.p014d0;

import android.view.View;
import com.adsurge.adn.p035k0.j;
import com.adsurge.adn.p038l0.i;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class d {
    public static final InterfaceC0105d a = new a();
    public static final InterfaceC0105d b = new b();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class c {
        public final boolean a;
        public final boolean b;

        public boolean a(c cVar) {
            return cVar != null && this.a == cVar.a && this.b == cVar.b;
        }

        public c(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.d0.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InterfaceC0105d {
        int a(i iVar, boolean z);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements InterfaceC0105d {
        @Override // com.adsurge.adn.p014d0.d.InterfaceC0105d
        public int a(i iVar, boolean z) {
            int height;
            View viewC = iVar.C();
            if (viewC == null) {
                return 0;
            }
            Object parent = viewC.getParent();
            if (!(parent instanceof View)) {
                return 0;
            }
            View view = (View) parent;
            if (z) {
                height = view.getWidth();
            } else {
                height = view.getHeight();
            }
            return Math.max(height, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements InterfaceC0105d {
        @Override // com.adsurge.adn.p014d0.d.InterfaceC0105d
        public int a(i iVar, boolean z) {
            View viewH;
            int height;
            com.adsurge.adn.p064w0.b bVarF = iVar.F();
            if (bVarF == null || (viewH = bVarF.h()) == null) {
                return 0;
            }
            if (z) {
                height = viewH.getWidth();
            } else {
                height = viewH.getHeight();
            }
            return Math.max(height, 0);
        }
    }

    public static c a(j jVar) {
        if (jVar.c()) {
            return new c(jVar.a(), false);
        }
        if (jVar.d()) {
            return new c(jVar.a(), true);
        }
        return null;
    }

    public static InterfaceC0105d a(c cVar) {
        return cVar.b ? b : a;
    }
}
