package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.node.LayoutNodeWrapper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/DeviceRenderNode;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface DeviceRenderNode {
    boolean A(int i, int i2, int i3, int i4);

    void B();

    boolean C();

    int D();

    void E(RenderEffect renderEffect);

    void F(CanvasHolder canvasHolder, Path path, LayoutNodeWrapper layoutNodeWrapper);

    void G(int i);

    void H(int i);

    float I();

    void a(Canvas canvas);

    void b(float f);

    void c(float f);

    float d();

    void e();

    void f();

    void g(float f);

    int getHeight();

    int getWidth();

    void h(float f);

    void i(boolean z);

    void j(float f);

    void k(int i);

    void l(float f);

    boolean m();

    boolean n();

    void o(float f);

    boolean p();

    void q();

    void r(Matrix matrix);

    void s(int i);

    int t();

    void u(float f);

    void v(float f);

    void w(Outline outline);

    int x();

    void y(boolean z);

    int z();
}
