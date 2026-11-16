package androidx.compose.material.icons.filled;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.graphics.vector.VectorKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material-icons-core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class StarKt {
    public static ImageVector a;

    public static final ImageVector a() {
        ImageVector imageVector = a;
        if (imageVector != null) {
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Star");
        int i = VectorKt.a;
        SolidColor solidColor = new SolidColor(Color.b);
        PathBuilder pathBuilder = new PathBuilder();
        PathNode.MoveTo moveTo = new PathNode.MoveTo(12.0f, 17.27f);
        ArrayList arrayList = pathBuilder.a;
        arrayList.add(moveTo);
        pathBuilder.a(18.18f, 21.0f);
        arrayList.add(new PathNode.RelativeLineTo(-1.64f, -7.03f));
        pathBuilder.a(22.0f, 9.24f);
        arrayList.add(new PathNode.RelativeLineTo(-7.19f, -0.61f));
        pathBuilder.a(12.0f, 2.0f);
        pathBuilder.a(9.19f, 8.63f);
        pathBuilder.a(2.0f, 9.24f);
        arrayList.add(new PathNode.RelativeLineTo(5.46f, 4.73f));
        pathBuilder.a(5.82f, 21.0f);
        arrayList.add(PathNode.Close.c);
        builder.b(1.0f, 1.0f, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, 2, solidColor, null, "", arrayList);
        ImageVector imageVectorD = builder.d();
        a = imageVectorD;
        return imageVectorD;
    }
}
