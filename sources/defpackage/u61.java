package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zznv;
import com.google.android.gms.internal.ads.zznx;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class u61 implements el0, fl0, hb3, zzeb {
    public static u61 c;
    public final /* synthetic */ int a;
    public final Object b;

    public u61() {
        this.a = 2;
        this.b = new Object();
        new Handler(Looper.getMainLooper(), new ch2(this, 0));
    }

    public static u61 b(Object obj) {
        if (obj != null) {
            return new u61(obj, 0);
        }
        d.w("instance cannot be null");
        return null;
    }

    @Override // defpackage.ib3
    public Object a() {
        return this.b;
    }

    @Override // defpackage.q02
    public Object get() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo1229zza(Object obj) {
        ((zznx) obj).zzo();
    }

    public /* synthetic */ u61(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ u61(zznv zznvVar, Object obj, long j) {
        this.a = 4;
        this.b = obj;
    }
}
