package androidx.room;

import defpackage.az2;
import defpackage.cz;
import defpackage.dy;
import defpackage.t50;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import java.util.concurrent.Callable;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@t50(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lcz;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 7, 1})
final class CoroutinesRoom$Companion$execute$2 extends ul2 implements zr0 {
    public final /* synthetic */ Callable r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$2(Callable callable, dy dyVar) {
        super(2, dyVar);
        this.r = callable;
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        return new CoroutinesRoom$Companion$execute$2(this.r, dyVar);
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        return ((CoroutinesRoom$Companion$execute$2) create((cz) obj, (dy) obj2)).invokeSuspend(az2.a);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        wz2.a0(obj);
        return this.r.call();
    }
}
