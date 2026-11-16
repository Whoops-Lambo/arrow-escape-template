package io.p071bidmachine.iab.script;

import defpackage.du;
import defpackage.rc1;
import defpackage.sr0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ List j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(List list, int i) {
        super(0);
        this.i = i;
        this.j = list;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        List list = this.j;
        switch (i) {
            case 0:
                return "installed " + list.size() + " document-start scripts";
            default:
                return "Start picking best file from:\n".concat(du.g0(list, "\n", null, null, null, 62));
        }
    }
}
