package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.gms.internal.ads.zzaaa;
import com.google.android.gms.internal.ads.zzaff;
import com.google.android.gms.internal.ads.zzbv;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzfb;
import com.google.android.gms.internal.ads.zzfi;
import com.google.android.gms.internal.ads.zzjg;
import com.google.android.gms.internal.ads.zzji;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjr;
import com.google.android.gms.internal.ads.zznv;
import com.google.android.gms.internal.ads.zzpz;
import com.google.android.gms.internal.ads.zzsd;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.ads.zzws;
import com.google.android.gms.internal.ads.zzxt;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e15 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzaff, zzsd, zzaaa, zzws, zzby, zzfb {
    public final /* synthetic */ z15 a;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        z15 z15Var = this.a;
        z15Var.m(null);
        z15Var.n(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void a(zzjg zzjgVar) {
        this.a.D.e(zzjgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void b(int i, long j) {
        zzpz zzpzVar = this.a.q;
        zznv zznvVarP = zzpzVar.p((zzxt) zzpzVar.d.e);
        zzpzVar.m(zznvVarP, 1018, new nc2(zznvVarP, i, j));
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void c(zzv zzvVar, zzjj zzjjVar) {
        zzpz zzpzVar = this.a.q;
        zznv zznvVarQ = zzpzVar.q();
        zzpzVar.m(zznvVarQ, 1017, new v45(zznvVarQ, zzvVar, zzjjVar, 0));
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void d(zzji zzjiVar) {
        zzpz zzpzVar = this.a.q;
        zznv zznvVarP = zzpzVar.p((zzxt) zzpzVar.d.e);
        zzpzVar.m(zznvVarP, 1020, new do4(zznvVarP, zzjiVar, 22));
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void e(long j, Object obj) {
        z15 z15Var = this.a;
        zzpz zzpzVar = z15Var.q;
        zznv zznvVarQ = zzpzVar.q();
        zzpzVar.m(zznvVarQ, 26, new u61(zznvVarQ, obj, j));
        if (z15Var.J == obj) {
            zzeg zzegVar = z15Var.m;
            zzegVar.c(26, c94.w);
            zzegVar.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void f(zzbv zzbvVar) {
        b15 b15Var = new b15(zzbvVar);
        zzeg zzegVar = this.a.m;
        zzegVar.c(25, b15Var);
        zzegVar.d();
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final void g(zzfi zzfiVar) {
        this.a.d(zzjr.c(zzfiVar, 1003));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        z15 z15Var = this.a;
        z15Var.getClass();
        Surface surface = new Surface(surfaceTexture);
        z15Var.m(surface);
        z15Var.K = surface;
        z15Var.n(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.n(i, i2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.n(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.a.n(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void zzb() {
        zzpz zzpzVar = this.a.q;
        zzpzVar.m(zzpzVar.q(), 1015, new z94(25));
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void zzc() {
        zzpz zzpzVar = this.a.q;
        zzpzVar.m(zzpzVar.q(), 1016, new ga4(25));
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void zzh() {
        zzpz zzpzVar = this.a.q;
        zzpzVar.m(zzpzVar.q(), 1019, new ia4(25));
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void zzj() {
        zzpz zzpzVar = this.a.q;
        zzpzVar.m(zzpzVar.p((zzxt) zzpzVar.d.e), 1021, new d94(26));
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void zzk() {
        zzpz zzpzVar = this.a.q;
        zzpzVar.m(zzpzVar.q(), 1030, new j94(26));
    }

    public /* synthetic */ e15(z15 z15Var) {
        this.a = z15Var;
    }
}
