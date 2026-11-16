package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/key/KeyEvent;", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1 extends rc1 implements wr0 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ sr0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1(boolean z, sr0 sr0Var) {
        super(1);
        this.i = z;
        this.j = sr0Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        boolean z;
        int iA;
        KeyEvent keyEvent = ((androidx.compose.ui.input.key.KeyEvent) obj).a;
        if (this.i) {
            int i = Clickable_androidKt.b;
            z = true;
            if (KeyEvent_androidKt.a(keyEvent) == 1 && ((iA = (int) (Key_androidKt.a(keyEvent.getKeyCode()) >> 32)) == 23 || iA == 66 || iA == 160)) {
                this.j.invoke();
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
