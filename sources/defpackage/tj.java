package defpackage;

import android.view.View;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class tj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public tj(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.a = 0;
        this.d = bottomSheetBehavior;
        this.c = view;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((BottomSheetBehavior) obj).F((View) obj2, i2, false);
                break;
            case 1:
                for (fc4 fc4Var : (CopyOnWriteArraySet) obj2) {
                    zzeb zzebVar = (zzeb) obj;
                    if (!fc4Var.d) {
                        if (i2 != -1) {
                            fc4Var.b.a(i2);
                        }
                        fc4Var.c = true;
                        zzebVar.mo1229zza(fc4Var.a);
                    }
                }
                break;
            default:
                ((xt4) obj2).u(i2, (ListenableFuture) obj);
                break;
        }
    }

    public /* synthetic */ tj(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
