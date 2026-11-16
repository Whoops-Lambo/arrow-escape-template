package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RequiresApi
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012JG\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi23Helper;", "", "Landroid/view/ViewStructure;", "structure", "", TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX, "b", "(Landroid/view/ViewStructure;I)Landroid/view/ViewStructure;", "num", "a", "(Landroid/view/ViewStructure;I)I", "id", "", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "typeName", "entryName", "Laz2;", "d", "(Landroid/view/ViewStructure;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "left", "top", "scrollX", "scrollY", "width", "height", "c", "(Landroid/view/ViewStructure;IIIIII)V", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AutofillApi23Helper {
    public static final AutofillApi23Helper a = new AutofillApi23Helper();

    @DoNotInline
    @RequiresApi
    public final int a(@NotNull ViewStructure structure, int num) {
        structure.getClass();
        return structure.addChildCount(num);
    }

    @DoNotInline
    @RequiresApi
    @Nullable
    public final ViewStructure b(@NotNull ViewStructure structure, int index) {
        structure.getClass();
        return structure.newChild(index);
    }

    @DoNotInline
    @RequiresApi
    public final void c(@NotNull ViewStructure structure, int left, int top, int scrollX, int scrollY, int width, int height) {
        structure.getClass();
        structure.setDimens(left, top, scrollX, scrollY, width, height);
    }

    @DoNotInline
    @RequiresApi
    public final void d(@NotNull ViewStructure structure, int id, @Nullable String packageName, @Nullable String typeName, @Nullable String entryName) {
        structure.getClass();
        structure.setId(id, packageName, typeName, entryName);
    }
}
