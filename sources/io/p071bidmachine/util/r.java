package io.p071bidmachine.util;

import android.view.View;
import defpackage.az2;
import defpackage.qo;
import defpackage.rc1;
import defpackage.sr0;
import io.p071bidmachine.util.network.b;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class r extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, Object obj, Object obj2) {
        super(0);
        this.i = i;
        this.j = obj;
        this.k = obj2;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        Object obj = this.k;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                ((qo) obj2).resumeWith((View) obj);
                return az2.a;
            case 1:
                return "Hold media file " + ((File) obj2).getName() + ", holder: " + obj;
            default:
                return "Download failed (" + ((b) obj2).a.getMessage() + "): " + ((String) obj);
        }
    }
}
