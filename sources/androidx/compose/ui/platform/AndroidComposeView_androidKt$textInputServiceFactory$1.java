package androidx.compose.ui.platform;

import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextInputService;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/input/TextInputService;", "it", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class AndroidComposeView_androidKt$textInputServiceFactory$1 extends rc1 implements wr0 {
    public static final AndroidComposeView_androidKt$textInputServiceFactory$1 i = new AndroidComposeView_androidKt$textInputServiceFactory$1(1);

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        PlatformTextInputService platformTextInputService = (PlatformTextInputService) obj;
        platformTextInputService.getClass();
        return new TextInputService(platformTextInputService);
    }
}
