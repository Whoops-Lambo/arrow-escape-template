package io.p071bidmachine.iab.mraid;

import defpackage.rc1;
import defpackage.sr0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class s extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ String j;
    public final /* synthetic */ Object[] k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object[] objArr, int i, String str) {
        super(0);
        this.i = i;
        this.j = str;
        this.k = objArr;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        Object[] objArr = this.k;
        String str = this.j;
        switch (i) {
            case 0:
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                return String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            default:
                Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length);
                return String.format(str, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
        }
    }
}
