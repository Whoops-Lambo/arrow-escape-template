package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.sdk.component.ahm.kgy.ahm;
import com.bytedance.sdk.component.ahm.kgy.kus;
import com.bytedance.sdk.component.ahm.kgy.rz;
import com.bytedance.sdk.component.ahm.kgy.vs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbiw;
import com.google.android.gms.internal.ads.zzeks;
import com.google.android.gms.internal.ads.zzekz;
import com.google.android.gms.internal.ads.zzfpv;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.tasks.OnFailureListener;
import com.vungle.ads.internal.protos.Sdk;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.dash.j;
import io.p071bidmachine.media3.extractor.e0;
import io.p071bidmachine.media3.extractor.i;
import io.p071bidmachine.media3.extractor.jpeg.c;
import io.p071bidmachine.media3.extractor.n;
import io.p071bidmachine.media3.extractor.o;
import io.p071bidmachine.media3.extractor.z;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ta3 implements rz, j, n, o, zzfpv, OnFailureListener {
    public long a;
    public final Object b;

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public boolean w() {
        return true;
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public void advancePeekPosition(int i) {
        ((n) this.b).advancePeekPosition(i);
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public long c(long j, long j2) {
        return ((i) this.b).d[(int) j];
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public long e(long j, long j2) {
        return 0L;
    }

    @Override // io.p071bidmachine.media3.extractor.o
    public void endTracks() {
        ((o) this.b).endTracks();
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public long getLength() {
        return ((n) this.b).getLength() - this.a;
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public long getPeekPosition() {
        return ((n) this.b).getPeekPosition() - this.a;
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public long getPosition() {
        return ((n) this.b).getPosition() - this.a;
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public long getTimeUs(long j) {
        return ((i) this.b).e[(int) j] - this.a;
    }

    @Override // io.p071bidmachine.media3.extractor.o
    public void h(z zVar) {
        ((o) this.b).h(new c(this, zVar, zVar));
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public long k(long j, long j2) {
        return x.e(((i) this.b).e, j + this.a, true);
    }

    /* JADX WARN: Code duplicated, block: B:91:0x01bb A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:84:0x018d, B:89:0x01b3, B:91:0x01bb, B:94:0x01c2, B:88:0x01a8, B:85:0x019c), top: B:98:0x018d, inners: #6 }] */
    @Override // com.bytedance.sdk.component.ahm.kgy.rz
    public void kgy(ahm ahmVar, kus kusVar) {
        int iRz;
        Throwable th;
        InputStream inputStreamRz;
        RandomAccessFile randomAccessFile;
        vs vsVarNoq;
        eb3 eb3Var;
        eb3 eb3Var2;
        long jKgy;
        long j = this.a;
        Closeable closeable = null;
        if (kusVar != null) {
            try {
                boolean zUq = kusVar.uq();
                if (zUq) {
                    vsVarNoq = kusVar.noq();
                    try {
                        vsVarNoq = kusVar.noq();
                        if (!zUq || vsVarNoq == null) {
                            inputStreamRz = null;
                            jKgy = 0;
                        } else {
                            jKgy = this.a + vsVarNoq.kgy();
                            inputStreamRz = vsVarNoq.rz();
                        }
                        try {
                            if (inputStreamRz == null) {
                                eb3 eb3Var3 = (eb3) this.b;
                                eb3.c(eb3Var3, eb3Var3.a, kusVar.rz(), kusVar.ct());
                                eb3Var = (eb3) this.b;
                            } else {
                                randomAccessFile = new RandomAccessFile(((eb3) this.b).c, "rw");
                                try {
                                    int i = u12.o;
                                    byte[] bArr = new byte[i];
                                    int i2 = 0;
                                    int i3 = 0;
                                    long j2 = 0;
                                    while (true) {
                                        int i4 = inputStreamRz.read(bArr, i3, i - i3);
                                        eb3 eb3Var4 = (eb3) this.b;
                                        if (i4 == -1) {
                                            if (eb3Var4.a.twf() && jKgy == ((eb3) this.b).c.length()) {
                                                eb3.f((eb3) this.b);
                                            }
                                            eb3 eb3Var5 = (eb3) this.b;
                                            eb3Var5.e(eb3Var5.a, kusVar.rz());
                                            closeable = randomAccessFile;
                                            eb3.b((eb3) this.b, closeable);
                                            break;
                                        }
                                        if (eb3Var4.b) {
                                            eb3 eb3Var6 = (eb3) this.b;
                                            zg3 zg3Var = eb3Var6.a;
                                            int iRz2 = kusVar.rz();
                                            synchronized (ie3.class) {
                                                try {
                                                    ArrayList arrayList = eb3Var6.e;
                                                    int size = arrayList.size();
                                                    while (i2 < size) {
                                                        Object obj = arrayList.get(i2);
                                                        i2++;
                                                        ie3 ie3Var = (ie3) obj;
                                                        if (ie3Var != null) {
                                                            ie3Var.ahm(zg3Var, iRz2);
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    throw th2;
                                                }
                                            }
                                            eb3.b((eb3) this.b, randomAccessFile);
                                            break;
                                        }
                                        int i5 = i3 + i4;
                                        j2 += (long) i4;
                                        if (j2 % ((long) i) == 0 || j2 == jKgy - this.a) {
                                            int iIntValue = Long.valueOf(j).intValue();
                                            ((eb3) this.b).a.xh();
                                            try {
                                                randomAccessFile.seek(iIntValue);
                                                randomAccessFile.write(bArr, i2, i5);
                                            } catch (Throwable th3) {
                                                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th3, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrU8UuI=", "becpkAyaYMuFWeJJhR2z", "Wv49kA24", 69);
                                            }
                                            j += (long) i5;
                                            i3 = 0;
                                        } else {
                                            i3 = i5;
                                        }
                                        i2 = 0;
                                        th = th;
                                        closeable = vsVarNoq;
                                        iRz = 601;
                                        try {
                                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5O1kmNAq89Se0o2xOubMuPS9M=", "aessmQ+lX86ET9htnhSsJ1rqacc=", "VOAfkBCsZsmTTw==", 244);
                                            eb3 eb3Var7 = (eb3) this.b;
                                            try {
                                                eb3Var7.d.delete();
                                                eb3Var7.c.delete();
                                            } catch (Throwable th4) {
                                                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th4, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5O1kmNAq89Se0o2xOubMuPS9M=", "aessmQ+lX86ET9htnhSsJ1rq", "WOIolBGfaMSIT/FUgBQ=", Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE);
                                            }
                                            eb3 eb3Var8 = (eb3) this.b;
                                            zg3 zg3Var2 = eb3Var8.a;
                                            if (kusVar != null) {
                                                iRz = kusVar.rz();
                                            }
                                            eb3.c(eb3Var8, zg3Var2, iRz, th.getMessage());
                                            eb3.b((eb3) this.b, randomAccessFile);
                                            eb3.b((eb3) this.b, inputStreamRz);
                                            eb3.b((eb3) this.b, closeable);
                                            eb3Var2 = (eb3) this.b;
                                        } catch (Throwable th5) {
                                            eb3.b((eb3) this.b, randomAccessFile);
                                            eb3.b((eb3) this.b, inputStreamRz);
                                            eb3.b((eb3) this.b, closeable);
                                            eb3.b((eb3) this.b, kusVar);
                                            ((eb3) this.b).a.dg();
                                            ((eb3) this.b).a.noq();
                                            bh3.a(((eb3) this.b).a);
                                            throw th5;
                                        }
                                    }
                                    eb3Var = (eb3) this.b;
                                } catch (Throwable th6) {
                                    th = th6;
                                    closeable = vsVarNoq;
                                    iRz = 601;
                                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5O1kmNAq89Se0o2xOubMuPS9M=", "aessmQ+lX86ET9htnhSsJ1rqacc=", "VOAfkBCsZsmTTw==", 244);
                                    eb3 eb3Var9 = (eb3) this.b;
                                    eb3Var9.d.delete();
                                    eb3Var9.c.delete();
                                    eb3 eb3Var10 = (eb3) this.b;
                                    zg3 zg3Var3 = eb3Var10.a;
                                    if (kusVar != null) {
                                        iRz = kusVar.rz();
                                    }
                                    eb3.c(eb3Var10, zg3Var3, iRz, th.getMessage());
                                    eb3.b((eb3) this.b, randomAccessFile);
                                    eb3.b((eb3) this.b, inputStreamRz);
                                    eb3.b((eb3) this.b, closeable);
                                }
                            }
                            eb3.b(eb3Var, inputStreamRz);
                            eb3.b((eb3) this.b, vsVarNoq);
                        } catch (Throwable th7) {
                            th = th7;
                            randomAccessFile = null;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        inputStreamRz = null;
                        randomAccessFile = null;
                    }
                    eb3Var2 = (eb3) this.b;
                } else {
                    eb3 eb3Var11 = (eb3) this.b;
                    eb3.c(eb3Var11, eb3Var11.a, kusVar.rz(), kusVar.ct());
                    eb3Var2 = (eb3) this.b;
                }
            } catch (Throwable th9) {
                th = th9;
                inputStreamRz = null;
                randomAccessFile = null;
            }
        } else {
            try {
                eb3 eb3Var12 = (eb3) this.b;
                iRz = 601;
                try {
                    eb3.c(eb3Var12, eb3Var12.a, 601, "Network link failed.");
                    vsVarNoq = null;
                    inputStreamRz = null;
                    eb3.b((eb3) this.b, closeable);
                    eb3Var = (eb3) this.b;
                    eb3.b(eb3Var, inputStreamRz);
                    eb3.b((eb3) this.b, vsVarNoq);
                } catch (Throwable th10) {
                    th = th10;
                    th = th;
                    inputStreamRz = null;
                    randomAccessFile = null;
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5O1kmNAq89Se0o2xOubMuPS9M=", "aessmQ+lX86ET9htnhSsJ1rqacc=", "VOAfkBCsZsmTTw==", 244);
                    eb3 eb3Var13 = (eb3) this.b;
                    eb3Var13.d.delete();
                    eb3Var13.c.delete();
                    eb3 eb3Var14 = (eb3) this.b;
                    zg3 zg3Var4 = eb3Var14.a;
                    if (kusVar != null) {
                        iRz = kusVar.rz();
                    }
                    eb3.c(eb3Var14, zg3Var4, iRz, th.getMessage());
                    eb3.b((eb3) this.b, randomAccessFile);
                    eb3.b((eb3) this.b, inputStreamRz);
                    eb3.b((eb3) this.b, closeable);
                }
            } catch (Throwable th11) {
                th = th11;
                iRz = 601;
            }
            eb3Var2 = (eb3) this.b;
        }
        eb3.b(eb3Var2, kusVar);
        ((eb3) this.b).a.dg();
        ((eb3) this.b).a.noq();
        bh3.a(((eb3) this.b).a);
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public long m(long j) {
        return ((i) this.b).a;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public /* synthetic */ void onFailure(Exception exc) {
        zzgq zzgqVar = (zzgq) this.b;
        zzgqVar.c.set(this.a);
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public int peek(byte[] bArr, int i, int i2) {
        return ((n) this.b).peek(bArr, i, i2);
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public boolean peekFully(byte[] bArr, int i, int i2, boolean z) {
        return ((n) this.b).peekFully(bArr, i, i2, z);
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public long r() {
        return 0L;
    }

    @Override // io.p071bidmachine.media3.common.g
    public int read(byte[] bArr, int i, int i2) {
        return ((n) this.b).read(bArr, i, i2);
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public boolean readFully(byte[] bArr, int i, int i2, boolean z) {
        return ((n) this.b).readFully(bArr, 0, i2, z);
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public void resetPeekPosition() {
        ((n) this.b).resetPeekPosition();
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public io.p071bidmachine.media3.exoplayer.dash.manifest.j s(long j) {
        i iVar = (i) this.b;
        int i = (int) j;
        return new io.p071bidmachine.media3.exoplayer.dash.manifest.j(null, iVar.c[i], iVar.b[i]);
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public int skip(int i) {
        return ((n) this.b).skip(i);
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public void skipFully(int i) {
        ((n) this.b).skipFully(i);
    }

    @Override // io.p071bidmachine.media3.extractor.o
    public e0 track(int i, int i2) {
        return ((o) this.b).track(i, i2);
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public long x(long j, long j2) {
        return ((i) this.b).a;
    }

    @Override // com.google.android.gms.internal.ads.zzfpv
    public Object zza(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((zzeks) this.b).a.zzx()) {
            return null;
        }
        long j = this.a;
        zzbiw.zzaf.zza.C0296zza c0296zzaV = zzbiw.zzaf.zza.V();
        c0296zzaV.l();
        ((zzbiw.zzaf.zza) c0296zzaV.b).Q(j);
        byte[] bArrH = ((zzbiw.zzaf.zza) c0296zzaV.m()).h();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
        zzekz.b(sQLiteDatabase, j, bArrH);
        return null;
    }

    public ta3(n nVar, long j) {
        boolean z;
        this.b = nVar;
        if (nVar.getPosition() >= j) {
            z = true;
        } else {
            z = false;
        }
        a.c(z);
        this.a = j;
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public long f(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public void peekFully(byte[] bArr, int i, int i2) {
        ((n) this.b).peekFully(bArr, i, i2);
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public void readFully(byte[] bArr, int i, int i2) {
        ((n) this.b).readFully(bArr, i, i2);
    }

    public /* synthetic */ ta3(Object obj, long j) {
        this.b = obj;
        this.a = j;
    }

    public ta3() {
        this.b = new ArrayList();
    }

    public ta3(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.b = clock;
    }

    public /* synthetic */ ta3(long j, Object obj) {
        this.a = j;
        this.b = obj;
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.rz
    public void kgy(ahm ahmVar, IOException iOException) {
        eb3 eb3Var = (eb3) this.b;
        zg3 zg3Var = eb3Var.a;
        eb3.c(eb3Var, zg3Var, 601, iOException.getMessage());
        bh3.a(zg3Var);
    }
}
