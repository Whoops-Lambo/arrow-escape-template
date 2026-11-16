package defpackage;

import android.util.LongSparseArray;
import com.google.android.gms.internal.ads.zzjc;
import com.google.android.gms.internal.ads.zzme;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.ads.zzzm;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class jc5 implements zzzm {
    public final tc5 a;
    public final tc5 b;
    public final zzme c = new zzme();
    public final zzjc d = new zzjc(1);
    public final LongSparseArray e = new LongSparseArray();
    public final int f;
    public byte[] g;
    public long h;
    public boolean i;
    public boolean j;

    @Override // com.google.android.gms.internal.ads.zzzm
    public final int a(long j) {
        return this.a.a(j);
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final int b(zzme zzmeVar, zzjc zzjcVar, int i) {
        int i2;
        byte[] bArr;
        int length;
        int i3;
        int iB = this.a.b(zzmeVar, zzjcVar, i);
        int i4 = -4;
        if (iB != -4) {
            return iB;
        }
        int i5 = 4;
        if (!zzjcVar.b(4) && (i & 4) == 0) {
            boolean z = true;
            if ((i & 1) == 0 && !this.i) {
                long j = zzjcVar.e;
                boolean z2 = this.j;
                byte[] bArr2 = null;
                LongSparseArray longSparseArray = this.e;
                if (!z2) {
                    while (true) {
                        zzjc zzjcVar2 = this.d;
                        zzjcVar2.c();
                        tc5 tc5Var = this.b;
                        zzme zzmeVar2 = this.c;
                        int iB2 = tc5Var.b(zzmeVar2, zzjcVar2, 0);
                        if (iB2 != -3) {
                            if (iB2 != -5) {
                                if (zzjcVar2.b(i5)) {
                                    this.j = z;
                                } else {
                                    long j2 = zzjcVar2.e;
                                    i2 = i4;
                                    long j3 = this.h;
                                    if (j3 != -9223372036854775807L && j2 < j3) {
                                        this.i = z;
                                        longSparseArray.clear();
                                        this.g = bArr2;
                                    }
                                    this.h = j2;
                                    ByteBuffer byteBuffer = zzjcVar2.d;
                                    if (!this.i && byteBuffer != null) {
                                        zzjcVar2.f();
                                        zzv zzvVar = zzmeVar2.b;
                                        if (zzvVar != null) {
                                            int i6 = 0;
                                            length = 0;
                                            while (true) {
                                                List list = zzvVar.r;
                                                if (i6 >= list.size()) {
                                                    break;
                                                }
                                                length += ((byte[]) list.get(i6)).length;
                                                i6++;
                                            }
                                        } else {
                                            length = 0;
                                        }
                                        byte[] bArr3 = new byte[byteBuffer.remaining() + length];
                                        if (zzvVar != null) {
                                            int i7 = 0;
                                            i3 = 0;
                                            while (true) {
                                                List list2 = zzvVar.r;
                                                if (i7 >= list2.size()) {
                                                    break;
                                                }
                                                byte[] bArr4 = (byte[]) list2.get(i7);
                                                int length2 = bArr4.length;
                                                System.arraycopy(bArr4, 0, bArr3, i3, length2);
                                                i3 += length2;
                                                i7++;
                                            }
                                        } else {
                                            i3 = 0;
                                        }
                                        byteBuffer.get(bArr3, i3, byteBuffer.remaining());
                                        longSparseArray.put(j2, bArr3);
                                        while (longSparseArray.size() > this.f) {
                                            longSparseArray.removeAt(0);
                                        }
                                    }
                                    if (j2 > j) {
                                        break;
                                    }
                                    i4 = i2;
                                    i5 = 4;
                                    z = true;
                                    bArr2 = null;
                                }
                            }
                        }
                        i2 = i4;
                        break;
                    }
                } else {
                    i2 = i4;
                    break;
                }
                long j4 = zzjcVar.e;
                int size = longSparseArray.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        bArr = null;
                        break;
                    }
                    if (longSparseArray.keyAt(size) <= j4) {
                        bArr = (byte[]) longSparseArray.valueAt(size);
                        break;
                    }
                }
                if (bArr != null) {
                    this.g = bArr;
                }
                byte[] bArr5 = this.g;
                if (bArr5 == null) {
                    return i2;
                }
                int length3 = bArr5.length;
                ByteBuffer byteBuffer2 = zzjcVar.f;
                if (byteBuffer2 == null || byteBuffer2.capacity() < length3) {
                    zzjcVar.f = ByteBuffer.allocate(length3);
                } else {
                    zzjcVar.f.clear();
                }
                zzjcVar.f.put(bArr5);
                zzjcVar.a = 268435456 | zzjcVar.a;
                return i2;
            }
        }
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final boolean zzc() {
        return this.a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final void zzd() throws IOException {
        this.a.zzd();
        if (this.i) {
            return;
        }
        this.b.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final int zzg() {
        return this.a.zzg();
    }

    public jc5(tc5 tc5Var, tc5 tc5Var2, zzv zzvVar) {
        int i;
        this.a = tc5Var;
        this.b = tc5Var2;
        int i2 = zzvVar.q;
        if (i2 != -1) {
            i = i2 + 2;
        } else {
            i = 18;
        }
        this.f = i;
        this.h = -9223372036854775807L;
    }
}
