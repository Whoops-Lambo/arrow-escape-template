package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CachedContentIndex;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class un {
    public final HashMap a;
    public final SparseArray b;
    public final SparseBooleanArray c;
    public final SparseBooleanArray d;
    public final tn e;
    public tn f;

    public final qn c(String str) {
        return (qn) this.a.get(str);
    }

    public final qn d(String str) {
        HashMap map = this.a;
        qn qnVar = (qn) map.get(str);
        if (qnVar != null) {
            return qnVar;
        }
        SparseArray sparseArray = this.b;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        qn qnVar2 = new qn(iKeyAt, str, DefaultContentMetadata.EMPTY);
        map.put(str, qnVar2);
        sparseArray.put(iKeyAt, str);
        this.d.put(iKeyAt, true);
        this.e.a(qnVar2);
        return qnVar2;
    }

    public final void e(long j) {
        tn tnVar;
        tn tnVar2 = this.e;
        tnVar2.initialize(j);
        tn tnVar3 = this.f;
        if (tnVar3 != null) {
            tnVar3.initialize(j);
        }
        boolean zExists = tnVar2.exists();
        SparseArray sparseArray = this.b;
        HashMap map = this.a;
        if (zExists || (tnVar = this.f) == null || !tnVar.exists()) {
            tnVar2.load(map, sparseArray);
        } else {
            this.f.load(map, sparseArray);
            tnVar2.storeFully(map);
        }
        tn tnVar4 = this.f;
        if (tnVar4 != null) {
            tnVar4.delete();
            this.f = null;
        }
    }

    public final void f(String str) {
        HashMap map = this.a;
        qn qnVar = (qn) map.get(str);
        if (qnVar != null && qnVar.c.isEmpty() && qnVar.d.isEmpty()) {
            map.remove(str);
            int i = qnVar.a;
            SparseBooleanArray sparseBooleanArray = this.d;
            boolean z = sparseBooleanArray.get(i);
            this.e.b(qnVar, z);
            SparseArray sparseArray = this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                this.c.put(i, true);
            }
        }
    }

    public final void g() {
        this.e.storeIncremental(this.a);
        SparseBooleanArray sparseBooleanArray = this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            this.b.remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        this.d.clear();
    }

    public un(DatabaseProvider databaseProvider, File file, byte[] bArr, boolean z, boolean z2) {
        boolean z3;
        rn rnVar;
        if (databaseProvider == null && file == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        Assertions.checkState(z3);
        this.a = new HashMap();
        this.b = new SparseArray();
        this.c = new SparseBooleanArray();
        this.d = new SparseBooleanArray();
        if (databaseProvider != null) {
            rnVar = new rn(databaseProvider);
        } else {
            rnVar = null;
        }
        sn snVar = file != null ? new sn(new File(file, CachedContentIndex.FILE_NAME), bArr, z) : null;
        if (rnVar != null && (snVar == null || !z2)) {
            this.e = rnVar;
            this.f = snVar;
        } else {
            this.e = (tn) Util.castNonNull(snVar);
            this.f = rnVar;
        }
    }

    public static DefaultContentMetadata a(DataInputStream dataInputStream) {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 >= 0) {
                int iMin = Math.min(i3, 10485760);
                byte[] bArrCopyOf = Util.EMPTY_BYTE_ARRAY;
                int i4 = 0;
                while (i4 != i3) {
                    int i5 = i4 + iMin;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                    dataInputStream.readFully(bArrCopyOf, i4, iMin);
                    iMin = Math.min(i3 - i5, 10485760);
                    i4 = i5;
                }
                map.put(utf, bArrCopyOf);
            } else {
                dr0.h(pv1.k(i3, "Invalid value size: "));
                return null;
            }
        }
        return new DefaultContentMetadata(map);
    }

    public static void b(DefaultContentMetadata defaultContentMetadata, DataOutputStream dataOutputStream) {
        Set<Map.Entry<String, byte[]>> setEntrySet = defaultContentMetadata.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry<String, byte[]> entry : setEntrySet) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }
}
