package com.google.android.gms.internal.play_billing;

import defpackage.lj4;
import defpackage.o85;
import defpackage.s75;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzp {
    public Object a;
    public o85 b;
    public zzv c = zzv.i();
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        o85 o85Var = this.b;
        if (o85Var != null) {
            s75 s75Var = o85Var.b;
            s75Var.getClass();
            if (obj == null) {
                obj = zzo.g;
            }
            if (zzo.f.h0(s75Var, null, obj)) {
                zzo.c(s75Var);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void finalize() {
        zzv zzvVar;
        o85 o85Var = this.b;
        if (o85Var != null) {
            s75 s75Var = o85Var.b;
            if (!s75Var.isDone()) {
                if (zzo.f.h0(s75Var, null, new lj4(new f("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.a)))))) {
                    zzo.c(s75Var);
                }
            }
        }
        if (this.d || (zzvVar = this.c) == null) {
            return;
        }
        zzvVar.h(null);
    }
}
