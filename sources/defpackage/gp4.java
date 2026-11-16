package defpackage;

import com.google.android.gms.internal.ads.zzgve;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class gp4 extends ks0 implements zr0 {
    public static final gp4 b = new gp4(2, zzgve.class, "lockWithoutOwner", "lockWithoutOwner(Lkotlinx/coroutines/sync/Mutex;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);

    @Override // defpackage.zr0
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((pp1) ((Mutex) obj)).e((dy) obj2);
    }
}
