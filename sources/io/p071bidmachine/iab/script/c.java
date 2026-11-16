package io.p071bidmachine.iab.script;

import defpackage.rc1;
import defpackage.sr0;
import io.p071bidmachine.rendering.model.w0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class c extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ w0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(w0 w0Var, int i) {
        super(0);
        this.i = i;
        this.j = w0Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        w0 w0Var = this.j;
        switch (i) {
            case 0:
                return "DOCUMENT_START_SCRIPT not supported, skipping: ".concat(w0Var.a);
            default:
                return "injected document-start script: ".concat(w0Var.a);
        }
    }
}
