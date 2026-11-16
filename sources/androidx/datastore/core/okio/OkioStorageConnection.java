package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.StorageConnection;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.as0;
import defpackage.fy;
import defpackage.l7;
import defpackage.wz2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/okio/OkioStorageConnection;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/StorageConnection;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkioStorageConnection<T> implements StorageConnection<T> {
    @Override // androidx.datastore.core.StorageConnection
    public final InterProcessCoordinator c() {
        return null;
    }

    @Override // androidx.datastore.core.Closeable
    public final void close() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.zr0 r4, defpackage.fy r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof androidx.datastore.core.okio.OkioStorageConnection$writeScope$1
            if (r4 == 0) goto L13
            r4 = r5
            androidx.datastore.core.okio.OkioStorageConnection$writeScope$1 r4 = (androidx.datastore.core.okio.OkioStorageConnection$writeScope$1) r4
            int r0 = r4.t
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.t = r0
            goto L18
        L13:
            androidx.datastore.core.okio.OkioStorageConnection$writeScope$1 r4 = new androidx.datastore.core.okio.OkioStorageConnection$writeScope$1
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r3 = r4.r
            int r4 = r4.t
            r5 = 0
            if (r4 == 0) goto L40
            r0 = 1
            if (r4 == r0) goto L3b
            r0 = 2
            if (r4 != r0) goto L33
            defpackage.wz2.a0(r3)     // Catch: java.lang.Throwable -> L2b
            throw r5     // Catch: java.lang.Throwable -> L29
        L29:
            r3 = move-exception
            throw r3     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L3f
        L2b:
            r3 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L2d
        L2d:
            r4 = move-exception
            defpackage.l7.a(r3, r4)     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L3f
            throw r3     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L3f
        L32:
            throw r5     // Catch: java.lang.Throwable -> L3f
        L33:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L3b:
            defpackage.wz2.a0(r3)
            throw r5     // Catch: java.lang.Throwable -> L3f
        L3f:
            throw r5
        L40:
            defpackage.wz2.a0(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioStorageConnection.a(zr0, fy):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.StorageConnection
    public final Object d(as0 as0Var, fy fyVar) {
        OkioStorageConnection$readScope$1 okioStorageConnection$readScope$1;
        if (fyVar instanceof OkioStorageConnection$readScope$1) {
            okioStorageConnection$readScope$1 = (OkioStorageConnection$readScope$1) fyVar;
            int i = okioStorageConnection$readScope$1.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                okioStorageConnection$readScope$1.t = i - Integer.MIN_VALUE;
            } else {
                okioStorageConnection$readScope$1 = new OkioStorageConnection$readScope$1(this, fyVar);
            }
        } else {
            okioStorageConnection$readScope$1 = new OkioStorageConnection$readScope$1(this, fyVar);
        }
        Object obj = okioStorageConnection$readScope$1.r;
        int i2 = okioStorageConnection$readScope$1.t;
        if (i2 == 0) {
            wz2.a0(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            wz2.a0(obj);
            throw null;
        } catch (Throwable th) {
            try {
                throw null;
            } catch (Throwable th2) {
                l7.a(th, th2);
                throw th;
            }
        }
    }
}
