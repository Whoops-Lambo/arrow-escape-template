package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/TabRowDefaults;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TabRowDefaults {
    public static final TabRowDefaults a = new TabRowDefaults();

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public final void a(float f, int i, long j, Composer composer, Modifier modifier) {
        float f2;
        long j2;
        ComposerImpl composerImplT = composer.t(910934799);
        if (((i | 150) & 5851) == 1170 && composerImplT.b()) {
            composerImplT.h();
            j2 = j;
            f2 = f;
        } else {
            composerImplT.r0();
            if ((i & 1) != 0 && !composerImplT.X()) {
                composerImplT.h();
            } else {
                j = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, 0.12f);
                modifier = Modifier.Companion.a;
                f = 1.0f;
            }
            float f3 = f;
            long j3 = j;
            Modifier modifier2 = modifier;
            composerImplT.S();
            DividerKt.a(f3, 6, j3, composerImplT, modifier2);
            f2 = f3;
            j2 = j3;
            modifier = modifier2;
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new TabRowDefaults$Divider$1(this, modifier, f2, j2, i);
    }
}
