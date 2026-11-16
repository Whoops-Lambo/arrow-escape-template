package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ProgressBar;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Jp {
    public static final boolean a(View view, ViewGroup viewGroup) {
        view.getClass();
        viewGroup.getClass();
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            if (s71.b(parent, viewGroup)) {
                return true;
            }
            if (parent instanceof ViewGroup) {
                parent = ((ViewGroup) parent).getParent();
            } else {
                parent = null;
            }
        }
        return false;
    }

    public static final boolean b(View view, ViewGroup viewGroup) {
        view.getClass();
        viewGroup.getClass();
        if (view.isAttachedToWindow()) {
            return a(view, viewGroup);
        }
        return false;
    }

    public static final void a(ProgressBar progressBar, int i) {
        progressBar.getClass();
        progressBar.setProgress(i, true);
    }

    public static final void a(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }
}
