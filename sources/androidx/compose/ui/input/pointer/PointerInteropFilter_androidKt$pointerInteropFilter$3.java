package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "motionEvent", "Landroid/view/MotionEvent;", "invoke", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class PointerInteropFilter_androidKt$pointerInteropFilter$3 extends rc1 implements wr0 {
    public final /* synthetic */ AndroidViewHolder i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$pointerInteropFilter$3(AndroidViewHolder androidViewHolder) {
        super(1);
        this.i = androidViewHolder;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        MotionEvent motionEvent = (MotionEvent) obj;
        motionEvent.getClass();
        int actionMasked = motionEvent.getActionMasked();
        AndroidViewHolder androidViewHolder = this.i;
        switch (actionMasked) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                zDispatchTouchEvent = androidViewHolder.dispatchTouchEvent(motionEvent);
                break;
            default:
                zDispatchTouchEvent = androidViewHolder.dispatchGenericMotionEvent(motionEvent);
                break;
        }
        return Boolean.valueOf(zDispatchTouchEvent);
    }
}
