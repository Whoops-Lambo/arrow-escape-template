package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/DefaultDebugIndication;", "Landroidx/compose/foundation/Indication;", "DefaultDebugIndicationInstance", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class DefaultDebugIndication implements Indication {
    public static final DefaultDebugIndication a = new DefaultDebugIndication();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/DefaultDebugIndication$DefaultDebugIndicationInstance;", "Landroidx/compose/foundation/IndicationInstance;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultDebugIndicationInstance implements IndicationInstance {
        public final State a;
        public final State b;
        public final State c;

        @Override // androidx.compose.foundation.IndicationInstance
        public final void b(LayoutNodeDrawScope layoutNodeDrawScope) {
            CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.a;
            layoutNodeDrawScope.W();
            if (((Boolean) this.a.getA()).booleanValue()) {
                DrawScope.M(layoutNodeDrawScope, Color.b(Color.b, 0.3f), 0L, canvasDrawScope.i(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            } else if (((Boolean) this.b.getA()).booleanValue() || ((Boolean) this.c.getA()).booleanValue()) {
                DrawScope.M(layoutNodeDrawScope, Color.b(Color.b, 0.1f), 0L, canvasDrawScope.i(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            }
        }

        public DefaultDebugIndicationInstance(MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
            mutableState.getClass();
            mutableState2.getClass();
            mutableState3.getClass();
            this.a = mutableState;
            this.b = mutableState2;
            this.c = mutableState3;
        }
    }

    @Override // androidx.compose.foundation.Indication
    public final IndicationInstance a(InteractionSource interactionSource, Composer composer) {
        interactionSource.getClass();
        composer.B(1683566979);
        MutableState mutableStateA = PressInteractionKt.a(interactionSource, composer);
        MutableState mutableStateA2 = HoverInteractionKt.a(interactionSource, composer);
        MutableState mutableStateA3 = FocusInteractionKt.a(interactionSource, composer, 0);
        composer.B(1157296644);
        boolean zL = composer.l(interactionSource);
        Object objC = composer.C();
        if (zL || objC == Composer.Companion.a) {
            objC = new DefaultDebugIndicationInstance(mutableStateA, mutableStateA2, mutableStateA3);
            composer.x(objC);
        }
        composer.J();
        DefaultDebugIndicationInstance defaultDebugIndicationInstance = (DefaultDebugIndicationInstance) objC;
        composer.J();
        return defaultDebugIndicationInstance;
    }
}
