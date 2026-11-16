package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import defpackage.f02;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
public /* synthetic */ class KeyMappingKt$defaultKeyMapping$1 extends f02 {
    public static final KeyMappingKt$defaultKeyMapping$1 b = new KeyMappingKt$defaultKeyMapping$1(KeyEvent_androidKt.class, "isCtrlPressed", "isCtrlPressed-ZmokQxo(Landroid/view/KeyEvent;)Z", 1);

    @Override // defpackage.f02, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return Boolean.valueOf(((KeyEvent) obj).a.isCtrlPressed());
    }
}
