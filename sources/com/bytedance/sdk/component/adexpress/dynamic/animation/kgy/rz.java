package com.bytedance.sdk.component.adexpress.dynamic.animation.kgy;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class rz {
    private static volatile rz kgy;

    public uq kgy(View view, com.bytedance.sdk.component.adexpress.dynamic.uq.kgy kgyVar) {
        if (kgyVar == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(kgyVar.gf())) {
            return new nu(view, kgyVar);
        }
        if ("translate".equals(kgyVar.gf())) {
            return new vs(view, kgyVar);
        }
        if ("ripple".equals(kgyVar.gf())) {
            return new fi(view, kgyVar);
        }
        if ("marquee".equals(kgyVar.gf())) {
            return new yo(view, kgyVar);
        }
        if ("waggle".equals(kgyVar.gf())) {
            return new dg(view, kgyVar);
        }
        if ("shine".equals(kgyVar.gf())) {
            return new at(view, kgyVar);
        }
        if ("swing".equals(kgyVar.gf())) {
            return new kus(view, kgyVar);
        }
        if ("fade".equals(kgyVar.gf())) {
            return new kgy(view, kgyVar);
        }
        if ("rubIn".equals(kgyVar.gf())) {
            return new ra(view, kgyVar);
        }
        if ("rotate".equals(kgyVar.gf())) {
            return new gf(view, kgyVar);
        }
        if ("cutIn".equals(kgyVar.gf())) {
            return new noq(view, kgyVar);
        }
        if ("stretch".equals(kgyVar.gf())) {
            return new twf(view, kgyVar);
        }
        if ("bounce".equals(kgyVar.gf())) {
            return new ct(view, kgyVar);
        }
        return null;
    }

    private rz() {
    }

    public static rz kgy() {
        if (kgy == null) {
            synchronized (rz.class) {
                try {
                    if (kgy == null) {
                        kgy = new rz();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }
}
