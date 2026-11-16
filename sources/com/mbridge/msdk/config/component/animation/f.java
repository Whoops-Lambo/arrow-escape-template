package com.mbridge.msdk.config.component.animation;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class f {
    private String a = "";
    private g b;
    private Animator c;
    private View d;
    private i e;

    public void a(String str) {
        if (str == null) {
            str = "";
        }
        this.a = str;
    }

    public i b() {
        return this.e;
    }

    public View c() {
        return this.d;
    }

    public void a(g gVar) {
        this.b = gVar;
    }

    public Animator a() {
        return this.c;
    }

    public void a(Animator animator) {
        this.c = animator;
    }

    public void a(View view) {
        this.d = view;
    }

    public void a(i iVar) {
        this.e = iVar;
    }
}
