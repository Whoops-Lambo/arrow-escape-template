package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class b0 implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {
    public static final long l = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("AC-3");
    public static final long m = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("EAC3");
    public static final long n = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("HEVC");
    public final int a;
    public final List b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n c;
    public final SparseIntArray d;
    public final e e;
    public final SparseArray f;
    public final SparseBooleanArray g;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j h;
    public int i;
    public boolean j;
    public f0 k;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        f0 f0Var;
        int iMin;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.c;
        byte[] bArr = nVar.a;
        int i = nVar.b;
        if (940 - i < 188) {
            int i2 = nVar.c - i;
            if (i2 > 0) {
                System.arraycopy(bArr, i, bArr, 0, i2);
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.c;
            nVar2.a = bArr;
            nVar2.c = i2;
            nVar2.b = 0;
        }
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.c;
            int i3 = nVar3.c;
            int i4 = nVar3.b;
            if (i3 - i4 >= 188) {
                while (i4 < i3 && bArr[i4] != 71) {
                    i4++;
                }
                this.c.e(i4);
                int i5 = i4 + 188;
                if (i5 > i3) {
                    return 0;
                }
                int iB = this.c.b();
                if ((8388608 & iB) != 0) {
                    this.c.e(i5);
                    return 0;
                }
                boolean z = true;
                boolean z2 = (4194304 & iB) != 0;
                int i6 = (2096896 & iB) >> 8;
                boolean z3 = (iB & 32) != 0;
                boolean z4 = (iB & 16) != 0;
                if (this.a != 2) {
                    int i7 = iB & 15;
                    int i8 = this.d.get(i6, i7 - 1);
                    this.d.put(i6, i7);
                    if (i8 == i7) {
                        if (z4) {
                            this.c.e(i5);
                            return 0;
                        }
                    } else if (i7 == ((i8 + 1) & 15)) {
                    }
                    z = false;
                } else {
                    z = false;
                }
                if (z3) {
                    int iJ = this.c.j();
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.c;
                    nVar4.e(nVar4.b + iJ);
                }
                if (z4 && (f0Var = (f0) this.f.get(i6)) != null) {
                    if (z) {
                        f0Var.a();
                    }
                    this.c.d(i5);
                    f0Var.a(this.c, z2);
                    this.c.d(i3);
                }
                this.c.e(i5);
                return 0;
            }
            int i9 = 940 - i3;
            int i10 = bVar.f;
            if (i10 == 0) {
                iMin = 0;
            } else {
                iMin = Math.min(i10, i9);
                System.arraycopy(bVar.d, 0, bArr, i3, iMin);
                bVar.b(iMin);
            }
            if (iMin == 0) {
                bVar2 = bVar;
                iMin = bVar2.a(bArr, i3, i9, 0, true);
            } else {
                bVar2 = bVar;
            }
            if (iMin != -1) {
                bVar2.c += (long) iMin;
            }
            if (iMin == -1) {
                return -1;
            }
            this.c.d(i3 + iMin);
            bVar = bVar2;
        }
    }

    public b0(int i, com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, e eVar) {
        this.e = eVar;
        this.a = i;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(vVar);
        } else {
            this.b = Collections.singletonList(vVar);
        }
        this.c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(940);
        this.g = new SparseBooleanArray();
        this.f = new SparseArray();
        this.d = new SparseIntArray();
        a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.h = jVar;
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j, long j2) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.util.v) this.b.get(i)).c = -9223372036854775807L;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.c;
        nVar.b = 0;
        nVar.c = 0;
        this.d.clear();
        a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        byte[] bArr = this.c.a;
        bVar.a(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 == 5) {
                    bVar.a(i);
                    return true;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final void a() {
        this.g.clear();
        this.f.clear();
        this.e.getClass();
        SparseArray sparseArray = new SparseArray();
        int size = sparseArray.size();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = this.f;
            if (i < size) {
                sparseArray2.put(sparseArray.keyAt(i), (f0) sparseArray.valueAt(i));
                i++;
            } else {
                sparseArray2.put(0, new w(new z(this)));
                this.k = null;
                return;
            }
        }
    }
}
