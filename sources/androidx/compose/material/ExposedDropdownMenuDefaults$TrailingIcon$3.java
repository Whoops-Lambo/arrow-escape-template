package androidx.compose.material;

import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.graphics.vector.VectorKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ExposedDropdownMenuDefaults$TrailingIcon$3 extends rc1 implements zr0 {
    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && composer.b()) {
            composer.h();
            return az2.a;
        }
        if (ArrowDropDownKt.a == null) {
            ImageVector.Builder builder = new ImageVector.Builder("Filled.ArrowDropDown");
            int i = VectorKt.a;
            SolidColor solidColor = new SolidColor(Color.b);
            PathBuilder pathBuilder = new PathBuilder();
            PathNode.MoveTo moveTo = new PathNode.MoveTo(7.0f, 10.0f);
            ArrayList arrayList = pathBuilder.a;
            arrayList.add(moveTo);
            arrayList.add(new PathNode.RelativeLineTo(5.0f, 5.0f));
            arrayList.add(new PathNode.RelativeLineTo(5.0f, -5.0f));
            arrayList.add(PathNode.Close.c);
            builder.b(1.0f, 1.0f, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, 2, solidColor, null, "", arrayList);
            ArrowDropDownKt.a = builder.d();
        }
        throw null;
    }
}
