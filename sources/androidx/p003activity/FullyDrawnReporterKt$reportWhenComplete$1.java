package androidx.p003activity;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@t50(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "reportWhenComplete")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
final class FullyDrawnReporterKt$reportWhenComplete$1 extends fy {
    public /* synthetic */ Object r;
    public int s;

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        throw null;
     */
    @Override // defpackage.ph
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            r2.r = r3
            int r0 = r2.s
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r2.s = r0
            r2 = 0
            if (r0 == 0) goto L1d
            r1 = 1
            if (r0 != r1) goto L15
            defpackage.wz2.a0(r3)     // Catch: java.lang.Throwable -> L14
            throw r2
        L14:
            throw r2
        L15:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L1d:
            defpackage.wz2.a0(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p003activity.FullyDrawnReporterKt$reportWhenComplete$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
