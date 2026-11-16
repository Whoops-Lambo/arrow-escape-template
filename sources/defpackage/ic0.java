package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import com.facebook.internal.v;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.TimedValueQueue;
import com.google.android.gms.internal.ads.w;
import com.google.android.gms.internal.ads.zzaaw;
import com.google.android.gms.internal.ads.zzaaz;
import com.google.android.gms.internal.ads.zzabi;
import com.google.android.gms.internal.ads.zzbg;
import com.google.android.gms.internal.ads.zzgyy;
import com.google.android.gms.internal.ads.zzgzb;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import io.p071bidmachine.iab.vast.j;
import io.p071bidmachine.iab.vast.k;
import io.p071bidmachine.iab.vast.tags.a;
import io.p071bidmachine.media3.common.audio.c;
import io.p071bidmachine.media3.common.util.s;
import io.p071bidmachine.media3.common.util.u;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.t;
import io.p071bidmachine.media3.extractor.e0;
import io.p071bidmachine.media3.extractor.o;
import io.p071bidmachine.media3.extractor.text.n;
import io.p071bidmachine.media3.extractor.z;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import okio.Path;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ic0 implements o, zzaaz {
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;

    public static void d(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }

    public boolean j(String str, String str2) {
        synchronized (this) {
            try {
                if (!((lc1) ((AtomicMarkableReference) this.b).getReference()).b(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.b;
                atomicMarkableReference.set((lc1) atomicMarkableReference.getReference(), true);
                g();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a aVar, j jVar) {
        this.d = jVar;
        Bundle bundle = new Bundle();
        bundle.putInt("params_error_code", jVar.a);
        ArrayList arrayList = aVar.f;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String strA = k.a(bundle, (String) obj);
            if (!TextUtils.isEmpty(strA)) {
                ((ArrayList) this.b).add(strA);
            }
        }
    }

    public void b(boolean z) {
        mc0 mc0Var = (mc0) this.d;
        synchronized (mc0Var) {
            try {
                if (this.a) {
                    throw new IllegalStateException("editor is closed");
                }
                if (s71.b(((jc0) this.b).g, this)) {
                    mc0.b(mc0Var, this, z);
                }
                this.a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public w e(int i, zzbg zzbgVar, int[] iArr) {
        zzabi zzabiVar = (zzabi) this.b;
        zzaaw zzaawVar = (zzaaw) this.c;
        bl3 bl3Var = new bl3(zzabiVar, zzaawVar);
        int i2 = ((int[]) this.d)[i];
        ar4 ar4Var = zzgzb.b;
        zzgyy zzgyyVar = new zzgyy();
        for (int i3 = 0; i3 < zzbgVar.a; i3++) {
            zzgyyVar.c(new tk3(i, zzbgVar, i3, zzaawVar, iArr[i3], this.a, bl3Var));
        }
        return zzgyyVar.f();
    }

    @Override // io.p071bidmachine.media3.extractor.o
    public void endTracks() {
        SparseArray sparseArray = (SparseArray) this.d;
        ((o) this.b).endTracks();
        if (this.a) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((n) sparseArray.valueAt(i)).i = true;
            }
        }
    }

    public Path f(int i) {
        Path path;
        mc0 mc0Var = (mc0) this.d;
        synchronized (mc0Var) {
            if (this.a) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.c)[i] = true;
            Object obj = ((jc0) this.b).d.get(i);
            lc0 lc0Var = mc0Var.p;
            Path path2 = (Path) obj;
            if (!lc0Var.exists(path2)) {
                i.a(lc0Var.sink(path2));
            }
            path = (Path) obj;
        }
        return path;
    }

    public void g() {
        nj2 nj2Var = new nj2(this, 17);
        AtomicReference atomicReference = (AtomicReference) this.c;
        while (!atomicReference.compareAndSet(null, nj2Var)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        ((CrashlyticsWorkers) ((lt0) this.d).d).b.a(nj2Var);
    }

    @Override // io.p071bidmachine.media3.extractor.o
    public void h(z zVar) {
        ((o) this.b).h(zVar);
    }

    public void i() {
        if (this.a) {
            ((u) this.d).c(new v(this, 18));
            this.a = false;
        }
    }

    @Override // io.p071bidmachine.media3.extractor.o
    public e0 track(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.d;
        o oVar = (o) this.b;
        if (i2 != 3) {
            this.a = true;
            return oVar.track(i, i2);
        }
        n nVar = (n) sparseArray.get(i);
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(oVar.track(i, i2), (io.p071bidmachine.media3.extractor.text.k) this.c);
        sparseArray.put(i, nVar2);
        return nVar2;
    }

    public ic0(Context context, io.p071bidmachine.media3.exoplayer.trackselection.o oVar) {
        AudioManager audioManagerP;
        if (context == null) {
            audioManagerP = null;
        } else {
            audioManagerP = c.p(context);
        }
        if (audioManagerP != null) {
            context.getClass();
            if (!x.K(context)) {
                Spatializer spatializer = audioManagerP.getSpatializer();
                this.b = spatializer;
                this.a = spatializer.getImmersiveAudioLevel() != 0;
                io.p071bidmachine.media3.exoplayer.trackselection.j jVar = new io.p071bidmachine.media3.exoplayer.trackselection.j(oVar);
                this.d = jVar;
                Looper looperMyLooper = Looper.myLooper();
                io.p071bidmachine.media3.common.util.a.j(looperMyLooper);
                Handler handler = new Handler(looperMyLooper);
                this.c = handler;
                spatializer.addOnSpatializerStateChangedListener(new z70(handler, 1), jVar);
                return;
            }
        }
        this.b = null;
        this.a = false;
        this.c = null;
        this.d = null;
    }

    public static void c(float[] fArr, float[] fArr2) {
        GlUtil.setToIdentity(fArr);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }

    public ic0(int i) {
        switch (i) {
            case 3:
                this.b = new ArrayList();
                this.a = true;
                break;
            case 6:
                this.b = new float[16];
                this.c = new float[16];
                this.d = new k90();
                break;
            default:
                this.b = new float[16];
                this.c = new float[16];
                this.d = new TimedValueQueue();
                break;
        }
    }

    public ic0(o oVar, io.p071bidmachine.media3.extractor.text.k kVar) {
        this.b = oVar;
        this.c = kVar;
        this.d = new SparseArray();
    }

    public ic0(Context context, Looper looper, Looper looper2, t tVar, s sVar) {
        this.b = context.getApplicationContext();
        this.d = sVar.a(looper, null);
        this.c = new io.p071bidmachine.media3.exoplayer.a(this, sVar.a(looper2, null), tVar);
    }

    public ic0(lt0 lt0Var, boolean z) {
        this.d = lt0Var;
        this.c = new AtomicReference(null);
        this.a = z;
        this.b = new AtomicMarkableReference(new lc1(z ? 8192 : 1024), false);
    }

    public ic0(mc0 mc0Var, jc0 jc0Var) {
        this.d = mc0Var;
        this.b = jc0Var;
        this.c = new boolean[2];
    }

    public /* synthetic */ ic0(zzabi zzabiVar, zzaaw zzaawVar, boolean z, int[] iArr) {
        this.b = zzabiVar;
        this.c = zzaawVar;
        this.a = z;
        this.d = iArr;
    }
}
