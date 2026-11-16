package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.nq2;
import defpackage.wz2;
import java.io.FileOutputStream;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/core/FileWriteScope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/FileReadScope;", "Landroidx/datastore/core/WriteScope;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileWriteScope<T> extends FileReadScope<T> implements WriteScope<T> {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.WriteScope
    public final Object b(Object obj, fy fyVar) {
        FileWriteScope$writeData$1 fileWriteScope$writeData$1;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (fyVar instanceof FileWriteScope$writeData$1) {
            fileWriteScope$writeData$1 = (FileWriteScope$writeData$1) fyVar;
            int i = fileWriteScope$writeData$1.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                fileWriteScope$writeData$1.v = i - Integer.MIN_VALUE;
            } else {
                fileWriteScope$writeData$1 = new FileWriteScope$writeData$1(this, fyVar);
            }
        } else {
            fileWriteScope$writeData$1 = new FileWriteScope$writeData$1(this, fyVar);
        }
        Object obj2 = fileWriteScope$writeData$1.t;
        int i2 = fileWriteScope$writeData$1.v;
        if (i2 == 0) {
            wz2.a0(obj2);
            if (this.c.get()) {
                e32.i("This scope has already been closed.");
                return null;
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(this.a);
            try {
                Serializer serializer = this.b;
                UncloseableOutputStream uncloseableOutputStream = new UncloseableOutputStream(fileOutputStream3);
                fileWriteScope$writeData$1.r = fileOutputStream3;
                fileWriteScope$writeData$1.s = fileOutputStream3;
                fileWriteScope$writeData$1.v = 1;
                Object objWriteTo = serializer.writeTo(obj, uncloseableOutputStream, fileWriteScope$writeData$1);
                dz dzVar = dz.a;
                if (objWriteTo == dzVar) {
                    return dzVar;
                }
                fileOutputStream2 = fileOutputStream3;
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream3;
                throw th;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fileOutputStream2 = fileWriteScope$writeData$1.s;
            fileOutputStream = fileWriteScope$writeData$1.r;
            try {
                wz2.a0(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    nq2.e(fileOutputStream, th);
                    throw th3;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        nq2.e(fileOutputStream, null);
        return az2.a;
    }
}
