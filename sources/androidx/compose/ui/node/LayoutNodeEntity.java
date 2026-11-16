package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNodeEntity;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeEntity;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/Modifier;", "M", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class LayoutNodeEntity<T extends LayoutNodeEntity<T, M>, M extends Modifier> {
    public final LayoutNodeWrapper a;
    public final Modifier b;
    public LayoutNodeEntity c;
    public boolean d;

    public void a() {
        this.d = true;
    }

    public void b() {
        this.d = false;
    }

    public LayoutNodeEntity(LayoutNodeWrapper layoutNodeWrapper, Modifier modifier) {
        layoutNodeWrapper.getClass();
        modifier.getClass();
        this.a = layoutNodeWrapper;
        this.b = modifier;
    }
}
