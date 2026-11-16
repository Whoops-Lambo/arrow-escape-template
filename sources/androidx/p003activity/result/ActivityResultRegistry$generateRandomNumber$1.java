package androidx.p003activity.result;

import defpackage.rc1;
import defpackage.sr0;
import defpackage.x12;
import defpackage.y12;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class ActivityResultRegistry$generateRandomNumber$1 extends rc1 implements sr0 {
    public static final ActivityResultRegistry$generateRandomNumber$1 i = new ActivityResultRegistry$generateRandomNumber$1(0);

    @Override // defpackage.sr0
    public final Object invoke() {
        x12 x12Var = y12.a;
        return Integer.valueOf(y12.b.j().nextInt(2147418112) + 65536);
    }
}
