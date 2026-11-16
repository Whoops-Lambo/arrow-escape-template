package androidx.compose.runtime;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@t50(c = "androidx.compose.runtime.Recomposer", f = "Recomposer.kt", l = {IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE, LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW}, m = "runFrameLoop")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class Recomposer$runFrameLoop$1 extends fy {
    public /* synthetic */ Object r;
    public int s;

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        throw null;
    }
}
