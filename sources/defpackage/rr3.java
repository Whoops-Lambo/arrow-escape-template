package defpackage;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzagc;
import com.google.android.gms.internal.ads.zzahp;
import com.google.android.gms.internal.ads.zzahr;
import com.google.android.gms.internal.ads.zzahs;
import com.google.android.gms.internal.ads.zzeh;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class rr3 implements zzahr {
    public final zzagc a;
    public final SparseArray b;
    public final long c;
    public final int d;

    public rr3(SparseArray sparseArray, long j, int i, long j2, long j3) {
        int i2;
        this.b = sparseArray;
        this.c = j;
        this.d = i;
        List list = (List) sparseArray.get(i);
        zzagc zzagcVar = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                qr3 qr3Var = (qr3) list.get(i4);
                jArrCopyOf3[i4] = qr3Var.a;
                jArrCopyOf[i4] = qr3Var.b;
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArrCopyOf[i3] = (int) (jArrCopyOf[i5] - jArrCopyOf[i3]);
                jArrCopyOf2[i3] = jArrCopyOf3[i5] - jArrCopyOf3[i3];
                i3 = i5;
            }
            int i6 = i2;
            while (i6 > 0 && jArrCopyOf3[i6] >= j) {
                i6--;
            }
            iArrCopyOf[i6] = (int) ((j2 + j3) - jArrCopyOf[i6]);
            jArrCopyOf2[i6] = j - jArrCopyOf3[i6];
            if (i6 < i2) {
                zzeh.c("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i7);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i7);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i7);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i7);
            }
            zzagcVar = new zzagc(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.a = zzagcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final zzahp a(long j) {
        zzagc zzagcVar = this.a;
        if (zzagcVar != null) {
            return zzagcVar.a(j);
        }
        zzahs zzahsVar = zzahs.c;
        return new zzahp(zzahsVar, zzahsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final long zza() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final boolean zzb() {
        List list = (List) this.b.get(this.d);
        return (list == null || list.isEmpty()) ? false : true;
    }
}
