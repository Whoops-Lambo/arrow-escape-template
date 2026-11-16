package androidx.compose.ui.text.input;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextInputService;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class TextInputService {
    public final PlatformTextInputService a;
    public final AtomicReference b;

    public TextInputService(PlatformTextInputService platformTextInputService) {
        platformTextInputService.getClass();
        this.a = platformTextInputService;
        this.b = new AtomicReference(null);
    }
}
